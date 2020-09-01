package com.osicorp.cyberspace_test.view.activities;

import android.os.Build;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import com.osicorp.cyberspace_test.R;

public class AppFinish extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_finish);
        finishAndRemoveTask();
    }
}
