package org.hillcrest.chapter6.password;


public class CriteriaChecker {
    private static String lowerletters = "abcdefghijklmnopqrstuvwxyz";
    private static String upperletters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    private static String numbers = "0123456789";
    private static String specials = "!@#$%^&*()-+=";
    private static boolean isLongEnough = false;
    private static boolean hasLowerLetter = false;
    private static boolean hasUpperLetter = false;
    private static boolean hasNumber = false;
    private static boolean hasSpecial = false;


    public static int evaluateCriteria(String password) {
        if (password.length() > 8) {
            isLongEnough = true;
        }
        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isLowerCase(ch)) hasLowerLetter = true;
            else if (upperletters.indexOf(ch) >= 0) hasUpperLetter = true;
            else if (numbers.indexOf(ch) >= 0) hasNumber = true;
            else if (specials.indexOf(ch) >= 0) hasSpecial = true;
        }

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
