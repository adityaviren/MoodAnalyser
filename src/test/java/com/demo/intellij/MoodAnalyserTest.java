package com.demo.intellij;

import org.hamcrest.CoreMatchers;
import org.junit.Assert;
import org.junit.Test;

public class MoodAnalyserTest {
    /*@Test
    public void testMoodAnalyser() throws Exception {
        MoodAnalyser moodAnalyser = new MoodAnalyser();
        String mood = moodAnalyser.analyseMood(null);

        Assert.assertThat(mood, CoreMatchers.is("SAD"));
    }*/
    @Test
    public void given2Numbers_whenAdded_shouldReturnSum() {
        MoodAnalyser calculator = new MoodAnalyser();
        int addition = calculator.addition(3, 3);
        Assert.assertEquals(6,addition);
    }
    @Test
    public void givenName_whenValid_shouldReturnTrue() {

        MoodAnalyser moodAnalyser = new MoodAnalyser();
        Boolean result = moodAnalyser.firstName("Aditya");
        Assert.assertTrue(result);
    }

}


