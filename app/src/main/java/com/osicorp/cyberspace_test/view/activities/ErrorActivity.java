package com.osicorp.cyberspace_test.view.activities;

import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.osicorp.cyberspace_test.R;
import com.osicorp.cyberspace_test.model.GeneralUtil;

public class ErrorActivity extends AppCompatActivity {

    private Button restartApp;
    private TextView version;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_error);

        restartApp= findViewById(R.id.buttonRestart);
        version = findViewById(R.id.textAppVersion);

        try {
            PackageInfo info = getPackageManager().getPackageInfo(getPackageName(), 0);
            version.setText(getString(R.string.version, info.versionName ));
        } catch (PackageManager.NameNotFoundException e) {
            e.printStackTrace();
            version.setText("");
        }

        restartApp.setOnClickListener(view -> GeneralUtil
                .transitionActivity(ErrorActivity.this, MainActivity.class));
    }
}
