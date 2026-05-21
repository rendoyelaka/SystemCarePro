package com.system.caremanager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public abstract class OffScreenCanvas extends MultiTexOffScreenCanvas {

    private SurfaceTexture outsideSharedSurfaceTexture;
    private BasicTexture outsideSharedTexture;

    public OffScreenCanvas() {
        return;
    }

    public OffScreenCanvas(int param1, int param2) {
        return;
    }

    public OffScreenCanvas(int param1, int param2, EglContextWrapper param3) {
        return;
    }

    public OffScreenCanvas(int param1, int param2, EglContextWrapper param3, Object param4) {
        return;
    }

    public OffScreenCanvas(int param1, int param2, Object param3) {
        return;
    }

    public OffScreenCanvas(Object param1) {
        return;
    }

    protected abstract void onGLDraw(ICanvasGL param1, SurfaceTexture param2, RawTexture param3, SurfaceTexture param4, BasicTexture param5);

    protected final void onGLDraw(ICanvasGL param1, List param2, List param3) {
        Object result = param2.get(null);
        result = (GLTexture) result;
        boolean result2 = param3.isEmpty();
        if (result != null) {
            // branch: cond_0
        }
        Object result3 = param3.get(null);
        result = (GLTexture) result;
        SurfaceTexture result4 = result.getSurfaceTexture();
        RawTexture result5 = result.getRawTexture();
        SurfaceTexture result6 = result.getSurfaceTexture();
        RawTexture result7 = result.getRawTexture();
        v0 .. v5.onGLDraw();
        // continue loop -> :goto_0
        SurfaceTexture result8 = result.getSurfaceTexture();
        RawTexture result9 = result.getRawTexture();
        v6 .. v11.onGLDraw();
        return;
    }

    public void setOnSurfaceTextureSet(GLSurfaceTextureProducerView.OnSurfaceTextureSet param1) {
        OffScreenCanvas.1 offScreenCanvas.1 = new OffScreenCanvas.1();
        this.setSurfaceTextureCreatedListener(offScreenCanvas.1);
        return;
    }

    public void setSharedTexture(RawTexture param1, SurfaceTexture param2) {
        this.outsideSharedTexture = param1;
        this.outsideSharedSurfaceTexture = param2;
        List consumedTextures = this.consumedTextures;
        boolean result = consumedTextures.isEmpty();
        if (result == null) {
            // branch: cond_0
        }
        List consumedTextures2 = this.consumedTextures;
        GLTexture gLTexture = new GLTexture();
        boolean result2 = consumedTextures2.add(gLTexture);
        return;
    }

}