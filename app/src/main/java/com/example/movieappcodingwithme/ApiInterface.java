package com.example.movieappcodingwithme;

import com.example.movieappcodingwithme.model.NowPlaying;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiInterface {


    @GET("movie/now_playing")
    Call<NowPlaying> getPlayingMovies(
            @Query("api_key") String apiKey
    );
    @GET("movie/upcoming")
    Call<NowPlaying> getUpcomingMovies(
            @Query("api_key") String apiKey
    );


}
