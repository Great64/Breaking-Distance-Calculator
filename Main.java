package com.company;

import java.util.Scanner;

public class Main {

    public static final String DIVIDER = "========================================================================================================";

    public static void main(String[] args) {

        //Scanner
        Scanner s = new Scanner(System.in);

        //Object
        Stoppingdistance acar = new Stoppingdistance();

        //Variables
        boolean done = false;
        String garbage = "";

        //Input for vehicle speed
        do {
            System.out.println("\u001B[0m" + DIVIDER + "\nEnter speed of the vehicle (km/h)");
            if (s.hasNextDouble()) {
                acar.setSpeed(s.nextDouble());
                done = true;
            } else {
                garbage = s.next();
                System.out.println("\u001B[31m" + "ERROR: Number input is required");
                done = false;
            }
        } while (!done);

        done = false;

        //Input for grade of slope
        do {
            System.out.println("\u001B[0m" + DIVIDER + "\nEnter the grade of the slope (%)");
            if (s.hasNextDouble()) {
                acar.setGrade(s.nextDouble() / 100);
                done = true;
            } else {
                garbage = s.next();
                System.out.println("\u001B[31m" + "ERROR: Number input is required");
                done = false;
            }
        } while (!done);

        done = false;

        //Input for reaction time
        do {
            System.out.println("\u001B[0m" + DIVIDER + "\nDescribe reaction time:\n1. Keen and alert\n2. Average\n3. Tired or Old\n4. Elderly or intoxicated");
            if (s.hasNextInt()) {
                switch (s.nextInt()) {
                    case 1:
                        acar.setReactionTime(1);
                        done = true;
                        break;
                    case 2:
                        acar.setReactionTime(1.5);
                        done = true;
                        break;
                    case 3:
                        acar.setReactionTime(2);
                        done = true;
                        break;
                    case 4:
                        acar.setReactionTime(2.5);
                        done = true;
                        break;
                    default:
                        System.out.println("\u001B[31m" + "ERROR: Pick a corresponding option (1-4)");
                        done = false;
                }
            } else {
                garbage = s.next();
                System.out.println("\u001B[31m" + "ERROR: Number input is required");
                done = false;
            }
        } while (!done);

        done = false;

        //Input for road condition
        do {
            System.out.println("\u001B[0m" + DIVIDER + "\nPick a road condition\n1. Wet\n2. Dry");
            if (s.hasNextInt()) {
                switch (s.nextInt()) {
                    case 1:
                        acar.setRoadCondition(.4);
                        done = true;
                        break;
                    case 2:
                        acar.setRoadCondition(.7);
                        done = true;
                        break;
                    default:
                        System.out.println("\u001B[31m" + "ERROR: Pick a corresponding option (1-2)");
                        done = false;
                }
            } else {
                garbage = s.next();
                System.out.println("\u001B[31m" + "ERROR: Pick a corresponding option (1-2)");
                done = false;
            }
        } while (!done);

        done = false;

        System.out.println(DIVIDER + "\n\u001B[34m" + "The stopping distance is: " + acar.stoppingDistance());

    } //end method
}//end class