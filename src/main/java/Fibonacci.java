/*
*  Assignment [Fibonacci Series]
*  Description: [This code will run the fibonacci series]
*  Name: [Shahriz Malek]
*  ID: [920378989]
*  Class: CSC 211-02
*  Semester: Spring 2020
*/

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 
        int first = 0; //Vars set
        int second = 1; //Vars set
        int fibNumber; 
        
        System.out.println("Enter number of terms for fibonacci series: "); // Asking user to enter a value 
        int user = input.nextInt(); // Takes the user input 
       
        if (user > 1000 || user < 0) { // if the user input is greater than 20 or less than 0 
            System.out.println("Please Enter a number that is between 0 and 20: ");
            user = input.nextInt();
        }
        
        if (user == 0) { // if user value is 0 this if statement will work
            System.out.println("The Fibonacci number is: " + user + " because you entered " + user);
        }
        else if (user == 1) { // if user value is 1 this else if statement will work
            System.out.print("The first two fibonacci seris is: " + first + " " + second );           
        }
        else { 
            for(int i = 2; i <= user; i++){ // This is a for loop that will loop the numbers given by the user 
                fibNumber = first + second; // adds the vars together 
                first = second; // the first number is now changed to second 
                second = fibNumber; // the second number is now changed to fibNumber
                System.out.print(fibNumber + " "); //print out the value
            }
        }
    }
}
