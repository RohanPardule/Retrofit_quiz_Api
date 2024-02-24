package com.example.retrofitpractise1.quiz.model;


import java.util.List;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class ResponseModel {

    @SerializedName("id")
    @Expose
    private Integer id;

    ///////////////
    @SerializedName("question")
    @Expose
    private String question;
    @SerializedName("answers")
    @Expose
    private Answers answers;
    @SerializedName("correct_answers")
    @Expose
    private CorrectAnswers correctAnswers;

    //////

    @SerializedName("description")
    @Expose
    private Object description;

    @SerializedName("multiple_correct_answers")
    @Expose
    private String multipleCorrectAnswers;

    @SerializedName("correct_answer")
    @Expose
    private Object correctAnswer;
    @SerializedName("explanation")
    @Expose
    private Object explanation;
    @SerializedName("tip")
    @Expose
    private Object tip;

    @SerializedName("category")
    @Expose
    private String category;
    @SerializedName("difficulty")
    @Expose
    private String difficulty;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public Object getDescription() {
        return description;
    }

    public void setDescription(Object description) {
        this.description = description;
    }

    public Answers getAnswers() {
        return answers;
    }

    public void setAnswers(Answers answers) {
        this.answers = answers;
    }

    public String getMultipleCorrectAnswers() {
        return multipleCorrectAnswers;
    }

    public void setMultipleCorrectAnswers(String multipleCorrectAnswers) {
        this.multipleCorrectAnswers = multipleCorrectAnswers;
    }

    public CorrectAnswers getCorrectAnswers() {
        return correctAnswers;
    }

    public void setCorrectAnswers(CorrectAnswers correctAnswers) {
        this.correctAnswers = correctAnswers;
    }

    public Object getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(Object correctAnswer) {
        this.correctAnswer = correctAnswer;
    }

    public Object getExplanation() {
        return explanation;
    }

    public void setExplanation(Object explanation) {
        this.explanation = explanation;
    }

    public Object getTip() {
        return tip;
    }

    public void setTip(Object tip) {
        this.tip = tip;
    }



    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getDifficulty() {
        return difficulty;
    }

    public void setDifficulty(String difficulty) {
        this.difficulty = difficulty;
    }


    @Override
    public String toString() {
        return "ResponseModel{" +
                "id=" + id +
                ", question='" + question + '\'' +
                ", description=" + description +
                ", answers=" + answers +
                ", multipleCorrectAnswers='" + multipleCorrectAnswers + '\'' +
                ", correctAnswers=" + correctAnswers +
                ", correctAnswer=" + correctAnswer +
                ", explanation=" + explanation +
                ", tip=" + tip +
                ", category='" + category + '\'' +
                ", difficulty='" + difficulty + '\'' +
                '}';
    }
}
