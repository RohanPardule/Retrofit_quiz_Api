package com.example.retrofitpractise1.quiz;



import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitInstance {
 // Replace with your API base URL
    private static Retrofit retrofit = null;
    private static RetrofitInstance instance;
    public static RetrofitInstance getInstance(){
        if (instance==null)
        {
            instance = new RetrofitInstance();

        }
        return instance;
    }


    public static ApiService getService(){
//https://quizapi.io/api/v1/questions?apiKey=0vw87uLfvsG4Kr2MDuTZpkyiZGmWSMco7IyJ12KA&limit=10
        if (retrofit == null){

            retrofit = new Retrofit.Builder()
                    .baseUrl("https://quizapi.io/api/v1/")
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit.create(ApiService.class);
    }
}
