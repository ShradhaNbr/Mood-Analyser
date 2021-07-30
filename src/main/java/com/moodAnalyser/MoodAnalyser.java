package com.moodAnalyser;
public class MoodAnalyser {
    public static String analyseMood(String message) {
        try {
            if (message.contains("sad"))
                return "sad";
            else
                return "Happy";
        } catch (NullPointerException e) {
            return "HAPPY";
        }
    }
}