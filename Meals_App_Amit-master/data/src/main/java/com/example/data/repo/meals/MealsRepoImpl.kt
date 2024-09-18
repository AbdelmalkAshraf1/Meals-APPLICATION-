package com.example.data.repo.meals

import com.example.data.remote.meals.MealsApi
import com.example.domain.entity.meals.MealsModelResponse
import com.example.domain.repo.meals.MealsRepo
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class MealsRepoImpl (private val mealsApi: MealsApi) : MealsRepo {
    override suspend fun getMealsCategoriesFromRemote(): MealsModelResponse =
        withContext(Dispatchers.IO){
            return@withContext mealsApi.getMealsRequest()
        }

}