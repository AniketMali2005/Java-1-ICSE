//Write a program to print the pattern of stars
public class StarPattern {
    public static void main(String[] args) {
        pattern();
    }

    public static void pattern() {
        for(int i=1;i<=5;i++){
            for(int j=1;j<=i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
