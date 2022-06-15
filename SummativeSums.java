import java.awt.*;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class SummativeSums {

    static void methodNumber1(){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the size of the array ");
        int size = scan.nextInt();
        int[] myIntArray = new int[size];
        int sum = 0;

        System.out.println("Enter all the array elements ");
        for (int i = 0; i <size ; i++){
            myIntArray[i] = scan.nextInt();
            sum = sum + myIntArray[i];
        }
        System.out.println("The array elemets are the following: " + Arrays.toString(myIntArray));
        System.out.println("The sum of the array is: " + sum);

    }

    public static void main(String[] args){
        methodNumber1();

        //System.out.println(Arrays.toString(array));
    }
}
