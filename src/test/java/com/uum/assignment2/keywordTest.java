/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uum.assignment2;

import java.util.Map;
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
public class keywordTest {
    
    public keywordTest() {
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
     * Test of countKeywords method, of class keyword.
     */
    @Test
    public void testCountKeywords() throws Exception {
        System.out.println("countKeywords");
        keyword instance = new keyword();
        Map<String, Integer> expResult = null;
        Map<String, Integer> result = instance.countKeywords();
        assertEquals(expResult, result);
     
    }

    /**
     * Test of noKeywords method, of class keyword.
     */
    @Test
    public void testNoKeywords() {
        System.out.println("noKeywords");
        keyword instance = new keyword();
        int expResult = 0;
        int result = instance.noKeywords();
        assertEquals(expResult, result);
     
    }
    
}
