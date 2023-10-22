//Write a program to find the maximum element in an array.
public class ArrayMax {
    public static void main(String[] args) {
        maxElement();
    }

    public static void maxElement() {
        //int marks[]= new int[10];
        int[] marks= {50,60,40,30,80};
        int max= marks[0];
        for(int i=1;i<marks.length;i++)
        {
            if(max<=marks[i]){
                max= marks[i];
            }
        }
        System.out.println(max);
    }
}