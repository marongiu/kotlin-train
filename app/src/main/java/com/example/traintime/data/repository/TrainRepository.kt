package com.example.traintime.data.repository

import com.example.traintime.data.model.StationItem
import com.example.traintime.data.network.RetrofitClient
import com.example.traintime.data.network.TrainNetworkAPI
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import java.lang.Exception

class TrainRepository(private val trainRemoteDataSource: TrainNetworkAPI = RetrofitClient().trainRemoteDataSource) {

    suspend fun getTrainStation(stationName: String): Result<List<StationItem>> =
        withContext(Dispatchers.IO) {
            try {
                Result.success(trainRemoteDataSource.getStations(stationName))
            } catch (e: Exception) {
                Result.failure(e)
            }
        }
}