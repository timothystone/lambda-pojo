/*
 *
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

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.fail;

/**
 * @author Timothy Stone
 */
public class RequestClassNGTest {

  RequestClass instance;

  public RequestClassNGTest() {
  }

  @BeforeClass
  public void setUpClass() throws Exception {
  }

  @AfterClass
  public void tearDownClass() throws Exception {
  }

  @BeforeMethod
  public void setUpMethod() throws Exception {
    instance = new RequestClass();
  }

  @AfterMethod
  public void tearDownMethod() throws Exception {
  }

  /**
   * Test of getNumberOfNPCs method, of class RequestClass.
   */
  @Test
  public void testGetNumberOfNPCs() {
    System.out.println("getNumberOfNPCs");
    int expResult = 0;
    instance.setNumberOfNPCs(0);
    int result = instance.getNumberOfNPCs();
    assertEquals(result, expResult);
  }

  /**
   * Test of setNumberOfNPCs method, of class RequestClass.
   */
  @Test
  public void testSetNumberOfNPCs() {
    System.out.println("setNumberOfNPCs");
    int numberOfNPCs = 0;
    instance.setNumberOfNPCs(numberOfNPCs);
    assertEquals(instance.getNumberOfNPCs(), numberOfNPCs);
  }

  /**
   * Test of isCharacteristic method, of class RequestClass.
   */
  @Test
  public void testIsCharacteristic() {
    System.out.println("isCharacteristic");
    boolean expResult = false;
    instance.setCharacteristic(false);
    boolean result = instance.isCharacteristic();
    assertEquals(result, expResult);
  }

  /**
   * Test of setCharacteristic method, of class RequestClass.
   */
  @Test
  public void testSetCharacteristic() {
    System.out.println("setCharacteristic");
    boolean characteristic = false;
    instance.setCharacteristic(characteristic);
    assertEquals(instance.isCharacteristic(), characteristic);
  }

  /**
   * Test of isIdeal method, of class RequestClass.
   */
  @Test
  public void testIsIdeal() {
    System.out.println("isIdeal");
    boolean expResult = false;
    instance.setIdeal(false);
    boolean result = instance.isIdeal();
    assertEquals(result, expResult);
  }

  /**
   * Test of setIdeal method, of class RequestClass.
   */
  @Test
  public void testSetIdeal() {
    System.out.println("setIdeal");
    boolean ideal = false;
    instance.setIdeal(ideal);
    assertEquals(instance.isIdeal(), ideal);
  }

  /**
   * Test of isBond method, of class RequestClass.
   */
  @Test
  public void testIsBonds() {
    System.out.println("isBonds");
    boolean expResult = false;
    instance.setBonds(false);
    boolean result = instance.isBonds();
    assertEquals(result, expResult);
  }

  /**
   * Test of setBond method, of class RequestClass.
   */
  @Test
  public void testSetBonds() {
    System.out.println("setBonds");
    boolean bond = false;
    instance.setBonds(bond);
    assertEquals(instance.isBonds(), bond);
  }

  /**
   * Test of isFlaw method, of class RequestClass.
   */
  @Test
  public void testIsFlaw() {
    System.out.println("isFlaw");
    boolean expResult = false;
    instance.setFlaw(false);
    boolean result = instance.isFlaw();
    assertEquals(result, expResult);
  }

  /**
   * Test of setFlaw method, of class RequestClass.
   */
  @Test
  public void testSetFlaw() {
    System.out.println("setFlaw");
    boolean flaw = false;
    instance.setFlaw(flaw);
    assertEquals(instance.isFlaw(), flaw);
  }

  /**
   * Test of isPhotos method, of class RequestClass.
   */
  @Test
  public void testIsPhotos() {
    System.out.println("isPhotos");
    boolean expResult = false;
    instance.setPhotos(false);
    boolean result = instance.isPhotos();
    assertEquals(result, expResult);
  }

  /**
   * Test of setPhotos method, of class RequestClass.
   */
  @Test
  public void testSetPhotos() {
    System.out.println("setPhotos");
    boolean photos = false;
    instance.setPhotos(false);
    assertEquals(instance.isFlaw(), photos);
  }

}
