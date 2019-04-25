package string.problems;

import org.testng.Assert;

import static org.testng.AssertJUnit.assertEquals;

public class UnitTestingStringProblem {
    public static void main(String[] args) throws java.lang.AssertionError {
        //Apply Unit Test into all the methods in this package.

        //Unit test for the Longest word
        try {
            String str1 = "Human brain is a biological learning machine";
            Assert.assertEquals(DetermineLargestWord.LongestWordLength(str1), "biological");
            System.out.println("Determine largest value unit test Passed.");
        } catch (AssertionError as) {
            System.out.println("Determine largest value unit test Failed");
        }

        //Unit test for Anangram Problem
        try {
            Assert.assertEquals(Anagram.checkAnagram("ACT", "CAT"), true);
            System.out.println("Anagram unit test Passed.");
        } catch (AssertionError as) {
            System.out.println("Anagram unit test is failed");
        }

    }
}
