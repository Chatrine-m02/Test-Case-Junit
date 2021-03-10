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
public class Palindrome_2Test_g {
    
    public Palindrome_2Test_g() {
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
    public void testMethodPalindrome_2() {
        System.out.println("methodPalindrome_2");
        String original = "read";
        Palindrome_2 instance = new Palindrome_2();
        String expResult = "NOT palindrome string!";
        String result = instance.methodPalindrome_2(original);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
    }
}
