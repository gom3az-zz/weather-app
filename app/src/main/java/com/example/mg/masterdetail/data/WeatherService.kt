package com.example.mg.masterdetail.data

import android.content.Context
import okhttp3.Cache
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import java.io.File
import java.util.concurrent.TimeUnit

open class WeatherService {

    companion object {

        fun provideCacheFile(context: Context): File {
            return File(context.cacheDir, "okHttp_cache")
        }

        fun provideCache(cacheFile: File): Cache {
            return Cache(cacheFile, 10 * 1024)
        }

        fun provideOkHttpClient(cache: Cache, interceptor: HttpLoggingInterceptor): OkHttpClient {
            return OkHttpClient.Builder()
                    .cache(cache)
                    .addInterceptor(interceptor)
                    .connectTimeout(5, TimeUnit.SECONDS)
                    .writeTimeout(5, TimeUnit.SECONDS)
                    .readTimeout(5, TimeUnit.SECONDS)
                    .build()
        }

        fun provideLoggingInterceptor(): HttpLoggingInterceptor {
            val interceptor = HttpLoggingInterceptor()
            interceptor.level = HttpLoggingInterceptor.Level.HEADERS
            return interceptor
        }

        fun provideRetrofit(client: OkHttpClient): Retrofit {
            return Retrofit.Builder()
                    .baseUrl(IWeatherClient.BASE_URL)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build()
        }
    }

}