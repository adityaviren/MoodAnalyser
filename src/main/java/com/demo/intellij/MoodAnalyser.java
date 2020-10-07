package com.demo.intellij;

public class MoodAnalyser {

    public String message;

    MoodAnalyser(){

    }
    MoodAnalyser(String message) {
        this.message=message;
    }

    public String analyseMood() {
        if (message.contains("sad")) {
            return "SAD";
        } else
            return "HAPPY";

    }


}
