/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.petmystone;

import java.util.List;
/**
 *
 * @author tstone
 */
public class ResponseClass {

        List names;

    /**
     * Get the names generated.
     * @return List names generated
     */
    public List getNames() {
            return this.names;
        }

    /**
     * Sets the {@link java.util.List} of generated names
     * @param names
     */
    public void setNames(List names) {
            this.names = names;
        }

    /**
     * Makes a new response with a list of names.
     * @param names
     */
    public ResponseClass(List names) {
            this.names = names;
        }

    /**
     * Default Constructor
     */
    public ResponseClass() {}
    
}
