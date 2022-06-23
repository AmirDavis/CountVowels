// Name: Amir Davis
// Class: CS 3305/Section# 04
// Term: Spring 2022
// Instructor: Dr. Haddad
// Assignment: 1

import java.util.Scanner;

public class Vowels {

    public static void main(String[] args) {
        int optionNum = 0;
        int index = 0;
        int vowelCount = 0;
        String userInput = "";

        Scanner myScanner = new Scanner(System.in);
        Scanner stringScanner = new Scanner(System.in);
        do{
            System.out.print("""
                    ---------MAIN MENU---------
                    1. Read input string
                    2. Compute number of vowels
                    3. Exit program
                    Enter option number:\s""");
            optionNum = myScanner.nextInt();

            switch(optionNum){
                case 1:
                    System.out.print("\nInput string: ");
                    userInput = stringScanner.nextLine();
                    break;
                case 2:
                    countVowels(userInput, vowelCount, index);
                    break;
                case 3:
                    break;
            }

        }while(optionNum != 3);
        myScanner.close();
        stringScanner.close();
    }

    /*
    The countVowels method takes in 3 parameters. userInput takes in the user's string.
    vowelCount is used to record how many vowels are in the user's string. The method goes through the
    user's string, and if it encounters a vowel, a/A, e/E, i/I, o/O, or u/U, then vowelCount is increased
    by one. index is used to tranverse through the user's string. Every time the countVowels method
    is called, index is increased by one. Once index reaches countVowels base case, which is
    the full length of the user's string input, the method returns the user's
    string input as well as vowelCount.
     */
    public static String countVowels(String userInput, int vowelCount, int index){

        if(userInput.charAt(index) == 'a' || userInput.charAt(index) == 'A') {
            vowelCount++;
        }
        else if(userInput.charAt(index) == 'e' || userInput.charAt(index) == 'E') {
            vowelCount++;
        }
        else if(userInput.charAt(index) == 'i' || userInput.charAt(index) == 'I') {
            vowelCount++;
        }
        else if(userInput.charAt(index) == 'o' || userInput.charAt(index) == 'O') {
            vowelCount++;
        }
        else if(userInput.charAt(index) == 'u' || userInput.charAt(index) == 'U') {
            vowelCount++;
        }

        if(index == userInput.length() - 1){
            System.out.format("\n%-20s %-10s\n", "You entered string: ", userInput);
            System.out.printf("%-20s %-10d\n", "Number of vowels: ", vowelCount);
            return "help me";
        }
        else{
            //System.out.println("Vowel Count: " + vowelCount);
            return countVowels(userInput, vowelCount, index + 1);
        }
    }
}

