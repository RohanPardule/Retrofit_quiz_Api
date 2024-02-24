package com.example.retrofitpractise1;

import retrofit2.Call;
import retrofit2.http.GET;

public interface MyAPIcall {



//    url : https://run.mocky.io/v3/f3a60413-83b9-4ff0-a933-b738a51aa2a6
    // fixed section- https://run.mocky.io/
    // variable section - v3/f3a60413-83b9-4ff0-a933-b738a51aa2a6




    @GET("v3/f3a60413-83b9-4ff0-a933-b738a51aa2a6")
    Call<DataModel> getData();


}
