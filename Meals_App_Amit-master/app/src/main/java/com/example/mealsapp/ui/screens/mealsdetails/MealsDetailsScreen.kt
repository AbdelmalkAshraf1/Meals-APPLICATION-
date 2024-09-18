package com.example.mealsapp.ui.screens.mealsdetails


import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.domain.entity.meals.Category

@Preview(showSystemUi = true, showBackground = true)
@Composable
fun MealsDetailsScreen(nav : NavController ?= null,category: Category = Category(),viewmodel: MealsDetailsViewModel = hiltViewModel()){


}