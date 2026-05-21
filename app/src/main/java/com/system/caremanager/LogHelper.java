package com.system.caremanager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class LogHelper {

    public LogHelper() {
        return;
    }

    static void i(String param1) {
        String str = "xxxxxxxxxxxxxxxxxxx";
        int result = Log.i(str, param1);
        return;
    }

}