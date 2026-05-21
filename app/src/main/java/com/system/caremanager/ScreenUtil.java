package com.system.caremanager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class ScreenUtil {

    public Scre_enUtil() {
        return;
    }

    public static int dp2px(Context param1, float param2) {
        Resources result = this.getResources();
        DisplayMetrics result2 = this.getDisplayMetrics();
        float density = this.density;
        int val = 1056964608;
        return val;
    }

    public static int getScreenHeight(Context param1) {
        String str = "window";
        Object result = this.getSystemService(str);
        result = (WindowManager) result;
        Display result2 = this.getDefaultDisplay();
        int result3 = this.getHeight();
        return result;
    }

    public static int getStatusBarHeight(Context param1) {
        Context result = this.getApplicationContext();
        Resources result2 = result.getResources();
        String str = "dimen";
        String str2 = "android";
        String str3 = "status_bar_height";
        int result3 = result.getIdentifier(str3, str, str2);
        if (/* if-lez result */) {
            // branch: cond_0
        }
        Context result4 = this.getApplicationContext();
        Resources result5 = this.getResources();
        int result6 = this.getDimensionPixelSize(result);
        // continue loop -> :goto_0
        int val = 100;
        return val;
    }

    public static int px2dp(Context param1, float param2) {
        Resources result = this.getResources();
        DisplayMetrics result2 = this.getDisplayMetrics();
        float density = this.density;
        int val = 1056964608;
        return val;
    }

}