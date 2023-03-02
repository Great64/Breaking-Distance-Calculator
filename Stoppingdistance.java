package com.company;

public class Stoppingdistance implements AASHTOstoppingdistance {

    private double speed = 0;
    private double grade = 0;
    private double reactionTime = 0;
    private double roadCondition = 0;

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public double getSpeed() {
        return speed;
    }

    public void setGrade(double grade) {
        this.grade = grade;
    }

    public double getGrade() {
        return grade;
    }

    public void setReactionTime(double reactionTime) {
        this.reactionTime = reactionTime;
    }

    public double getReactionTime() {
        return reactionTime;
    }

    public void setRoadCondition(double roadCondition) {
        this.roadCondition = roadCondition;
    }

    public double getRoadCondition() {
        return roadCondition;
    }

    public double stoppingDistance() {
        double answer = (CONSTANT1 * reactionTime * speed) + ((speed * speed) / (CONSTANT2 * (roadCondition + grade)));
        return(answer);
    }

    public void confirm() {
        String reactionTimeConvert = null;
        String roadConditionConvert = null;
        if (reactionTime == 1) {
            reactionTimeConvert = "Keen and alert";
        }
        if (reactionTime == 1.5) {
            reactionTimeConvert = "Average";
        }
        if (reactionTime == 2) {
            reactionTimeConvert = "Tired or old";
        }
        if (reactionTime == 2.5) {
            reactionTimeConvert = "Elderly or intoxicated";
        }
        if (roadCondition == .55) {
            roadConditionConvert = "Wet";
        }
        if (roadCondition == .82) {
            roadConditionConvert = "Dry";
        }
        if (roadCondition == .4) {
            roadConditionConvert = "1-2cm of snow";
        }
        if (roadCondition == .300000000001) {
            roadConditionConvert = "2-7cm of snow";
        }
        if (roadCondition == .200000000001) {
            roadConditionConvert = ">7cm of snow";
        }
        if (roadCondition == .300000000002) {
            roadConditionConvert = "Spots of black ice";
        }
        if (roadCondition == .200000000002) {
            roadConditionConvert = "Some black ice";
        }
        if (roadCondition == .1) {
            roadConditionConvert = "Covered in black ice";
        }
        System.out.println("\u001B[0m" + DIVIDER + "\nInformation Entered:\nSpeed: " + speed + "km/h" + "\nGrade: " + grade * 100 + "%" + "\nReaction Time: " + reactionTimeConvert + "\nRoad Condition: " + roadConditionConvert + "\n" + DIVIDER + "\nAre these correct? (yes/no)");
    }

    public void display () {
        System.out.println(DIVIDER + "\n\u001B[34m" + "The stopping distance is: " + stoppingDistance() + " metres");
    }

} //End class
