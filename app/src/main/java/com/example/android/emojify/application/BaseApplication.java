package com.example.android.emojify.application;

import android.app.Application;

import com.example.android.emojify.BuildConfig;

import timber.log.Timber;

public class BaseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        if (BuildConfig.DEBUG) {
            Timber.plant(new Timber.DebugTree());
        }
    }
}
