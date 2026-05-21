package com.system.caremanager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class OpenGLUtil {

    public OpenGLUtil() {
        return;
    }

    public static Bitmap createBitmapFromGLSurface(int param1, int param2, int param3, int param4, int param5) {
        try {
            int val = param3 * param4;
            int[] arr = new int[val];
            int[] arr2 = new int[val];
            IntBuffer result = IntBuffer.wrap(arr);
            Buffer result2 = result.position(null);
            int val2 = param4 - p3;
            int val3 = val2 - param2;
            int val4 = 6408;
            int val5 = 5121;
            GLES11.glReadPixels(v2 .. v8);
            if (null >= param4) {
                // branch: cond_1
            }
            int val6 = null * param3;
            int val7 = param4 - null;
            int val8 = val7 + -0x1;
            int val9 = val8 * param3;
            if (null >= param3) {
                // branch: cond_0
            }
            int val10 = val6 + null;
            int item = arr[val10];
            int val11 = param3 & 0xff;
            int val12 = 16711680;
            int val13 = val12 & v6;
            int val14 = -16711936;
            int val15 = val14 & v6;
            int val16 = val13 | v5;
            int val17 = val11 | v4;
            int val18 = val9 + null;
            arr2[val18] = val17;
            int val19 = null + 0x1;
            // continue loop -> :goto_1
            int val20 = null + 0x1;
            // continue loop -> :goto_0
            Bitmap.Config ARGB_8888 = Bitmap$Config.ARGB_8888;
            Bitmap result3 = Bitmap.createBitmap(arr2, param3, param4, ARGB_8888);
            return result;
            } catch (Exception e) {
                e.printStackTrace();
            return null;
        } catch (GLException e) {
            e.printStackTrace();
        }
    }

    public static void setFloat(int param1, float param2) {
        GLES20.glUniform1f(param1, param2);
        return;
    }

    public static void setUniformMatrix4f(int param1, float[] param2) {
        GLES20.glUniformMatrix4fv(param1, 1, null, param2, null);
        return;
    }

}