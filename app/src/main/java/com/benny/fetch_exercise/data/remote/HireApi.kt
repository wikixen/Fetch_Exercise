package com.benny.fetch_exercise.data.remote

import com.benny.fetch_exercise.domain.models.HiringListItem
import retrofit2.http.GET

interface HireApi {
    @GET(PATH_URL)
    suspend fun getHireList(): List<HiringListItem>

    companion object{
        const val PATH_URL = "/hiring.json"
    }
}