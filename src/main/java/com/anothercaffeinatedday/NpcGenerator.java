/*
 * The MIT License
 *
 * Copyright 2016 tstone.
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy
 * of this software and associated documentation files (the "Software"), to deal
 * in the Software without restriction, including without limitation the rights
 * to use, copy, modify, merge, publish, distribute, sublicense, and/or sell
 * copies of the Software, and to permit persons to whom the Software is
 * furnished to do so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in
 * all copies or substantial portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY,
 * FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE
 * AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER
 * LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM,
 * OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN
 * THE SOFTWARE.
 */
package com.anothercaffeinatedday;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import java.text.MessageFormat;
import java.util.*;

/**
 * A simple API call that returns fantasy Non-Player Characters (NPCs). Based on
 * the Name Generator found in the D&amp;D 5th Edition Dungeon Master's Screen.
 * <p>
 * Names are constructed from three (3) parts, rolling a d20 three (3) times.
 *
 * @author tstone
 */
public class NpcGenerator implements RequestHandler<RequestClass, ResponseClass> {

    /**
     * A possible set of photo assets
     * This is a static set of photo assets for generic use in the response.
     */
    private static final String[] IMAGES = {"assets/photo_1.jpg", "assets/photo_2.jpg", "assets/photo_3.jpg", "assets/photo_4.jpg"};

    /**
     * Whether two rolls should be made against a table.
     */
    private static final String ROLL_TWICE = "ROLL_TWICE";

    /**
     * First part of name.
     * The first four (4) indexes are empty. This creates a shorter name, however
     * complicates generating two (2) part names as the second part table is not
     * capitalized. A supporting {@link #properNameFormatter(java.lang.StringBuffer)} method
     * is provided to correct this problem.
     */
    private static final String[] NAME_PART_ONE = {
            "", "", "", "", "A",
            "Be", "De", "El", "Fa", "Jo",
            "Ki", "La", "Ma", "Na", "O",
            "Pa", "Re", "Si", "Ta", "Va"
    };

    /**
     * Second part of name.
     *
     * @see #NAME_PART_ONE
     * @see #properNameFormatter(java.lang.StringBuffer)
     */
    private static final String[] NAME_PART_TWO = {
            "bar", "ched", "dell", "far", "gran",
            "hal", "jen", "kel", "lim", "mor",
            "net", "penn", "quil", "rond", "sark",
            "shen", "tur", "vash", "yor", "zen"
    };

    /**
     * Second part of name.
     */
    private static final String[] NAME_PART_THREE = {
            "", "a", "ac", "ai", "al",
            "am", "an", "ar", "ea", "el",
            "er", "ess", "ett", "ic", "id",
            "il", "in", "is", "or", "us"
    };

    private static final String[] BONDS = {
            "Personal goal or achievement",
            "Family members",
            "Colleagues or compatriots",
            "Benefactor, patron, or employer",
            "Romantic interest",
            "Special place",
            "Keepsake",
            "Valuable possession",
            "Revenge",
            ROLL_TWICE
    };

    private static final String[] CHARACTERISTICS = {
            "Absentminded",
            "Arrogant",
            "Boorish",
            "Chews something",
            "Clumsy",
            "Curious",
            "Dim-witted",
            "Fiddles and fidgets nervously",
            "Frequently uses the wrong word",
            "Friendly",
            "Irritable",
            "Prone to predictions of certain doom",
            "Pronounced scar",
            "Slurs words, lisps, or stutters",
            "Speaks loudly or whispers",
            "Squints",
            "Stares into the distance",
            "Suspicious",
            "Uses colorful oaths and exclamations",
            "Uses flowery speech or long words"
    };

    private static final String[] FLAWS = {
            "Forbidden love or romantic susceptibility",
            "Decadence",
            "Arrogance",
            "Envy of another person's possessions or station",
            "Overpowering greed",
            "Prone to rage",
            "Powerful Enemy",
            "Specific phobia",
            "Shameful or scandalous history",
            "Secret crime or misdeed",
            "Possession of forbidden lore",
            "Foolhardy bravery"
    };

    private static final String[] IDEALS = {
            "Aspiration (any)",
            "Charity (good)",
            "Community (lawful)",
            "Creativity (chaotic)",
            "Discovery (any)",
            "Fairness (lawful)",
            "Freedom (chaotic)",
            "Glory (any)",
            "Greater good (good)",
            "Greedy (evil)",
            "Honor (lawful)",
            "Independence (chaotic)",
            "Knowledge (neutral)",
            "Life (good)",
            "Live and let live (chaotic)",
            "Might (evil)",
            "Nation (any)",
            "People (neutral)",
            "Power (evil)",
            "Redemption (any)"
    };

    /**
     * @param request RequestClass provided by AWS
     * @param context Context provided by AWS
     * @return ResponseClass
     */
    @Override
    public ResponseClass handleRequest(RequestClass request, Context context) {
        LambdaLogger logger = context.getLogger();
        List<NPC> NPCs = new ArrayList<>();
        List<String> photos = Arrays.asList(IMAGES);
        for (int i = 0; i < request.numberOfNPCs; i++) {
            NPC npc = new NPC();
            Collections.shuffle(photos, new Random(32));
            npc.setPhotos(photos);
            StringBuffer name = new StringBuffer();
            name.append(NAME_PART_ONE[rollD20()]).append(NAME_PART_TWO[rollD20()]).append(NAME_PART_THREE[rollD20()]);
            npc.setName(properNameFormatter(name));
            if (request.bond) {
                int index = rollD10();
                String bond = BONDS[index];
                List<String> bonds = new ArrayList<>();
                if (ROLL_TWICE.equals(bond)) {
                    bonds.addAll(getTwoBonds());
                } else {
                    bonds.add(bond);
                }
                npc.setBonds(bonds);
            }

            if (request.characteristic) {
                npc.setCharacteristic(CHARACTERISTICS[rollD20()]);
            }
            if (request.flaw) {
                npc.setFlaw(FLAWS[rollD12()]);
            }
            if (request.ideal) {
                npc.setIdeal(IDEALS[rollD20()]);
            }
            NPCs.add(npc);
        }
        logger.log(MessageFormat.format("Generated {0} {1} {2}", NPCs.size(), (NPCs.size() == 1) ? "NPC:\n" : "NPCs:\n", NPCs.toString()));
        return new ResponseClass(NPCs);
    }

    /**
     * A simple PRNG from {@link java.lang.Math} to generate a random number
     * between 0-19. The resulting value is used to {@link #handleRequest} to
     * select an indexed result.
     *
     * @return int an index between 0-19.
     */
    private int rollD20() {
        return (int) (Math.random() * 20);
    }

    /**
     * A simple PRNG from {@link java.lang.Math} to generate a random number
     * between 0-11. The resulting value is used to {@link #handleRequest} to
     * select an indexed result.
     *
     * @return int an index between 0-11.
     */
    private int rollD12() {
        return (int) (Math.random() * 12);
    }

    /**
     * A simple PRNG from {@link java.lang.Math} to generate a random number
     * between 0-9. The resulting value is used to {@link #handleRequest} to
     * select an indexed result.
     *
     * @return int an index between 0-9.
     */
    private int rollD10() {
        return (int) (Math.random() * 10);
    }

    /**
     * A utility method to generate two bonds when the asked to roll twice on the table.
     *
     * @return List a set of bonds.
     */
    private List<String> getTwoBonds() {
        List<String> bonds = new ArrayList<>();
        int firstBond = (int) (Math.random() * 9);
        bonds.add(BONDS[firstBond]);
        int secondBond = (int) (Math.random() * 9);
        while (secondBond != firstBond) {
            bonds.add(BONDS[secondBond]);
            if (bonds.size() == 2) {
                break;
            }
            secondBond = (int) (Math.random() * 9);
        }
        return bonds;
    }

    /**
     * A utility function that properly UPPERCASEs the first letter of the
     * provided name. When {@link #handleRequest} selects an empty index, the
     * proper name should be properly capitalized.
     *
     * @param name StringBuffer
     * @return String the correct case form for proper names.
     */
    private String properNameFormatter(StringBuffer name) {
        return name.toString().substring(0, 1).toUpperCase() + name.toString().substring(1);
    }

}
