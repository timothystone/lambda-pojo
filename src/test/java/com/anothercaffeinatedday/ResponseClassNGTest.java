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
public class ResponseClassNGTest {

  ResponseClass instance;
  NPC npc;
  List<NPC> npcs;

  public ResponseClassNGTest() {
  }

  @BeforeClass
  public void setUpClass() throws Exception {
  }

  @AfterClass
  public void tearDownClass() throws Exception {
  }

  @BeforeMethod
  public void setUpMethod() throws Exception {
    instance = new ResponseClass();
    npc = new NPC();
    NPC.Attributes attributes = npc.new Attributes();
    attributes.setName("name");
    npc.setAttributes(attributes);
    npcs = new ArrayList<>();
    npcs.add(npc);
  }

  @AfterMethod
  public void tearDownMethod() throws Exception {
  }

  /**
   * Test of getNPCs method, of class ResponseClass.
   */
  @Test
  public void testGetNPCs() {
    System.out.println("getNPCs");
    instance.setNPCs(npcs);
    List<NPC> result = instance.getNPCs();
    assertEquals(result, npcs);
  }

  /**
   * Test of setNPCs method, of class ResponseClass.
   */
  @Test
  public void testSetNPCs() {
    System.out.println("setNPCs");
    instance.setNPCs(npcs);
    assertEquals(instance.getNPCs().size(), 1);
  }

}
