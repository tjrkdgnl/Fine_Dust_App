package com.hugh.core_data

import com.hugh.core_network.ApiService
import javax.inject.Inject

internal class DustRepositoryImpl @Inject constructor(
    private val apiService: ApiService
) : DustRepository {

    override suspend fun getCityDustInformation() {
        return apiService.getMinuDustFrcstDspth()
    }
}