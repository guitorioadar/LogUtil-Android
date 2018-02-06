package com.vaidoos.guitorio.errorlog;

import android.content.Context;
import android.widget.Toast;

/**
 * Created by Guitorio on 2/6/2018.
 */

public class ErrorDebug {

    public void viewError(Context context, String error){
        Toast.makeText(context, error, Toast.LENGTH_SHORT).show();
    }

}
