package com.system.caremanager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class UtilityHelper {

    public UtilityHelper() {
        return;
    }

    public static String getNameApp(Context param1) {
        try {
            Context result = this.getApplicationContext();
            PackageManager result2 = result.getPackageManager();
            String result3 = this.getPackageName();
            ApplicationInfo result4 = result.getApplicationInfo(result, null);
            // continue loop -> :goto_0
            } catch (Exception e) {
                e.printStackTrace();
            if (null == null) {
                // branch: cond_0
            }
            CharSequence result5 = result.getApplicationLabel(null);
            // continue loop -> :goto_1
            String str = "(unknown)";
            str = (String) str;
            return str;
        } catch (PackageManager$NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    public static boolean isHuaweiDevice() {
        String MANUFACTURER = Build.MANUFACTURER;
        String result = MANUFACTURER.toLowerCase();
        String str = "huawei";
        boolean result2 = result.contains(str);
        if (result != null) {
            // branch: cond_1
        }
        String str2 = "honor";
        boolean result3 = result.contains(str2);
        if (result == null) {
            // branch: cond_0
        }
        // continue loop -> :goto_0
        // continue loop -> :goto_1
        return 1;
    }

    public static boolean isVivoDevice() {
        String MANUFACTURER = Build.MANUFACTURER;
        String result = MANUFACTURER.toLowerCase();
        String MODEL = Build.MODEL;
        String result2 = MODEL.toLowerCase();
        String str = "vivo";
        boolean result3 = result.contains(str);
        if (result != null) {
            // branch: cond_1
        }
        boolean result4 = result.contains(str);
        if (result == null) {
            // branch: cond_0
        }
        // continue loop -> :goto_0
        // continue loop -> :goto_1
        return 1;
    }

}