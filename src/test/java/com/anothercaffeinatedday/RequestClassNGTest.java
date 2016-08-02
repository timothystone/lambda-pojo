/*
 * The MIT License
 *
 * Copyright 2016 ajw121.
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

import static org.testng.Assert.*;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

/**
 *
 * @author ajw121
 */
public class RequestClassNGTest {
  
  public RequestClassNGTest() {
  }

  @BeforeClass
  public static void setUpClass() throws Exception {
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
  }

  @BeforeMethod
  public void setUpMethod() throws Exception {
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
    RequestClass instance = new RequestClass();
    int expResult = 0;
    int result = instance.getNumberOfNPCs();
    assertEquals(result, expResult);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of setNumberOfNPCs method, of class RequestClass.
   */
  @Test
  public void testSetNumberOfNPCs() {
    System.out.println("setNumberOfNPCs");
    int numberOfNPCs = 0;
    RequestClass instance = new RequestClass();
    instance.setNumberOfNPCs(numberOfNPCs);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of isCharacteristic method, of class RequestClass.
   */
  @Test
  public void testIsCharacteristic() {
    System.out.println("isCharacteristic");
    RequestClass instance = new RequestClass();
    boolean expResult = false;
    boolean result = instance.isCharacteristic();
    assertEquals(result, expResult);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of setCharacteristic method, of class RequestClass.
   */
  @Test
  public void testSetCharacteristic() {
    System.out.println("setCharacteristic");
    boolean characteristic = false;
    RequestClass instance = new RequestClass();
    instance.setCharacteristic(characteristic);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of isIdeal method, of class RequestClass.
   */
  @Test
  public void testIsIdeal() {
    System.out.println("isIdeal");
    RequestClass instance = new RequestClass();
    boolean expResult = false;
    boolean result = instance.isIdeal();
    assertEquals(result, expResult);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of setIdeal method, of class RequestClass.
   */
  @Test
  public void testSetIdeal() {
    System.out.println("setIdeal");
    boolean ideal = false;
    RequestClass instance = new RequestClass();
    instance.setIdeal(ideal);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of isBond method, of class RequestClass.
   */
  @Test
  public void testIsBond() {
    System.out.println("isBond");
    RequestClass instance = new RequestClass();
    boolean expResult = false;
    boolean result = instance.isBond();
    assertEquals(result, expResult);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of setBond method, of class RequestClass.
   */
  @Test
  public void testSetBond() {
    System.out.println("setBond");
    boolean bond = false;
    RequestClass instance = new RequestClass();
    instance.setBond(bond);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of isFlaw method, of class RequestClass.
   */
  @Test
  public void testIsFlaw() {
    System.out.println("isFlaw");
    RequestClass instance = new RequestClass();
    boolean expResult = false;
    boolean result = instance.isFlaw();
    assertEquals(result, expResult);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of setFlaw method, of class RequestClass.
   */
  @Test
  public void testSetFlaw() {
    System.out.println("setFlaw");
    boolean flaw = false;
    RequestClass instance = new RequestClass();
    instance.setFlaw(flaw);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }
  
}
