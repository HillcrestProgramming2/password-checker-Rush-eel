package org.hillcrest.chapter6.password;

/**
 * Checks password criteria and determines strength.
 * 
 * This class evaluates passwords against five criteria: length,
 * lowercase letters, uppercase letters, numbers, and special characters. It counts how
 * many criteria are met and provides a strength rating based on that count.
 */
public class CriteriaChecker {
    private static final String LOWER_LETTERS = "abcdefghijklmnopqrstuvwxyz";
    private static final String UPPER_LETTERS = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static final String NUMBERS = "0123456789";
    private static final String SPECIALS = "!@#$%^&*()-+=";
    private static boolean isLongEnough = false;
    private static boolean hasLowerLetter = false;
    private static boolean hasUpperLetter = false;
    private static boolean hasNumber = false;
    private static boolean hasSpecial = false;

    /**
     * Evaluates password against criteria.
     * 
     * @param password the password to evaluate
     * @return number of criteria that is met (0-5)
     */
    public static int evaluateCriteria(String password) {
        if (password.length() > 8) {
            isLongEnough = true;
        }
        // Check each character for type
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isLowerCase(ch)) hasLowerLetter = true;
            else if (UPPER_LETTERS.indexOf(ch) >= 0) hasUpperLetter = true;
            else if (NUMBERS.indexOf(ch) >= 0) hasNumber = true;
            else if (SPECIALS.indexOf(ch) >= 0) hasSpecial = true;
        }

        // Count criteria met
        int count = 0;
        if (isLongEnough == true) {
            count++;
        }
        if (hasLowerLetter == true) {
            count++;
        }
        if (hasUpperLetter == true) {
            count++;
        }
        if (hasNumber == true) {
            count++;
        }
        if (hasSpecial == true) {
            count++;
        }  return count;
    }

    /**
     * Determines password strength based on criteria count.
     * 
     * @param count number of criteria met
     * @return strength description
     */
    public static String determineStrength(int count) {
        if (count <= 2) {
            return ("0-2: Weak");
        } else if (count == 3) {
            return ("3: Moderate");
        } else if (count > 3) {
            return ("4-5: Strong");
        } return " ";
    }
}
