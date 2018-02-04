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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.List;

/**
 *
 * @author tstone
 */
public class NPC {

    private String name;
    private List bonds;
    private String characteristic;
    private String ideal;
    private String flaw;

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the bonds
     */
    public List getBonds() {
        return bonds;
    }

    /**
     * @param bonds the bond to set
     */
    public void setBonds(List bonds) {
        this.bonds = bonds;
    }

    /**
     * @return the characteristic
     */
    public String getCharacteristic() {
        return characteristic;
    }

    /**
     * @param characteristic the characteristic to set
     */
    public void setCharacteristic(String characteristic) {
        this.characteristic = characteristic;
    }

    /**
     * @return the ideal
     */
    public String getIdeal() {
        return ideal;
    }

    /**
     * @param ideal the ideal to set
     */
    public void setIdeal(String ideal) {
        this.ideal = ideal;
    }

    /**
     * @return the flaw
     */
    public String getFlaw() {
        return flaw;
    }

    /**
     * @param flaw the flaw to set
     */
    public void setFlaw(String flaw) {
        this.flaw = flaw;
    }

    /**
     * @return a JSON version of the NPC
     */
    @Override
    public String toString() {
        try {
            ObjectMapper mapper = new ObjectMapper();
            return mapper.writeValueAsString(this);
        } catch (JsonProcessingException ex) {
            throw new RuntimeException("Failed to create JSON representation of NPC.");
        }
    }
}
