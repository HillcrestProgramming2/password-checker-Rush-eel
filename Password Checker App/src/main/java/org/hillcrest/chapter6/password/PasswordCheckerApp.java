package org.hillcrest.chapter6.password;
import java.util.Scanner;

/**
 * Main application for password checking.
 * 
 * This application prompts the user to enter a password, evaluates its strength
 * using CriteriaChecker, and displays both the strength rating and detailed feedback
 * for improvement using FeedbackGenerator.
 */
public class PasswordCheckerApp {
    /**
     * Main entry point for password checker application.
     * 
     * @param args command line arguments
     */
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter a password: ");
        String password = in.nextLine();
        int count = CriteriaChecker.evaluateCriteria(password);
        System.out.println("Password Strength:");
        System.out.println(CriteriaChecker.determineStrength(count));
        System.out.println("Suggestions to improve your password:");
        System.out.println(FeedbackGenerator.generateFeedback(password));

    }
}
