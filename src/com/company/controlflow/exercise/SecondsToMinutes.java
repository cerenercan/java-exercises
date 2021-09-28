package com.company.controlflow.exercise;

public class SecondsToMinutes {

    public static String getDurationString(int minutes, int seconds){
        if ((minutes < 0) || (seconds < 0 || seconds > 60)){
            return "Invalid Value.";
        } else {
            int hours = minutes / 60;
            int remainingMinutes = minutes % 60;
            return hours + "h " + remainingMinutes + "m " + seconds + "s";
        }
    }

    public static String getDurationString(int seconds){

        if(seconds < 0){
            return "Invalid Value.";
        } else {
            int minutes = seconds / 60;
            int remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);
        }
    }
}
