package com.example.mealsapp.ui.screens.mealsdetails

import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.example.domain.entity.meals.Category
import com.google.gson.Gson
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

private const val TAG = "MealsDetailsViewModel"
@HiltViewModel
class MealsDetailsViewModel @Inject constructor(savedStateHandle: SavedStateHandle)  : ViewModel() {

}