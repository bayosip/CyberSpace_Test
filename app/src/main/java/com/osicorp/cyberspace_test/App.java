package com.osicorp.cyberspace_test;

import android.app.Application;
import android.content.Context;

import androidx.multidex.MultiDex;

import com.cyberspace.cyberpaysdk.CyberpaySdk;
import com.cyberspace.cyberpaysdk.enums.Mode;
import com.osicorp.cyberspace_test.model.Constants;
import com.osicorp.cyberspace_test.view.activities.ErrorActivity;

import cat.ereza.customactivityoncrash.config.CaocConfig;

public class App extends Application {

    public static Context context;
    private static final String TAG = "Coza Family";

    @Override
    public void onCreate()
    {
        super.onCreate();
        context = getApplicationContext();

        CaocConfig.Builder.create()
                .backgroundMode(CaocConfig.BACKGROUND_MODE_SILENT) //default: CaocConfig.BACKGROUND_MODE_SHOW_CUSTOM
                .trackActivities(true) //default: false
                .minTimeBetweenCrashesMs(2000) //default: 3000
                .logErrorOnRestart(true)
                .errorActivity(ErrorActivity.class) //default: null (default error activity)
                .apply();

        //Test Environment
        CyberpaySdk.INSTANCE.initialiseSdk(Constants.KEY, Mode.Debug);

        //Live Environment
        //CyberpaySdk.INSTANCE.initialiseSdk("LIVE INTEGRATION KEY", Mode.Live)
    }

    @Override
    protected void attachBaseContext(Context base) {
        super.attachBaseContext(base);
        MultiDex.install(this);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
