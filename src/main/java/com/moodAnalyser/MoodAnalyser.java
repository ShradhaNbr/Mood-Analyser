package com.moodAnalyser;
public class MoodAnalyser {
    enum s
    {
        S1
    }
    public static String analyseMood(String message) throws MoodAnalysisException {
        try {
            if (message.contains("sad"))
                return "sad";
            else
                return "Happy";
        } catch (NullPointerException e) {
            throw new MoodAnalysisException("Invalid Message");
        }
    }
}