package org.hillcrest.chapter6.password;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Test class for CriteriaChecker.
 * 
 * Tests the password evaluation and strength determination functionality
 * to ensure criteria checking works correctly.
 */
public class CriteriaCheckerTest {
    /**
     * Tests password criteria evaluation.
     */
    @Test
    void testEvaluateCriteria() {
        String password = "Password123";
        int criteria = CriteriaChecker.evaluateCriteria(password);
        Assertions.assertEquals(4,criteria);
    }
    
    /**
     * Tests password strength determination.
     */
    @Test
    void testDetermineStrength() {
        String password = "Password123";
        int criteria = CriteriaChecker.evaluateCriteria(password);
        String determine = CriteriaChecker.determineStrength(criteria);
        Assertions.assertEquals("4-5: Strong", determine);
    }
}
