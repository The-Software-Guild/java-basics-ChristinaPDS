import java.awt.*;
import java.util.Random;
import java.util.Scanner;

public class DogGenetics {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        Random rnd = new Random();
        int min = 1;
        int max = 90;

        System.out.println("What is your dog's name?");
        String dogName = scan.nextLine();

        System.out.println(dogName + "  is:");
        int percT = min + rnd.nextInt(max);
        max = max - percT;
        int one = percT;
        System.out.println(one + " St. Bernard");
        percT = min + rnd.nextInt(max);
        max = max - percT;
        int two = percT;
        System.out.println(two + " Chihuahua");
        percT = min + rnd.nextInt(max);
        max = max - percT;
        int three = percT;
        System.out.println(three + " Dramatic RedNosed Asian Pug");
        percT = min + rnd.nextInt(max);
        max = max - percT;
        int four = percT;
        System.out.println(four + " Common Cur");

        int sum = one + two + three + four;
        int five = 100 -sum;
        System.out.println(five + " King Doberman");

        System.out.println("__________________________________________________________");
        int percentage = one + two + three + four +five;
        System.out.println(percentage);


    }

}
