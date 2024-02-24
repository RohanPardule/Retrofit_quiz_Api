package com.example.retrofitpractise1.quiz.model;


import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Answers {

    @SerializedName("answer_a")
    @Expose
    private String answerA;
    @SerializedName("answer_b")
    @Expose
    private String answerB;
    @SerializedName("answer_c")
    @Expose
    private String answerC;
    @SerializedName("answer_d")
    @Expose
    private Object answerD;
    @SerializedName("answer_e")
    @Expose
    private Object answerE;
    @SerializedName("answer_f")
    @Expose
    private Object answerF;

    public String getAnswerA() {
        return answerA;
    }

    public void setAnswerA(String answerA) {
        this.answerA = answerA;
    }

    public String getAnswerB() {
        return answerB;
    }

    public void setAnswerB(String answerB) {
        this.answerB = answerB;
    }

    public String getAnswerC() {
        return answerC;
    }

    public void setAnswerC(String answerC) {
        this.answerC = answerC;
    }

    public Object getAnswerD() {
        return answerD;
    }

    public void setAnswerD(Object answerD) {
        this.answerD = answerD;
    }

    public Object getAnswerE() {
        return answerE;
    }

    public void setAnswerE(Object answerE) {
        this.answerE = answerE;
    }

    public Object getAnswerF() {
        return answerF;
    }

    public void setAnswerF(Object answerF) {
        this.answerF = answerF;
    }

    @Override
    public String toString() {
        return "Answers{" +
                "answerA='" + answerA + '\'' +
                ", answerB='" + answerB + '\'' +
                ", answerC='" + answerC + '\'' +
                ", answerD=" + answerD +
                ", answerE=" + answerE +
                ", answerF=" + answerF +
                '}';
    }
}
