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
public class LOCTest {
    
    public LOCTest() {
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
     * Test of countLineNumber method, of class LOC.
     */
    @Test
    public void testCountLineNumber() {
        System.out.println("countLineNumber");
        LOC instance = new LOC();
        int expResult = 0;
        int result = instance.countLineNumber();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of countBlankLineNumber method, of class LOC.
     */
    @Test
    public void testCountBlankLineNumber() {
        System.out.println("countBlankLineNumber");
        LOC instance = new LOC();
        int expResult = 0;
        int result = instance.countBlankLineNumber();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of countCommentLineNumber method, of class LOC.
     */
    @Test
    public void testCountCommentLineNumber() {
        System.out.println("countCommentLineNumber");
        LOC instance = new LOC();
        int expResult = 0;
        int result = instance.countCommentLineNumber();
        assertEquals(expResult, result);
      
    }
    
}
