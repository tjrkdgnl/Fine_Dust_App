package com.hugh.finedust

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.hugh.core_data.DustRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val dustRepository: DustRepository
) : ViewModel() {


    init {
        viewModelScope.launch {
            dustRepository.getCityDustInformation()
        }
    }

    fun hi(){

    }

}