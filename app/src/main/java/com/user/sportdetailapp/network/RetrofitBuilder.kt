package com.rozana.coustomer.Network


import com.google.gson.GsonBuilder
import okhttp3.OkHttpClient
import okhttp3.Protocol
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.util.*
import java.util.concurrent.TimeUnit

object RetrofitBuilder {

   // private  val BASE_URL =  "https://preproduction.rozana.in/api/v5/"
    private  val BASE_URL =  "https://demo.sportz.io/"


    var interceptor = HttpLoggingInterceptor()
  //  interceptor.setLevel(HttpLoggingInterceptor.Level.BODY)

    var client = OkHttpClient.Builder()
        .addInterceptor(interceptor)
        .protocols(Arrays.asList(Protocol.HTTP_2, Protocol.HTTP_1_1, Protocol.SPDY_3))
        .connectTimeout(20, TimeUnit.SECONDS)
        .readTimeout(20000, TimeUnit.SECONDS)
        .writeTimeout(10000, TimeUnit.SECONDS)
        .retryOnConnectionFailure(true)
        .build()

    var gson = GsonBuilder()
        .setLenient()
        .create()

    private fun getRetrofit(): Retrofit {
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create(gson))
            .client(client)
            .build()
    }

    val apiService: ApiService = getRetrofit().create(ApiService::class.java)
}