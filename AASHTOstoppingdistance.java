package com.company;

public interface AASHTOstoppingdistance {

    //Constants
    public static final double CONSTANT1 = 0.278;
    public static final double CONSTANT2 = 254;

    //Methods
    double stoppingDistance(double speed, double grade, double reactionTime, double roadCondition);
    void setSpeed(double speed);
    public double getSpeed();
    void setGrade(double grade);
    double getGrade();
    void setReactionTime(double reactionTime);
    double getReactionTime();
    void setRoadCondition(double roadCondition);
    double getRoadCondition();


}
