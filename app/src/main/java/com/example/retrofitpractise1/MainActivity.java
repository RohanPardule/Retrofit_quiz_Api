package com.example.retrofitpractise1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import com.example.retrofitpractise1.quiz.RetrofitInstance;
import com.example.retrofitpractise1.quiz.model.ResponseModel;

import java.util.ArrayList;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
TextView textView;
RetrofitInstance retrofitInstance;
    ArrayList<ResponseModel> responseModelArrayList;

    ArrayList<String> finalAnswers;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        retrofitInstance=new RetrofitInstance();
        fetchQuizQuestions();
    }

    private void fetchQuizQuestions() {
        //intializing my both arraylists
        responseModelArrayList=new ArrayList<>();
        finalAnswers=new ArrayList<>();
        Call<List<ResponseModel>> call = retrofitInstance.getService().getQuizQuestions();
        call.enqueue(new Callback<List<ResponseModel>>() {
            @Override
            public void onResponse(Call<List<ResponseModel>> call, Response<List<ResponseModel>> response) {
                if (response.isSuccessful()) {
                    // Handle successful response
                    responseModelArrayList= (ArrayList<ResponseModel>) response.body();

                for(int i=0;i<responseModelArrayList.size();i++)
                {
                    //10times

                   ResponseModel model= responseModelArrayList.get(i);
                   String[] answers={ model.getAnswers().getAnswerA(),
                           (String) model.getAnswers().getAnswerB(),
                           (String) model.getAnswers().getAnswerC(),
                           (String) model.getAnswers().getAnswerD(),
                           (String) model.getAnswers().getAnswerE(),
                           (String) model.getAnswers().getAnswerF()
                   };

                    String[] correctAnswers={
                            model.getCorrectAnswers().getAnswerACorrect(),
                            model.getCorrectAnswers().getAnswerBCorrect(),
                            model.getCorrectAnswers().getAnswerCCorrect(),
                            model.getCorrectAnswers().getAnswerDCorrect(),
                            model.getCorrectAnswers().getAnswerECorrect(),
                            model.getCorrectAnswers().getAnswerFCorrect()
                    };
                    for(int j=0;j<correctAnswers.length;j++)
                    {
                        if(correctAnswers[j].equals("true"))
                        {
                            finalAnswers.add(answers[j]);
                           return;
                        }


                    }




                }

                    Toast.makeText(MainActivity.this, "succesfull", Toast.LENGTH_SHORT).show();
                    Log.d("ResponseModel",responseModelArrayList.toString());
                    Log.d("ResponseModel2",finalAnswers.toString());



                    // Process the data here
                } else {
                    // Handle unsuccessful response
                    Toast.makeText(MainActivity.this, "unsuccesfulll", Toast.LENGTH_SHORT).show();
                }
            }

            @Override
            public void onFailure(Call<List<ResponseModel>> call, Throwable t) {
                 Toast.makeText(MainActivity.this, "unsuccesfull 12345", Toast.LENGTH_SHORT).show();

                 Log.d("OnFailureError",t.toString());
            }
        });
    }

}