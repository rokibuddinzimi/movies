package com.rokib.movie.app.di

import com.rokib.movie.domain.repository.MovieRepository
import com.rokib.movie.domain.repository.MovieRepositoryImpl
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ViewModelComponent

@Module
@InstallIn(ViewModelComponent::class)
abstract class ViewModelModule {

    @Binds
    abstract fun bindMovieRepository(movieRepository: MovieRepositoryImpl) : MovieRepository
}