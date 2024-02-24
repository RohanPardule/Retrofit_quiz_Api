package com.example.retrofitpractise1.quiz.model;



import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class CorrectAnswers {

    @SerializedName("answer_a_correct")
    @Expose
    private String answerACorrect;
    @SerializedName("answer_b_correct")
    @Expose
    private String answerBCorrect;
    @SerializedName("answer_c_correct")
    @Expose
    private String answerCCorrect;
    @SerializedName("answer_d_correct")
    @Expose
    private String answerDCorrect;
    @SerializedName("answer_e_correct")
    @Expose
    private String answerECorrect;
    @SerializedName("answer_f_correct")
    @Expose
    private String answerFCorrect;

    public String getAnswerACorrect() {
        return answerACorrect;
    }

    public void setAnswerACorrect(String answerACorrect) {
        this.answerACorrect = answerACorrect;
    }

    public String getAnswerBCorrect() {
        return answerBCorrect;
    }

    public void setAnswerBCorrect(String answerBCorrect) {
        this.answerBCorrect = answerBCorrect;
    }

    public String getAnswerCCorrect() {
        return answerCCorrect;
    }

    public void setAnswerCCorrect(String answerCCorrect) {
        this.answerCCorrect = answerCCorrect;
    }

    public String getAnswerDCorrect() {
        return answerDCorrect;
    }

    public void setAnswerDCorrect(String answerDCorrect) {
        this.answerDCorrect = answerDCorrect;
    }

    public String getAnswerECorrect() {
        return answerECorrect;
    }

    public void setAnswerECorrect(String answerECorrect) {
        this.answerECorrect = answerECorrect;
    }

    public String getAnswerFCorrect() {
        return answerFCorrect;
    }

    public void setAnswerFCorrect(String answerFCorrect) {
        this.answerFCorrect = answerFCorrect;
    }

    @Override
    public String toString() {
        return "CorrectAnswers{" +
                "answerACorrect='" + answerACorrect + '\'' +
                ", answerBCorrect='" + answerBCorrect + '\'' +
                ", answerCCorrect='" + answerCCorrect + '\'' +
                ", answerDCorrect='" + answerDCorrect + '\'' +
                ", answerECorrect='" + answerECorrect + '\'' +
                ", answerFCorrect='" + answerFCorrect + '\'' +
                '}';
    }
}
