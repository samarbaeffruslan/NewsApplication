package com.androiddevs.mvvmnewsapp.viewModel

import androidx.lifecycle.ViewModel
import com.androiddevs.mvvmnewsapp.repository.NewsRepository

class NewsViewModel(
    val newsRepository: NewsRepository
)
    : ViewModel() {
}