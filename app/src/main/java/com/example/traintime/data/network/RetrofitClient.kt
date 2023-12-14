package com.example.traintime.data.network

import com.google.gson.Gson
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RetrofitClient() {

    private val movieBaseAddress = "https://www.lefrecce.it/Channels.Website.BFF.WEB/website/"

    private val loggingInterceptor = HttpLoggingInterceptor().apply {
        setLevel(HttpLoggingInterceptor.Level.BODY)
    }

    private val httpClient = OkHttpClient.Builder()
        .addInterceptor(loggingInterceptor)
        .build()

    val trainRemoteDataSource =
        Retrofit.Builder()
            .client(httpClient)
            .addConverterFactory(GsonConverterFactory.create(Gson()))
            .baseUrl(movieBaseAddress)
            .build()
            .create(TrainNetworkAPI::class.java)
}
