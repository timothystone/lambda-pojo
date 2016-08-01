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

/**
 *
 * @author tstone
 */
public class RequestClass {

    int numberOfNPCs;
    boolean characteristic;
    boolean ideal;
    boolean bond;
    boolean flaw;

    /**
     *
     * @param numberOfNPCs the number of NPCs to be generated
     * @param characteristic the prominent characteristic of the NPC
     * @param ideal the"world outlook" and Alignment of the NPC
     * @param bond a possession, person, or place important to the NPC
     * @param flaw a vice or other undesirable behavior of the NPC
     */
    public RequestClass(int numberOfNPCs, boolean characteristic, boolean ideal, boolean bond, boolean flaw) {
        this.numberOfNPCs = numberOfNPCs;
        this.characteristic = characteristic;
        this.ideal = ideal;
        this.bond = bond;
        this.flaw = flaw;
    }

    /**
     *
     */
    public RequestClass() {
    }
    
    /**
     *
     * @return the number of NPCs
     */
    public int getNumberOfNPCs() {
        return numberOfNPCs;
    }
    /**
     *
     * @param numberOfNPCs the number of NPCs to generate
     */
    public void setNumberOfNPCs(int numberOfNPCs) {
        this.numberOfNPCs = numberOfNPCs;
    }

    /**
     * @return the characteristic
     */
    public boolean isCharacteristic() {
        return characteristic;
    }

    /**
     * @param characteristic the characteristic to set
     */
    public void setCharacteristic(boolean characteristic) {
        this.characteristic = characteristic;
    }

    /**
     * @return the ideal
     */
    public boolean isIdeal() {
        return ideal;
    }

    /**
     * @param ideal the ideal to set
     */
    public void setIdeal(boolean ideal) {
        this.ideal = ideal;
    }

    /**
     * @return the bond
     */
    public boolean isBond() {
        return bond;
    }

    /**
     * @param bond the bond to set
     */
    public void setBond(boolean bond) {
        this.bond = bond;
    }

    /**
     * @return the flaw
     */
    public boolean isFlaw() {
        return flaw;
    }

    /**
     * @param flaw the flaw to set
     */
    public void setFlaw(boolean flaw) {
        this.flaw = flaw;
    }
}
