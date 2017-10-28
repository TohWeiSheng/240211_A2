/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum.assignment2;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author User
 */
public class commentTest {
    
    public commentTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getSem method, of class comment.
     */
    @Test
    public void testGetSem()throws FileNotFoundException, IOException {
        System.out.println("getSem");
        comment instance = new comment();
        String expResult = "";
        String result = instance.getSem();
        assertEquals(expResult, result);
      
    }

    /**
     * Test of getCourse method, of class comment.
     */
    @Test
    public void testGetCourse() {
        System.out.println("getCourse");
        comment instance = new comment();
        String expResult = "";
        String result = instance.getCourse();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of getGroup method, of class comment.
     */
    @Test
    public void testGetGroup() {
        System.out.println("getGroup");
        comment instance = new comment();
        String expResult = "";
        String result = instance.getGroup();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of getTask method, of class comment.
     */
    @Test
    public void testGetTask() {
        System.out.println("getTask");
        comment instance = new comment();
        String expResult = "";
        String result = instance.getTask();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of getName method, of class comment.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        comment instance = new comment();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
   
    }

    /**
     * Test of getMatric method, of class comment.
     */
    @Test
    public void testGetMatric() {
        System.out.println("getMatric");
        comment instance = new comment();
        String expResult = "";
        String result = instance.getMatric();
        assertEquals(expResult, result);
    
    }
    
}
