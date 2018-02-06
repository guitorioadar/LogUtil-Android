package com.vaidoos.guitorio.utillog;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Guitorio on 2/6/2018.
 */

public class LogDebug {

    public void viewLog(Context context, String text){
        Toast.makeText(context, text, Toast.LENGTH_SHORT).show();
    }

}
