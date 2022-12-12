package com.hugh.core_network

import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("getCtprvnRltmMesureDnsty")
    fun getMinuDustFrcstDspth(
        @Query("serviceKey") serviceKey: String = BuildConfig.serviceKey,
        @Query("returnType") returnType: String = "json",
        @Query("sidoName") sidoName: String = CityType.SEOUL.name
    )
}