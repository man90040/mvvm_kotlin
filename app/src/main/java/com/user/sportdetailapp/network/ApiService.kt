package com.rozana.coustomer.Network


import com.test.sportsupdates.Model.Match2Response
import com.test.sportsupdates.Model.MatchResponse
import retrofit2.Response
import retrofit2.http.*


interface ApiService {


    @GET("sapk01222019186652.json")
    suspend fun getMatchDetail1(): Response<MatchResponse>

    @GET("nzin01312019187360.json")
    suspend fun getMatchDetail2(): Response<Match2Response>




}



