package com.automation;

public class App {

    // Method 1: Simple calculator to add two numbers
    public int add(int a, int b) {
        return a + b;
    }

    // Method 2: Simple calculator to subtract two numbers
    public int subtract(int a, int b) {
        return a - b;
    }

    // Method 3: Method to check if a given number is even
    public boolean isEven(int number) {
        return number % 2 == 0;
    }

    // Method 4: Method to check if a given email is valid (basic validation)
    public boolean isValidEmail(String email) {
        return email != null && email.contains("@") && email.contains(".");
    }

    // Method 5: Method to find the longest word in a string array
    public String findLongestWord(String[] words) {
        String longest = "";
        for (String word : words) {
            if (word.length() > longest.length()) {
                longest = word;
            }
        }
        return longest;
    }

    // Method 6: Method to check if a string is a palindrome (same forwards and backwards)
    public boolean isPalindrome(String str) {
        if (str == null || str.isEmpty()) {
            return false;
        }
        String reversed = new StringBuilder(str).reverse().toString();
        return str.equals(reversed);
    }

    // Method 7: Method to check if a user is eligible for a senior citizen discount
    public boolean isEligibleForSeniorDiscount(int age) {
        return age >= 65;
    }

    // Method 8: Method to calculate the area of a circle given the radius
    public double calculateAreaOfCircle(double radius) {
        if (radius < 0) {
            throw new IllegalArgumentException("Radius cannot be negative");
        }
        return Math.PI * radius * radius;
    }

    // Method 9: Method to concatenate a list of strings
    public String concatenateStrings(String[] strings) {
        StringBuilder result = new StringBuilder();
        for (String str : strings) {
            result.append(str);
        }
        return result.toString();
    }

    // Method 10: Method to calculate the factorial of a number (recursive)
    public long factorial(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * factorial(n - 1);
        }
    }
}
