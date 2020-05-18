package com.myrium.di

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.myrium.data.endpoint
import com.myrium.data.remote.ScryfallService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val appModule = module {
    single { createRetrofit(createOkHttpClient()) }
    single { createNetworkApi(get()) }
}

fun createRetrofit(okHttpClient: OkHttpClient): Retrofit {
    return Retrofit.Builder()
        .addConverterFactory(GsonConverterFactory.create())
        .addCallAdapterFactory(CoroutineCallAdapterFactory())
        .baseUrl(endpoint)
        .client(okHttpClient)
        .build()
}

fun createOkHttpClient(): OkHttpClient = OkHttpClient
    .Builder()
    .addInterceptor(HttpLoggingInterceptor().also {
        it.level = HttpLoggingInterceptor.Level.BODY
    })
    .build()

fun createNetworkApi(retrofit: Retrofit) = retrofit.create(ScryfallService::class.java)