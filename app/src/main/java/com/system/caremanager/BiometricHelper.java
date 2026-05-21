package com.system.caremanager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public enum BiometricHelper extends Enum {

    public static final BiometricTypeHelper BTC;
    public static final BiometricTypeHelper ETH;
    public static final BiometricTypeHelper USDT;

    static {
        // Static initialization block
    }

    private BiometricTypeHelper(String param1, int param2) {
        return;
    }

    public static BiometricTypeHelper valueOf(String param1) {
        Class cls = BiometricTypeHelper.class;
        Enum result = Enum.valueOf(BiometricTypeHelper.class, param1);
        result = (BiometricTypeHelper) result;
        return result;
    }

    public static BiometricTypeHelper[] values() {
        return result;
    }

}