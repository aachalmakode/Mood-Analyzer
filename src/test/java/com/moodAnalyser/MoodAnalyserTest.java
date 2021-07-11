package com.moodAnalyser;

import org.junit.Assert;
import org.junit.Test;


public class MoodAnalyserTest {

    @Test
    public void givenMessage_whenSad_ShouldReturn_Sad() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser("I am in Sad Mood");
        String actual = moodAnalyzer.analyseMood();
        String expected = "SAD";
        Assert.assertEquals(expected, actual);

    }


    @Test
    public void givenMessage_whenNotSad_ShouldReturn_Happy() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser("I am in Happy Mood");
        String actual = moodAnalyzer.analyseMood();
        String expected = "HAPPY";
        Assert.assertEquals(expected, actual);

    }

    @Test
    public void givenNullMood_ShouldReturn_Happy() {
        MoodAnalyser moodAnalyzer = new MoodAnalyser(null);
        String actual = moodAnalyzer.analyseMood();
        String expected = "HAPPY";
        Assert.assertEquals(expected, actual);

    }

}