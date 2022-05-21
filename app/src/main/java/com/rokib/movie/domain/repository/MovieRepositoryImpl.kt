package com.rokib.movie.domain.repository

import androidx.paging.Pager
import androidx.paging.PagingConfig
import androidx.paging.PagingData
import com.rokib.movie.data.network.ApiService
import com.rokib.movie.data.source.MoviePagingSource
import com.rokib.movie.domain.model.Movie
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

class MovieRepositoryImpl @Inject constructor(private val apiService: ApiService) :
    MovieRepository {

    override fun getMovies(): Flow<PagingData<Movie>> {
        return Pager(
            PagingConfig(pageSize = 40, enablePlaceholders = false, prefetchDistance = 3),
            pagingSourceFactory = { MoviePagingSource(apiService = apiService) }
        ).flow
    }
}