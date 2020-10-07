package com.demo.intellij;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {


    @Test
    public void testMoodAnalyser(){
        MoodAnalyser moodAnalyser = new MoodAnalyser("This is a sad message");
        String mood1 = moodAnalyser.analyseMood();
        Assert.assertThat(mood1, CoreMatchers.is("SAD"));
        MoodAnalyser moodAnalyse = new MoodAnalyser("This is a happy message");
        String mood2 = moodAnalyse.analyseMood();
        Assert.assertThat(mood2, CoreMatchers.is("HAPPY"));
    }
}