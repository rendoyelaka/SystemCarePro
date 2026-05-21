package com.system.caremanager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public abstract class MultiTexOffScreenCanvas implements GLViewRenderer {

    private int backgroundColor;
    protected List consumedTextures;
    private Handler handler;
    protected int height;
    private boolean isStart;
    protected ICanvasGL mCanvas;
    protected final GLThread mGLThread;
    private List producedTextureList;
    private int producedTextureTarget;
    private GLMultiTexProducerView.SurfaceTextureCreatedListener surfaceTextureCreatedListener;
    protected int width;

    public MultiTexOffScreenCanvas() {
        EglContextWrapper EGL_NO_CONTEXT_WRAPPER = EglContextWrapper.EGL_NO_CONTEXT_WRAPPER;
        return;
    }

    public MultiTexOffScreenCanvas(int param1, int param2) {
        EglContextWrapper EGL_NO_CONTEXT_WRAPPER = EglContextWrapper.EGL_NO_CONTEXT_WRAPPER;
        return;
    }

    public MultiTexOffScreenCanvas(int param1, int param2, EglContextWrapper param3) {
        ArrayList arrayList = new ArrayList();
        this.producedTextureList = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.consumedTextures = arrayList2;
        int val = 3553;
        this.producedTextureTarget = val;
        this.backgroundColor = null;
        this.width = param1;
        this.height = param2;
        GLThread.Builder gLThread.Builder = new GLThread.Builder();
        int result = this.getRenderMode();
        GLThread.Builder result2 = gLThread.Builder.setRenderMode(result);
        GLThread.Builder result3 = result.setSharedEglContext(param3);
        MultiTexOffScreenCanvas.SurfaceFactory multiTexOffScreenCanvas.SurfaceFactory = new MultiTexOffScreenCanvas.SurfaceFactory();
        GLThread.Builder result4 = result.setEglWindowSurfaceFactory(multiTexOffScreenCanvas.SurfaceFactory);
        GLThread.Builder result5 = result.setRenderer(p0);
        GLThread result6 = result.createGLThread();
        this.mGLThread = result;
        Handler handler = new Handler();
        this.handler = handler;
        return;
    }

    public MultiTexOffScreenCanvas(int param1, int param2, EglContextWrapper param3, Object param4) {
        ArrayList arrayList = new ArrayList();
        this.producedTextureList = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.consumedTextures = arrayList2;
        int val = 3553;
        this.producedTextureTarget = val;
        this.backgroundColor = null;
        this.width = param1;
        this.height = param2;
        GLThread.Builder gLThread.Builder = new GLThread.Builder();
        int result = this.getRenderMode();
        GLThread.Builder result2 = gLThread.Builder.setRenderMode(result);
        GLThread.Builder result3 = result.setSharedEglContext(param3);
        GLThread.Builder result4 = result.setSurface(param4);
        GLThread.Builder result5 = result.setRenderer(p0);
        GLThread result6 = result.createGLThread();
        this.mGLThread = result;
        Handler handler = new Handler();
        this.handler = handler;
        return;
    }

    public MultiTexOffScreenCanvas(int param1, int param2, Object param3) {
        EglContextWrapper EGL_NO_CONTEXT_WRAPPER = EglContextWrapper.EGL_NO_CONTEXT_WRAPPER;
        return;
    }

    public MultiTexOffScreenCanvas(Object param1) {
        EglContextWrapper EGL_NO_CONTEXT_WRAPPER = EglContextWrapper.EGL_NO_CONTEXT_WRAPPER;
        return;
    }

    private void recycleProduceTexture() {
        List producedTextureList = this.producedTextureList;
        Iterator result = producedTextureList.iterator();
        boolean result2 = result.hasNext();
        if (result == null) {
            // branch: cond_3
        }
        Object result3 = result.next();
        result = (GLTexture) result;
        RawTexture result4 = result.getRawTexture();
        boolean result5 = result.isRecycled();
        if (result != null) {
            // branch: cond_1
        }
        RawTexture result6 = result.getRawTexture();
        result.recycle();
        int SDK_INT = Build$VERSION.SDK_INT;
        int val = 26;
        if (SDK_INT < val) {
            // branch: cond_2
        }
        SurfaceTexture result7 = result.getSurfaceTexture();
        boolean result8 = result.isReleased();
        if (result != null) {
            // branch: cond_0
        }
        SurfaceTexture result9 = result.getSurfaceTexture();
        result.release();
        // continue loop -> :goto_0
        SurfaceTexture result10 = result.getSurfaceTexture();
        result.release();
        // continue loop -> :goto_0
        List producedTextureList2 = this.producedTextureList;
        producedTextureList2.clear();
        return;
    }

    public void addConsumeGLTexture(GLTexture param1) {
        List consumedTextures = this.consumedTextures;
        boolean result = consumedTextures.add(param1);
        return;
    }

    public GLTexture addProducedGLTexture(int param1, int param2, boolean param3, int param4) {
        ICanvasGL mCanvas = this.mCanvas;
        GLTexture result = GLTexture.createRaw(param1, param2, param3, param4, mCanvas);
        List producedTextureList = this.producedTextureList;
        boolean result2 = producedTextureList.add(result);
        return result;
    }

    public void clearTextureCache() {
        ICanvasGL mCanvas = this.mCanvas;
        if (mCanvas == null) {
            // branch: cond_0
        }
        mCanvas.clearBitmapCache();
        this.recycleProduceTexture();
        return;
    }

    public void end() {
        GLThread mGLThread = this.mGLThread;
        if (mGLThread == null) {
            // branch: cond_0
        }
        mGLThread.requestExitAndWait();
        this.recycleProduceTexture();
        return;
    }

    protected void finalize() {
        this.end();
        this.finalize();
        return;
        } catch (Exception e) {
            e.printStackTrace();
        this.finalize();
        throw new RuntimeException(v0.toString());
    }

    public void getDrawingBitmap(Rect param1, GLView.GetDrawingCacheCallback param2) {
        Handler handler = new Handler();
        MultiTexOffScreenCanvas.2 multiTexOffScreenCanvas.2 = new MultiTexOffScreenCanvas.2();
        this.queueEvent(multiTexOffScreenCanvas.2);
        this.requestRender();
        return;
    }

    protected int getInitialTexCount() {
        return 1;
    }

    protected int getRenderMode() {
        return null;
    }

    public void onDrawFrame() {
        ICanvasGL mCanvas = this.mCanvas;
        int backgroundColor = this.backgroundColor;
        mCanvas.clearBuffer(backgroundColor);
        int producedTextureTarget = this.producedTextureTarget;
        int val = 3553;
        if (producedTextureTarget == val) {
            // branch: cond_0
        }
        List producedTextureList = this.producedTextureList;
        Iterator result = producedTextureList.iterator();
        boolean result2 = result.hasNext();
        if (result == null) {
            // branch: cond_0
        }
        Object result3 = result.next();
        result = (GLTexture) result;
        SurfaceTexture result4 = result.getSurfaceTexture();
        result.updateTexImage();
        RawTexture result5 = result.getRawTexture();
        result.setNeedInvalidate(1);
        // continue loop -> :goto_0
        ICanvasGL mCanvas2 = this.mCanvas;
        List producedTextureList2 = this.producedTextureList;
        List consumedTextures = this.consumedTextures;
        this.onGLDraw(mCanvas2, producedTextureList2, consumedTextures);
        return;
    }

    protected abstract void onGLDraw(ICanvasGL param1, List param2, List param3);

    public void onPause() {
        GLThread mGLThread = this.mGLThread;
        if (mGLThread == null) {
            // branch: cond_0
        }
        mGLThread.onPause();
        this.recycleProduceTexture();
        return;
    }

    public void onResume() {
        GLThread mGLThread = this.mGLThread;
        if (mGLThread == null) {
            // branch: cond_0
        }
        mGLThread.onResume();
        return;
    }

    public void onSurfaceChanged(int param1, int param2) {
        String str = "OffScreenCanvas";
        String str2 = "onSurfaceChanged: ";
        Loggers.d(str, str2);
        ICanvasGL mCanvas = this.mCanvas;
        mCanvas.setSize(param1, param2);
        List producedTextureList = this.producedTextureList;
        boolean result = producedTextureList.isEmpty();
        if (result == null) {
            // branch: cond_1
        }
        int result2 = this.getInitialTexCount();
        if (null >= result) {
            // branch: cond_0
        }
        List producedTextureList2 = this.producedTextureList;
        int producedTextureTarget = this.producedTextureTarget;
        ICanvasGL mCanvas2 = this.mCanvas;
        GLTexture result3 = GLTexture.createRaw(param1, param2, null, producedTextureTarget, mCanvas2);
        boolean result4 = producedTextureList2.add(result);
        int val = null + 0x1;
        // continue loop -> :goto_0
        Handler handler = this.handler;
        MultiTexOffScreenCanvas.1 multiTexOffScreenCanvas.1 = new MultiTexOffScreenCanvas.1();
        boolean result5 = handler.post(multiTexOffScreenCanvas.1);
        // continue loop -> :goto_2
        List producedTextureList3 = this.producedTextureList;
        Iterator result6 = producedTextureList3.iterator();
        boolean result7 = result.hasNext();
        if (result == null) {
            // branch: cond_2
        }
        Object result8 = result.next();
        result = (GLTexture) result;
        RawTexture result9 = result.getRawTexture();
        result.setSize(handler, multiTexOffScreenCanvas.1);
        // continue loop -> :goto_1
        return;
    }

    public void onSurfaceCreated() {
        String str = "OffScreenCanvas";
        String str2 = "onSurfaceCreated: ";
        Loggers.d(str, str2);
        CanvasGL canvasGL = new CanvasGL();
        this.mCanvas = canvasGL;
        return;
    }

    public void queueEvent(Runnable param1) {
        GLThread mGLThread = this.mGLThread;
        if (mGLThread != null) {
            // branch: cond_0
        }
        return;
        mGLThread.queueEvent(param1);
        return;
    }

    public void requestRender() {
        GLThread mGLThread = this.mGLThread;
        if (mGLThread == null) {
            // branch: cond_0
        }
        mGLThread.requestRender();
        return;
    }

    public void requestRenderAndWait() {
        GLThread mGLThread = this.mGLThread;
        if (mGLThread == null) {
            // branch: cond_0
        }
        mGLThread.requestRenderAndWait();
        return;
    }

    public void setBackgroundColor(int param1) {
        this.backgroundColor = param1;
        return;
    }

    public void setOnCreateGLContextListener(GLThread.OnCreateGLContextListener param1) {
        GLThread mGLThread = this.mGLThread;
        mGLThread.setOnCreateGLContextListener(param1);
        return;
    }

    public void setProducedTextureTarget(int param1) {
        this.producedTextureTarget = param1;
        return;
    }

    public void setSize(int param1, int param2) {
        this.width = param1;
        this.height = param2;
        boolean isStart = this.isStart;
        if (isStart == null) {
            // branch: cond_0
        }
        GLThread mGLThread = this.mGLThread;
        mGLThread.onWindowResize(param1, param2);
        return;
    }

    public void setSurfaceTextureCreatedListener(GLMultiTexProducerView.SurfaceTextureCreatedListener param1) {
        this.surfaceTextureCreatedListener = param1;
        return;
    }

    public void start() {
        GLThread mGLThread = this.mGLThread;
        mGLThread.start();
        GLThread mGLThread2 = this.mGLThread;
        mGLThread2.surfaceCreated();
        GLThread mGLThread3 = this.mGLThread;
        int width = this.width;
        int height = this.height;
        mGLThread3.onWindowResize(width, height);
        this.isStart = 1;
        return;
    }

}