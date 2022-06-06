package com.example.quizprojekt;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface JsonPlaceHolderApi {

    @GET("question/1")
    Call<List<Post>> getPosts();
}
