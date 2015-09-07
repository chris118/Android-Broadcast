package com.xiaopeng.android_broadcastreciever;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class MyReceiver extends BroadcastReceiver {
    public MyReceiver() {
    }

    @Override
    public void onReceive(Context context, Intent intent) {

        String message = intent.getStringExtra("msg");

        Intent newIntent = new Intent(context,MainActivity.class);
        newIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
        newIntent.putExtra("msg", "hello world");
        context.startActivity(newIntent);
    }
}
