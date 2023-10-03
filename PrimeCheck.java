//Write a program to find out if a number is a prime number.
import java.util.Scanner;

public class PrimeCheck {
    public static void main(String[] args){
        System.out.println(prime());
    }
    public static int prime(){
            int i,check=0;
            Scanner sc= new Scanner(System.in);
            int no= sc.nextInt();
            for(i=1;i<=no;i++)
            if(no%i==0){
                check++;
            }
            if (check==2){
                System.out.println("Prime");
            }
            else{
                System.out.println("No Prime");
            }
            return no;
    }
}
