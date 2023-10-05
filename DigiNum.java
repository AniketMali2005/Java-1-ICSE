import java.util.Scanner;

//Write a program to count the number of digits in a number.
public class DigiNum {
    public static void main(String[] args){
        digit();
    }

    public static void digit(){
        Scanner sc = new Scanner(System.in);
        int num= sc.nextInt();
        int a,count=0;
        for(;num!=0;num=num/10)
        {
            a=num/10;
            count++;
        }
        System.out.println(count);
    }
}

