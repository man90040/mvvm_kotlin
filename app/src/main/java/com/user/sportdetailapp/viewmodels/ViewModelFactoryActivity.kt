package com.user.sportdetailapp.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.rozana.coustomer.Network.ApiHelper




class ViewModelFactoryActivity(

    private val apiHelper: ApiHelper,



    ) : ViewModelProvider.Factory {

       override  fun <T : ViewModel> create(modelClass: Class<T>): T {

           if (modelClass.isAssignableFrom(MatchDetail1Model::class.java)) {
               return MatchDetail1Model(apiHelper) as T
           }




           throw IllegalArgumentException("Unknown class name")
       }





}