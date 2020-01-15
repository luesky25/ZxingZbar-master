package com.google.zxing.client.android.base;

import android.app.Application;
import android.content.Context;

import androidx.multidex.MultiDex;

public class MyApp extends Application {

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }
}
