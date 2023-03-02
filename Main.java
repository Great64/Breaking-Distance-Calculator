package com.company;

//AUTHORS NOTE: Any unrealistic answer is due to the flawed formula and not flawed user-input-
//due to the nature of this assignment, the formula was not altered
//as a result, some answers may be negative (or 0), however that is an issue with the formula not the program

import java.util.Scanner;

public abstract class Main implements AASHTOstoppingdistance {

    public static void confirm() {
    }

    public static void main(String[] args) {

        //Scanner
        Scanner s = new Scanner(System.in);

        //Object
        Stoppingdistance acar = new Stoppingdistance();

        //Variables
        boolean done = false;
        boolean udone = false;
        boolean doLooper = false; //This variable is not changed
        String garbage = "";

        //Repeat program if wrong information
        do {
            //Loop for basic error checks
            do {
                //Input for vehicle speed
                do {
                    System.out.println("\u001B[0m" + DIVIDER + "\nEnter speed of the vehicle (km/h)");
                    if (s.hasNextDouble()) {
                        acar.setSpeed(s.nextDouble());
                        done = true;
                        if (acar.getSpeed() > 1227.985) { //https://www.fia.com/fia-world-land-speed-records
                            System.out.println("\u001B[31m" + "ERROR: No vehicle can go this fast");
                            done = false;
                        }
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
                //Grade goes up/down to infinite so there is no need to cap it

                done = false;
                udone = false;

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
                    System.out.println("\u001B[0m" + DIVIDER + "\nPick a road condition\n1. Wet\n2. Dry\n3. 1-2cm of snow\n4. 2-7cm of snow\n5. >7cm of snow\n6. Spots of black ice \n7. Some black ice\n8. Covered in black ice");
                    if (s.hasNextInt()) {
                        switch (s.nextInt()) {
                            case 1:
                                acar.setRoadCondition(.55);
                                done = true;
                                break;
                            case 2:
                                acar.setRoadCondition(.82);
                                done = true;
                                break;
                            case 3:
                                acar.setRoadCondition(.4);
                                done = true;
                                break;
                            case 4:
                                acar.setRoadCondition(.300000000001); //this was done in order to separate case statements
                                done = true;
                                break;
                            case 5:
                                acar.setRoadCondition(.200000000001);  //this was done in order to separate case statements
                                done = true;
                                break;
                            case 6:
                                acar.setRoadCondition(.300000000002);  //this was done in order to separate case statements
                                done = true;
                                break;
                            case 7:
                                acar.setRoadCondition(.200000000002);  //this was done in order to separate case statements
                                done = true;
                                break;
                            case 8:
                                acar.setRoadCondition(.1);
                                done = true;
                                break;
                            default:
                                System.out.println("\u001B[31m" + "ERROR: Pick a corresponding option (1-8)");
                                done = false;
                        }
                    } else {
                        garbage = s.next();
                        System.out.println("\u001B[31m" + "ERROR: Pick a corresponding option (1-8)");
                        done = false;
                    }
                } while (!done);

                done = false;

                //Confirm user input
                acar.confirm();
                do {
                    String userAnswer = s.next();
                    if (userAnswer.equalsIgnoreCase("yes")) {
                        acar.display();
                        System.exit(1);
                    }
                    if (userAnswer.equalsIgnoreCase("no")) {
                        udone = true;
                    } else {
                        udone = false;
                        System.out.println("\u001B[31m" + "ERROR: Answer must be \"yes\" or \"no\"");
                        acar.confirm();
                    }

                } while (!udone);

            } while (!done);

        } while (!doLooper);

    } //End method
}//End class
