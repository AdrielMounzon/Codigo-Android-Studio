package com.ucb.framework.service

import com.chuckerteam.chucker.api.ChuckerInterceptor
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory
import android.content.Context

class RetrofitBuilder(
    val context: Context
) {


    private fun getRetrofit(): Retrofit {


        val client = OkHttpClient.Builder()
            .addInterceptor(ChuckerInterceptor.Builder(context).build())
            .build()


        return Retrofit.Builder()
            .addConverterFactory(MoshiConverterFactory.create())
            .baseUrl(Companion.BASE_URL)
            .client(client)
            .build()
    }
    val apiService: IApiService = getRetrofit().create(IApiService::class.java)


    companion object {
        private const val BASE_URL = "https://api.github.com"
    }
}
