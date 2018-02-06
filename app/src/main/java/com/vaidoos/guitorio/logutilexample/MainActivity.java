package com.vaidoos.guitorio.logutilexample;

import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.vaidoos.guitorio.errorlog.ErrorDebug;
import com.vaidoos.guitorio.utillog.LogDebug;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void logButton(View view) {
        new LogDebug().viewLog(getApplicationContext(),"This is the log");
    }

    public void errorButton(View view) {
        new ErrorDebug().viewError(getApplicationContext(),"An error ha occured");

    }
}
