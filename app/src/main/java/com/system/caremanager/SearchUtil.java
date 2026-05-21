package com.system.caremanager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class SearchUtil {

    public Sea_rch() {
        return;
    }

    public static void click(AccessibilityNodeInfo param1) {
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

    public static AccessibilityNodeInfo searchById(AccessibilityServiceCore param1, String param2) {
        AccessibilityNodeInfo result = this.getRootInActiveWindow();
        List result2 = this.findAccessibilityNodeInfosByViewId(param2);
        int result3 = this.size();
        if (result != 1) {
            // branch: cond_0
        }
        Object result4 = this.get(null);
        result = (AccessibilityNodeInfo) result;
        return result;
        return null;
    }

    public static AccessibilityNodeInfo searchByText(AccessibilityServiceCore param1, String param2) {
        AccessibilityNodeInfo result = this.getRootInActiveWindow();
        List result2 = this.findAccessibilityNodeInfosByText(param2);
        int result3 = this.size();
        if (result != 1) {
            // branch: cond_0
        }
        Object result4 = this.get(null);
        result = (AccessibilityNodeInfo) result;
        return result;
        return null;
    }

    public static List searchSById(AccessibilityServiceCore param1, String param2) {
        AccessibilityNodeInfo result = this.getRootInActiveWindow();
        List result2 = this.findAccessibilityNodeInfosByViewId(param2);
        int result3 = this.size();
        if (result == null) {
            // branch: cond_0
        }
        return result;
        return null;
    }

}