package com.example.asus.padc_ex4;

import android.app.Application;
import android.content.Context;

/**
 * Created by Asus on 6/27/2016.
 */
public class PADCExApp extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = this.getApplicationContext();

    }

    public static Context getContext() {
        return context;
    }
}
