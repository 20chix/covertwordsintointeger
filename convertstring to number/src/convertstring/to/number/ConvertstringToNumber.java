/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package convertstring.to.number;

import java.util.Arrays;
import java.util.Scanner;
import static javax.management.Query.value;

/**
 *
 * @author hadielmekawi
 */
public class ConvertstringToNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
      
        
        
        String numbersLetters[] = {"one","two","three","four","five","six","seven","eight","nine"};
        String numbersNumbers[] = {"1","2","3","4","5","6","7","8","9"};
        int value= 0;
        
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.println("Plese enter a number in String");
        String EnteredNumber = scanner.nextLine();
        
        System.out.println("You entered:  " + EnteredNumber);
        
       
       // final String s = "Before-After";
        final String first = EnteredNumber.split("-")[0]; // "Before"
        final String second = EnteredNumber.split("-")[1]; // "After"
        final String third = EnteredNumber.split("-")[2]; // "After"
        
        System.out.println("first part:  " + first);
        System.out.println("second part:  " + second);
        System.out.println("third part:  " + third);
        
        
        
       
        
        switch (first) {
            case "one":
                value = value + 1;
                break;
            case "two":
                value = value + 2;
                break;
                case "three":
                value = value + 3;
                break;
                case "four":
                value = value + 4;
                break;
                case "five":
                value = value + 5;
                break;
                case "six":
                value = value + 6;
                break;
                case "seven":
                value = value + 7;
                break;
                case "eight":
                value = value + 8;
                break;
                case "nine":
                value = value + 9;
                break;
                                  
                
        }
        
        
        
        switch (second) {
            case "hundred":
                value = value *100;
                break;
            case "thousand":
                value = value * 1000;
                break;
            case "milion":
                value = value * 1000000;
                break;
            
        }
        
        switch (third) {
            case "ten":
                value = value + 10;
                break;
            case "twenty":
                value = value + 20;
                break;
            case "thirty":
                value = value + 30;
                break;
            case "fourty":
                value = value + 40;
                break;
            case "fifty":
                value = value + 50;
                break;
            case "sixty":
                value = value + 60;
                break;
            case "seventy":
                value = value + 70;
                break;
            case "eighty":
                value = value + 80;
                break;
            case "ninty":
                value = value + 90;
                break;
            
                
            
        }
        
        
     
     
        System.out.println(" you entered "+value);
           
        
       

}
    
}
