package com.petmystone;

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
public class HelloPojo implements RequestHandler<RequestClass, ResponseClass>{  
    
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
        for (int i = 0; i < request.numberOfNames; i++) {
            StringBuffer name = new StringBuffer();
            name.append(NAME_PART_ONE[rollD20()]).append(NAME_PART_TWO[rollD20()]).append(NAME_PART_THREE[rollD20()]);
            names.add(uppercaseFirstLetter(name));
        }
        return new ResponseClass(names);
    }

    /**
     * A simple PRNG from {@link java.lang.Math} to generate a random numbur between 0-19.
     * The resulting value is used to {@link #handleRequest} to select an indexed 
     * result from the one of three parts of a name.
     * 
     * @return int an index between 0-19.
     */
    private int rollD20() {
        return (int) (Math.random() * 20);
    }
    
    /**
     * A utility function that properly UPPERCASEs the first letter of the provided name.
     * When {@link #handleRequest} selects an empty index, the proper name should be properly capitalized.
     * 
     * @param name StringBuffer 
     * @return String the correct case form for proper names.
     */
     private String uppercaseFirstLetter(StringBuffer name) {
        return name.toString().substring(0, 1).toUpperCase() + name.toString().substring(1);
    }
}