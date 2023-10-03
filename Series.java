import java.util.Scanner;

// Write a program to find the sum of the series 1 + 1/2 + 1/3 + … + 1/n.
public class Series {
    public static void main(String[] args) {
        serys();
    }

    public static void serys() {
        double s = 0, j = 1;
        Scanner sc = new Scanner(System.in);
        double n = sc.nextDouble();
        for (double i = 1; i <= n; i++) {
            s = s + j;
            j = i / (i + 1);
        }
        System.out.println(s);
    }
}
