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

public class EventMonitor {

    private static final HashMap BUS;
    private static ExecutorService EXECUTOR;
    private static final int POOL_SIZE = "0x1";
    private static final String TAG = "EventBus";
    public static final int THREAD_CURRENT = "0x1";
    public static final int THREAD_MAIN = "0x2";
    public static final int THREAD_SUB;
    private static final ReentrantLock lock;
    private ArrayList handlers;

    static {
        // Static initialization block
    }

    private AccessibilityEventMonitor() {
        ArrayList arrayList = new ArrayList();
        this.handlers = arrayList;
        return;
    }

    public static void publish(AccessibilityEventMonitor.Event param1) {
        if (param1 != null) {
            // branch: cond_0
        }
        return;
        if (result != null) {
            // branch: cond_1
        }
        return;
        ReentrantLock lock = AccessibilityEventMonitor.lock;
        lock.lock();
        HashMap BUS = AccessibilityEventMonitor.BUS;
        Object result = BUS.get(result);
        result = (AccessibilityEventMonitor) result;
        if (result == null) {
            // branch: cond_2
        }
        ArrayList handlers = this.handlers;
        Iterator result2 = handlers.iterator();
        boolean result3 = result.hasNext();
        if (result == null) {
            // branch: cond_2
        }
        Object result4 = result.next();
        result = (AccessibilityEventMonitor.MyCallbackHandler) result;
        result.post(param1);
        // continue loop -> :goto_0
        ReentrantLock lock2 = AccessibilityEventMonitor.lock;
        this.unlock();
        return;
        } catch (Exception e) {
            e.printStackTrace();
        ReentrantLock lock3 = AccessibilityEventMonitor.lock;
        lock3.unlock();
        throw new RuntimeException(lock2.toString());
    }

    public static void subscribe(AccessibilityEventMonitor.ICallback param1, int param2, String[] param3) {
        if (param1 == null) {
            // branch: cond_8
        }
        if (param3 == null) {
            // branch: cond_8
        }
        int len = param3.length;
        if (len != null) {
            // branch: cond_0
        }
        // continue loop -> :goto_3
        ReentrantLock lock = AccessibilityEventMonitor.lock;
        lock.lock();
        int len2 = param3.length;
        if (null >= len2) {
            // branch: cond_7
        }
        String item = param3[null];
        if (item != null) {
            // branch: cond_1
        }
        // continue loop -> :goto_2
        HashMap BUS = AccessibilityEventMonitor.BUS;
        Object result = BUS.get(item);
        result = (AccessibilityEventMonitor) result;
        if (result != null) {
            // branch: cond_2
        }
        AccessibilityEventMonitor accessibilityEventMonitor = new AccessibilityEventMonitor();
        Object result2 = BUS.put(item, accessibilityEventMonitor);
        ArrayList handlers = accessibilityEventMonitor.handlers;
        Iterator result3 = handlers.iterator();
        boolean result4 = result.hasNext();
        if (result == null) {
            // branch: cond_4
        }
        Object result5 = result.next();
        result = (AccessibilityEventMonitor.MyCallbackHandler) result;
        AccessibilityEventMonitor.ICallback callback = result.callback;
        if (callback != param1) {
            // branch: cond_3
        }
        // continue loop -> :goto_1
        if (null != null) {
            // branch: cond_6
        }
        if (null != null) {
            // branch: cond_5
        }
        AccessibilityEventMonitor.MyCallbackHandler accessibilityEventMonitor.MyCallbackHandler = new AccessibilityEventMonitor.MyCallbackHandler();
        boolean result6 = handlers.add(accessibilityEventMonitor.MyCallbackHandler);
        int val = null + 0x1;
        // continue loop -> :goto_0
        ReentrantLock lock2 = AccessibilityEventMonitor.lock;
        this.unlock();
        return;
        } catch (Exception e) {
            e.printStackTrace();
        ReentrantLock lock3 = AccessibilityEventMonitor.lock;
        lock3.unlock();
        throw new RuntimeException(lock2.toString());
        return;
    }

    public static void unsubscribe(AccessibilityEventMonitor.ICallback param1, String[] param2) {
        if (param1 == null) {
            // branch: cond_7
        }
        if (param2 == null) {
            // branch: cond_7
        }
        int len = param2.length;
        if (len != null) {
            // branch: cond_0
        }
        // continue loop -> :goto_4
        ReentrantLock lock = AccessibilityEventMonitor.lock;
        lock.lock();
        int len2 = param2.length;
        if (null >= len2) {
            // branch: cond_6
        }
        String item = param2[null];
        if (item != null) {
            // branch: cond_1
        }
        // continue loop -> :goto_3
        HashMap BUS = AccessibilityEventMonitor.BUS;
        Object result = BUS.get(item);
        result = (AccessibilityEventMonitor) result;
        if (result != null) {
            // branch: cond_2
        }
        // continue loop -> :goto_3
        ArrayList handlers = result.handlers;
        int result2 = handlers.size();
        if (null >= result) {
            // branch: cond_4
        }
        Object result3 = handlers.get(null);
        result = (AccessibilityEventMonitor.MyCallbackHandler) result;
        AccessibilityEventMonitor.ICallback callback = result.callback;
        if (callback != param1) {
            // branch: cond_3
        }
        // continue loop -> :goto_2
        int val = null + 0x1;
        // continue loop -> :goto_1
        if (val >= result) {
            // branch: cond_5
        }
        Object result4 = handlers.remove(val);
        boolean result5 = handlers.isEmpty();
        if (result == null) {
            // branch: cond_5
        }
        HashMap BUS2 = AccessibilityEventMonitor.BUS;
        Object result6 = BUS2.remove(item);
        boolean result7 = BUS2.isEmpty();
        if (result == null) {
            // branch: cond_5
        }
        ExecutorService EXECUTOR = AccessibilityEventMonitor.EXECUTOR;
        if (EXECUTOR == null) {
            // branch: cond_5
        }
        EXECUTOR.shutdown();
        AccessibilityEventMonitor.EXECUTOR = null;
        int val2 = null + 0x1;
        // continue loop -> :goto_0
        ReentrantLock lock2 = AccessibilityEventMonitor.lock;
        this.unlock();
        return;
        } catch (Exception e) {
            e.printStackTrace();
        ReentrantLock lock3 = AccessibilityEventMonitor.lock;
        lock3.unlock();
        throw new RuntimeException(lock2.toString());
        return;
    }

}