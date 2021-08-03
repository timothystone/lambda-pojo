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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import java.util.ArrayList;
import java.util.List;
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
public class NPCNGTest {

  public NPC instance;
  public NPC.NpcAttributes attributes;

  public NPCNGTest() {
  }

  @BeforeClass
  public static void setUpClass() throws Exception {
  }

  @AfterClass
  public static void tearDownClass() throws Exception {
  }

  @BeforeMethod
  public void setUpMethod() throws Exception {
    instance = new NPC();
    attributes = instance.new NpcAttributes();
  }

  @AfterMethod
  public void tearDownMethod() throws Exception {
  }

  /**
   * Test of getName method, of class NPC.
   */
  @Test
  public void testGetName() {
    System.out.println("getName");
    String expResult = "";
    String result = attributes.getName();
    assertEquals(result, expResult);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of setName method, of class NPC.
   */
  @Test
  public void testSetName() {
    System.out.println("setName");
    String name = "";
    attributes.setName(name);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of getBonds method, of class NPC.
   */
  @Test
  public void testGetBonds() {
    System.out.println("getBonds");
    List<String> expResult = null;
    List<String> result = attributes.getBonds();
    assertEquals(result, expResult);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of setBonds method, of class NPC.
   */
  @Test
  public void testSetBonds() {
    System.out.println("setBonds");
    List<String> bonds = null;
    attributes.setBonds(bonds);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of getCharacteristic method, of class NPC.
   */
  @Test
  public void testGetCharacteristic() {
    System.out.println("getCharacteristic");
    String expResult = "";
    String result = attributes.getCharacteristic();
    assertEquals(result, expResult);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of setCharacteristic method, of class NPC.
   */
  @Test
  public void testSetCharacteristic() {
    System.out.println("setCharacteristic");
    String characteristic = "";
    attributes.setCharacteristic(characteristic);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of getIdeal method, of class NPC.
   */
  @Test
  public void testGetIdeal() {
    System.out.println("getIdeal");
    String expResult = "";
    String result = attributes.getIdeal();
    assertEquals(result, expResult);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of setIdeal method, of class NPC.
   */
  @Test
  public void testSetIdeal() {
    System.out.println("setIdeal");
    String ideal = "";
    attributes.setIdeal(ideal);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of getFlaw method, of class NPC.
   */
  @Test
  public void testGetFlaw() {
    System.out.println("getFlaw");
    String expResult = "";
    String result = attributes.getFlaw();
    assertEquals(result, expResult);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  /**
   * Test of setFlaw method, of class NPC.
   */
  @Test
  public void testSetFlaw() {
    System.out.println("setFlaw");
    String flaw = "";
    attributes.setFlaw(flaw);
    // TODO review the generated test code and remove the default call to fail.
    fail("The test case is a prototype.");
  }

  @Test
  public void testToString() {
    ObjectMapper mapper = new ObjectMapper();
    List<String> bonds = new ArrayList<>();
    List<String> photos = new ArrayList<>();
    bonds.add("test");
    bonds.add("test");
    photos.add("photo_1.jpg");
    photos.add("photo_2.jpg");

    attributes.setBonds(bonds);
    attributes.setPhotos(photos);
    attributes.setFlaw("flaw");
    attributes.setIdeal("ideal");
    attributes.setCharacteristic("characteristic");
    attributes.setName("name");
    instance.setAttributes(attributes);
    try {
      System.out.println(mapper.writeValueAsString(instance));
    } catch (JsonProcessingException e) {
      e.printStackTrace();
    }
    fail("The test case is a prototype.");

  }
}
