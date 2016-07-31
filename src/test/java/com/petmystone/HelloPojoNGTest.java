/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.petmystone;

import com.anothercaffeinatedday.NpcGenerator;
import com.anothercaffeinatedday.RequestClass;
import com.anothercaffeinatedday.ResponseClass;
import com.amazonaws.services.lambda.runtime.Context;
import static org.testng.Assert.*;

/**
 *
 * @author tstone
 */
public class HelloPojoNGTest {
    
    public HelloPojoNGTest() {
    }

    @org.testng.annotations.BeforeClass
    public static void setUpClass() throws Exception {
    }

    @org.testng.annotations.AfterClass
    public static void tearDownClass() throws Exception {
    }

    @org.testng.annotations.BeforeMethod
    public void setUpMethod() throws Exception {
    }

    @org.testng.annotations.AfterMethod
    public void tearDownMethod() throws Exception {
    }

    /**
     * Test of handleRequest method, of class NpcGenerator.
     */
    @org.testng.annotations.Test
    public void testHandleRequest() {
        System.out.println("handleRequest");
        RequestClass request = null;
        Context context = null;
        NpcGenerator instance = new NpcGenerator();
        ResponseClass expResult = null;
        ResponseClass result = instance.handleRequest(request, context);
        assertEquals(result, expResult);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
