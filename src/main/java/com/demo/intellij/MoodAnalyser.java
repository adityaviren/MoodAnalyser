package com.demo.intellij;

public class MoodAnalyser {

    public String message;
    public enum moodEnum{Empty, NonEmpty}

    MoodAnalyser(){

    }
    MoodAnalyser(String message) {
        this.message=message;
    }

    public String analyseMood(){
        moodEnum mood = moodEnum.NonEmpty;
        try {
            if (message.contains("sad"))
                return "SAD";
            else
                return "HAPPY";
        }
        catch (Exception e){
            System.out.println("User entered null");
            mood = moodEnum.Empty;
            return "HAPPY";
        }
        finally {
            System.out.println("Mood was "+mood);
        }

    }


}
