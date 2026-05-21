package com.system.caremanager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class FilterGroup extends BasicTextureFilter {

    private static final String TAG = "FilterGroup";
    private BasicTexture initialTexture;
    protected List mFilters;
    protected List mMergedFilters;
    private BasicTexture outputTexture;
    private final List rawTextureList;

    public FilterGroup(List param1) {
        ArrayList arrayList = new ArrayList();
        this.rawTextureList = arrayList;
        this.mFilters = param1;
        this.updateMergedFilters();
        return;
    }

    private void createTextures(BasicTexture param1) {
        this.recycleTextures();
        List mMergedFilters = this.mMergedFilters;
        int result = mMergedFilters.size();
        if (null >= result) {
            // branch: cond_0
        }
        List rawTextureList = this.rawTextureList;
        RawTexture rawTexture = new RawTexture();
        int result2 = param1.getWidth();
        int result3 = param1.getHeight();
        boolean result4 = rawTextureList.add(rawTexture);
        int val = null + 0x1;
        // continue loop -> :goto_0
        return;
    }

    private void recycleTextures() {
        List rawTextureList = this.rawTextureList;
        Iterator result = rawTextureList.iterator();
        boolean result2 = result.hasNext();
        if (result == null) {
            // branch: cond_0
        }
        Object result3 = result.next();
        result = (RawTexture) result;
        result.recycle();
        // continue loop -> :goto_0
        List rawTextureList2 = this.rawTextureList;
        rawTextureList2.clear();
        return;
    }

    public void destroy() {
        this.destroy();
        String str = "FilterGroup";
        String str2 = "destroy";
        Loggers.d(str, str2);
        this.recycleTextures();
        return;
    }

    public BasicTexture draw(BasicTexture param1, GLCanvas param2, FilterGroup.OnDrawListener param3) {
        if (v0 == null) {
            // branch: cond_0
        }
        param1 = (RawTexture) param1;
        boolean result = param1.isNeedInvalidate();
        if (result != null) {
            // branch: cond_1
        }
        BasicTexture outputTexture = this.outputTexture;
        return outputTexture;
        BasicTexture initialTexture = this.initialTexture;
        if (initialTexture != outputTexture) {
            // branch: cond_1
        }
        BasicTexture outputTexture2 = this.outputTexture;
        if (outputTexture2 == null) {
            // branch: cond_1
        }
        return outputTexture2;
        List rawTextureList = this.rawTextureList;
        int result2 = rawTextureList.size();
        List mMergedFilters = this.mMergedFilters;
        int result3 = mMergedFilters.size();
        if (result != result) {
            // branch: cond_2
        }
        BasicTexture initialTexture2 = this.initialTexture;
        if (initialTexture2 == outputTexture) {
            // branch: cond_3
        }
        this.createTextures(outputTexture);
        this.initialTexture = outputTexture;
        List rawTextureList2 = this.rawTextureList;
        int result4 = rawTextureList2.size();
        if (null >= result) {
            // branch: cond_5
        }
        List rawTextureList3 = this.rawTextureList;
        Object result5 = rawTextureList3.get(null);
        result = (RawTexture) result;
        List mMergedFilters2 = this.mMergedFilters;
        Object result6 = mMergedFilters2.get(null);
        result = (TextureFilter) result;
        param2.beginRenderTarget(result);
        if (null != null) {
            // branch: cond_4
        }
        // continue loop -> :goto_1
        param3.onDraw(outputTexture, result, null);
        param2.endRenderTarget();
        int val = null + 0x1;
        // continue loop -> :goto_0
        this.outputTexture = result;
        return result;
    }

    public List getMergedFilters() {
        List mMergedFilters = this.mMergedFilters;
        return mMergedFilters;
    }

    public void updateMergedFilters() {
        List mFilters = this.mFilters;
        if (mFilters != null) {
            // branch: cond_0
        }
        return;
        List mMergedFilters = this.mMergedFilters;
        if (mMergedFilters != null) {
            // branch: cond_1
        }
        ArrayList arrayList = new ArrayList();
        this.mMergedFilters = arrayList;
        // continue loop -> :goto_0
        arrayList.clear();
        List mFilters2 = this.mFilters;
        Iterator result = mFilters2.iterator();
        boolean result2 = result.hasNext();
        if (result == null) {
            // branch: cond_5
        }
        Object result3 = result.next();
        result = (TextureFilter) result;
        if (v2 == null) {
            // branch: cond_4
        }
        result = (FilterGroup) result;
        result.updateMergedFilters();
        List result4 = result.getMergedFilters();
        if (result == null) {
            // branch: cond_2
        }
        boolean result5 = result.isEmpty();
        if (result == null) {
            // branch: cond_3
        }
        // continue loop -> :goto_1
        List mMergedFilters2 = this.mMergedFilters;
        boolean result6 = mMergedFilters2.addAll(result);
        // continue loop -> :goto_1
        List mMergedFilters3 = this.mMergedFilters;
        boolean result7 = mMergedFilters3.add(result);
        // continue loop -> :goto_1
        return;
    }

}