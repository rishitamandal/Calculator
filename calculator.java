package com.rishita;
import java.util.Scanner;
public class Code {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int ans = 0;
        while(true){
            //take operator as input
            System.out.print("Enter the Operator : ");
             char op = sc.next().trim().charAt(0);
             if(op == '+' ||op == '-' ||op == '*' ||op == '/' ||op == '%'){
                 System.out.print("Enter 1st Number : ");
                 int num1 = sc.nextInt();
                 System.out.print("Enter 2nd Number : ");
                 int num2 = sc.nextInt();

                 if(op == '+'){
                     ans = num1 + num2;
                 }
                 if(op == '-'){
                    ans = num1 - num2;
                }
                if(op == '*'){
                    ans = num1 * num2;
                }
                if(op == '/'){
                    if (num2 != 0){
                    ans = num1 / num2;
                    }
                }
                if(op == '%'){
                    ans = num1 % num2;
                }
            }else if (op == 'x' || op == 'X'){
                 break;
            }else {
                System.out.println("Invalid Operation!!");
            }
            System.out.println(ans);
       }

    }
}
