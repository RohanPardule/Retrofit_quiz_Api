package com.example.retrofitpractise1.quiz;


import com.example.retrofitpractise1.quiz.model.ResponseModel;

import java.util.List;

import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.Header;
import retrofit2.http.Multipart;
import retrofit2.http.POST;
import retrofit2.http.Part;

public interface ApiService {
    @GET("questions?apiKey=0vw87uLfvsG4Kr2MDuTZpkyiZGmWSMco7IyJ12KA&limit=10")
    Call<List<ResponseModel>> getQuizQuestions();


}
