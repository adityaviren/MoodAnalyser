package com.demo.intellij;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;
import java.util.Scanner;

public class MoodAnalyserTest {


    @Test
    public void testMoodAnalyser() throws MoodAnalysisException{
        Scanner scanner= new Scanner(System.in);
        System.out.println("Enter how you feel");
        String mood_generator =null;
        MoodAnalyser moodAnalyser = new MoodAnalyser(mood_generator);
        String mood = moodAnalyser.analyseMood();
        Assert.assertThat(mood, CoreMatchers.is("HAPPY"));
    }
}