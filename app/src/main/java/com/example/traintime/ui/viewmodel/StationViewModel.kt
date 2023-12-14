package com.example.traintime.ui.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.traintime.data.model.StationItem
import com.example.traintime.data.repository.TrainRepository
import kotlinx.coroutines.launch

class StationViewModel(
    private val repository: TrainRepository = TrainRepository()
) : ViewModel() {


    private val _liveTrain = MutableLiveData<List<StationItem>>(listOf())
    val liveTrain: LiveData<List<StationItem>> = _liveTrain

    fun getStationName(stationName: String): LiveData<List<StationItem>> {
        viewModelScope.launch {
            repository.getTrainStation(stationName)
                .onSuccess {
                    _liveTrain.postValue(it)
                }
        }
        return liveTrain
    }
}