/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JUnitTask;

import JUnitTask.*;
import JUnitTask.Palindrome_1;
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
public class Palindrome_1Test_c {
    
    public Palindrome_1Test_c() {
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

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    @Test
    public void testMethodPalindrome_1() {
        System.out.println("methodPalindrome_1");
        int n1 = 27;
        Palindrome_1 instance = new Palindrome_1();
        String expResult = "NOT palindrome number!";
        String result = instance.methodPalindrome_1(n1);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}
