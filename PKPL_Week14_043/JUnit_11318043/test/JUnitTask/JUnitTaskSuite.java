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
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

/**
 *
 * @author Chatrine
 */
@RunWith(Suite.class)
@Suite.SuiteClasses
        ({JUnitTask.Reverse_2Test.class,
          JUnitTask.Palindrome_1Test.class,
          JUnitTask.Reverse_1Test.class, 
          JUnitTask.Palindrome_2Test.class})
public class JUnitTaskSuite {

    @BeforeClass
    public static void setUpClass() throws Exception {
    }

    @AfterClass
    public static void tearDownClass() throws Exception {
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }
    
}
