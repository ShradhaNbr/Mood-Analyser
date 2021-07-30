package com.moodAnalyser;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class MoodAnalyserTest {
    public String input;
    public String expectedResult;

    public MoodAnalyserTest(String input,String expectedResult){
        this.input=input;
        this.expectedResult=expectedResult;
    }
    @Parameterized.Parameters
    public static Collection parameters(){
        return Arrays.asList(new Object[][]{{"I am sad", "sad"}, {"Be Happy", "Happy"}, {"Its a Happy day", "Happy"}, {"I am Happy", "Happy"},{null,"HAPPY"}});
    }
    /*
     * this is test case for analyse mood Method.
     * if Method Argument contain 'sad' character then it should return SAD
     * else return HAPPY
     */
    @Test
    public void givenMessage_ShouldReturnMood() throws MoodAnalysisException {
        try {
            MoodAnalyser analyser = new MoodAnalyser();
            String mood = analyser.analyseMood(input);
            Assert.assertEquals(expectedResult, mood);
        } catch (MoodAnalysisException e){
            e.printStackTrace();
        }
    }
}