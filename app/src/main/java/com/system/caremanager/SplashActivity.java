package com.system.caremanager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class SplashActivity extends Activity {

     PowerManager.WakeLock wakeLock;

    public WakeLockKeeperActivity() {
        this.wakeLock = null;
        return;
    }

    public void finish() {
        try {
            PowerManager.WakeLock wakeLock = this.wakeLock;
            if (wakeLock == null) {
                // branch: cond_0
            }
            boolean result = wakeLock.isHeld();
            if (result == null) {
                // branch: cond_0
            }
            PowerManager.WakeLock wakeLock2 = this.wakeLock;
            wakeLock2.release();
            } catch (Exception e) {
                e.printStackTrace();
            this.finishAndRemoveTask();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void onCreate(Bundle param1) {
        try {
            this.onCreate(param1);
            Window result = this.getWindow();
            int val = 2622464;
            result.setFlags(val, val);
            int val2 = 2131165192;
            this.setContentView(val2);
            Context result2 = this.getApplicationContext();
            String str = "power";
            Object result3 = result.getSystemService(str);
            result = (PowerManager) result;
            int val3 = 268435482;
            String str2 = "AppScreen:LOCK";
            PowerManager.WakeLock result4 = result.newWakeLock(val3, str2);
            this.wakeLock = result;
            boolean result5 = result.isHeld();
            if (result == null) {
                // branch: cond_0
            }
            PowerManager.WakeLock wakeLock = this.wakeLock;
            wakeLock.release();
            PowerManager.WakeLock wakeLock2 = this.wakeLock;
            wakeLock2.acquire();
            Thread.sleep(val3, str2);
            // continue loop -> :goto_4
            } catch (Exception e) {
                e.printStackTrace();
            Boolean result6 = Boolean.valueOf(1);
            boolean result7 = result.booleanValue();
            if (result == null) {
                // branch: cond_1
            }
            Boolean result8 = Boolean.valueOf(null);
            // continue loop -> :goto_0
            boolean result9 = result.booleanValue();
            if (result == null) {
                // branch: cond_2
            }
            Boolean result10 = Boolean.valueOf(null);
            // continue loop -> :goto_1
            boolean result11 = result.booleanValue();
            if (result == null) {
                // branch: cond_3
            }
            Boolean result12 = Boolean.valueOf(null);
            // continue loop -> :goto_2
            boolean result13 = result.booleanValue();
            if (result == null) {
                // branch: cond_4
            }
            Boolean result14 = Boolean.valueOf(null);
            // continue loop -> :goto_3
            this.finish();
            return;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

}