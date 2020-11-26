package com.guilhermecardoso.core.di

import com.jakewharton.retrofit2.adapter.kotlin.coroutines.CoroutineCallAdapterFactory
import com.guilhermecardoso.core.data.endpoint
import com.guilhermecardoso.core.data.remote.services.ScryfallService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

val networkModule = module {
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

fun createNetworkApi(retrofit: Retrofit): ScryfallService = retrofit.create(
    ScryfallService::class.java)