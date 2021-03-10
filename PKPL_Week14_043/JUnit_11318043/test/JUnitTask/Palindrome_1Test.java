/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnitTask;

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
public class Palindrome_1Test {
    
    public Palindrome_1Test() {
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
     * Test of methodPalindrome_1 method, of class Palindrome_1.
     */
    @Test
    public void testMethodPalindrome_1() {
        System.out.println("methodPalindrome_1");
        int n1 = 1;
        Palindrome_1 instance = new Palindrome_1();
        String expResult = "palindrome number!";
        String result = instance.methodPalindrome_1(n1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
    
}
