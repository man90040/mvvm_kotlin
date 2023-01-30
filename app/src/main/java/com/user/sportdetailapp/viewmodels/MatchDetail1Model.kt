package com.user.sportdetailapp.viewmodels

import android.util.Log
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import com.google.gson.JsonObject
import com.rozana.coustomer.Network.ApiHelper
import com.test.sportsupdates.Model.Match2Response
import com.test.sportsupdates.Model.MatchResponse

import kotlinx.coroutines.*

class MatchDetail1Model(var apiHelper: ApiHelper): ViewModel() {

    val errorMessage = MutableLiveData<String>()

    val setMatchData1teamInning = MutableLiveData<List<MatchResponse.Inning>>()
    val setMatchData1teamMatchdetail = MutableLiveData<List<MatchResponse.Matchdetail>>()
    val setMatchData1teamNotes= MutableLiveData<List<MatchResponse.Notes>>()
    val setMatchData1teamTeams = MutableLiveData<List<MatchResponse.Teams>>()


    val setMatchData2teamInning = MutableLiveData<List<Match2Response.Inning>>()
    val setMatchData2teamMatchdetail = MutableLiveData<List<Match2Response.Matchdetail>>()
    val setMatchData2teamNotes= MutableLiveData<List<Match2Response.Notes>>()
    val setMatchData2teamTeams = MutableLiveData<List<Match2Response.Teams>>()

    var job: Job? = null
    val exceptionHandler = CoroutineExceptionHandler { _, throwable ->
        onError("Exception handled: ${throwable.localizedMessage}")
    }
    val loading = MutableLiveData<Boolean>()



    fun getMatch1Response() {

        job = CoroutineScope(Dispatchers.IO + exceptionHandler).launch {
            val response = apiHelper.getMatchData1();
            withContext(Dispatchers.Main) {
                if (response.isSuccessful) {

                    Log.d("Response", "getMatch1Response: "+response)
                    val allteamInning = mutableListOf<MatchResponse.Inning>()
                    response.body()?.innings?.let { allteamInning.add(it.get(0)) }
                    setMatchData1teamInning.postValue(allteamInning)

                    val allteamTeams = mutableListOf<MatchResponse.Teams>()
                    response.body()?.teams?.let { allteamTeams.add(it) }
                    setMatchData1teamTeams.postValue(allteamTeams)

                    val allteamNotes = mutableListOf<MatchResponse.Notes>()
                    response.body()?.notes?.let { allteamNotes.add(it) }
                    setMatchData1teamNotes.postValue(allteamNotes)

                    val allteamMatchdetail= mutableListOf<MatchResponse.Matchdetail>()
                    response.body()?.matchdetail?.let { allteamMatchdetail.add(it) }
                    setMatchData1teamMatchdetail.postValue(allteamMatchdetail)


                    loading.value = false
                } else {
                    onError("Error : ${response.message()} ")
                }
            }
        }

    }

    fun getMatch2Response() {

        job = CoroutineScope(Dispatchers.IO + exceptionHandler).launch {
            val response = apiHelper.getMatchData2();
            withContext(Dispatchers.Main) {
                if (response.isSuccessful) {

                    Log.d("Response", "getMatch1Response: "+response)
                    val allteamInning = mutableListOf<Match2Response.Inning>()
                    response.body()?.innings?.let { allteamInning.add(it.get(0)) }
                    setMatchData2teamInning.postValue(allteamInning)

                    val allteamTeams = mutableListOf<Match2Response.Teams>()
                    response.body()?.teams?.let { allteamTeams.add(it) }
                    setMatchData2teamTeams.postValue(allteamTeams)

                    val allteamNotes = mutableListOf<Match2Response.Notes>()
                    response.body()?.notes?.let { allteamNotes.add(it) }
                    setMatchData2teamNotes.postValue(allteamNotes)

                    val allteamMatchdetail= mutableListOf<Match2Response.Matchdetail>()
                    response.body()?.matchdetail?.let { allteamMatchdetail.add(it) }
                    setMatchData2teamMatchdetail.postValue(allteamMatchdetail)


                    loading.value = false
                } else {
                    onError("Error : ${response.message()} ")
                }
            }
        }

    }

    private fun onError(message: String) {
        errorMessage.value = message
        loading.value = false
    }
}