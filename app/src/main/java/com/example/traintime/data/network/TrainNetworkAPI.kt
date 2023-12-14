package com.example.traintime.data.network

import com.example.traintime.data.model.StationItem
import retrofit2.http.GET
import retrofit2.http.Query

interface TrainNetworkAPI {

    @GET("locations/search")
    suspend fun getStations(
        @Query("name") name: String
    ): List<StationItem>
}