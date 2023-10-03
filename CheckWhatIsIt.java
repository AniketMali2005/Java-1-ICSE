//Write a program that takes a character input and identifies if it's a digit, uppercase letter, or lowercase letter.
import java.util.Scanner;

public class CheckWhatIsIt {
    public static void main(String[] args){
    start();
    }
    public static void start(){
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter a Key: ");
        char key= sc.nextLine().charAt(0);
        if(key>='a' && key <='z'){
            System.out.println("It is a Small Case Alphabet: "+key);
        }
        else if(key>='A' && key<='Z'){
            System.out.println("It is a Upper Case Alphabet: "+key);
        }
        else if(key>='0' && key<='9'){
            System.out.println("It is a Number: "+key);
        }
        else{
            System.out.println("It is a Symbol: "+key);
        }
    }
}
