package com.automation;

import org.testng.Assert;
import org.testng.annotations.Test;

public class AppTest {

    App app = new App(); // Create an instance of the App class to test its methods

    // Test Case 1: Test the addition method
    @Test
    public void testAdd() {
        Assert.assertEquals(app.add(5, 3), 8, "The addition result should be correct");
    }

    // Test Case 2: Test the subtraction method
    @Test
    public void testSubtract() {
        Assert.assertEquals(app.subtract(10, 4), 6, "The subtraction result should be correct");
    }

    // Test Case 3: Test if the number is even
    @Test
    public void testIsEven() {
        Assert.assertTrue(app.isEven(4), "4 should be even");
        Assert.assertFalse(app.isEven(5), "5 should not be even");
    }
    @Test
    public void testIsEvenAgain() {
        Assert.assertTrue(app.isEven(10), "10 should be even");
        Assert.assertFalse(app.isEven(11), "11 should not be even");
        Assert.assertFalse(app.isEven(13), "13 should not be even");
    }

    // Test Case 4: Test valid email validation
    @Test
    public void testIsValidEmail() {
        Assert.assertTrue(app.isValidEmail("test@example.com"), "This should be a valid email address");
        Assert.assertFalse(app.isValidEmail("testexample.com"), "This should be an invalid email address");
    }

    // Test Case 5: Test finding the longest word in an array
    @Test
    public void testFindLongestWord() {
        String[] words = {"cat", "elephant", "tiger", "dog"};
        Assert.assertEquals(app.findLongestWord(words), "elephant", "The longest word should be 'elephant'");
    }

    // Test Case 6: Test if a string is a palindrome
    @Test
    public void testIsPalindrome() {
        Assert.assertTrue(app.isPalindrome("madam"), "The word 'madam' should be a palindrome");
        Assert.assertFalse(app.isPalindrome("hello"), "The word 'hello' should not be a palindrome");
    }

    // Test Case 7: Test if the person is eligible for a senior citizen discount
    @Test
    public void testIsEligibleForSeniorDiscount() {
        Assert.assertTrue(app.isEligibleForSeniorDiscount(70), "Person aged 70 should be eligible for a senior discount");
        Assert.assertFalse(app.isEligibleForSeniorDiscount(50), "Person aged 50 should not be eligible for a senior discount");
    }

    // Test Case 8: Test area calculation of a circle
    @Test
    public void testCalculateAreaOfCircle() {
        Assert.assertEquals(app.calculateAreaOfCircle(3), 28.274333882308138, "The area of the circle with radius 3 should be correct");
        try {
            app.calculateAreaOfCircle(-1);
            Assert.fail("Should throw IllegalArgumentException for negative radius");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue(e.getMessage().contains("Radius cannot be negative"));
        }
    }

    // Test Case 9: Test string concatenation
    @Test
    public void testConcatenateStrings() {
        String[] strings = {"Hello", " ", "World"};
        Assert.assertEquals(app.concatenateStrings(strings), "Hello World", "The concatenated string should be 'Hello World'");
    }

    // Test Case 10: Test factorial calculation
    @Test
    public void testFactorial() {
        Assert.assertEquals(app.factorial(5), 120, "Factorial of 5 should be 120");
        Assert.assertEquals(app.factorial(0), 1, "Factorial of 0 should be 1");
    }
}
