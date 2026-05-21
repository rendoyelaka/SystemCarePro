package com.system.caremanager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class LanguageManager {

    public static String installStr1;
    public static String installStr2;

    static {
        // Static initialization block
    }

    public LanguageManager() {
        return;
    }

    private static void initInstallStr() {
        Locale result = Locale.getDefault();
        String result2 = result.getLanguage();
        String result3 = result.toLowerCase();
        String[] uninstall1 = UninstallConstants.uninstall1;
        int len = uninstall1.length;
        if (null >= len) {
            // branch: cond_1
        }
        String[] uninstall12 = UninstallConstants.uninstall1;
        String item = uninstall12[null];
        StringBuilder stringBuilder = new StringBuilder();
        String str = "[";
        StringBuilder result4 = stringBuilder.append(result);
        String str2 = "]";
        StringBuilder result5 = stringBuilder.append(str2);
        String result6 = stringBuilder.toString();
        boolean result7 = item.contains(result);
        if (result == null) {
            // branch: cond_0
        }
        String[] uninstall13 = UninstallConstants.uninstall1;
        String item2 = uninstall13[null];
        StringBuilder stringBuilder2 = new StringBuilder();
        StringBuilder result8 = stringBuilder2.append(result);
        StringBuilder result9 = stringBuilder2.append(str2);
        String result10 = stringBuilder2.toString();
        String str3 = "";
        String result11 = item2.replace(result, str3);
        LanguageManager.installStr1 = result;
        String[] uninstall2 = UninstallConstants.uninstall2;
        String item3 = uninstall2[null];
        StringBuilder stringBuilder3 = new StringBuilder();
        StringBuilder result12 = stringBuilder3.append(result);
        StringBuilder result13 = stringBuilder3.append(str2);
        String result14 = stringBuilder3.toString();
        String result15 = item3.replace(result, str3);
        LanguageManager.installStr2 = result;
        // continue loop -> :goto_1
        int val = item3 + 0x1;
        // continue loop -> :goto_0
        return;
    }

    public static void initLanguage() {
        LanguageManager.initInstallStr();
        LanguageManager.initSendStr();
        return;
    }

    private static void initSendStr() {
        return;
    }

}