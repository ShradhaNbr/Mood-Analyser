package com.moodAnalyser;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

public class MoodAnalyserTest {
    MoodAnalyser moodAnalyser = new MoodAnalyser();

//Method to test if the mood is sad
    @Test
    public void whenTestedMood_ifIamInSadMood_shouldReturnSad() {
        String mood = moodAnalyser.analyseMood("I am in sad Mood");
        Assert.assertEquals("sad",mood);
    }

    //Method to test if the mood is happy
    @Test
    public void whenTestedMood_ifHappy_shouldReturnHappy() {
        String mood = moodAnalyser.analyseMood("Happy Days");
        Assert.assertEquals("Happy",mood);
    }

    //Method to test if the no mood is given
    @Test
    public void whenTestedMood_ifNotInAnyMood_shouldReturnHappy() {
        String mood = moodAnalyser.analyseMood("Iam not in a mood");
        Assert.assertEquals("Happy",mood);
    }

    }

