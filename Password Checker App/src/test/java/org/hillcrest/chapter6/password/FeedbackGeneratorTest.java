package org.hillcrest.chapter6.password;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class FeedbackGeneratorTest {
    @Test
    void testGenerateFeedback() {
        String password = "Password123";
        String criteria = FeedbackGenerator.generateFeedback(password);
        Assertions.assertEquals("Add at least one special character\n", criteria);
    }


}
