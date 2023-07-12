package com.alka;
import java.util.Scanner;
public class calculator {
    public static void main(String[] args) {
        int result;
        Scanner scan = new Scanner(System.in);
        System.out.println("Choose an operator: +, -, *, or /");
          char operator = scan.next().charAt(0);

        System.out.println("Enter first number");
        int a = scan.nextInt();

        System.out.println("Enter second number");
         int b = scan.nextInt();

         switch (operator){

             //add
             case '+':
              result = a+b;
                 System.out.println(result);
                 break;

             //multiplication
             case '*':
              result =a*b;
                 System.out.println(result);
                 break;

              //subtraction
             case'-':
               result = a-b;
                 System.out.println(result);
                 break;

               //division
             case '/':
               result =a/b;
                 System.out.println(result);
                 break;





         }




    }


}
