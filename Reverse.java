//Write a program to find the reverse of a number.

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        revnum();
    }

    public static void revnum() {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int digit, rev = 0;
        for (int i = 1; i <= num;)
        {
            digit = num % 10;
            rev =  (rev * 10)+ digit;
            num= num/10;
        }
        System.out.println(rev);
    }
}
