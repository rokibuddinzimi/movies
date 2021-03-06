package com.rokib.movie.view.moview_details

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.rokib.movie.domain.model.Movie

class SharedViewModel : ViewModel() {
    private val _movie = MutableLiveData<Movie>()
    val movie: LiveData<Movie> = _movie

    fun setMovie(data: Movie) {
        _movie.value = data
    }
}