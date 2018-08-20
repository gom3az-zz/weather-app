package com.example.mg.masterdetail;

import android.app.Activity;
import android.app.Application;
import android.content.Context;

import com.example.mg.masterdetail.DI.DaggerIAppComponent;
import com.example.mg.masterdetail.DI.IAppComponent;
import com.example.mg.masterdetail.DI.Modules.AppModule;
import com.example.mg.masterdetail.DI.Modules.NetworkModule;
import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

public class WeatherApplication extends Application {
    private RefWatcher mRefWatcher;
    private IAppComponent appComponent;

    public static WeatherApplication get(Activity activity) {
        return (WeatherApplication) activity.getApplication();
    }

    public static RefWatcher getRefWatcher(Context context) {
        WeatherApplication application = (WeatherApplication) context.getApplicationContext();
        return application.mRefWatcher;
    }

    public IAppComponent getAppComponent() {
        return appComponent;
    }


    @Override
    public void onCreate() {
        super.onCreate();
        initLeakCanary();
        initDagger();
    }

    private void initDagger() {
        appComponent = DaggerIAppComponent.builder()
                .appModule(new AppModule(this))
                .networkModule(new NetworkModule())
                .build();
        appComponent.inject(this);
    }

    private void initLeakCanary() {
        if (LeakCanary.isInAnalyzerProcess(this)) {
            // This process is dedicated to LeakCanary for heap analysis.
            // You should not init your app in this process.
            return;
        }
        mRefWatcher = LeakCanary.install(this);
    }


}
