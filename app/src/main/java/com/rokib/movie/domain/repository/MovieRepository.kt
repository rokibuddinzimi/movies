package com.rokib.movie.domain.repository

import androidx.paging.PagingData
import com.rokib.movie.domain.model.Movie
import kotlinx.coroutines.flow.Flow

interface MovieRepository {
    fun getMovies() : Flow<PagingData<Movie>>
}