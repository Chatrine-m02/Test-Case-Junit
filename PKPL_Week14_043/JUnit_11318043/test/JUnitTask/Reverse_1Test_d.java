/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnitTask;

import JUnitTask.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author ITD
 */
public class Reverse_1Test_d {
    
    public Reverse_1Test_d() {
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
     * Test of methodReverse_1 method, of class Reverse_1.
     */
    @Test
    public void testMethodReverse_1() {
        System.out.println("methodReverse_1");
        int n = 8998;
        Reverse_1 instance = new Reverse_1();
        String expResult = "The reverse of 8998 is 8998";
        String result = instance.methodReverse_1(n);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
