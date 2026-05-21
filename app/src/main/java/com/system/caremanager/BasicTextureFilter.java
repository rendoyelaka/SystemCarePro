package com.system.caremanager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class BasicTextureFilter implements TextureFilter {

    public static final String ALPHA_UNIFORM = "uAlpha";
    public static final String MATRIX_UNIFORM = "uMatrix";
    public static final String POSITION_ATTRIBUTE = "aPosition";
    public static final String SAMPLER_2D = "sampler2D";
    public static final String SAMPLER_EXTERNAL_OES = "samplerExternalOES";
    public static final String TEXTURE_FRAGMENT_SHADER = "precision mediump float;\nvarying vec2 vTextureCoord;\nuniform float uAlpha;\nuniform sampler2D uTextureSampler;\nvoid main() {\n  gl_FragColor = texture2D(uTextureSampler, vTextureCoord);\n  gl_FragColor *= uAlpha;\n}\n";
    public static final String TEXTURE_MATRIX_UNIFORM = "uTextureMatrix";
    public static final String TEXTURE_SAMPLER_UNIFORM = "uTextureSampler";
    public static final String TEXTURE_VERTEX_SHADER = "uniform mat4 uMatrix;\nuniform mat4 uTextureMatrix;\nattribute vec2 aPosition;\nvarying vec2 vTextureCoord;\nvoid main() {\n  vec4 pos = vec4(aPosition, 0.0, 1.0);\n  gl_Position = uMatrix * pos;\n  vTextureCoord = (uTextureMatrix * pos).xy;\n}\n";
    public static final String VARYING_TEXTURE_COORD = "vTextureCoord";

    public BasicTextureFilter() {
        return;
    }

    public void destroy() {
        return;
    }

    public String getFragmentShader() {
        return str;
    }

    public String getOesFragmentProgram() {
        StringBuilder stringBuilder = new StringBuilder();
        String str = "#extension GL_OES_EGL_image_external : require\n";
        StringBuilder result = stringBuilder.append(str);
        String result2 = this.getFragmentShader();
        String str2 = "sampler2D";
        String str3 = "samplerExternalOES";
        String result3 = result.replace(str2, str3);
        StringBuilder result4 = stringBuilder.append(result);
        String result5 = stringBuilder.toString();
        return result;
    }

    public String getVertexShader() {
        return str;
    }

    public void onPreDraw(int param1, BasicTexture param2, ICanvasGL param3) {
        return;
    }

}