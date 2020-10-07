package com.demo.intellij;

import java.util.regex.Pattern;

public class MoodAnalyser {
    public String analyseMood(String message) {
        if (message.contains("sad")) {
            return "SAD";
        } else
            return "HAPPY";

    }


}
