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
public class Reverse_2Test_f {
    
    public Reverse_2Test_f() {
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
     * Test of methodReverse_2 method, of class Reverse_2.
     */
    @Test
    public void testMethodReverse_2() {
        System.out.println("methodReverse_2");
        String original = "nababan";
        Reverse_2 instance = new Reverse_2();
        String expResult = "The reverse of nababan is nababan";
        String result = instance.methodReverse_2(original);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
