package org.hillcrest.chapter6.password;


public class FeedbackGenerator {
    public static String generateFeedback(String password) {
        String specials = "!@#$%^&*()-+=";
        boolean isLongEnough = false;
        boolean hasLowerLetter = false;
        boolean hasUpperLetter = false;
        boolean hasNumber = false;
        boolean hasSpecial = false;
        String feedback = "";

        if (password.length() > 8) {
            isLongEnough = true;
        }

        for (int i = 0; i < password.length(); i++) {
            char ch = password.charAt(i);
            if (Character.isLowerCase(ch)) hasLowerLetter = true;
            else if (Character.isUpperCase(ch)) hasUpperLetter = true;
            else if (Character.isDigit(ch)) hasNumber = true;
            else if (specials.contains(password.substring(i,i+1))) hasSpecial = true;
        }

        if (hasLowerLetter == false) feedback += "Add at least one lowercase letter.\n";
        if (hasUpperLetter == false) feedback += "Add at least one uppercase letter.\n";
        if (hasNumber == false) feedback += "Add at least one number.\n";
        if (hasSpecial == false) feedback += "Include at least one special character. (!@#$%^&*()-+=)\n";
        if (isLongEnough == false) feedback += "At least 8 characters in length.\n";

        return feedback;
    }
}
