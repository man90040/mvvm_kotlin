package com.rozana.coustomer.Network


import com.test.sportsupdates.Model.Match2Response
import com.test.sportsupdates.Model.MatchResponse
import retrofit2.Response

class ApiHelperImpl(private val apiService: ApiService) : ApiHelper {



    override suspend fun getMatchData1():  Response<MatchResponse> = apiService.getMatchDetail1()
    override suspend fun getMatchData2():  Response<Match2Response> = apiService.getMatchDetail2()
}