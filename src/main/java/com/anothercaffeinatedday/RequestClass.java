/*
 * The MIT License
 *
 * Copyright © 2016-2021 Timothy Stone.
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
 *
 */
package com.anothercaffeinatedday;

/**
 * @author Timothy Stone
 */
public class RequestClass {

  private int numberOfNPCs;
  private boolean characteristic;
  private boolean ideal;
  private boolean bonds;
  private boolean flaw;
  private boolean photos;

  /**
   * @param numberOfNPCs   the number of NPCs to be generated
   * @param characteristic the prominent characteristic of the NPC
   * @param ideal          the"world outlook" and Alignment of the NPC
   * @param bonds          a possession, person, or place important to the NPC
   * @param flaw           a vice or other undesirable behavior of the NPC
   * @param photos         a list of photo filenames to be used
   */
  public RequestClass(int numberOfNPCs, boolean characteristic, boolean ideal, boolean bonds, boolean flaw, boolean photos) {
    this.numberOfNPCs = numberOfNPCs;
    this.characteristic = characteristic;
    this.ideal = ideal;
    this.bonds = bonds;
    this.flaw = flaw;
    this.photos = photos;
  }

  /**
   * Default constructor.
   */
  public RequestClass() {
  }

  /**
   * @return the number of NPCs generated
   */
  public int getNumberOfNPCs() {
    return numberOfNPCs;
  }

  /**
   * @param numberOfNPCs the number of NPCs to generate
   */
  public void setNumberOfNPCs(int numberOfNPCs) {
    this.numberOfNPCs = numberOfNPCs;
  }

  /**
   * @return the NPC has a characteristic
   */
  public boolean isCharacteristic() {
    return characteristic;
  }

  /**
   * @param characteristic generate a characteristic for the NPC
   */
  public void setCharacteristic(boolean characteristic) {
    this.characteristic = characteristic;
  }

  /**
   * @return the NPC has an ideal
   */
  public boolean isIdeal() {
    return ideal;
  }

  /**
   * @param ideal generate an ideal for the NPC
   */
  public void setIdeal(boolean ideal) {
    this.ideal = ideal;
  }

  /**
   * @return the NPC has bonds
   */
  public boolean isBonds() {
    return bonds;
  }

  /**
   * @param bonds generate bonds for the NPC
   */
  public void setBonds(boolean bonds) {
    this.bonds = bonds;
  }

  /**
   * @return the NPC has a flaw
   */
  public boolean isFlaw() {
    return flaw;
  }

  /**
   * @param flaw generate a flaw for the NPC
   */
  public void setFlaw(boolean flaw) {
    this.flaw = flaw;
  }

  /**
   * Generate a set of photos filenames for the NPC.
   *
   * @return photos the NPC has photos
   */
  public boolean isPhotos() {
    return photos;
  }

  /**
   * Generate a set of photos filenames for the NPC.
   *
   * @param photos generate a set of photo filenames for the NPC
   */
  public void setPhotos(boolean photos) {
    this.photos = photos;
  }
}
