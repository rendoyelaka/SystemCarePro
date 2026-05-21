package com.system.caremanager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public interface TextureFilter {

    public abstract void destroy();

    public abstract String getFragmentShader();

    public abstract String getOesFragmentProgram();

    public abstract String getVertexShader();

    public abstract void onPreDraw(int param1, BasicTexture param2, ICanvasGL param3);

}