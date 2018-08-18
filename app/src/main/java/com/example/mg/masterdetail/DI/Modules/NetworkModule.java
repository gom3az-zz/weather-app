package com.example.mg.masterdetail.DI.Modules;

import android.content.Context;

import com.example.mg.masterdetail.DI.IAppContext;
import com.example.mg.masterdetail.DI.IAppScope;
import com.example.mg.masterdetail.data.IWeatherClient;

import java.io.File;
import java.util.concurrent.TimeUnit;

import dagger.Module;
import dagger.Provides;
import okhttp3.Cache;
import okhttp3.OkHttpClient;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

@Module
public class NetworkModule {

    @Provides
    @IAppScope
    public Cache provideCache(File cacheFile) {
        return new Cache(cacheFile, 10 * 1024);
    }

    @Provides
    @IAppScope
    public File provideCacheFile(@IAppContext Context context) {
        return new File(context.getCacheDir(), "okHttp_cache");

    }

    @Provides
    @IAppScope
    public OkHttpClient provideOkHttpClient(Cache cache) {
        return new OkHttpClient.Builder()
                .cache(cache)
                .connectTimeout(10, TimeUnit.SECONDS)
                .writeTimeout(10, TimeUnit.SECONDS)
                .readTimeout(30, TimeUnit.SECONDS)
                .build();
    }


    @Provides
    @IAppScope
    public Retrofit provideRetrofit(OkHttpClient client) {
        return new Retrofit.Builder()
                .baseUrl(IWeatherClient.BASE_URL)
                .client(client)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
    }

    @Provides
    @IAppScope
    public IWeatherClient provideRetrofitClient(Retrofit retrofit) {
        return retrofit
                .create(IWeatherClient.class);
    }

}
