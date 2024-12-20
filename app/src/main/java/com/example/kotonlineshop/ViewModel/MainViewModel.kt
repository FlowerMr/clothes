package com.example.kotonlineshop.ViewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import com.example.kotonlineshop.Model.CategoryModel
import com.example.kotonlineshop.Model.ItemsModel
import com.example.kotonlineshop.Model.SliderModel
import com.example.kotonlineshop.Repository.MainRepository

class MainViewModel: ViewModel() {
    private val repository=MainRepository()

    fun loadBanner():LiveData<MutableList<SliderModel>>{
        return repository.loadBanner()
    }
    fun loadCategory():LiveData<MutableList<CategoryModel>>{
        return repository.loadCategory()
    }
    fun loadPopular():LiveData<MutableList<ItemsModel>>{
        return repository.loadPopular()
    }
    fun loadFiltered(id:String):LiveData<MutableList<ItemsModel>>{
        return repository.loadFilterd(id)
    }

}