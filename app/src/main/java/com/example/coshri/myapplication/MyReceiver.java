package com.example.coshri.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class MyReceiver extends BroadcastReceiver {

    @Override
    public void onReceive(Context context, Intent intent) {

        String action  = intent.getAction();

        if(action == null)
            Toast.makeText(context,"onReceive \nmy application",Toast.LENGTH_LONG).show();
        else if(action.compareTo("android.intent.action.ACTION_POWER_DISCONNECTED")==0)
            Toast.makeText(context,"onReceive \nACTION_POWER_DISCONNECTED",Toast.LENGTH_LONG).show();
        else if(action.compareTo("android.intent.action.BATTERY_LOW")==0)
            Toast.makeText(context,"onReceive \nBATTERY_LOW",Toast.LENGTH_LONG).show();
        else if(action.compareTo("com.example.coshri.myapplication.my_action_app1")==0)
            Toast.makeText(context,"onReceive \nmy_action_app1",Toast.LENGTH_LONG).show();
       // Toast.makeText(context,"onReceive",Toast.LENGTH_LONG).show();

        context.startActivity(new Intent(context,MainActivity.class));
    }
}
