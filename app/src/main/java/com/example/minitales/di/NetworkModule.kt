package com.example.minitales.di

import com.bilalhaliloglu.network.MiniTalesHttpClientBuilder
import com.bilalhaliloglu.network.RequestHandler
import com.example.minitales.BuildConfig
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import io.ktor.client.HttpClient
import io.ktor.http.URLProtocol

@Module
@InstallIn(SingletonComponent::class)
class NetworkModule {

    @Provides
    fun provideHttpClient(): HttpClient = MiniTalesHttpClientBuilder()
        .protocol(URLProtocol.HTTPS)
        .host(BuildConfig.MINI_TALES_HOST)
        .build()

    @Provides
    fun provideRequestHandler(client: HttpClient): RequestHandler = RequestHandler(client)
}