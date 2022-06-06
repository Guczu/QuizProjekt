package com.example.quizprojekt;

public class Post {

    private String question;

    private String[] answers;

    private int points;

    private boolean lastQuestion;

    public String getQuestion() {
        return question;
    }

    public String[] getAnswers() {
        return answers;
    }

    public int getPoints() {
        return points;
    }

    public boolean isLastQuestion() {
        return lastQuestion;
    }
}
