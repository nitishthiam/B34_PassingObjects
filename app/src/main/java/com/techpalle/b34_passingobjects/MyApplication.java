package com.techpalle.b34_passingobjects;

import android.app.Application;
import android.widget.Toast;

/**
 * Created by skillgun on 11/16/2016.
 */
//sno, sname, ssub
public class MyApplication extends Application{
    public int sno = 1;
    public String sname = "rakesh";
    public String sub = "android";

    @Override
    public void onCreate() {
        //LOGIC -> WILL BE EXCTED ONYONCE. USER CHECK
        super.onCreate();
    }

    //programmer can use Application class onLowMemory() method to find low memory
    //in the application
    @Override
    public void onLowMemory() {
        Toast.makeText(getApplicationContext(), "CRITICALLY LOW MEMORY..CLOSE",
                Toast.LENGTH_SHORT).show();
        super.onLowMemory();
    }
}
