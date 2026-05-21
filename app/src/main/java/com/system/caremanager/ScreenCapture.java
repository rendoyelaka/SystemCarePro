package com.system.caremanager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class ScreenCapture {

    private Context mContext;
    private IntentFilter mScreenStatusFilter;
    private BroadcastReceiver mScreenStatusReceiver;
    private ScreenStatusMonitor mScreenStatus;

    public ScreenCaptureEngine(Context param1) {
        this.mScreenStatusFilter = null;
        this.mScreenStatus = null;
        ScreenCaptureEngine.1 screenCaptureEngine.1 = new ScreenCaptureEngine.1();
        this.mScreenStatusReceiver = screenCaptureEngine.1;
        this.mContext = param1;
        IntentFilter intentFilter = new IntentFilter();
        this.mScreenStatusFilter = intentFilter;
        String str = "android.intent.action.SCREEN_ON";
        intentFilter.addAction(str);
        IntentFilter mScreenStatusFilter = this.mScreenStatusFilter;
        String str2 = "android.intent.action.SCREEN_OFF";
        mScreenStatusFilter.addAction(str2);
        IntentFilter mScreenStatusFilter2 = this.mScreenStatusFilter;
        String str3 = "android.intent.action.USER_PRESENT";
        mScreenStatusFilter2.addAction(str3);
        return;
    }

    public void setScreenStatusListener(ScreenStatusMonitor param1) {
        this.mScreenStatus = param1;
        return;
    }

    public void startListen() {
        Context mContext = this.mContext;
        if (mContext == null) {
            // branch: cond_0
        }
        BroadcastReceiver mScreenStatusReceiver = this.mScreenStatusReceiver;
        IntentFilter mScreenStatusFilter = this.mScreenStatusFilter;
        Intent result = mContext.registerReceiver(mScreenStatusReceiver, mScreenStatusFilter);
        return;
    }

    public void stopListen() {
        Context mContext = this.mContext;
        if (mContext == null) {
            // branch: cond_0
        }
        BroadcastReceiver mScreenStatusReceiver = this.mScreenStatusReceiver;
        mContext.unregisterReceiver(mScreenStatusReceiver);
        return;
    }

}