package com.moodAnalyser;


public class MoodAnalyser {

    private String message;


    //default constructor
    public MoodAnalyser() {

    }

    //constructor
    public MoodAnalyser(String message) {
        this.message = message;
    }

    public String analyseMood() {
        try {
            if (message.toLowerCase().contains("sad"))
                return "SAD";
            return "HAPPY";
        } catch (NullPointerException e) {
            return "HAPPY";
        }

    }
}