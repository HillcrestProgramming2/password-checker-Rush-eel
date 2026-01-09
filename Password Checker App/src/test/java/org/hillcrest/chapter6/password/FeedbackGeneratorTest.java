package org.hillcrest.chapter6.password;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

/**
 * Test class for FeedbackGenerator.
 * 
 * Tests the feedback generation functionality to ensure correct
 * suggestions are provided for password improvements.
 */
public class FeedbackGeneratorTest {
    /**
     * Tests feedback generation for missing criteria.
     */
    @Test
    void testGenerateFeedback() {
        String password = "Password123";
        String criteria = FeedbackGenerator.generateFeedback(password);
        Assertions.assertEquals("Add at least one special character\n", criteria);
    }


}
