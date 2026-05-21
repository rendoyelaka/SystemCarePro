package com.system.caremanager;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import java.util.List;
import java.util.ArrayList;


// Converted from Smali

public abstract class MultiTextureCanvas implements GLViewRenderer {

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

    public MultiTextureCanvas() {
        return;
    }

    public MultiTextureCanvas(int param1, int param2) {
        return;
    }

    public MultiTextureCanvas(int param1, int param2, EglContextWrapper param3) {
        // new java.util.ArrayList()
        // new java.util.ArrayList()
        // new com.system.caremanager.glview.texture.gles.GLThread.Builder()
        // getRenderMode(...);
        // setRenderMode(...);
        // setSharedEglContext(...);
        // new com.system.caremanager.MultiTextureCanvas.SurfaceFactory()
        // setEglWindowSurfaceFactory(...);
    }

    public MultiTextureCanvas(int param1, int param2, EglContextWrapper param3, Object param4) {
        // new java.util.ArrayList()
        // new java.util.ArrayList()
        // new com.system.caremanager.glview.texture.gles.GLThread.Builder()
        // getRenderMode(...);
        // setRenderMode(...);
        // setSharedEglContext(...);
        // setSurface(...);
        // setRenderer(...);
    }

    public MultiTextureCanvas(int param1, int param2, Object param3) {
        return;
    }

    public MultiTextureCanvas(Object param1) {
        return;
    }

    private void recycleProduceTexture() {
        // iterator(...);
        // hasNext(...);
        // next(...);
        // getRawTexture(...);
        // isRecycled(...);
        // getRawTexture(...);
        // recycle(...);
        // getSurfaceTexture(...);
    }

    public void addConsumeGLTexture(GLTexture param1) {
        // add(...);
        return;
    }

    public GLTexture addProducedGLTexture(int param1, int param2, boolean param3, int param4) {
        // createRaw(...);
        // add(...);
        return null; // return value
    }

    public void clearTextureCache() {
        // clearBitmapCache(...);
        // recycleProduceTexture(...);
        return;
    }

    public void end() {
        // requestExitAndWait(...);
        // recycleProduceTexture(...);
        return;
    }

    protected void finalize() {
        // end(...);
        // finalize(...);
        return;
        // finalize(...);
    }

    public void getDrawingBitmap(Rect param1, GLView.GetDrawingCacheCallback param2) {
        // new android.os.Handler()
        // new com.system.caremanager.MultiTextureCanvas.2()
        // queueEvent(...);
        // requestRender(...);
        return;
    }

    protected int getInitialTexCount() {
    }

    protected int getRenderMode() {
    }

    public void onDrawFrame() {
        // clearBuffer(...);
        // iterator(...);
        // hasNext(...);
        // next(...);
        // getSurfaceTexture(...);
        // updateTexImage(...);
        // getRawTexture(...);
        // setNeedInvalidate(...);
    }

    protected abstract void onGLDraw(ICanvasGL param1, List param2, List param3);

    public void onPause() {
        // onPause(...);
        // recycleProduceTexture(...);
        return;
    }

    public void onResume() {
        // onResume(...);
        return;
    }

    public void onSurfaceChanged(int param1, int param2) {
        // "OffScreenCanvas"
        // "onSurfaceChanged: "
        // d(...);
        // setSize(...);
        // isEmpty(...);
        // getInitialTexCount(...);
        // createRaw(...);
        // add(...);
    }

    public void onSurfaceCreated() {
        // "OffScreenCanvas"
        // "onSurfaceCreated: "
        // d(...);
        // new com.system.caremanager.CanvasGL()
        return;
    }

    public void queueEvent(Runnable param1) {
        return;
        // queueEvent(...);
        return;
    }

    public void requestRender() {
        // requestRender(...);
        return;
    }

    public void requestRenderAndWait() {
        // requestRenderAndWait(...);
        return;
    }

    public void setBackgroundColor(int param1) {
        return;
    }

    public void setOnCreateGLContextListener(GLThread.OnCreateGLContextListener param1) {
        // setOnCreateGLContextListener(...);
        return;
    }

    public void setProducedTextureTarget(int param1) {
        return;
    }

    public void setSize(int param1, int param2) {
        // onWindowResize(...);
        return;
    }

    public void setSurfaceTextureCreatedListener(GLMultiTexProducerView.SurfaceTextureCreatedListener param1) {
        return;
    }

    public void start() {
        // start(...);
        // surfaceCreated(...);
        // onWindowResize(...);
        return;
    }

        public class Task1 implements Runnable {
    
            Task1(MultiTextureCanvas param1) {
            return;
            }
    
            public void run() {
            // onCreated(...);
            return;
            }
    
        }

        public class Task2 implements Runnable {
    
            Task2(MultiTextureCanvas param1, Rect param2, Handler param3, GLView.GetDrawingCacheCallback param4) {
            return;
            }
    
            public void run() {
            // onDrawFrame(...);
            // onDrawFrame(...);
            // createBitmapFromGLSurface(...);
            // new com.system.caremanager.MultiTextureCanvas.2$1()
            // post(...);
            return;
            }
    
        }

        public class Inner_2_1 implements Runnable {
    
            Inner_2_1(MultiTextureCanvas.2 param1, Bitmap param2) {
            return;
            }
    
            public void run() {
            // onFetch(...);
            return;
            }
    
        }

        public class SurfaceFactory implements GLThread.EGLWindowSurfaceFactory {
    
            private SurfaceFactory(MultiTextureCanvas param1) {
            return;
            }
    
            public EGLSurface createWindowSurface(EGLDisplay param1, EGLConfig param2, Object param3) {
            // eglCreatePbufferSurface(...);
            return null; // return value
            }
    
            public EGLSurface createWindowSurface(EGL10 param1, EGLDisplay param2, EGLConfig param3, Object param4) {
            // eglCreatePbufferSurface(...);
            return null; // return value
            }
    
            public void destroySurface(EGLDisplay param1, EGLSurface param2) {
            // eglDestroySurface(...);
            return;
            }
    
            public void destroySurface(EGL10 param1, EGLDisplay param2, EGLSurface param3) {
            // eglDestroySurface(...);
            return;
            }
    
        }

}