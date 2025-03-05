/* Problem Statement
A picture of chessboard.

Above is the standard representation of a chessboard.

This could be imagined as a 2D cartesian plane, with the x axis being represented by the alphabets and y axis by the numbers.

Given coordinates in the form of string, print if that cell is white or black.

Input Format
First line contains a string s.

Output Format
White or Black.

Constraints
|s|=2

Sample Testcase 0
Testcase Input
b2
Testcase Output
Black
Explanation
Self explanatory.
Sample Testcase 1
Testcase Input
a1
Testcase Output
Black
Explanation
We can clearly see a1 is black in the diagram. */

//Language: Java 8 (oracle 1.8.0_91)

import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next(); // Read input (e.g., "b2")

        int col = s.charAt(0) - 'a' + 1; // Convert 'a'..'h' to 1..8
        int row = s.charAt(1) - '0';     // Convert '1'..'8' to int

        if ((row + col) % 2 == 0) {
            System.out.println("Black");
        } else {
            System.out.println("White");
        }
        
        sc.close();
    }
}