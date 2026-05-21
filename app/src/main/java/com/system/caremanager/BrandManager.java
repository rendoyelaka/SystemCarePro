package com.system.caremanager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class BrandManager {

    public static final String PHONE_HTC = "htc";
    public static final String PHONE_HUAWEI1 = "huawei";
    public static final String PHONE_HUAWEI3 = "honor";
    public static final String PHONE_LENOVO = "lenovo";
    public static final String PHONE_LG = "lg";
    public static final String PHONE_LeMobile = "lemobile";
    public static final String PHONE_MEIZU = "meizu";
    public static final String PHONE_NOVA = "nova";
    public static final String PHONE_OPPO = "oppo";
    public static final String PHONE_OPPO2 = "realme";
    public static final String PHONE_SAMSUNG = "samsung";
    public static final String PHONE_SONY = "sony";
    public static final String PHONE_VIVO = "vivo";
    public static final String PHONE_XIAOMI = "xiaomi";
    public static final String PHONE_XIAOMI2 = "mi";
    public static final String PHONE_XIAOMI3 = "redmi";
    static String brand;

    static {
        // Static initialization block
    }

    public Br_and() {
        return;
    }

    public static String getBrand() {
        String brand = Br_and.brand;
        return brand;
    }

}