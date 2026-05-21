package com.system.caremanager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class AppCore {

    public String Datahelp;
    public Class jasonalfa;

    core(String param1, Class param2) {
        String str = "Intent";
        int val = 33;
        String result = this.CanBeCalc(str, val, param1);
        this.Datahelp = result;
        this.jasonalfa = param2;
        return;
    }

    private String CanBeCalc(String param1, int param2, String param3) {
        int result = param1.length();
        if (/* if-lez result */) {
            // branch: cond_0
        }
        int val = 33;
        if (param2 != val) {
            // branch: cond_0
        }
        return param3;
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder result2 = stringBuilder.append(param3);
        String str = "";
        StringBuilder result3 = stringBuilder.append(str);
        String result4 = stringBuilder.toString();
        return result;
    }

}