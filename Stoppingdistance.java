package com.company;

public class Stoppingdistance {

    private double speed = 0;
    private double grade = 0;
    private double reactionTime = 0;
    private double roadCondition = 0;
    private double stoppingDistance = 0;

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
        double answer = (0.278 * reactionTime * speed) + ((speed * speed) / (254 * (roadCondition + grade)));
        return(answer);
    }

    public void display() {
        System.out.println(stoppingDistance);
    }


} //end class

