import java.util.Scanner;
public class HealthyHearts {
    public static void main(String[] args){
        Scanner inputReader = new Scanner(System.in);

        int userAge, heartRate;
        String stringAge;
        System.out.println("What is you age? ");
        stringAge = inputReader.nextLine();
        userAge = Integer.parseInt(stringAge);
        heartRate = 220 - userAge;
        double minimum = heartRate / 2;
        double maximum = (heartRate * 85) * 0.01;
        System.out.println("Your maximum heart rate should be " + heartRate + " beats per minute. ");
        System.out.println("Your target HR range is " + minimum + " to "  + maximum);




    }
}