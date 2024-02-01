/*# Programmers: Joel Robinson
        # Course:CS212
        # Due Date: 2/1/2024
        # Problem Statement: Determine Distance traveled, if it is above or below par, and the amount of points earned.
        # Data In: Jumper's Speed & Hill Chosen
        # Data Out: Points Earned and if Above/Below Par
        # Credits:

 */
import java.util.Scanner;

public class SkiJump {
    public static void main(String[] args) {
        Scanner hill = new Scanner(System.in);
        System.out.println("Is this the large or normal hill?");
        var choice = hill.next();
        choice.replaceAll("\\s+","");
        double points_per_meter = 0;
        double height = 0;
        double par = 0;
        double distance = 0;
        double points_earned = 0;
        var large_hill = "large";
        var normal_hill = "normal";
        if(normal_hill.equalsIgnoreCase(choice)){
            System.out.println("What is the speed you are going? ");
            var speed = hill.nextFloat();
            height = 70;
            points_per_meter = 1.8;
            par = 120;
            var time_air = Math.sqrt((2*height)/9.8);
            distance = speed * time_air;
            points_earned = Math.round(60 + (distance - par)*points_per_meter);

        } else if (large_hill.equalsIgnoreCase(choice)) {
            System.out.println("What is the speed you are going? ");
            var speed = hill.nextFloat();
            height = 46;
            points_per_meter = 2;
            par = 90;
            var time_air = Math.sqrt((2*height)/9.8);
            distance = speed * time_air;
            points_earned = Math.round(60 + (distance - par)*points_per_meter);
        } else{
            System.out.println("Please choose a correct hill type.");
        }
        System.out.println("You traveled " + distance + " meters");
        System.out.println("You earned " + points_earned + " points");

        if(points_earned >= 61){
            System.out.println("Great job for doing better than par!");

        } else if (points_earned < 10) {
            System.out.println("What happened??");
        } else{
            System.out.println("Sorry you didnt go very far.");

        }


    }
}
