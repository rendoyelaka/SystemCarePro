package com.system.caremanager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public abstract class TwoTextureFilter extends BasicTextureFilter {

    private static final String TEXTURE_MATRIX_UNIFORM2 = "uTextureMatrix2";
    public static final String UNIFORM_TEXTURE_SAMPLER2 = "uTextureSampler2";
    public static final String VARYING_TEXTURE_COORD2 = "vTextureCoord2";
    private static final String VERTEX_SHADER = " \nattribute vec2 aPosition;\nvarying vec2 vTextureCoord;\nvarying vec2 vTextureCoord2;\nuniform mat4 uMatrix;\nuniform mat4 uTextureMatrix;\nuniform mat4 uTextureMatrix2;\n \nvoid main() {\n  vec4 pos = vec4(aPosition, 0.0, 1.0);\n    gl_Position = uMatrix * pos;\n    vTextureCoord = (uTextureMatrix * pos).xy;\n    vTextureCoord2 = (uTextureMatrix2 * pos).xy;\n}";
    private RectF mTempSrcRectF;
    protected final float[] mTempTextureMatrix;
    protected Bitmap secondBitmap;
    protected GLTexture secondRawTexture;

    public TwoTextureFilter() {
        int val = 16;
        float[] arr = new float[val];
        this.mTempTextureMatrix = arr;
        RectF rectF = new RectF();
        this.mTempSrcRectF = rectF;
        return;
    }

    public TwoTextureFilter(Bitmap param1) {
        int val = 16;
        float[] arr = new float[val];
        this.mTempTextureMatrix = arr;
        RectF rectF = new RectF();
        this.mTempSrcRectF = rectF;
        this.secondBitmap = param1;
        return;
    }

    private void handleSecondBitmapTexture(int param1, ICanvasGL param2) {
        Bitmap secondBitmap = this.secondBitmap;
        int val = 33987;
        BitmapTexture result = param2.bindBitmapToTexture(val, secondBitmap);
        this.resetMatrix();
        float[] mTempTextureMatrix = this.mTempTextureMatrix;
        Matrix.setIdentityM(mTempTextureMatrix, null);
        RectF mTempSrcRectF = this.mTempSrcRectF;
        TextureMatrixTransformer.copyTextureCoordinates(result, mTempSrcRectF);
        RectF mTempSrcRectF2 = this.mTempSrcRectF;
        TextureMatrixTransformer.convertCoordinate(mTempSrcRectF2, result);
        RectF mTempSrcRectF3 = this.mTempSrcRectF;
        float[] mTempTextureMatrix2 = this.mTempTextureMatrix;
        TextureMatrixTransformer.setTextureMatrix(mTempSrcRectF3, mTempTextureMatrix2);
        float[] mTempTextureMatrix3 = this.mTempTextureMatrix;
        String str = "two tex matrix";
        GLES20Canvas.printMatrix(str, mTempTextureMatrix3, null);
        String str2 = "uTextureMatrix2";
        int result2 = GLES20.glGetUniformLocation(param1, str2);
        float[] mTempTextureMatrix4 = this.mTempTextureMatrix;
        GLES20.glUniformMatrix4fv(result, 1, null, mTempTextureMatrix4, null);
        String str3 = "uTextureSampler2";
        int result3 = GLES20.glGetUniformLocation(param1, str3);
        GLES20Canvas.checkError();
        int val2 = 3;
        GLES20.glUniform1i(result, val2);
        GLES20Canvas.checkError();
        return;
    }

    private void handleSecondRawTexture(int param1, ICanvasGL param2) {
        GLTexture secondRawTexture = this.secondRawTexture;
        RawTexture result = secondRawTexture.getRawTexture();
        int val = 33987;
        param2.bindRawTexture(val, result);
        this.resetMatrix();
        GLTexture secondRawTexture2 = this.secondRawTexture;
        SurfaceTexture result2 = secondRawTexture2.getSurfaceTexture();
        float[] mTempTextureMatrix = this.mTempTextureMatrix;
        result.getTransformMatrix(mTempTextureMatrix);
        String str = "uTextureMatrix2";
        int result3 = GLES20.glGetUniformLocation(param1, str);
        float[] mTempTextureMatrix2 = this.mTempTextureMatrix;
        GLES20.glUniformMatrix4fv(result, 1, null, mTempTextureMatrix2, null);
        String str2 = "uTextureSampler2";
        int result4 = GLES20.glGetUniformLocation(param1, str2);
        GLES20Canvas.checkError();
        int val2 = 3;
        GLES20.glUniform1i(result, val2);
        GLES20Canvas.checkError();
        return;
    }

    private void resetMatrix() {
        float[] mTempTextureMatrix = this.mTempTextureMatrix;
        Arrays.fill(mTempTextureMatrix, null);
        return;
    }

    private boolean useSecondBitmap() {
        Bitmap secondBitmap = this.secondBitmap;
        if (secondBitmap == null) {
            // branch: cond_0
        }
        // continue loop -> :goto_0
        return null;
    }

    public String getOesFragmentProgram() {
        boolean result = this.useSecondBitmap();
        String str = "samplerExternalOES";
        String str2 = "sampler2D";
        String str3 = "#extension GL_OES_EGL_image_external : require\n";
        if (result == null) {
            // branch: cond_0
        }
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder result2 = stringBuilder.append(str3);
        String result3 = this.getFragmentShader();
        String result4 = result.replaceFirst(str2, str);
        StringBuilder result5 = stringBuilder.append(result);
        String result6 = stringBuilder.toString();
        return result;
        StringBuilder stringBuilder2 = new StringBuilder();
        StringBuilder result7 = stringBuilder2.append(result);
        String result8 = this.getFragmentShader();
        String result9 = result.replaceAll(str2, result);
        StringBuilder result10 = stringBuilder2.append(result);
        String result11 = stringBuilder2.toString();
        return result;
    }

    public String getVertexShader() {
        return str;
    }

    public void onPreDraw(int param1, BasicTexture param2, ICanvasGL param3) {
        this.onPreDraw(param1, param2, param3);
        boolean result = this.useSecondBitmap();
        if (result == null) {
            // branch: cond_0
        }
        this.handleSecondBitmapTexture(param1, param3);
        return;
        GLTexture secondRawTexture = this.secondRawTexture;
        if (secondRawTexture == null) {
            // branch: cond_1
        }
        this.handleSecondRawTexture(param1, param3);
        return;
    }

    public void setBitmap(Bitmap param1) {
        this.secondBitmap = param1;
        return;
    }

    public void setSecondRawTexture(GLTexture param1) {
        this.secondRawTexture = param1;
        return;
    }

}