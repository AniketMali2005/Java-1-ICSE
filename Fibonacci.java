//Write a program to generate the Fibonacci series up to N numbers.

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        series();
    }

    public static void series() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Value of N: ");
        int n = sc.nextInt();
        int a = 0, b = 1,i,c;
        for (i = 1; i <= n; i++) {
            System.out.println(a);
            c=a+b;
            a=b;
            b=c;
        }
    }
}
