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
public class excelTest {
    
    public excelTest() {
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
     * Test of Details method, of class excel.
     */
    @Test
    public void testDetails() {
        System.out.println("Details");
        String semester = "";
        String course = "";
        String group = "";
        String task = "";
        excel instance = null;
        excel expResult = null;
        excel result = instance.Details(semester, course, group, task);
        assertEquals(expResult, result);
      
    }

    /**
     * Test of keyword method, of class excel.
     */
    @Test
    public void testKeyword() {
        System.out.println("keyword");
        Map<String, Integer> map = null;
        excel instance = null;
        excel expResult = null;
        excel result = instance.keyword(map);
        assertEquals(expResult, result);
       
    }

    /**
     * Test of Data method, of class excel.
     */
    @Test
    public void testData() {
        System.out.println("Data");
        Map<String, Integer> map = null;
        String name = "";
        String matric = "";
        String loc = "";
        String blank = "";
        String comment = "";
        String actLoc = "";
        String ttl = "";
        excel instance = null;
        excel expResult = null;
        excel result = instance.Data(map, name, matric, loc, blank, comment, actLoc, ttl);
        assertEquals(expResult, result);
  
    }

    /**
     * Test of processDataObject method, of class excel.
     */
    @Test
    public void testProcessDataObject() {
        System.out.println("processDataObject");
        excel instance = null;
        excel expResult = null;
        excel result = instance.processDataObject();
        assertEquals(expResult, result);
       
    }

    /**
     * Test of create method, of class excel.
     */
    @Test
    public void testCreate() {
        System.out.println("create");
        excel instance = null;
        excel expResult = null;
        excel result = instance.create();
        assertEquals(expResult, result);
    
    }

    /**
     * Test of write method, of class excel.
     */
    @Test
    public void testWrite() {
        System.out.println("write");
        excel instance = null;
        excel expResult = null;
        excel result = instance.write();
        assertEquals(expResult, result);
      
    }
    
}
