package com.petmystone;

import com.amazonaws.services.lambda.runtime.Context; 
import com.amazonaws.services.lambda.runtime.RequestHandler;
import java.util.ArrayList;
import java.util.List;

/**
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
     * @param request RequestClass
     * @param context Context
     * @return ResponseClass
     */
    @Override
    public ResponseClass handleRequest(RequestClass request, Context context){            
        List names = new ArrayList<>();
        for (int i = 0; i < request.numberOfNames; i++) {
            StringBuffer name = new StringBuffer();
            name.append(NAME_PART_ONE[rollD20()]).append(NAME_PART_TWO[rollD20()]).append(NAME_PART_THREE[rollD20()]);
            names.add(uppercaseFirstLetter(name));
        }
        return new ResponseClass(names);
    }

    /**
     *
     * @return int
     */    private int rollD20() {
        return (int) (Math.random() * 20);
    }
    
    /**
     *
     * @param name StringBuffer
     * @return String
     */
     private String uppercaseFirstLetter(StringBuffer name) {
        return name.toString().substring(0, 1).toUpperCase() + name.toString().substring(1);
    }
}