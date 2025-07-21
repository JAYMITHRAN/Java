// Question 1
// Revisit Later

// How to Attempt?

// Read second word and change to Uppercase: Write a function (method) that takes as input a string (sentence), and returns its second word in uppercase.

// For example -
// If input1 is "Wipro Technologies Bangalore",
// the function should return "TECHNOLOGIES"

// If input1 is "Hello World",
// the function should return "WORLD"

// If input1 is "Championship 2017 League",
// the function should return "2017"

// If input1 is "Hello",
// the function should return "LESS"

// NOTE 1: If input1 is a sentence with less than 2 words, the function should return the word "LESS".
// NOTE 2: The result should have no leading or trailing spaces.


import java.util.*;

class Friday {
  public static void main(String[] args) {
    Scanner jarvis = new Scanner(System.in);
    String s = jarvis.nextLine();
    jarvis.close();

    String[] arr = s.trim().split("\\s+"); 

    if (arr.length < 2) {
      System.out.print("LESS");
    } else {
      System.out.print(arr[1].toUpperCase());
    }
  }
}