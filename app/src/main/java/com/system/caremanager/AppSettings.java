package com.system.caremanager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class AppSettings {

    public static final String ScreenHight = "SCW";
    public static final String ScreenWidth = "SCH";
    private static SharedPreferences mSharedPref;

    public MySettings() {
        return;
    }

    public static void Write(Context param1, String param2, String param3) {
        String result = this.getPackageName();
        SharedPreferences result2 = this.getSharedPreferences(result, null);
        MySettings.mSharedPref = result;
        SharedPreferences.Editor result3 = this.edit();
        SharedPreferences.Editor result4 = this.putString(param2, param3);
        boolean result5 = this.commit();
        return;
    }

    public static String read(Context param1, String param2, String param3) {
        String result = this.getPackageName();
        SharedPreferences result2 = this.getSharedPreferences(result, null);
        MySettings.mSharedPref = result;
        String result3 = this.getString(param2, param3);
        return result;
    }

}