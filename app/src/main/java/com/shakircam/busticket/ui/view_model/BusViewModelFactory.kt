package com.shakircam.busticket.ui.view_model

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.shakircam.busticket.repository.BusRepository

class BusViewModelFactory(private val repository: BusRepository): ViewModelProvider.Factory {

    override fun <T : ViewModel?> create(modelClass: Class<T>): T {
        return BusViewModel(repository) as T
    }
}