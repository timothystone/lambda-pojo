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
import com.amazonaws.services.lambda.runtime.RequestHandler;
import java.util.ArrayList;
import java.util.List;

/**
 * A simple API call that returns a fantasy like name, or set of names.
 * Based on the Name Generator found in the D&D 5th Edition Dungeon Master's Screen.
 * 
 * Names are constructed from three (3) parts.
 * 
 * @author tstone
 */
public class NpcGenerator implements RequestHandler<RequestClass, ResponseClass>{  
    
    /**
     * 
     */
    public static final String[] NAME_PART_ONE = {
        ""  ,""  ,""  ,""  ,"A",
        "Be","De","El","Fa","Jo",
        "Ki","La","Ma","Na","O",
        "Pa","Re","Si","Ta","Va"
    };
    
    /**
     *
     */
    public static final String[] NAME_PART_TWO =  {
        "bar" ,"ched","dell","far" ,"gran",
        "hal" ,"jen" ,"kel" ,"lim" ,"mor",
        "net" ,"penn","quil","rond","sark",
        "shen","tur" ,"vash","yor" ,"zen"
    };
    
    /**
     *
     */
    public static final String[] NAME_PART_THREE =  {
        ""  ,"a"  ,"ac"  ,"ai"  ,"al",
        "am","an","ar","ea","el",
        "er","ess","ett","ic","id",
        "il","in","is","or","us"
    };

    /**
     * 
     * @param request RequestClass provided by AWS
     * @param context Context provided by AWS
     * @return ResponseClass
     */
    @Override
    public ResponseClass handleRequest(RequestClass request, Context context){            
        List<String> names = new ArrayList<>();
        for (int i = 0; i < request.numberOfNPCs; i++) {
            StringBuffer name = new StringBuffer();
            name.append(NAME_PART_ONE[rollD20()]).append(NAME_PART_TWO[rollD20()]).append(NAME_PART_THREE[rollD20()]);
            names.add(properNameFormatter(name));
        }
        return new ResponseClass(names);
    }

    /**
     * A simple PRNG from {@link java.lang.Math} to generate a random numbur between 0-19.
     * The resulting value is used to {@link #handleRequest} to select an indexed 
     * result.
     * 
     * @return int an index between 0-19.
     */
    private int rollD20() {
        return (int) (Math.random() * 20);
    }
    
    /**
     * A simple PRNG from {@link java.lang.Math} to generate a random numbur between 0-12.
     * The resulting value is used to {@link #handleRequest} to select an indexed 
     * result.
     * 
     * @return int an index between 0-12.
     */
    private int rollD12() {
        return (int) (Math.random() * 12);
    }

    /**
     * A simple PRNG from {@link java.lang.Math} to generate a random numbur between 0-10.
     * The resulting value is used to {@link #handleRequest} to select an indexed 
     * result.
     * 
     * @return int an index between 0-10.
     */
    private int rollD10() {
        return (int) (Math.random() * 10);
    }
    /**
     * A utility function that properly UPPERCASEs the first letter of the provided name.
     * When {@link #handleRequest} selects an empty index, the proper name should be properly capitalized.
     * 
     * @param name StringBuffer 
     * @return String the correct case form for proper names.
     */
     private String properNameFormatter(StringBuffer name) {
        return name.toString().substring(0, 1).toUpperCase() + name.toString().substring(1);
    }
}