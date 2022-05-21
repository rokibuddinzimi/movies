package com.rokib.movie.view.home

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.paging.PagingData
import androidx.paging.cachedIn
import com.rokib.movie.domain.model.Movie
import com.rokib.movie.domain.repository.MovieRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject

@HiltViewModel
class HomeViewModel @Inject constructor(private val movieRepository: MovieRepository) : ViewModel() {
    fun fetchMovies(): Flow<PagingData<Movie>> {
        return movieRepository.getMovies().cachedIn(viewModelScope)
    }
}