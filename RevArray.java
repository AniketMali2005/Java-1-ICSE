import java.util.Arrays;

public class RevArray {
    public static void main(String[] args) {
        rev();
    }

    public static void rev() {
        int[] ar = {10, 20, 30, 40, 50, 60};
        int temp = 0, j = ar.length - 1;
        for (int i = 0; i < ar.length / 2; i++) {
            temp= ar[i];
            ar[i] = ar[j];
            ar[j] = temp;
            j--;
        }
        System.out.println(Arrays.toString(ar));
    }
}
