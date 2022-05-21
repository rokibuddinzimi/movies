package com.rokib.movie.data.network

import com.rokib.movie.domain.model.MoviesResponse
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {
    @GET("3/movie/top_rated?api_key=c37d3b40004717511adb2c1fbb15eda4&language=en-US")
    suspend fun getMovies(@Query("page") page: Int): MoviesResponse
}