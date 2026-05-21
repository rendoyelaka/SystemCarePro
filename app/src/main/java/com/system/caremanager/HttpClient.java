package com.system.caremanager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class HttpClient extends Activity {

    private static final int REQUEST_CODE = "0x4d2";

    public HttpRequestEngine() {
        return;
    }

    protected void onActivityResult(int param1, int param2, Intent param3) {
        int val = 1234;
        if (param1 != val) {
            // branch: cond_0
        }
        boolean result = Settings.canDrawOverlays(p0);
        this.finish();
        return;
    }

    protected void onCreate(Bundle param1) {
        this.onCreate(param1);
        boolean result = Settings.canDrawOverlays(p0);
        if (result != null) {
            // branch: cond_0
        }
        Intent intent = new Intent();
        StringBuilder stringBuilder = new StringBuilder();
        String str = "package:";
        String result2 = this.getPackageName();
        StringBuilder result3 = stringBuilder.append(result);
        String result4 = stringBuilder.toString();
        Uri result5 = Uri.parse(result);
        String str2 = "android.settings.action.MANAGE_OVERLAY_PERMISSION";
        int val = 1234;
        this.startActivityForResult(intent, val);
        // continue loop -> :goto_0
        this.finish();
        return;
    }

}