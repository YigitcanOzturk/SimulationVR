package com.hasan.deneme2;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;

public class BroadcastReceiver extends android.content.BroadcastReceiver {
    @SuppressLint("UnsafeProtectedBroadcastReceiver")
    @Override
    public void onReceive(Context context, Intent intent) {
        Intent i = new Intent(context, UnityPlayerActivity.class);
        if(i !=null){
            context.startActivity(i);
        }
    }
}