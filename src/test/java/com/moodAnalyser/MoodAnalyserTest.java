package com.moodAnalyser;

import org.junit.Assert;
import org.junit.Test;


public class MoodAnalyserTest {


    @Test
    public void givenMessage_whenSad_ShouldReturn_Sad() throws MoodAnalysisException {
        MoodAnalyser moodAnalyzer = new MoodAnalyser("I am in Sad Mood");
        String actual = moodAnalyzer.analyseMood();
        String expected = "SAD";
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void givenMessage_whenNotSad_ShouldReturn_Happy() throws MoodAnalysisException {
        MoodAnalyser moodAnalyzer = new MoodAnalyser("I am in Happy Mood");
        String actual = moodAnalyzer.analyseMood();
        String expected = "HAPPY";
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void givenNullMood_ShouldReturn_Happy() throws MoodAnalysisException {
        MoodAnalyser moodAnalyzer = new MoodAnalyser(null);
        String actual = moodAnalyzer.analyseMood();
        String expected = "HAPPY";
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void givenNullMood_ShouldThrow_Exception() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser(null);
        try {
            moodAnalyzer.analyseMood();
        } catch (MoodAnalysisException e) {
            System.out.println("here");
            Assert.assertEquals(MoodAnalysisException.ExceptionType.ENTERED_NULL, e.exceptionType);
        }
    }

}