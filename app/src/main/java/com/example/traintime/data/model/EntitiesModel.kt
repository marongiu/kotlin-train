package com.example.traintime.data.model

class Station : ArrayList<StationItem>()

data class StationItem(
    val centroidId: Int = 0,
    val displayName: String = "",
    val id: Int = 0,
    val multistation: Boolean = false,
    val name: String = "",
    val timezone: String = ""
)