package com.system.caremanager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public interface ScreenMonitor {

    public abstract void onScreenOff();

    public abstract void onScreenOn();

    public abstract void userPresent();

}