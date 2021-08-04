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
  public NPC.Attributes attributes;

  public NPCNGTest() {
  }

  @BeforeClass
  public void setUpClass() throws Exception {
  }

  @AfterClass
  public void tearDownClass() throws Exception {
  }

  @BeforeMethod
  public void setUpMethod() throws Exception {
    instance = new NPC();
    attributes = instance.new Attributes();
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
    String expResult = "name";
    attributes.setName("name");
    String result = attributes.getName();
    assertEquals(result, expResult);
  }

  /**
   * Test of setName method, of class NPC.
   */
  @Test
  public void testSetName() {
    System.out.println("setName");
    String name = "";
    attributes.setName(name);
    assertEquals(attributes.getName(), name);
  }

  /**
   * Test of getBonds method, of class NPC.
   */
  @Test
  public void testGetBonds() {
    System.out.println("getBonds");
    List<String> expResult = new ArrayList<>();
    expResult.add("bond");
    expResult.add("bond");
    attributes.setBonds(expResult);
    List<String> result = attributes.getBonds();
    assertEquals(result.size(), expResult.size());
  }

  /**
   * Test of setBonds method, of class NPC.
   */
  @Test
  public void testSetBonds() {
    System.out.println("setBonds");
    List<String> bonds = new ArrayList<>();
    bonds.add("bond");
    bonds.add("bond");
    attributes.setBonds(bonds);
    assertEquals(attributes.getBonds().size(), 2);
  }

  @Test
  public void testGetPhotos() {
    System.out.println("getBonds");
    List<String> expResult = new ArrayList<>();
    expResult.add("photo");
    expResult.add("photo");
    attributes.setPhotos(expResult);
    assertEquals(attributes.getPhotos().size(), 2);

  }

  @Test
  public void testSetPhotos() {
    System.out.println("setPhotos");
    List<String> photos = new ArrayList<>();
    photos.add("photo");
    photos.add("photo");
    attributes.setPhotos(photos);
    assertEquals(attributes.getPhotos().size(), 2);
  }
  /**
   * Test of getCharacteristic method, of class NPC.
   */
  @Test
  public void testGetCharacteristic() {
    System.out.println("getCharacteristic");
    String expResult = "characteristic";
    attributes.setCharacteristic(expResult);
    String result = attributes.getCharacteristic();
    assertEquals(result, expResult);
  }

  /**
   * Test of setCharacteristic method, of class NPC.
   */
  @Test
  public void testSetCharacteristic() {
    System.out.println("setCharacteristic");
    String characteristic = "characteristic";
    attributes.setCharacteristic(characteristic);
    assertEquals(attributes.getCharacteristic(), characteristic);
  }

  /**
   * Test of getIdeal method, of class NPC.
   */
  @Test
  public void testGetIdeal() {
    System.out.println("getIdeal");
    String expResult = "ideal";
    attributes.setIdeal(expResult);
    String result = attributes.getIdeal();
    assertEquals(result, expResult);
  }

  /**
   * Test of setIdeal method, of class NPC.
   */
  @Test
  public void testSetIdeal() {
    System.out.println("setIdeal");
    String ideal = "ideal";
    attributes.setIdeal(ideal);
    assertEquals(attributes.getIdeal(), ideal);
  }

  /**
   * Test of getFlaw method, of class NPC.
   */
  @Test
  public void testGetFlaw() {
    System.out.println("getFlaw");
    String expResult = "flaw";
    attributes.setFlaw(expResult);
    String result = attributes.getFlaw();
    assertEquals(result, expResult);
  }

  /**
   * Test of setFlaw method, of class NPC.
   */
  @Test
  public void testSetFlaw() {
    System.out.println("setFlaw");
    String flaw = "flaw";
    attributes.setFlaw(flaw);
    assertEquals(attributes.getFlaw(), flaw);
  }
}
