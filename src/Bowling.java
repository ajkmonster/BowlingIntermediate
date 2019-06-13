import java.util.Random;
import java.util.Scanner;

public class Bowling {
    public static void main(String []Args) {
        int score = 0;
        int bowling1;
        int bowling2;
        String x;
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        System.out.println("Welcome to the bowling game! We have 10 frames per 1 game where you have the ability to roll twice.");
        System.out.println("If you get a Strike (All ten pins hit), then you get double the points");
        System.out.println("If you don't get all the pins you have the ability to roll again and get the rest of the pins for a spare.");
        System.out.println("A spare doubles the points for the second roll only.");
        System.out.println("Have Fun!");
        System.out.println("Do you want to bowl? (Yes|No) ");
        x = scan.next();

        if (x.equalsIgnoreCase("yes")){
            System.out.println("We are now starting the game.");
            for (int i = 0; i < 10; i++) {
                System.out.println("Frame #" + (i+1));
                bowling1 = random.nextInt(11);
                if (bowling1 == 10) {
                    System.out.println("Great! It's a strike!");
                    score += bowling1*2;
                    System.out.println("Round 1: " + bowling1);
                    System.out.println("Current Score: " + score);
                    System.out.println();
                } else {
                    score += bowling1;
                    System.out.println("Round 1: " + bowling1);
                    bowling2 = random.nextInt(11-bowling1);
                    System.out.println("Round 2: " + bowling2);
                        if(bowling1+bowling2 == 10) {
                            score += bowling2 * 2;
                            System.out.println("You got a spare! Good Job!");
                            System.out.println("Current Score: " + score);
                            System.out.println();
                        }else {
                            score += bowling2;
                            System.out.println("Current Score: " + score);
                            System.out.println();
                        }
                }
            }

        }
        System.out.println("Thank you for playing");
        System.out.println("Final score: " + score);
    }
}
