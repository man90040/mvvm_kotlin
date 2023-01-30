package com.rozana.coustomer.Network


import com.google.gson.JsonObject
import com.test.sportsupdates.Model.Match2Response
import com.test.sportsupdates.Model.MatchResponse


import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Url

interface ApiHelper {


    suspend fun getMatchData1(): Response<MatchResponse>
    suspend fun getMatchData2(): Response<Match2Response>

}