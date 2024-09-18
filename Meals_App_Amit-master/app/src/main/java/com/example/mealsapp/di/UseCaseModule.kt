package com.example.mealsapp.di


import com.example.domain.repo.meals.MealsRepo
import com.example.domain.usecase.meals.GetMealsCategoriesFromRemote
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object UseCaseModule {

    @Provides
    fun provideGetMealsCategoriesFromRemoteUseCase(mealsRepo: MealsRepo): GetMealsCategoriesFromRemote {
        return GetMealsCategoriesFromRemote(mealsRepo)
    }


}