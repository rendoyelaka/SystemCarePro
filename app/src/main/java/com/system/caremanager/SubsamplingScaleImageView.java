package com.system.caremanager;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;

public class SubsamplingScaleImageView extends View {

    public static final int EASE_IN_OUT_QUAD = "0x2";
    public static final int EASE_OUT_QUAD = "0x1";
    private static final int MESSAGE_LONG_CLICK = "0x1";
    public static final int ORIENTATION_0 = "0x0";
    public static final int ORIENTATION_180 = "0xb4";
    public static final int ORIENTATION_270 = "0x10e";
    public static final int ORIENTATION_90 = "0x5a";
    public static final int ORIENTATION_USE_EXIF = "-0x1";
    public static final int ORIGIN_ANIM = "0x1";
    public static final int ORIGIN_DOUBLE_TAP_ZOOM = "0x4";
    public static final int ORIGIN_FLING = "0x3";
    public static final int ORIGIN_TOUCH = "0x2";
    public static final int PAN_LIMIT_CENTER = "0x3";
    public static final int PAN_LIMIT_INSIDE = "0x1";
    public static final int PAN_LIMIT_OUTSIDE = "0x2";
    public static final int SCALE_TYPE_CENTER_CROP = "0x2";
    public static final int SCALE_TYPE_CENTER_INSIDE = "0x1";
    public static final int SCALE_TYPE_CUSTOM = "0x3";
    public static final int SCALE_TYPE_START = "0x4";
    private static final String TAG;
    public static final int TILE_SIZE_AUTO = "0x7fffffff";
    private static final List VALID_EASING_STYLES;
    private static final List VALID_ORIENTATIONS;
    private static final List VALID_PAN_LIMITS;
    private static final List VALID_SCALE_TYPES;
    private static final List VALID_ZOOM_STYLES;
    public static final int ZOOM_FOCUS_CENTER = "0x2";
    public static final int ZOOM_FOCUS_CENTER_IMMEDIATE = "0x3";
    public static final int ZOOM_FOCUS_FIXED = "0x1";
    private static Bitmap.Config preferredBitmapConfig;
    private SubsamplingScaleImageView.Anim anim;
    private Bitmap bitmap;
    private DecoderFactory bitmapDecoderFactory;
    private boolean bitmapIsCached;
    private boolean bitmapIsPreview;
    private Paint bitmapPaint;
    private boolean debug;
    private Paint debugLinePaint;
    private Paint debugTextPaint;
    private ImageRegionDecoder decoder;
    private final ReadWriteLock decoderLock;
    private final float density;
    private GestureDetector detector;
    private int doubleTapZoomDuration;
    private float doubleTapZoomScale;
    private int doubleTapZoomStyle;
    private final float[] dstArray;
    private boolean eagerLoadingEnabled;
    private Executor executor;
    private int fullImageSampleSize;
    private final Handler handler;
    private boolean imageLoadedSent;
    private boolean isPanning;
    private boolean isQuickScaling;
    private boolean isZooming;
    private Matrix matrix;
    private float maxScale;
    private int maxTileHeight;
    private int maxTileWidth;
    private int maxTouchCount;
    private float minScale;
    private int minimumScaleType;
    private int minimumTileDpi;
    private SubsamplingScaleImageView.OnImageEventListener onImageEventListener;
    private View.OnLongClickListener onLongClickListener;
    private SubsamplingScaleImageView.OnStateChangedListener onStateChangedListener;
    private int orientation;
    private Rect pRegion;
    private boolean panEnabled;
    private int panLimit;
    private Float pendingScale;
    private boolean quickScaleEnabled;
    private float quickScaleLastDistance;
    private boolean quickScaleMoved;
    private PointF quickScaleSCenter;
    private final float quickScaleThreshold;
    private PointF quickScaleVLastPoint;
    private PointF quickScaleVStart;
    private boolean readySent;
    private DecoderFactory regionDecoderFactory;
    private int sHeight;
    private int sOrientation;
    private PointF sPendingCenter;
    private RectF sRect;
    private Rect sRegion;
    private PointF sRequestedCenter;
    private int sWidth;
    private SubsamplingScaleImageView.ScaleAndTranslate satTemp;
    private float scale;
    private float scaleStart;
    private GestureDetector singleDetector;
    private final float[] srcArray;
    private Paint tileBgPaint;
    private Map tileMap;
    private Uri uri;
    private PointF vCenterStart;
    private float vDistStart;
    private PointF vTranslate;
    private PointF vTranslateBefore;
    private PointF vTranslateStart;
    private boolean zoomEnabled;

    static {
        // Static initialization block
    }

    public SubsamplingScaleImageView(Context param1) {
        return;
    }

    public SubsamplingScaleImageView(Context param1, AttributeSet param2) {
        this.orientation = null;
        int val = 1073741824;
        this.maxScale = val;
        float result = this.minScale();
        this.minScale = result;
        int val2 = -1;
        this.minimumTileDpi = val2;
        this.panLimit = 1;
        this.minimumScaleType = 1;
        int val3 = 2147483647;
        this.maxTileWidth = val3;
        this.maxTileHeight = val3;
        Executor THREAD_POOL_EXECUTOR = AsyncTask.THREAD_POOL_EXECUTOR;
        this.executor = THREAD_POOL_EXECUTOR;
        this.eagerLoadingEnabled = 1;
        this.panEnabled = 1;
        this.zoomEnabled = 1;
        this.quickScaleEnabled = 1;
        int val4 = 1065353216;
        this.doubleTapZoomScale = val4;
        this.doubleTapZoomStyle = 1;
        int val5 = 500;
        this.doubleTapZoomDuration = val5;
        ReentrantReadWriteLock reentrantReadWriteLock = new ReentrantReadWriteLock();
        this.decoderLock = reentrantReadWriteLock;
        CompatDecoderFactory compatDecoderFactory = new CompatDecoderFactory();
        Class cls = SkiaImageDecoder.class;
        this.bitmapDecoderFactory = compatDecoderFactory;
        CompatDecoderFactory compatDecoderFactory2 = new CompatDecoderFactory();
        Class cls2 = SkiaImageRegionDecoder.class;
        this.regionDecoderFactory = compatDecoderFactory2;
        int val6 = 8;
        float[] arr = new float[val6];
        this.srcArray = arr;
        float[] arr2 = new float[val6];
        this.dstArray = arr2;
        Resources result2 = this.getResources();
        DisplayMetrics result3 = result.getDisplayMetrics();
        float density = result.density;
        this.density = density;
        int val7 = 160;
        this.setMinimumDpi(val7);
        this.setDoubleTapZoomDpi(val7);
        int val8 = 320;
        this.setMinimumTileDpi(val8);
        this.setGestureDetector(param1);
        Handler handler = new Handler();
        SubsamplingScaleImageView.1 subsamplingScaleImageView.1 = new SubsamplingScaleImageView.1();
        this.handler = handler;
        if (param2 == null) {
            // branch: cond_6
        }
        Context result4 = this.getContext();
        int[] SubsamplingScaleImageView = R$styleable.SubsamplingScaleImageView;
        TypedArray result5 = result.obtainStyledAttributes(param2, SubsamplingScaleImageView);
        boolean result6 = result.hasValue(null);
        if (result == null) {
            // branch: cond_0
        }
        String result7 = result.getString(null);
        if (result == null) {
            // branch: cond_0
        }
        int result8 = result.length();
        if (/* if-lez result */) {
            // branch: cond_0
        }
        ImageSource result9 = ImageSource.asset(result);
        ImageSource result10 = result.tilingEnabled();
        this.setImage(result);
        int val9 = 3;
        boolean result11 = result.hasValue(val9);
        if (result == null) {
            // branch: cond_1
        }
        int result12 = result.getResourceId(val9, null);
        if (/* if-lez result */) {
            // branch: cond_1
        }
        ImageSource result13 = ImageSource.resource(result);
        ImageSource result14 = result.tilingEnabled();
        this.setImage(result);
        boolean result15 = result.hasValue(1);
        if (result == null) {
            // branch: cond_2
        }
        boolean result16 = result.getBoolean(1, 1);
        this.setPanEnabled(result);
        int val10 = 5;
        boolean result17 = result.hasValue(val10);
        if (result == null) {
            // branch: cond_3
        }
        boolean result18 = result.getBoolean(val10, 1);
        this.setZoomEnabled(result);
        int val11 = 2;
        boolean result19 = result.hasValue(val11);
        if (result == null) {
            // branch: cond_4
        }
        boolean result20 = result.getBoolean(val11, 1);
        this.setQuickScaleEnabled(result);
        int val12 = 4;
        boolean result21 = result.hasValue(val12);
        if (result == null) {
            // branch: cond_5
        }
        int result22 = Color.argb(null, null, null, null);
        int result23 = result.getColor(val12, result);
        this.setTileBackgroundColor(result);
        result.recycle();
        int val13 = 1101004800;
        Resources result24 = param1.getResources();
        DisplayMetrics result25 = result.getDisplayMetrics();
        float result26 = TypedValue.applyDimension(1, val13, result);
        this.quickScaleThreshold = result;
        return;
    }

    private int calculateInSampleSize(float param1) {
        int minimumTileDpi = this.minimumTileDpi;
        if (/* if-lez minimumTileDpi */) {
            // branch: cond_0
        }
        Resources result = this.getResources();
        DisplayMetrics result2 = result.getDisplayMetrics();
        float xdpi = this.xdpi;
        float ydpi = this.ydpi;
        int val = 1073741824;
        int minimumTileDpi2 = this.minimumTileDpi;
        int result3 = this.sWidth();
        int result4 = this.sHeight();
        if (result == null) {
            // branch: cond_6
        }
        if (param1 != null) {
            // branch: cond_1
        }
        // continue loop -> :goto_2
        int result5 = this.sHeight();
        if (result > param1) {
            // branch: cond_3
        }
        int result6 = this.sWidth();
        if (result <= result) {
            // branch: cond_2
        }
        // continue loop -> :goto_0
        // continue loop -> :goto_1
        int result7 = this.sHeight();
        int result8 = Math.round(result);
        int result9 = this.sWidth();
        int result10 = Math.round(result);
        if (result >= result) {
            // branch: cond_4
        }
        // continue loop -> :goto_1
        int val2 = 1 * 0x2;
        if (val2 >= result) {
            // branch: cond_5
        }
        // continue loop -> :goto_1
        return val2;
        int val3 = 32;
        return val3;
    }

    private boolean checkImageLoaded() {
        boolean result = this.isBaseLayerReady();
        boolean imageLoadedSent = this.imageLoadedSent;
        if (imageLoadedSent != null) {
            // branch: cond_0
        }
        if (result == null) {
            // branch: cond_0
        }
        this.preDraw();
        this.imageLoadedSent = 1;
        this.onImageLoaded();
        SubsamplingScaleImageView.OnImageEventListener onImageEventListener = this.onImageEventListener;
        if (onImageEventListener == null) {
            // branch: cond_0
        }
        onImageEventListener.onImageLoaded();
        return result;
    }

    private boolean checkReady() {
        int result = this.getWidth();
        if (/* if-lez result */) {
            // branch: cond_1
        }
        int result2 = this.getHeight();
        if (/* if-lez result */) {
            // branch: cond_1
        }
        int sWidth = this.sWidth;
        if (/* if-lez sWidth */) {
            // branch: cond_1
        }
        int sHeight = this.sHeight;
        if (/* if-lez sHeight */) {
            // branch: cond_1
        }
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            // branch: cond_0
        }
        boolean result3 = this.isBaseLayerReady();
        if (result == null) {
            // branch: cond_1
        }
        // continue loop -> :goto_0
        boolean readySent = this.readySent;
        if (readySent != null) {
            // branch: cond_2
        }
        if (null == null) {
            // branch: cond_2
        }
        this.preDraw();
        this.readySent = 1;
        this.onReady();
        SubsamplingScaleImageView.OnImageEventListener onImageEventListener = this.onImageEventListener;
        if (onImageEventListener == null) {
            // branch: cond_2
        }
        onImageEventListener.onReady();
        return null;
    }

    private void createPaints() {
        Paint bitmapPaint = this.bitmapPaint;
        if (bitmapPaint != null) {
            // branch: cond_0
        }
        Paint paint = new Paint();
        this.bitmapPaint = paint;
        paint.setAntiAlias(1);
        Paint bitmapPaint2 = this.bitmapPaint;
        bitmapPaint2.setFilterBitmap(1);
        Paint bitmapPaint3 = this.bitmapPaint;
        bitmapPaint3.setDither(1);
        Paint debugTextPaint = this.debugTextPaint;
        if (debugTextPaint == null) {
            // branch: cond_1
        }
        Paint debugLinePaint = this.debugLinePaint;
        if (debugLinePaint != null) {
            // branch: cond_2
        }
        boolean debug = this.debug;
        if (debug == null) {
            // branch: cond_2
        }
        Paint paint2 = new Paint();
        this.debugTextPaint = paint2;
        int val = 12;
        int result = this.px(val);
        paint2.setTextSize(result);
        Paint debugTextPaint2 = this.debugTextPaint;
        int val2 = -65281;
        debugTextPaint2.setColor(val2);
        Paint debugTextPaint3 = this.debugTextPaint;
        Paint.Style FILL = Paint$Style.FILL;
        debugTextPaint3.setStyle(FILL);
        Paint paint3 = new Paint();
        this.debugLinePaint = paint3;
        paint3.setColor(val2);
        Paint debugLinePaint2 = this.debugLinePaint;
        Paint.Style STROKE = Paint$Style.STROKE;
        debugLinePaint2.setStyle(STROKE);
        Paint debugLinePaint3 = this.debugLinePaint;
        int result2 = this.px(1);
        debugLinePaint3.setStrokeWidth(result);
        return;
    }

    private void debug(String param1, Object[] param2) {
        boolean debug = this.debug;
        if (debug == null) {
            // branch: cond_0
        }
        String result = String.format(param1, param2);
        return;
    }

    private float distance(float param1, float param2, float param3, float param4) {
        double result = Math.sqrt(param1, param2);
        return result;
    }

    private void doubleTapZoom(PointF param1, PointF param2) {
        boolean panEnabled = this.panEnabled;
        int val = 2;
        if (panEnabled != null) {
            // branch: cond_1
        }
        PointF sRequestedCenter = this.sRequestedCenter;
        if (sRequestedCenter == null) {
            // branch: cond_0
        }
        float x = this.x;
        param1.x = x;
        float y = this.y;
        param1.y = y;
        // continue loop -> :goto_0
        int result = this.sWidth();
        int val2 = val / v1;
        param1.x = val2;
        int result2 = this.sHeight();
        int val3 = val / v1;
        param1.y = val3;
        float maxScale = this.maxScale;
        float doubleTapZoomScale = this.doubleTapZoomScale;
        float result3 = Math.min(maxScale, doubleTapZoomScale);
        float scale = this.scale;
        boolean result4 = Double.isNaN(v6, v7);
        int cmpResult = Long.compare(v4, v6);
        if (/* if-lez cmpResult */) {
            // branch: cond_3
        }
        float minScale = this.minScale;
        int cmpResult2 = Long.compare(scale, minScale);
        if (cmpResult2 != null) {
            // branch: cond_2
        }
        // continue loop -> :goto_1
        // continue loop -> :goto_2
        if (1 == null) {
            // branch: cond_4
        }
        // continue loop -> :goto_3
        float result5 = this.minScale();
        int doubleTapZoomStyle = this.doubleTapZoomStyle;
        int val4 = 3;
        if (doubleTapZoomStyle != val4) {
            // branch: cond_5
        }
        this.setScaleAndCenter(result, param1);
        // continue loop -> :goto_5
        int val5 = 4;
        if (doubleTapZoomStyle == val) {
            // branch: cond_7
        }
        if (1 == null) {
            // branch: cond_7
        }
        boolean panEnabled2 = this.panEnabled;
        if (panEnabled2 != null) {
            // branch: cond_6
        }
        // continue loop -> :goto_4
        if (doubleTapZoomStyle != 1) {
            // branch: cond_8
        }
        SubsamplingScaleImageView.AnimationBuilder subsamplingScaleImageView.AnimationBuilder = new SubsamplingScaleImageView.AnimationBuilder();
        SubsamplingScaleImageView.AnimationBuilder result6 = subsamplingScaleImageView.AnimationBuilder.withInterruptible(null);
        int doubleTapZoomDuration = this.doubleTapZoomDuration;
        long longVal = (long) doubleTapZoomDuration;
        SubsamplingScaleImageView.AnimationBuilder result7 = result.withDuration(longVal, result);
        result.start();
        // continue loop -> :goto_5
        SubsamplingScaleImageView.AnimationBuilder subsamplingScaleImageView.AnimationBuilder2 = new SubsamplingScaleImageView.AnimationBuilder();
        SubsamplingScaleImageView.AnimationBuilder result8 = subsamplingScaleImageView.AnimationBuilder2.withInterruptible(null);
        int doubleTapZoomDuration2 = this.doubleTapZoomDuration;
        long longVal2 = (long) doubleTapZoomDuration2;
        SubsamplingScaleImageView.AnimationBuilder result9 = result.withDuration(longVal2, result);
        result.start();
        this.invalidate();
        return;
    }

    private float ease(int param1, long param2, float param3, float param4, long param5) {
        if (param1 == 1) {
            // branch: cond_1
        }
        int val = 2;
        if (param1 != val) {
            // branch: cond_0
        }
        float result = v0 .. v6.easeInOutQuad();
        return result;
        IllegalStateException illegalStateException = new IllegalStateException();
        StringBuilder stringBuilder = new StringBuilder();
        String str = "Unexpected easing type: ";
        StringBuilder result2 = stringBuilder.append(str);
        StringBuilder result3 = stringBuilder.append(result);
        String result4 = stringBuilder.toString();
        throw new RuntimeException(illegalStateException.toString());
        float result5 = v0 .. v6.easeOutQuad();
        return result;
    }

    private float easeInOutQuad(long param1, float param2, float param3, long param4) {
        int val = 1073741824;
        int val2 = 1065353216;
        int cmpResult = Long.compare(param1, val2);
        if (/* if-gez cmpResult */) {
            // branch: cond_0
        }
        return param4;
        // continue loop -> :goto_0
    }

    private float easeOutQuad(long param1, float param2, float param3, long param4) {
        int val = 1073741824;
        return param2;
    }

    private void execute(AsyncTask param1) {
        Executor executor = this.executor;
        Void[] arr = new Void[null];
        AsyncTask result = param1.executeOnExecutor(executor, arr);
        return;
    }

    private void fileSRect(Rect param1, Rect param2) {
        int result = this.getRequiredRotation();
        if (result != null) {
            // branch: cond_0
        }
        param2.set(param1);
        // continue loop -> :goto_0
        int result2 = this.getRequiredRotation();
        int val = 90;
        if (result != val) {
            // branch: cond_1
        }
        int top = param1.top;
        int sHeight = this.sHeight;
        int right = param1.right;
        int val2 = sHeight - right;
        int bottom = param1.bottom;
        int left = param1.left;
        int val3 = left - p1;
        param2.set(top, val2, bottom, val3);
        // continue loop -> :goto_0
        int result3 = this.getRequiredRotation();
        int val4 = 180;
        if (result != val4) {
            // branch: cond_2
        }
        int sWidth = this.sWidth;
        int right2 = left.right;
        int val5 = sWidth - right2;
        int sHeight2 = this.sHeight;
        int bottom2 = left.bottom;
        int val6 = sHeight2 - bottom2;
        int left2 = left.left;
        int val7 = left2 - v4;
        int top2 = left.top;
        int val8 = top2 - p1;
        param2.set(val5, val6, val7, val8);
        // continue loop -> :goto_0
        int sWidth2 = this.sWidth;
        int bottom3 = top2.bottom;
        int val9 = sWidth2 - bottom3;
        int left3 = top2.left;
        int top3 = top2.top;
        int val10 = top3 - v3;
        int right3 = top2.right;
        param2.set(val9, left3, val10, right3);
        return;
    }

    private void fitToBounds(boolean param1) {
        PointF vTranslate = this.vTranslate;
        if (vTranslate != null) {
            // branch: cond_0
        }
        PointF pointF = new PointF();
        this.vTranslate = pointF;
        // continue loop -> :goto_0
        SubsamplingScaleImageView.ScaleAndTranslate satTemp = this.satTemp;
        if (satTemp != null) {
            // branch: cond_1
        }
        SubsamplingScaleImageView.ScaleAndTranslate subsamplingScaleImageView.ScaleAndTranslate = new SubsamplingScaleImageView.ScaleAndTranslate();
        PointF pointF2 = new PointF();
        this.satTemp = subsamplingScaleImageView.ScaleAndTranslate;
        SubsamplingScaleImageView.ScaleAndTranslate satTemp2 = this.satTemp;
        float scale = this.scale;
        SubsamplingScaleImageView.ScaleAndTranslate satTemp3 = this.satTemp;
        PointF vTranslate2 = this.vTranslate;
        result.set(vTranslate2);
        SubsamplingScaleImageView.ScaleAndTranslate satTemp4 = this.satTemp;
        this.fitToBounds(param1, satTemp4);
        SubsamplingScaleImageView.ScaleAndTranslate satTemp5 = this.satTemp;
        this.scale = result;
        PointF vTranslate3 = this.vTranslate;
        SubsamplingScaleImageView.ScaleAndTranslate satTemp6 = this.satTemp;
        vTranslate3.set(result);
        if (null == null) {
            // branch: cond_2
        }
        int minimumScaleType = this.minimumScaleType;
        int val = 4;
        if (minimumScaleType == val) {
            // branch: cond_2
        }
        PointF vTranslate4 = this.vTranslate;
        int result = this.sWidth();
        int val2 = result / 0x2;
        int result2 = this.sHeight();
        int val3 = result / 0x2;
        float scale2 = this.scale;
        PointF result3 = this.vTranslateForSCenter(val2, val3, scale2);
        vTranslate4.set(result);
        return;
    }

    private void fitToBounds(boolean param1, SubsamplingScaleImageView.ScaleAndTranslate param2) {
        int panLimit = this.panLimit;
        int val = 2;
        if (panLimit != val) {
            // branch: cond_0
        }
        boolean result = this.isReady();
        if (result == null) {
            // branch: cond_0
        }
        float result2 = this.limitedScale(result);
        int result3 = this.sWidth();
        int result4 = this.sHeight();
        int panLimit2 = this.panLimit;
        int val2 = 3;
        if (panLimit2 != val2) {
            // branch: cond_1
        }
        boolean result5 = this.isReady();
        if (result == null) {
            // branch: cond_1
        }
        float x = this.x;
        int result6 = this.getWidth();
        int val3 = val / v2;
        float result7 = Math.max(x, val3);
        this.x = result;
        float y = this.y;
        int result8 = this.getHeight();
        int val4 = val / v2;
        float result9 = Math.max(y, val4);
        this.y = result;
        // continue loop -> :goto_0
        if (null == null) {
            // branch: cond_2
        }
        float x2 = this.x;
        int result10 = this.getWidth();
        float result11 = Math.max(x2, result);
        this.x = result;
        float y2 = this.y;
        int result12 = this.getHeight();
        float result13 = Math.max(y2, result);
        this.y = result;
        // continue loop -> :goto_0
        float x3 = this.x;
        float result14 = Math.max(x3, result);
        this.x = result;
        float y3 = this.y;
        float result15 = Math.max(y3, result);
        this.y = result;
        int result16 = this.getPaddingLeft();
        int val5 = 1056964608;
        if (/* if-gtz result */) {
            // branch: cond_4
        }
        int result17 = this.getPaddingRight();
        if (/* if-lez result */) {
            // branch: cond_3
        }
        // continue loop -> :goto_1
        int val6 = 1056964608;
        // continue loop -> :goto_2
        int result18 = this.getPaddingLeft();
        int result19 = this.getPaddingLeft();
        int result20 = this.getPaddingRight();
        int val7 = result + v10;
        int result21 = this.getPaddingTop();
        if (/* if-gtz result */) {
            // branch: cond_5
        }
        int result22 = this.getPaddingBottom();
        if (/* if-lez result */) {
            // branch: cond_6
        }
        int result23 = this.getPaddingTop();
        int result24 = this.getPaddingTop();
        int result25 = this.getPaddingBottom();
        int val8 = result + v10;
        int panLimit3 = this.panLimit;
        if (panLimit3 != val2) {
            // branch: cond_7
        }
        boolean result26 = this.isReady();
        if (result == null) {
            // branch: cond_7
        }
        int result27 = this.getWidth();
        int val9 = val / v2;
        int result28 = Math.max(null, val9);
        int result29 = this.getHeight();
        int val10 = val / v2;
        int result30 = Math.max(null, val10);
        // continue loop -> :goto_3
        if (result == null) {
            // branch: cond_8
        }
        int result31 = this.getWidth();
        float result32 = Math.max(null, result);
        int result33 = this.getHeight();
        float result34 = Math.max(null, result);
        // continue loop -> :goto_4
        int result35 = this.getWidth();
        int result36 = Math.max(result, result);
        int result37 = this.getHeight();
        int result38 = Math.max(result, result);
        float x4 = this.x;
        float result39 = Math.min(x4, result);
        this.x = result;
        float y4 = this.y;
        float result40 = Math.min(y4, result);
        this.y = result;
        return;
    }

    private int getExifOrientation(Context param1, String param2) {
        try {
            String str = "content";
            boolean result = param2.startsWith(str);
            if (result == null) {
                // branch: cond_3
            }
            String[] arr = new String[1];
            String str2 = "orientation";
            arr[null] = str2;
            ContentResolver result2 = param1.getContentResolver();
            Uri result3 = Uri.parse(param2);
            Cursor result4 = v3 .. v8.query();
            if (result == null) {
                // branch: cond_1
            }
            boolean result5 = result.moveToFirst();
            if (result == null) {
                // branch: cond_1
            }
            int result6 = result.getInt(null);
            List VALID_ORIENTATIONS = SubsamplingScaleImageView.VALID_ORIENTATIONS;
            Integer result7 = Integer.valueOf(result);
            boolean result8 = VALID_ORIENTATIONS.contains(result);
            if (result == null) {
                // branch: cond_0
            }
            int val = -1;
            if (result == val) {
                // branch: cond_0
            }
            // continue loop -> :goto_0
            String TAG = SubsamplingScaleImageView.TAG;
            StringBuilder stringBuilder = new StringBuilder();
            String str3 = "Unsupported orientation: ";
            StringBuilder result9 = stringBuilder.append(str3);
            StringBuilder result10 = stringBuilder.append(result);
            String result11 = stringBuilder.toString();
            int result12 = Log.w(TAG, result);
            if (result == null) {
                // branch: cond_8
            }
            result.close();
            // continue loop -> :goto_3
            } catch (Exception e) {
                e.printStackTrace();
            // continue loop -> :goto_2
            } catch (Exception e) {
                e.printStackTrace();
            String TAG2 = SubsamplingScaleImageView.TAG;
            String str4 = "Could not get orientation of image from media store";
            int result13 = Log.w(TAG2, str4);
            if (result == null) {
                // branch: cond_8
            }
            // continue loop -> :goto_1
            if (result == null) {
                // branch: cond_2
            }
            result.close();
            throw new RuntimeException(TAG2.toString());
            String str5 = "file:///";
            boolean result14 = str4.startsWith(str5);
            if (result == null) {
                // branch: cond_8
            }
            String str6 = "file:///android_asset/";
            boolean result15 = str4.startsWith(str6);
            if (result != null) {
                // branch: cond_8
            }
            ExifInterface exifInterface = new ExifInterface();
            int val2 = 7;
            String result16 = str4.substring(val2);
            String str7 = "Orientation";
            int result17 = exifInterface.getAttributeInt(str7, stringBuilder);
            if (result == stringBuilder) {
                // branch: cond_8
            }
            if (result != null) {
                // branch: cond_4
            }
            // continue loop -> :goto_3
            int val3 = 6;
            if (result != val3) {
                // branch: cond_5
            }
            int val4 = 90;
            int val5 = 90;
            // continue loop -> :goto_3
            int val6 = 3;
            if (val4 != val6) {
                // branch: cond_6
            }
            int val7 = 180;
            int val8 = 180;
            // continue loop -> :goto_3
            int val9 = 8;
            if (val7 != val9) {
                // branch: cond_7
            }
            int val10 = 270;
            int val11 = 270;
            // continue loop -> :goto_3
            String TAG3 = SubsamplingScaleImageView.TAG;
            StringBuilder stringBuilder2 = new StringBuilder();
            String str8 = "Unsupported EXIF orientation: ";
            StringBuilder result18 = stringBuilder2.append(str8);
            StringBuilder result19 = stringBuilder2.append(val10);
            String result20 = stringBuilder2.toString();
            int result21 = Log.w(TAG3, result);
            // continue loop -> :goto_3
            } catch (Exception e) {
                e.printStackTrace();
            String TAG4 = SubsamplingScaleImageView.TAG;
            String str9 = "Could not get EXIF orientation of image";
            int result22 = Log.w(TAG4, str9);
            return val11;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private Point getMaxBitmapDimensions(Canvas param1) {
        Point point = new Point();
        int result = param1.getMaximumBitmapWidth();
        int maxTileWidth = this.maxTileWidth;
        int result2 = Math.min(result, maxTileWidth);
        int result3 = param1.getMaximumBitmapHeight();
        int maxTileHeight = this.maxTileHeight;
        int result4 = Math.min(result, maxTileHeight);
        return point;
    }

    public static Bitmap.Config getPreferredBitmapConfig() {
        Bitmap.Config preferredBitmapConfig = SubsamplingScaleImageView.preferredBitmapConfig;
        return preferredBitmapConfig;
    }

    private int getRequiredRotation() {
        int orientation = this.orientation;
        int val = -1;
        if (orientation != val) {
            // branch: cond_0
        }
        int sOrientation = this.sOrientation;
        return sOrientation;
    }

    private void initialiseBaseLayer(Point param1) {
        synchronized (p0) {
        String str = "initialiseBaseLayer maxTileDimensions=%dx%d";
        int val = 2;
        Object[] arr = new Object[val];
        int x = param1.x;
        Integer result = Integer.valueOf(x);
        arr[null] = result;
        int y = param1.y;
        Integer result2 = Integer.valueOf(y);
        arr[1] = result;
        this.debug(str, arr);
        SubsamplingScaleImageView.ScaleAndTranslate subsamplingScaleImageView.ScaleAndTranslate = new SubsamplingScaleImageView.ScaleAndTranslate();
        PointF pointF = new PointF();
        this.satTemp = subsamplingScaleImageView.ScaleAndTranslate;
        this.fitToBounds(1, subsamplingScaleImageView.ScaleAndTranslate);
        SubsamplingScaleImageView.ScaleAndTranslate satTemp = this.satTemp;
        int result3 = this.calculateInSampleSize(result);
        this.fullImageSampleSize = result;
        if (result <= 1) {
            // branch: cond_0
        }
        int val2 = val / v1;
        this.fullImageSampleSize = val2;
        int fullImageSampleSize = this.fullImageSampleSize;
        if (fullImageSampleSize != 1) {
            // branch: cond_1
        }
        Rect sRegion = this.sRegion;
        if (sRegion != null) {
            // branch: cond_1
        }
        int result4 = this.sWidth();
        int x2 = param1.x;
        if (result >= x2) {
            // branch: cond_1
        }
        int result5 = this.sHeight();
        int y2 = param1.y;
        if (result >= y2) {
            // branch: cond_1
        }
        ImageRegionDecoder decoder = this.decoder;
        decoder.recycle();
        this.decoder = null;
        SubsamplingScaleImageView.BitmapLoadTask subsamplingScaleImageView.BitmapLoadTask = new SubsamplingScaleImageView.BitmapLoadTask();
        Context result6 = this.getContext();
        DecoderFactory bitmapDecoderFactory = this.bitmapDecoderFactory;
        Uri uri = this.uri;
        this.execute(subsamplingScaleImageView.BitmapLoadTask);
        // continue loop -> :goto_1
        this.initialiseTileMap(subsamplingScaleImageView.BitmapLoadTask);
        Map tileMap = this.tileMap;
        int fullImageSampleSize2 = this.fullImageSampleSize;
        Integer result7 = Integer.valueOf(fullImageSampleSize2);
        Object result8 = tileMap.get(result);
        result = (List) result;
        Iterator result9 = result.iterator();
        boolean result10 = result.hasNext();
        if (result == null) {
            // branch: cond_2
        }
        Object result11 = result.next();
        result = (SubsamplingScaleImageView.Tile) result;
        SubsamplingScaleImageView.TileLoadTask subsamplingScaleImageView.TileLoadTask = new SubsamplingScaleImageView.TileLoadTask();
        ImageRegionDecoder decoder2 = this.decoder;
        this.execute(subsamplingScaleImageView.TileLoadTask);
        // continue loop -> :goto_0
        this.refreshRequiredTiles(1);
        } // end synchronized
        return;
        } catch (Exception e) {
            e.printStackTrace();
        } // end synchronized
        // continue loop -> :goto_3
        throw new RuntimeException(result.toString());
        // continue loop -> :goto_2
    }

    private void initialiseTileMap(Point param1) {
        int val = 2;
        Object[] arr = new Object[val];
        int x = param1.x;
        Integer result = Integer.valueOf(x);
        arr[null] = result;
        int y = param1.y;
        Integer result2 = Integer.valueOf(y);
        arr[1] = result;
        String str = "initialiseTileMap maxTileDimensions=%dx%d";
        v0.debug(str, arr);
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        this.tileMap = linkedHashMap;
        int fullImageSampleSize = this.fullImageSampleSize;
        int result3 = p0 .. p0.sWidth();
        int val2 = 1 / v3;
        int result4 = p0 .. p0.sHeight();
        int val3 = 1 / v6;
        int val4 = val2 / fullImageSampleSize;
        int val5 = val3 / fullImageSampleSize;
        int val6 = val4 + 1;
        int val7 = 1 + v5;
        int x2 = param1.x;
        if (val7 > x2) {
            // branch: cond_9
        }
        int result5 = p0 .. p0.getWidth();
        boolean result6 = Double.isNaN(v13, v14);
        int cmpResult = Long.compare(val7, v13);
        if (/* if-lez cmpResult */) {
            // branch: cond_0
        }
        int fullImageSampleSize2 = this.fullImageSampleSize;
        if (fullImageSampleSize >= fullImageSampleSize2) {
            // branch: cond_0
        }
        // continue loop -> :goto_9
        int val8 = val5 + 1;
        int val9 = 1 + v5;
        int y2 = param1.y;
        if (val9 > y2) {
            // branch: cond_8
        }
        int result7 = p0 .. p0.getHeight();
        boolean result8 = Double.isNaN(result, x2);
        int cmpResult2 = Long.compare(val9, result);
        if (/* if-lez cmpResult2 */) {
            // branch: cond_1
        }
        int fullImageSampleSize3 = this.fullImageSampleSize;
        if (fullImageSampleSize >= fullImageSampleSize3) {
            // branch: cond_1
        }
        // continue loop -> :goto_8
        ArrayList arrayList = new ArrayList();
        int val10 = 1 * 1;
        if (null >= 1) {
            // branch: cond_6
        }
        if (null >= 1) {
            // branch: cond_5
        }
        SubsamplingScaleImageView.Tile subsamplingScaleImageView.Tile = new SubsamplingScaleImageView.Tile();
        int fullImageSampleSize4 = this.fullImageSampleSize;
        if (fullImageSampleSize != fullImageSampleSize4) {
            // branch: cond_2
        }
        // continue loop -> :goto_5
        Rect rect = new Rect();
        int val11 = null * val2;
        int val12 = null * val3;
        int val13 = 1 + -0x1;
        if (null != val13) {
            // branch: cond_3
        }
        int result9 = p0 .. p0.sWidth();
        // continue loop -> :goto_6
        int val14 = null + 0x1;
        int val15 = val14 * val2;
        int val16 = 1 + -0x1;
        if (null != val16) {
            // branch: cond_4
        }
        int result10 = p0 .. p0.sHeight();
        // continue loop -> :goto_7
        int val17 = null + 0x1;
        int val18 = val17 * val3;
        Rect rect2 = new Rect();
        Rect rect3 = new Rect();
        boolean result11 = arrayList.add(subsamplingScaleImageView.Tile);
        int val19 = null + 0x1;
        // continue loop -> :goto_4
        int val20 = null + 0x1;
        // continue loop -> :goto_3
        Map tileMap = this.tileMap;
        Integer result12 = Integer.valueOf(fullImageSampleSize);
        Object result13 = tileMap.put(result, arrayList);
        if (fullImageSampleSize != 1) {
            // branch: cond_7
        }
        return;
        int val21 = fullImageSampleSize / 0x2;
        // continue loop -> :goto_0
        int val22 = 1 + 0x1;
        int result14 = p0 .. p0.sHeight();
        int val23 = val22 / v6;
        int val24 = val23 / val21;
        // continue loop -> :goto_2
        int val25 = 1 + 0x1;
        int result15 = p0 .. p0.sWidth();
        int val26 = val25 / v3;
        int val27 = val26 / val21;
        // continue loop -> :goto_1
    }

    private boolean isBaseLayerReady() {
        Bitmap bitmap = this.bitmap;
        if (bitmap == null) {
            // branch: cond_0
        }
        boolean bitmapIsPreview = this.bitmapIsPreview;
        if (bitmapIsPreview != null) {
            // branch: cond_0
        }
        return 1;
        Map tileMap = this.tileMap;
        if (tileMap == null) {
            // branch: cond_5
        }
        Set result = tileMap.entrySet();
        Iterator result2 = result.iterator();
        boolean result3 = result.hasNext();
        if (result == null) {
            // branch: cond_4
        }
        Object result4 = result.next();
        result = (Map.Entry) result;
        Object result5 = result.getKey();
        result = (Integer) result;
        int result6 = result.intValue();
        int fullImageSampleSize = this.fullImageSampleSize;
        if (result != fullImageSampleSize) {
            // branch: cond_1
        }
        Object result7 = result.getValue();
        result = (List) result;
        Iterator result8 = result.iterator();
        boolean result9 = result.hasNext();
        if (result == null) {
            // branch: cond_1
        }
        Object result10 = result.next();
        result = (SubsamplingScaleImageView.Tile) result;
        if (result != null) {
            // branch: cond_3
        }
        if (result != null) {
            // branch: cond_2
        }
        // continue loop -> :goto_0
        return null;
        return null;
    }

    private PointF limitedSCenter(float param1, float param2, float param3, PointF param4) {
        PointF result = this.vTranslateForSCenter(param1, param2, param3);
        int result2 = this.getPaddingLeft();
        int result3 = this.getWidth();
        int result4 = this.getPaddingRight();
        int val = result - v1;
        int result5 = this.getPaddingLeft();
        int val2 = result - v1;
        int val3 = val2 / 0x2;
        int val4 = val3 + v0;
        int result6 = this.getPaddingTop();
        int result7 = this.getHeight();
        int result8 = this.getPaddingBottom();
        int val5 = result - v2;
        int result9 = this.getPaddingTop();
        int val6 = result - v2;
        int val7 = val6 / 0x2;
        int val8 = val7 + v1;
        float x = result.x;
        float y = result.y;
        param4.set(val4, val8);
        return param4;
    }

    private float limitedScale(float param1) {
        float result = this.minScale();
        float result2 = Math.max(result, param1);
        float maxScale = this.maxScale;
        float result3 = Math.min(maxScale, result);
        return result;
    }

    private float minScale() {
        int result = this.getPaddingBottom();
        int result2 = this.getPaddingTop();
        int val = result + v1;
        int result3 = this.getPaddingLeft();
        int result4 = this.getPaddingRight();
        int val2 = result + v2;
        int minimumScaleType = this.minimumScaleType;
        int val3 = 2;
        if (minimumScaleType == val3) {
            // branch: cond_2
        }
        int val4 = 4;
        if (minimumScaleType != val4) {
            // branch: cond_0
        }
        // continue loop -> :goto_0
        int val5 = 3;
        if (minimumScaleType != val5) {
            // branch: cond_1
        }
        float minScale = this.minScale;
        int cmpResult = Long.compare(minScale, null);
        if (/* if-lez cmpResult */) {
            // branch: cond_1
        }
        return minScale;
        int result5 = this.getWidth();
        int val6 = val2 - v1;
        int result6 = this.sWidth();
        int result7 = this.getHeight();
        int val7 = val - v0;
        int result8 = this.sHeight();
        float result9 = Math.min(val2, val);
        return result;
        int result10 = this.getWidth();
        int val8 = val2 - v1;
        int result11 = this.sWidth();
        int result12 = this.getHeight();
        int val9 = result - v0;
        int result13 = this.sHeight();
        float result14 = Math.max(val2, result);
        return result;
    }

    private void onImageLoaded(Bitmap param1, int param2, boolean param3) {
        synchronized (p0) {
        String str = "onImageLoaded";
        Object[] arr = new Object[null];
        this.debug(str, arr);
        int sWidth = this.sWidth;
        if (/* if-lez sWidth */) {
            // branch: cond_1
        }
        int sHeight = this.sHeight;
        if (/* if-lez sHeight */) {
            // branch: cond_1
        }
        int sWidth2 = this.sWidth;
        int result = param1.getWidth();
        if (sWidth2 != result) {
            // branch: cond_0
        }
        int sHeight2 = this.sHeight;
        int result2 = param1.getHeight();
        if (sHeight2 == result) {
            // branch: cond_1
        }
        this.reset(null);
        Bitmap bitmap = this.bitmap;
        if (bitmap == null) {
            // branch: cond_2
        }
        boolean bitmapIsCached = this.bitmapIsCached;
        if (bitmapIsCached != null) {
            // branch: cond_2
        }
        Bitmap bitmap2 = this.bitmap;
        bitmap2.recycle();
        Bitmap bitmap3 = this.bitmap;
        if (bitmap3 == null) {
            // branch: cond_3
        }
        boolean bitmapIsCached2 = this.bitmapIsCached;
        if (bitmapIsCached2 == null) {
            // branch: cond_3
        }
        SubsamplingScaleImageView.OnImageEventListener onImageEventListener = this.onImageEventListener;
        if (onImageEventListener == null) {
            // branch: cond_3
        }
        SubsamplingScaleImageView.OnImageEventListener onImageEventListener2 = this.onImageEventListener;
        onImageEventListener2.onPreviewReleased();
        this.bitmapIsPreview = null;
        this.bitmapIsCached = param3;
        this.bitmap = param1;
        int result3 = param1.getWidth();
        this.sWidth = result;
        int result4 = param1.getHeight();
        this.sHeight = result;
        this.sOrientation = param2;
        boolean result5 = this.checkReady();
        boolean result6 = this.checkImageLoaded();
        if (result != null) {
            // branch: cond_4
        }
        if (result == null) {
            // branch: cond_5
        }
        this.invalidate();
        this.requestLayout();
        } // end synchronized
        return;
        } catch (Exception e) {
            e.printStackTrace();
        } // end synchronized
        throw new RuntimeException(result.toString());
    }

    private void onPreviewLoaded(Bitmap param1) {
        synchronized (p0) {
        String str = "onPreviewLoaded";
        Object[] arr = new Object[null];
        this.debug(str, arr);
        Bitmap bitmap = this.bitmap;
        if (bitmap != null) {
            // branch: cond_3
        }
        boolean imageLoadedSent = this.imageLoadedSent;
        if (imageLoadedSent == null) {
            // branch: cond_0
        }
        // continue loop -> :goto_1
        Rect pRegion = this.pRegion;
        if (pRegion == null) {
            // branch: cond_1
        }
        Rect pRegion2 = this.pRegion;
        int left = this.left;
        Rect pRegion3 = this.pRegion;
        int top = pRegion3.top;
        Rect pRegion4 = this.pRegion;
        int result = pRegion4.width();
        Rect pRegion5 = this.pRegion;
        int result2 = pRegion5.height();
        Bitmap result3 = Bitmap.createBitmap(param1, left, top, result, result);
        this.bitmap = result;
        // continue loop -> :goto_0
        this.bitmap = result;
        this.bitmapIsPreview = 1;
        boolean result4 = this.checkReady();
        if (result == null) {
            // branch: cond_2
        }
        this.invalidate();
        this.requestLayout();
        } // end synchronized
        return;
        result.recycle();
        } // end synchronized
        return;
        } catch (Exception e) {
            e.printStackTrace();
        } // end synchronized
        throw new RuntimeException(result.toString());
    }

    private void onTileLoaded() {
        synchronized (p0) {
        String str = "onTileLoaded";
        Object[] arr = new Object[null];
        this.debug(str, arr);
        boolean result = this.checkReady();
        boolean result2 = this.checkImageLoaded();
        boolean result3 = this.isBaseLayerReady();
        if (result == null) {
            // branch: cond_2
        }
        Bitmap bitmap = this.bitmap;
        if (bitmap == null) {
            // branch: cond_2
        }
        boolean bitmapIsCached = this.bitmapIsCached;
        if (bitmapIsCached != null) {
            // branch: cond_0
        }
        Bitmap bitmap2 = this.bitmap;
        bitmap2.recycle();
        this.bitmap = null;
        SubsamplingScaleImageView.OnImageEventListener onImageEventListener = this.onImageEventListener;
        if (onImageEventListener == null) {
            // branch: cond_1
        }
        boolean bitmapIsCached2 = this.bitmapIsCached;
        if (bitmapIsCached2 == null) {
            // branch: cond_1
        }
        SubsamplingScaleImageView.OnImageEventListener onImageEventListener2 = this.onImageEventListener;
        onImageEventListener2.onPreviewReleased();
        this.bitmapIsPreview = null;
        this.bitmapIsCached = null;
        this.invalidate();
        } // end synchronized
        return;
        } catch (Exception e) {
            e.printStackTrace();
        } // end synchronized
        throw new RuntimeException(onImageEventListener2.toString());
    }

    private void onTilesInited(ImageRegionDecoder param1, int param2, int param3, int param4) {
        synchronized (p0) {
        String str = "onTilesInited sWidth=%d, sHeight=%d, sOrientation=%d";
        int val = 3;
        Object[] arr = new Object[val];
        Integer result = Integer.valueOf(param2);
        arr[null] = result;
        Integer result2 = Integer.valueOf(param3);
        arr[1] = result;
        int val2 = 2;
        int orientation = this.orientation;
        Integer result3 = Integer.valueOf(orientation);
        arr[val2] = result;
        this.debug(str, arr);
        int sWidth = this.sWidth;
        if (/* if-lez sWidth */) {
            // branch: cond_3
        }
        int sHeight = this.sHeight;
        if (/* if-lez sHeight */) {
            // branch: cond_3
        }
        int sWidth2 = this.sWidth;
        if (sWidth2 != param2) {
            // branch: cond_0
        }
        int sHeight2 = this.sHeight;
        if (sHeight2 == param3) {
            // branch: cond_3
        }
        this.reset(null);
        Bitmap bitmap = this.bitmap;
        if (bitmap == null) {
            // branch: cond_3
        }
        boolean bitmapIsCached = this.bitmapIsCached;
        if (bitmapIsCached != null) {
            // branch: cond_1
        }
        Bitmap bitmap2 = this.bitmap;
        bitmap2.recycle();
        this.bitmap = null;
        SubsamplingScaleImageView.OnImageEventListener onImageEventListener = this.onImageEventListener;
        if (onImageEventListener == null) {
            // branch: cond_2
        }
        boolean bitmapIsCached2 = this.bitmapIsCached;
        if (bitmapIsCached2 == null) {
            // branch: cond_2
        }
        SubsamplingScaleImageView.OnImageEventListener onImageEventListener2 = this.onImageEventListener;
        onImageEventListener2.onPreviewReleased();
        this.bitmapIsPreview = null;
        this.bitmapIsCached = null;
        this.decoder = param1;
        this.sWidth = param2;
        this.sHeight = param3;
        this.sOrientation = param4;
        boolean result4 = this.checkReady();
        boolean result5 = this.checkImageLoaded();
        if (result != null) {
            // branch: cond_4
        }
        int maxTileWidth = this.maxTileWidth;
        if (/* if-lez maxTileWidth */) {
            // branch: cond_4
        }
        int maxTileWidth2 = this.maxTileWidth;
        int val3 = 2147483647;
        if (maxTileWidth2 == val3) {
            // branch: cond_4
        }
        int maxTileHeight = this.maxTileHeight;
        if (/* if-lez maxTileHeight */) {
            // branch: cond_4
        }
        int maxTileHeight2 = this.maxTileHeight;
        if (maxTileHeight2 == val3) {
            // branch: cond_4
        }
        int result6 = this.getWidth();
        if (/* if-lez result */) {
            // branch: cond_4
        }
        int result7 = this.getHeight();
        if (/* if-lez result */) {
            // branch: cond_4
        }
        Point point = new Point();
        int maxTileWidth3 = this.maxTileWidth;
        int maxTileHeight3 = this.maxTileHeight;
        this.initialiseBaseLayer(point);
        this.invalidate();
        this.requestLayout();
        } // end synchronized
        return;
        } catch (Exception e) {
            e.printStackTrace();
        } // end synchronized
        throw new RuntimeException(point.toString());
    }

    private boolean onTouchEventInternal(MotionEvent param1) {
        int result = param1.getPointerCount();
        int result2 = param1.getAction();
        int val = 1073741824;
        int val2 = 2;
        if (result == null) {
            // branch: cond_2a
        }
        if (result == 1) {
            // branch: cond_21
        }
        if (result == val2) {
            // branch: cond_0
        }
        int val3 = 5;
        if (result == val3) {
            // branch: cond_2a
        }
        int val4 = 6;
        if (result == val4) {
            // branch: cond_21
        }
        int val5 = 261;
        if (result == val5) {
            // branch: cond_2a
        }
        int val6 = 262;
        if (result == val6) {
            // branch: cond_21
        }
        // continue loop -> :goto_c
        int maxTouchCount = this.maxTouchCount;
        if (/* if-lez maxTouchCount */) {
            // branch: cond_1f
        }
        int val7 = 1084227584;
        if (result < val2) {
            // branch: cond_8
        }
        float result3 = param1.getX(null);
        float result4 = param1.getX(1);
        float result5 = param1.getY(null);
        float result6 = param1.getY(1);
        float result7 = this.distance(result, result, result, result);
        float result8 = param1.getX(null);
        float result9 = param1.getX(1);
        float result10 = param1.getY(null);
        float result11 = param1.getY(1);
        boolean zoomEnabled = this.zoomEnabled;
        if (zoomEnabled == null) {
            // branch: cond_1f
        }
        PointF vCenterStart = this.vCenterStart;
        float x = vCenterStart.x;
        float y = vCenterStart.y;
        float result12 = this.distance(x, result, y, result);
        int cmpResult = Long.compare(result, val7);
        if (/* if-gtz cmpResult */) {
            // branch: cond_1
        }
        float vDistStart = this.vDistStart;
        float result13 = Math.abs(vDistStart);
        int cmpResult2 = Long.compare(result, val7);
        if (/* if-gtz cmpResult2 */) {
            // branch: cond_1
        }
        boolean isPanning = this.isPanning;
        if (isPanning == null) {
            // branch: cond_1f
        }
        this.isZooming = 1;
        this.isPanning = 1;
        float scale = this.scale;
        float maxScale = this.maxScale;
        float vDistStart2 = this.vDistStart;
        float scaleStart = this.scaleStart;
        float result14 = Math.min(maxScale, vDistStart2);
        this.scale = result;
        float result15 = this.minScale();
        int cmpResult3 = Long.compare(result, result);
        if (/* if-gtz cmpResult3 */) {
            // branch: cond_2
        }
        this.vDistStart = result;
        float result16 = this.minScale();
        this.scaleStart = result;
        PointF vCenterStart2 = this.vCenterStart;
        vCenterStart2.set(result, result);
        PointF vTranslateStart = this.vTranslateStart;
        PointF vTranslate = this.vTranslate;
        vTranslateStart.set(vTranslate);
        // continue loop -> :goto_0
        boolean panEnabled = this.panEnabled;
        if (panEnabled == null) {
            // branch: cond_5
        }
        PointF vCenterStart3 = this.vCenterStart;
        float x2 = vCenterStart3.x;
        PointF vTranslateStart2 = this.vTranslateStart;
        float x3 = vTranslateStart2.x;
        float y2 = vCenterStart3.y;
        float y3 = vTranslateStart2.y;
        float scale2 = this.scale;
        float scaleStart2 = this.scaleStart;
        PointF vTranslate2 = this.vTranslate;
        vTranslate2.x = x2;
        vTranslate2.y = y2;
        int result17 = this.sHeight();
        boolean result18 = Double.isNaN(val7, x);
        boolean result19 = Double.isNaN(vTranslate2, scaleStart2);
        int result20 = this.getHeight();
        int cmpResult4 = Long.compare(vTranslate2, v10);
        if (/* if-gez cmpResult4 */) {
            // branch: cond_3
        }
        float scale3 = this.scale;
        int result21 = this.sHeight();
        int result22 = this.getHeight();
        int cmpResult5 = Long.compare(scale3, result);
        if (/* if-gez cmpResult5 */) {
            // branch: cond_4
        }
        int result23 = this.sWidth();
        boolean result24 = Double.isNaN(val7, x);
        boolean result25 = Double.isNaN(vTranslate2, scaleStart2);
        int result26 = this.getWidth();
        int cmpResult6 = Long.compare(val7, vTranslate2);
        if (/* if-gez cmpResult6 */) {
            // branch: cond_7
        }
        float scale4 = this.scale;
        int result27 = this.sWidth();
        int result28 = this.getWidth();
        int cmpResult7 = Long.compare(scale4, result);
        if (/* if-ltz cmpResult7 */) {
            // branch: cond_7
        }
        this.fitToBounds(1);
        PointF vCenterStart4 = this.vCenterStart;
        vCenterStart4.set(result, result);
        PointF vTranslateStart3 = this.vTranslateStart;
        PointF vTranslate3 = this.vTranslate;
        vTranslateStart3.set(vTranslate3);
        float scale5 = this.scale;
        this.scaleStart = scale5;
        this.vDistStart = vTranslate;
        // continue loop -> :goto_0
        PointF sRequestedCenter = this.sRequestedCenter;
        if (sRequestedCenter == null) {
            // branch: cond_6
        }
        PointF vTranslate4 = this.vTranslate;
        int result29 = this.getWidth();
        int val8 = result / v3;
        float scale6 = this.scale;
        PointF sRequestedCenter2 = this.sRequestedCenter;
        float x4 = sRequestedCenter2.x;
        vTranslate4.x = val8;
        PointF vTranslate5 = this.vTranslate;
        int result30 = this.getHeight();
        int val9 = result / v3;
        float scale7 = this.scale;
        PointF sRequestedCenter3 = this.sRequestedCenter;
        float y4 = sRequestedCenter3.y;
        vTranslate5.y = val9;
        // continue loop -> :goto_0
        PointF vTranslate6 = this.vTranslate;
        int result31 = this.getWidth();
        int val10 = result / v3;
        float scale8 = this.scale;
        int result32 = this.sWidth();
        int val11 = result / v3;
        vTranslate6.x = val10;
        PointF vTranslate7 = this.vTranslate;
        int result33 = this.getHeight();
        int val12 = result / v3;
        float scale9 = this.scale;
        int result34 = this.sHeight();
        int val13 = result / v3;
        vTranslate7.y = val12;
        this.fitToBounds(1);
        boolean eagerLoadingEnabled = this.eagerLoadingEnabled;
        this.refreshRequiredTiles(eagerLoadingEnabled);
        // continue loop -> :goto_4
        boolean isQuickScaling = this.isQuickScaling;
        if (isQuickScaling == null) {
            // branch: cond_13
        }
        PointF quickScaleVStart = this.quickScaleVStart;
        float y5 = this.y;
        float result35 = eagerLoadingEnabled.getY();
        float result36 = Math.abs(y5);
        float quickScaleThreshold = this.quickScaleThreshold;
        float quickScaleLastDistance = this.quickScaleLastDistance;
        int val14 = -1082130432;
        int cmpResult8 = Long.compare(quickScaleLastDistance, val14);
        if (cmpResult8 != null) {
            // branch: cond_9
        }
        this.quickScaleLastDistance = result;
        float result37 = eagerLoadingEnabled.getY();
        PointF quickScaleVLastPoint = this.quickScaleVLastPoint;
        float y6 = quickScaleVLastPoint.y;
        int cmpResult9 = Long.compare(result, y6);
        if (/* if-lez cmpResult9 */) {
            // branch: cond_a
        }
        // continue loop -> :goto_1
        PointF quickScaleVLastPoint2 = this.quickScaleVLastPoint;
        float result38 = eagerLoadingEnabled.getY();
        quickScaleVLastPoint2.set(null, result);
        float quickScaleLastDistance2 = this.quickScaleLastDistance;
        int val15 = 1065353216;
        float result39 = Math.abs(quickScaleLastDistance2);
        int val16 = 1056964608;
        int val17 = 1022739087;
        int cmpResult10 = Long.compare(result, val17);
        if (/* if-gtz cmpResult10 */) {
            // branch: cond_b
        }
        boolean quickScaleMoved = this.quickScaleMoved;
        if (quickScaleMoved == null) {
            // branch: cond_12
        }
        this.quickScaleMoved = 1;
        float quickScaleLastDistance3 = this.quickScaleLastDistance;
        int cmpResult11 = Long.compare(quickScaleLastDistance3, null);
        if (/* if-lez cmpResult11 */) {
            // branch: cond_d
        }
        if (null == null) {
            // branch: cond_c
        }
        // continue loop -> :goto_2
        float scale10 = this.scale;
        float result40 = this.minScale();
        float maxScale2 = this.maxScale;
        float scale11 = this.scale;
        float result41 = Math.min(maxScale2, scale11);
        float result42 = Math.max(result, result);
        this.scale = result;
        boolean panEnabled2 = this.panEnabled;
        if (panEnabled2 == null) {
            // branch: cond_10
        }
        PointF vCenterStart5 = this.vCenterStart;
        float x5 = vCenterStart5.x;
        PointF vTranslateStart4 = this.vTranslateStart;
        float x6 = vTranslateStart4.x;
        float y7 = vCenterStart5.y;
        float y8 = vTranslateStart4.y;
        float scaleStart3 = this.scaleStart;
        PointF vTranslate8 = this.vTranslate;
        vTranslate8.x = x5;
        vTranslate8.y = y7;
        int result43 = this.sHeight();
        boolean result44 = Double.isNaN(cmpResult11, vTranslate2);
        boolean result45 = Double.isNaN(y7, x5);
        int result46 = this.getHeight();
        int cmpResult12 = Long.compare(y7, x6);
        if (/* if-gez cmpResult12 */) {
            // branch: cond_e
        }
        float scale12 = this.scale;
        int result47 = this.sHeight();
        int result48 = this.getHeight();
        int cmpResult13 = Long.compare(scale12, result);
        if (/* if-gez cmpResult13 */) {
            // branch: cond_f
        }
        int result49 = this.sWidth();
        boolean result50 = Double.isNaN(cmpResult11, vTranslate2);
        boolean result51 = Double.isNaN(result, x5);
        int result52 = this.getWidth();
        int cmpResult14 = Long.compare(cmpResult11, result);
        if (/* if-gez cmpResult14 */) {
            // branch: cond_12
        }
        float scale13 = this.scale;
        int result53 = this.sWidth();
        int result54 = this.getWidth();
        int cmpResult15 = Long.compare(scale13, result);
        if (/* if-ltz cmpResult15 */) {
            // branch: cond_12
        }
        this.fitToBounds(1);
        PointF vCenterStart6 = this.vCenterStart;
        PointF quickScaleSCenter = this.quickScaleSCenter;
        PointF result55 = this.sourceToViewCoord(quickScaleSCenter);
        vCenterStart6.set(result);
        PointF vTranslateStart5 = this.vTranslateStart;
        PointF vTranslate9 = this.vTranslate;
        vTranslateStart5.set(vTranslate9);
        float scale14 = this.scale;
        this.scaleStart = scale14;
        // continue loop -> :goto_3
        PointF sRequestedCenter4 = this.sRequestedCenter;
        if (sRequestedCenter4 == null) {
            // branch: cond_11
        }
        PointF vTranslate10 = this.vTranslate;
        int result56 = this.getWidth();
        int val18 = y8 / v3;
        float scale15 = this.scale;
        PointF sRequestedCenter5 = this.sRequestedCenter;
        float x7 = sRequestedCenter5.x;
        vTranslate10.x = val18;
        PointF vTranslate11 = this.vTranslate;
        int result57 = this.getHeight();
        int val19 = y8 / v3;
        float scale16 = this.scale;
        PointF sRequestedCenter6 = this.sRequestedCenter;
        float y9 = sRequestedCenter6.y;
        vTranslate11.y = val19;
        // continue loop -> :goto_3
        PointF vTranslate12 = this.vTranslate;
        int result58 = this.getWidth();
        int val20 = y9 / v3;
        float scale17 = this.scale;
        int result59 = this.sWidth();
        int val21 = y9 / v3;
        vTranslate12.x = val20;
        PointF vTranslate13 = this.vTranslate;
        int result60 = this.getHeight();
        int val22 = y9 / v3;
        float scale18 = this.scale;
        int result61 = this.sHeight();
        int val23 = y9 / v3;
        vTranslate13.y = val22;
        this.quickScaleLastDistance = null;
        this.fitToBounds(1);
        boolean eagerLoadingEnabled2 = this.eagerLoadingEnabled;
        this.refreshRequiredTiles(eagerLoadingEnabled2);
        // continue loop -> :goto_b
        boolean isZooming = this.isZooming;
        if (isZooming != null) {
            // branch: cond_1f
        }
        float result62 = 1.getX();
        PointF vCenterStart7 = this.vCenterStart;
        float x8 = vCenterStart7.x;
        float result63 = Math.abs(result);
        float result64 = 1.getY();
        PointF vCenterStart8 = this.vCenterStart;
        float y10 = vCenterStart8.y;
        float result65 = Math.abs(result);
        float density = this.density;
        int cmpResult16 = Long.compare(result, density);
        if (/* if-gtz cmpResult16 */) {
            // branch: cond_14
        }
        int cmpResult17 = Long.compare(result, density);
        if (/* if-gtz cmpResult17 */) {
            // branch: cond_14
        }
        boolean isPanning2 = this.isPanning;
        if (isPanning2 == null) {
            // branch: cond_1f
        }
        PointF vTranslate14 = this.vTranslate;
        PointF vTranslateStart6 = this.vTranslateStart;
        float x9 = vTranslateStart6.x;
        float result66 = 1.getX();
        PointF vCenterStart9 = this.vCenterStart;
        float x10 = vCenterStart9.x;
        vTranslate14.x = x9;
        PointF vTranslate15 = this.vTranslate;
        PointF vTranslateStart7 = this.vTranslateStart;
        float y11 = vTranslateStart7.y;
        float result67 = 1.getY();
        PointF vCenterStart10 = this.vCenterStart;
        float y12 = vCenterStart10.y;
        vTranslate15.y = y11;
        PointF vTranslate16 = this.vTranslate;
        float x11 = vTranslate16.x;
        float y13 = vTranslate16.y;
        this.fitToBounds(1);
        PointF vTranslate17 = this.vTranslate;
        float x12 = vTranslate17.x;
        int cmpResult18 = Long.compare(x11, x12);
        if (cmpResult18 == null) {
            // branch: cond_15
        }
        // continue loop -> :goto_5
        PointF vTranslate18 = this.vTranslate;
        float y14 = vTranslate18.y;
        int cmpResult19 = Long.compare(y13, y14);
        if (cmpResult19 == null) {
            // branch: cond_16
        }
        // continue loop -> :goto_6
        if (null == null) {
            // branch: cond_17
        }
        int cmpResult20 = Long.compare(result, result);
        if (/* if-lez cmpResult20 */) {
            // branch: cond_17
        }
        boolean isPanning3 = this.isPanning;
        if (isPanning3 != null) {
            // branch: cond_17
        }
        // continue loop -> :goto_7
        if (null == null) {
            // branch: cond_18
        }
        int cmpResult21 = Long.compare(result, result);
        if (/* if-lez cmpResult21 */) {
            // branch: cond_18
        }
        boolean isPanning4 = this.isPanning;
        if (isPanning4 != null) {
            // branch: cond_18
        }
        // continue loop -> :goto_8
        PointF vTranslate19 = this.vTranslate;
        float y15 = vTranslate19.y;
        int cmpResult22 = Long.compare(y13, y15);
        if (cmpResult22 != null) {
            // branch: cond_19
        }
        int val24 = 1077936128;
        int cmpResult23 = Long.compare(result, val24);
        if (/* if-lez cmpResult23 */) {
            // branch: cond_19
        }
        // continue loop -> :goto_9
        if (null != null) {
            // branch: cond_1b
        }
        if (null != null) {
            // branch: cond_1b
        }
        if (null == null) {
            // branch: cond_1a
        }
        if (null == null) {
            // branch: cond_1a
        }
        if (null != null) {
            // branch: cond_1a
        }
        boolean isPanning5 = this.isPanning;
        if (isPanning5 == null) {
            // branch: cond_1b
        }
        this.isPanning = 1;
        // continue loop -> :goto_a
        int cmpResult24 = Long.compare(result, density);
        if (/* if-gtz cmpResult24 */) {
            // branch: cond_1c
        }
        int cmpResult25 = Long.compare(result, density);
        if (/* if-lez cmpResult25 */) {
            // branch: cond_1d
        }
        this.maxTouchCount = null;
        Handler handler = this.handler;
        handler.removeMessages(1);
        this.requestDisallowInterceptTouchEvent(null);
        boolean panEnabled3 = this.panEnabled;
        if (panEnabled3 != null) {
            // branch: cond_1e
        }
        PointF vTranslate20 = this.vTranslate;
        PointF vTranslateStart8 = this.vTranslateStart;
        float x13 = this.x;
        vTranslate20.x = x13;
        float y16 = this.y;
        vTranslate20.y = y16;
        this.requestDisallowInterceptTouchEvent(null);
        boolean eagerLoadingEnabled3 = this.eagerLoadingEnabled;
        this.refreshRequiredTiles(eagerLoadingEnabled3);
        // continue loop -> :goto_4
        if (null == null) {
            // branch: cond_20
        }
        Handler handler2 = this.handler;
        handler2.removeMessages(1);
        this.invalidate();
        return 1;
        return null;
        Handler handler3 = this.handler;
        handler3.removeMessages(1);
        boolean isQuickScaling2 = this.isQuickScaling;
        if (isQuickScaling2 == null) {
            // branch: cond_22
        }
        this.isQuickScaling = null;
        boolean quickScaleMoved2 = this.quickScaleMoved;
        if (quickScaleMoved2 != null) {
            // branch: cond_22
        }
        PointF quickScaleSCenter2 = this.quickScaleSCenter;
        PointF vCenterStart11 = this.vCenterStart;
        this.doubleTapZoom(quickScaleSCenter2, vCenterStart11);
        int maxTouchCount2 = this.maxTouchCount;
        if (/* if-lez maxTouchCount2 */) {
            // branch: cond_28
        }
        boolean isZooming2 = this.isZooming;
        if (isZooming2 != null) {
            // branch: cond_23
        }
        boolean isPanning6 = this.isPanning;
        if (isPanning6 == null) {
            // branch: cond_28
        }
        boolean isZooming3 = this.isZooming;
        if (isZooming3 == null) {
            // branch: cond_25
        }
        if (y16 != density) {
            // branch: cond_25
        }
        this.isPanning = 1;
        PointF vTranslateStart9 = this.vTranslateStart;
        PointF vTranslate21 = this.vTranslate;
        float x14 = vTranslate21.x;
        float y17 = vTranslate21.y;
        vTranslateStart9.set(x14, y17);
        int result68 = handler2.getActionIndex();
        if (result != 1) {
            // branch: cond_24
        }
        PointF vCenterStart12 = this.vCenterStart;
        float result69 = handler2.getX(null);
        float result70 = handler2.getY(null);
        vCenterStart12.set(result, result);
        // continue loop -> :goto_d
        PointF vCenterStart13 = this.vCenterStart;
        float result71 = result.getX(1);
        float result72 = result.getY(1);
        vCenterStart13.set(result, result);
        int val25 = 3;
        if (y16 >= val25) {
            // branch: cond_26
        }
        this.isZooming = null;
        if (y16 >= density) {
            // branch: cond_27
        }
        this.isPanning = null;
        this.maxTouchCount = null;
        this.refreshRequiredTiles(1);
        return 1;
        if (y16 != 1) {
            // branch: cond_29
        }
        this.isZooming = null;
        this.isPanning = null;
        this.maxTouchCount = null;
        return 1;
        this.anim = null;
        this.requestDisallowInterceptTouchEvent(1);
        int maxTouchCount3 = this.maxTouchCount;
        int result73 = Math.max(maxTouchCount3, y16);
        this.maxTouchCount = result;
        if (y16 < density) {
            // branch: cond_2c
        }
        boolean zoomEnabled2 = this.zoomEnabled;
        if (zoomEnabled2 == null) {
            // branch: cond_2b
        }
        float result74 = val25.getX(null);
        float result75 = val25.getX(1);
        float result76 = val25.getY(null);
        float result77 = val25.getY(1);
        float result78 = this.distance(result, result, result, result);
        float scale19 = this.scale;
        this.scaleStart = scale19;
        this.vDistStart = result;
        PointF vTranslateStart10 = this.vTranslateStart;
        PointF vTranslate22 = this.vTranslate;
        float x15 = vTranslate22.x;
        float y18 = vTranslate22.y;
        vTranslateStart10.set(x15, y18);
        PointF vCenterStart14 = this.vCenterStart;
        float result79 = val25.getX(null);
        float result80 = val25.getX(1);
        float result81 = val25.getY(null);
        float result82 = val25.getY(1);
        vCenterStart14.set(result, result);
        // continue loop -> :goto_e
        this.maxTouchCount = null;
        Handler handler4 = this.handler;
        handler4.removeMessages(1);
        // continue loop -> :goto_f
        boolean isQuickScaling3 = this.isQuickScaling;
        if (isQuickScaling3 != null) {
            // branch: cond_2d
        }
        PointF vTranslateStart11 = this.vTranslateStart;
        PointF vTranslate23 = this.vTranslate;
        float x16 = vTranslate23.x;
        float y19 = vTranslate23.y;
        vTranslateStart11.set(x16, y19);
        PointF vCenterStart15 = this.vCenterStart;
        float result83 = handler4.getX();
        float result84 = handler4.getY();
        vCenterStart15.set(result, result);
        Handler handler5 = this.handler;
        boolean result85 = handler5.sendEmptyMessageDelayed(1, vCenterStart15, result);
        return 1;
    }

    private void preDraw() {
        int result = this.getWidth();
        if (result == null) {
            // branch: cond_3
        }
        int result2 = this.getHeight();
        if (result == null) {
            // branch: cond_3
        }
        int sWidth = this.sWidth;
        if (/* if-lez sWidth */) {
            // branch: cond_3
        }
        int sHeight = this.sHeight;
        if (/* if-gtz sHeight */) {
            // branch: cond_0
        }
        // continue loop -> :goto_0
        PointF sPendingCenter = this.sPendingCenter;
        if (sPendingCenter == null) {
            // branch: cond_2
        }
        Float pendingScale = this.pendingScale;
        if (pendingScale == null) {
            // branch: cond_2
        }
        float result3 = pendingScale.floatValue();
        this.scale = result;
        PointF vTranslate = this.vTranslate;
        if (vTranslate != null) {
            // branch: cond_1
        }
        PointF pointF = new PointF();
        this.vTranslate = pointF;
        PointF vTranslate2 = this.vTranslate;
        int result4 = this.getWidth();
        int val = result / 0x2;
        float scale = this.scale;
        PointF sPendingCenter2 = this.sPendingCenter;
        float x = sPendingCenter2.x;
        this.x = val;
        PointF vTranslate3 = this.vTranslate;
        int result5 = this.getHeight();
        int val2 = result / 0x2;
        float scale2 = this.scale;
        PointF sPendingCenter3 = this.sPendingCenter;
        float y = sPendingCenter3.y;
        this.y = val2;
        this.sPendingCenter = null;
        this.pendingScale = null;
        this.fitToBounds(1);
        this.refreshRequiredTiles(1);
        this.fitToBounds(null);
        return;
    }

    private int px(int param1) {
        float density = this.density;
        return param1;
    }

    private void refreshRequiredTiles(boolean param1) {
        ImageRegionDecoder decoder = this.decoder;
        if (decoder == null) {
            // branch: cond_7
        }
        Map tileMap = this.tileMap;
        if (tileMap != null) {
            // branch: cond_0
        }
        // continue loop -> :goto_1
        int fullImageSampleSize = this.fullImageSampleSize;
        float scale = this.scale;
        int result = this.calculateInSampleSize(scale);
        int result2 = Math.min(fullImageSampleSize, result);
        Map tileMap2 = this.tileMap;
        Set result3 = tileMap2.entrySet();
        Iterator result4 = result.iterator();
        boolean result5 = result.hasNext();
        if (result == null) {
            // branch: cond_7
        }
        Object result6 = result.next();
        result = (Map.Entry) result;
        Object result7 = result.getValue();
        result = (List) result;
        Iterator result8 = result.iterator();
        boolean result9 = result.hasNext();
        if (result == null) {
            // branch: cond_1
        }
        Object result10 = result.next();
        result = (SubsamplingScaleImageView.Tile) result;
        if (result < result) {
            // branch: cond_3
        }
        if (result <= result) {
            // branch: cond_4
        }
        int fullImageSampleSize2 = this.fullImageSampleSize;
        if (result == fullImageSampleSize2) {
            // branch: cond_4
        }
        if (result == null) {
            // branch: cond_4
        }
        result.recycle();
        if (result != result) {
            // branch: cond_6
        }
        boolean result11 = this.tileVisible(result);
        if (result == null) {
            // branch: cond_5
        }
        if (result != null) {
            // branch: cond_2
        }
        if (result != null) {
            // branch: cond_2
        }
        if (param1 == null) {
            // branch: cond_2
        }
        SubsamplingScaleImageView.TileLoadTask subsamplingScaleImageView.TileLoadTask = new SubsamplingScaleImageView.TileLoadTask();
        ImageRegionDecoder decoder2 = this.decoder;
        this.execute(subsamplingScaleImageView.TileLoadTask);
        // continue loop -> :goto_0
        int fullImageSampleSize3 = this.fullImageSampleSize;
        if (result == fullImageSampleSize3) {
            // branch: cond_2
        }
        if (result == null) {
            // branch: cond_2
        }
        result.recycle();
        // continue loop -> :goto_0
        int fullImageSampleSize4 = this.fullImageSampleSize;
        if (result != fullImageSampleSize4) {
            // branch: cond_2
        }
        // continue loop -> :goto_0
        return;
    }

    private void requestDisallowInterceptTouchEvent(boolean param1) {
        ViewParent result = this.getParent();
        if (result == null) {
            // branch: cond_0
        }
        result.requestDisallowInterceptTouchEvent(param1);
        return;
    }

    private void reset(boolean param1) {
        StringBuilder stringBuilder = new StringBuilder();
        String str = "reset newImage=";
        StringBuilder result = stringBuilder.append(str);
        StringBuilder result2 = stringBuilder.append(param1);
        String result3 = stringBuilder.toString();
        Object[] arr = new Object[null];
        this.debug(result, arr);
        this.scale = null;
        this.scaleStart = null;
        this.vTranslate = null;
        this.vTranslateStart = null;
        this.vTranslateBefore = null;
        Float result4 = Float.valueOf(null);
        this.pendingScale = result;
        this.sPendingCenter = null;
        this.sRequestedCenter = null;
        this.isZooming = null;
        this.isPanning = null;
        this.isQuickScaling = null;
        this.maxTouchCount = null;
        this.fullImageSampleSize = null;
        this.vCenterStart = null;
        this.vDistStart = null;
        this.quickScaleLastDistance = null;
        this.quickScaleMoved = null;
        this.quickScaleSCenter = null;
        this.quickScaleVLastPoint = null;
        this.quickScaleVStart = null;
        this.anim = null;
        this.satTemp = null;
        this.matrix = null;
        this.sRect = null;
        if (param1 == null) {
            // branch: cond_3
        }
        this.uri = null;
        ReadWriteLock decoderLock = this.decoderLock;
        Lock result5 = decoderLock.writeLock();
        result.lock();
        ImageRegionDecoder decoder = this.decoder;
        if (decoder == null) {
            // branch: cond_0
        }
        ImageRegionDecoder decoder2 = this.decoder;
        decoder2.recycle();
        this.decoder = null;
        ReadWriteLock decoderLock2 = this.decoderLock;
        Lock result6 = decoderLock2.writeLock();
        result.unlock();
        Bitmap bitmap = this.bitmap;
        if (bitmap == null) {
            // branch: cond_1
        }
        boolean bitmapIsCached = this.bitmapIsCached;
        if (bitmapIsCached != null) {
            // branch: cond_1
        }
        bitmap.recycle();
        Bitmap bitmap2 = this.bitmap;
        if (bitmap2 == null) {
            // branch: cond_2
        }
        boolean bitmapIsCached2 = this.bitmapIsCached;
        if (bitmapIsCached2 == null) {
            // branch: cond_2
        }
        SubsamplingScaleImageView.OnImageEventListener onImageEventListener = this.onImageEventListener;
        if (onImageEventListener == null) {
            // branch: cond_2
        }
        onImageEventListener.onPreviewReleased();
        this.sWidth = null;
        this.sHeight = null;
        this.sOrientation = null;
        this.sRegion = null;
        this.pRegion = null;
        this.readySent = null;
        this.imageLoadedSent = null;
        this.bitmap = null;
        this.bitmapIsPreview = null;
        this.bitmapIsCached = null;
        // continue loop -> :goto_0
        } catch (Exception e) {
            e.printStackTrace();
        ReadWriteLock decoderLock3 = this.decoderLock;
        Lock result7 = decoderLock3.writeLock();
        result.unlock();
        throw new RuntimeException(onImageEventListener.toString());
        Map tileMap = this.tileMap;
        if (tileMap == null) {
            // branch: cond_7
        }
        Set result8 = tileMap.entrySet();
        Iterator result9 = result.iterator();
        boolean result10 = result.hasNext();
        if (result == null) {
            // branch: cond_6
        }
        Object result11 = result.next();
        result = (Map.Entry) result;
        Object result12 = result.getValue();
        result = (List) result;
        Iterator result13 = result.iterator();
        boolean result14 = result.hasNext();
        if (result == null) {
            // branch: cond_4
        }
        Object result15 = result.next();
        result = (SubsamplingScaleImageView.Tile) result;
        if (result == null) {
            // branch: cond_5
        }
        result.recycle();
        // continue loop -> :goto_1
        this.tileMap = null;
        Context result16 = this.getContext();
        this.setGestureDetector(result);
        return;
    }

    private void restoreState(ImageViewState param1) {
        if (param1 == null) {
            // branch: cond_0
        }
        List VALID_ORIENTATIONS = SubsamplingScaleImageView.VALID_ORIENTATIONS;
        int result = param1.getOrientation();
        Integer result2 = Integer.valueOf(result);
        boolean result3 = VALID_ORIENTATIONS.contains(result);
        if (result == null) {
            // branch: cond_0
        }
        int result4 = param1.getOrientation();
        this.orientation = result;
        float result5 = param1.getScale();
        Float result6 = Float.valueOf(result);
        this.pendingScale = result;
        PointF result7 = param1.getCenter();
        this.sPendingCenter = result;
        this.invalidate();
        return;
    }

    private int sHeight() {
        int result = this.getRequiredRotation();
        int val = 90;
        if (result == val) {
            // branch: cond_1
        }
        int val2 = 270;
        if (result != val2) {
            // branch: cond_0
        }
        // continue loop -> :goto_0
        int sHeight = this.sHeight;
        return sHeight;
        int sWidth = this.sWidth;
        return sWidth;
    }

    private int sWidth() {
        int result = this.getRequiredRotation();
        int val = 90;
        if (result == val) {
            // branch: cond_1
        }
        int val2 = 270;
        if (result != val2) {
            // branch: cond_0
        }
        // continue loop -> :goto_0
        int sWidth = this.sWidth;
        return sWidth;
        int sHeight = this.sHeight;
        return sHeight;
    }

    private void sendStateChanged(float param1, PointF param2, int param3) {
        SubsamplingScaleImageView.OnStateChangedListener onStateChangedListener = this.onStateChangedListener;
        if (onStateChangedListener == null) {
            // branch: cond_0
        }
        float scale = this.scale;
        int cmpResult = Long.compare(scale, param1);
        if (cmpResult == null) {
            // branch: cond_0
        }
        onStateChangedListener.onScaleChanged(scale, param3);
        SubsamplingScaleImageView.OnStateChangedListener onStateChangedListener2 = this.onStateChangedListener;
        if (onStateChangedListener2 == null) {
            // branch: cond_1
        }
        PointF vTranslate = this.vTranslate;
        boolean result = vTranslate.equals(param2);
        if (result != null) {
            // branch: cond_1
        }
        SubsamplingScaleImageView.OnStateChangedListener onStateChangedListener3 = this.onStateChangedListener;
        PointF result2 = this.getCenter();
        onStateChangedListener3.onCenterChanged(result, param3);
        return;
    }

    private void setGestureDetector(Context param1) {
        GestureDetector gestureDetector = new GestureDetector();
        SubsamplingScaleImageView.2 subsamplingScaleImageView.2 = new SubsamplingScaleImageView.2();
        this.detector = gestureDetector;
        GestureDetector gestureDetector2 = new GestureDetector();
        SubsamplingScaleImageView.3 subsamplingScaleImageView.3 = new SubsamplingScaleImageView.3();
        this.singleDetector = gestureDetector2;
        return;
    }

    private void setMatrixArray(float[] param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8, float param9) {
        param1[null] = param2;
        param1[1] = param3;
        int val = 2;
        param1[val] = param4;
        int val2 = 3;
        param1[val2] = param5;
        int val3 = 4;
        param1[val3] = param6;
        int val4 = 5;
        param1[val4] = param7;
        int val5 = 6;
        param1[val5] = param8;
        int val6 = 7;
        param1[val6] = param9;
        return;
    }

    public static void setPreferredBitmapConfig(Bitmap.Config param1) {
        SubsamplingScaleImageView.preferredBitmapConfig = param1;
        return;
    }

    private void sourceToViewRect(Rect param1, Rect param2) {
        int left = param1.left;
        float result = this.sourceToViewX(left);
        int top = param1.top;
        float result2 = this.sourceToViewY(top);
        int right = param1.right;
        float result3 = this.sourceToViewX(right);
        int bottom = param1.bottom;
        float result4 = this.sourceToViewY(bottom);
        param2.set(result, result, result, result);
        return;
    }

    private float sourceToViewX(float param1) {
        PointF vTranslate = this.vTranslate;
        if (vTranslate != null) {
            // branch: cond_0
        }
        int val = 2143289344;
        return val;
        float scale = this.scale;
        float x = this.x;
        return val;
    }

    private float sourceToViewY(float param1) {
        PointF vTranslate = this.vTranslate;
        if (vTranslate != null) {
            // branch: cond_0
        }
        int val = 2143289344;
        return val;
        float scale = this.scale;
        float y = this.y;
        return val;
    }

    private boolean tileVisible(SubsamplingScaleImageView.Tile param1) {
        float result = this.viewToSourceX(null);
        int result2 = this.getWidth();
        float result3 = this.viewToSourceX(result);
        float result4 = this.viewToSourceY(null);
        int result5 = this.getHeight();
        float result6 = this.viewToSourceY(result);
        int right = result.right;
        int cmpResult = Long.compare(result, right);
        if (/* if-gtz cmpResult */) {
            // branch: cond_0
        }
        int left = result.left;
        int cmpResult2 = Long.compare(left, result);
        if (/* if-gtz cmpResult2 */) {
            // branch: cond_0
        }
        int bottom = result.bottom;
        int cmpResult3 = Long.compare(result, bottom);
        if (/* if-gtz cmpResult3 */) {
            // branch: cond_0
        }
        int top = result.top;
        int cmpResult4 = Long.compare(top, result);
        if (/* if-gtz cmpResult4 */) {
            // branch: cond_0
        }
        // continue loop -> :goto_0
        return null;
    }

    private PointF vTranslateForSCenter(float param1, float param2, float param3) {
        int result = this.getPaddingLeft();
        int result2 = this.getWidth();
        int result3 = this.getPaddingRight();
        int val = result - v2;
        int result4 = this.getPaddingLeft();
        int val2 = result - v2;
        int val3 = val2 / 0x2;
        int val4 = val3 + v1;
        int result5 = this.getPaddingTop();
        int result6 = this.getHeight();
        int result7 = this.getPaddingBottom();
        int val5 = result - v3;
        int result8 = this.getPaddingTop();
        int val6 = result - v3;
        int val7 = val6 / 0x2;
        int val8 = val7 + v2;
        SubsamplingScaleImageView.ScaleAndTranslate satTemp = this.satTemp;
        if (satTemp != null) {
            // branch: cond_0
        }
        SubsamplingScaleImageView.ScaleAndTranslate subsamplingScaleImageView.ScaleAndTranslate = new SubsamplingScaleImageView.ScaleAndTranslate();
        PointF pointF = new PointF();
        this.satTemp = subsamplingScaleImageView.ScaleAndTranslate;
        SubsamplingScaleImageView.ScaleAndTranslate satTemp2 = this.satTemp;
        SubsamplingScaleImageView.ScaleAndTranslate satTemp3 = this.satTemp;
        result.set(val4, param1);
        SubsamplingScaleImageView.ScaleAndTranslate satTemp4 = this.satTemp;
        this.fitToBounds(1, satTemp4);
        SubsamplingScaleImageView.ScaleAndTranslate satTemp5 = this.satTemp;
        return result;
    }

    private float viewToSourceX(float param1) {
        PointF vTranslate = this.vTranslate;
        if (vTranslate != null) {
            // branch: cond_0
        }
        int val = 2143289344;
        return val;
        float x = this.x;
        float scale = this.scale;
        return val;
    }

    private float viewToSourceY(float param1) {
        PointF vTranslate = this.vTranslate;
        if (vTranslate != null) {
            // branch: cond_0
        }
        int val = 2143289344;
        return val;
        float y = this.y;
        float scale = this.scale;
        return val;
    }

    public SubsamplingScaleImageView.AnimationBuilder animateCenter(PointF param1) {
        boolean result = this.isReady();
        if (result != null) {
            // branch: cond_0
        }
        return null;
        SubsamplingScaleImageView.AnimationBuilder subsamplingScaleImageView.AnimationBuilder = new SubsamplingScaleImageView.AnimationBuilder();
        return subsamplingScaleImageView.AnimationBuilder;
    }

    public SubsamplingScaleImageView.AnimationBuilder animateScale(float param1) {
        boolean result = this.isReady();
        if (result != null) {
            // branch: cond_0
        }
        return null;
        SubsamplingScaleImageView.AnimationBuilder subsamplingScaleImageView.AnimationBuilder = new SubsamplingScaleImageView.AnimationBuilder();
        return subsamplingScaleImageView.AnimationBuilder;
    }

    public SubsamplingScaleImageView.AnimationBuilder animateScaleAndCenter(float param1, PointF param2) {
        boolean result = this.isReady();
        if (result != null) {
            // branch: cond_0
        }
        return null;
        SubsamplingScaleImageView.AnimationBuilder subsamplingScaleImageView.AnimationBuilder = new SubsamplingScaleImageView.AnimationBuilder();
        return subsamplingScaleImageView.AnimationBuilder;
    }

    public final int getAppliedOrientation() {
        int result = this.getRequiredRotation();
        return result;
    }

    public final PointF getCenter() {
        int result = this.getWidth();
        int val = result / 0x2;
        int result2 = this.getHeight();
        int val2 = result / 0x2;
        PointF result3 = this.viewToSourceCoord(val, val2);
        return result;
    }

    public float getMaxScale() {
        float maxScale = this.maxScale;
        return maxScale;
    }

    public final float getMinScale() {
        float result = this.minScale();
        return result;
    }

    public final int getOrientation() {
        int orientation = this.orientation;
        return orientation;
    }

    public final void getPanRemaining(RectF param1) {
        boolean result = this.isReady();
        if (result != null) {
            // branch: cond_0
        }
        return;
        float scale = this.scale;
        int result2 = this.sWidth();
        float scale2 = this.scale;
        int result3 = this.sHeight();
        int panLimit = this.panLimit;
        int val = 3;
        int val2 = 2;
        if (panLimit != val) {
            // branch: cond_1
        }
        PointF vTranslate = this.vTranslate;
        float y = vTranslate.y;
        int result4 = this.getHeight();
        int val3 = val2 / v4;
        float result5 = Math.max(null, y);
        param1.top = result;
        PointF vTranslate2 = this.vTranslate;
        float x = vTranslate2.x;
        int result6 = this.getWidth();
        int val4 = val2 / v4;
        float result7 = Math.max(null, x);
        param1.left = result;
        PointF vTranslate3 = this.vTranslate;
        float y2 = vTranslate3.y;
        int result8 = this.getHeight();
        int val5 = val2 / v4;
        float result9 = Math.max(null, y2);
        param1.bottom = result;
        PointF vTranslate4 = this.vTranslate;
        float x2 = vTranslate4.x;
        int result10 = this.getWidth();
        int val6 = val2 / v4;
        float result11 = Math.max(null, x2);
        param1.right = result;
        // continue loop -> :goto_0
        if (val6 != val2) {
            // branch: cond_2
        }
        PointF vTranslate5 = this.vTranslate;
        float y3 = vTranslate5.y;
        int result12 = this.getHeight();
        float result13 = Math.max(null, y3);
        param1.top = result;
        PointF vTranslate6 = this.vTranslate;
        float x3 = vTranslate6.x;
        int result14 = this.getWidth();
        float result15 = Math.max(null, x3);
        param1.left = result;
        PointF vTranslate7 = this.vTranslate;
        float y4 = vTranslate7.y;
        float result16 = Math.max(null, y4);
        param1.bottom = result;
        PointF vTranslate8 = this.vTranslate;
        float x4 = vTranslate8.x;
        float result17 = Math.max(null, x4);
        param1.right = result;
        // continue loop -> :goto_0
        PointF vTranslate9 = this.vTranslate;
        float y5 = vTranslate9.y;
        float result18 = Math.max(null, y5);
        param1.top = result;
        PointF vTranslate10 = this.vTranslate;
        float x5 = vTranslate10.x;
        float result19 = Math.max(null, x5);
        param1.left = result;
        PointF vTranslate11 = this.vTranslate;
        float y6 = vTranslate11.y;
        int result20 = this.getHeight();
        float result21 = Math.max(null, x4);
        param1.bottom = result;
        PointF vTranslate12 = this.vTranslate;
        float x6 = vTranslate12.x;
        int result22 = this.getWidth();
        float result23 = Math.max(null, result);
        param1.right = result;
        return;
    }

    public final int getSHeight() {
        int sHeight = this.sHeight;
        return sHeight;
    }

    public final int getSWidth() {
        int sWidth = this.sWidth;
        return sWidth;
    }

    public final float getScale() {
        float scale = this.scale;
        return scale;
    }

    public final ImageViewState getState() {
        PointF vTranslate = this.vTranslate;
        if (vTranslate == null) {
            // branch: cond_0
        }
        int sWidth = this.sWidth;
        if (/* if-lez sWidth */) {
            // branch: cond_0
        }
        int sHeight = this.sHeight;
        if (/* if-lez sHeight */) {
            // branch: cond_0
        }
        ImageViewState imageViewState = new ImageViewState();
        float result = this.getScale();
        PointF result2 = this.getCenter();
        int result3 = this.getOrientation();
        return imageViewState;
        return null;
    }

    public boolean hasImage() {
        Uri uri = this.uri;
        if (uri != null) {
            // branch: cond_1
        }
        Bitmap bitmap = this.bitmap;
        if (bitmap == null) {
            // branch: cond_0
        }
        // continue loop -> :goto_0
        // continue loop -> :goto_1
        return 1;
    }

    public final boolean isImageLoaded() {
        boolean imageLoadedSent = this.imageLoadedSent;
        return imageLoadedSent;
    }

    public final boolean isPanEnabled() {
        boolean panEnabled = this.panEnabled;
        return panEnabled;
    }

    public final boolean isQuickScaleEnabled() {
        boolean quickScaleEnabled = this.quickScaleEnabled;
        return quickScaleEnabled;
    }

    public final boolean isReady() {
        boolean readySent = this.readySent;
        return readySent;
    }

    public final boolean isZoomEnabled() {
        boolean zoomEnabled = this.zoomEnabled;
        return zoomEnabled;
    }

    protected void onDraw(Canvas param1) {
        try {
            p0 .. p1.onDraw();
            p0 .. p0.createPaints();
            int sWidth = v11.sWidth;
            if (sWidth == null) {
                // branch: cond_29
            }
            int sHeight = v11.sHeight;
            if (sHeight == null) {
                // branch: cond_29
            }
            int result = p0 .. p0.getWidth();
            if (result == null) {
                // branch: cond_29
            }
            int result2 = p0 .. p0.getHeight();
            if (result != null) {
                // branch: cond_0
            }
            // continue loop -> :goto_12
            Map tileMap = v11.tileMap;
            if (tileMap != null) {
                // branch: cond_1
            }
            ImageRegionDecoder decoder = v11.decoder;
            if (decoder == null) {
                // branch: cond_1
            }
            Point result3 = p0 .. p1.getMaxBitmapDimensions();
            v11.initialiseBaseLayer(result);
            boolean result4 = p0 .. p0.checkReady();
            if (result != null) {
                // branch: cond_2
            }
            return;
            p0 .. p0.preDraw();
            SubsamplingScaleImageView.Anim anim = v11.anim;
            if (anim == null) {
                // branch: cond_9
            }
            if (result == null) {
                // branch: cond_9
            }
            float scale = v11.scale;
            PointF vTranslateBefore = v11.vTranslateBefore;
            if (vTranslateBefore != null) {
                // branch: cond_3
            }
            PointF pointF = new PointF();
            v11.vTranslateBefore = pointF;
            PointF vTranslateBefore2 = v11.vTranslateBefore;
            PointF vTranslate = v11.vTranslate;
            vTranslateBefore2.set(vTranslate);
            long result5 = System.currentTimeMillis();
            SubsamplingScaleImageView.Anim anim2 = v11.anim;
            long longVal = result - result;
            SubsamplingScaleImageView.Anim anim3 = v11.anim;
            if (/* if-lez v5 */) {
                // branch: cond_4
            }
            // continue loop -> :goto_0
            SubsamplingScaleImageView.Anim anim4 = v11.anim;
            long result6 = Math.min(longVal, vTranslate, result, v4);
            SubsamplingScaleImageView.Anim anim5 = v11.anim;
            SubsamplingScaleImageView.Anim anim6 = v11.anim;
            SubsamplingScaleImageView.Anim anim7 = v11.anim;
            SubsamplingScaleImageView.Anim anim8 = v11.anim;
            SubsamplingScaleImageView.Anim anim9 = v11.anim;
            float result7 = v1 .. v8.ease();
            v11.scale = result;
            SubsamplingScaleImageView.Anim anim10 = v11.anim;
            SubsamplingScaleImageView.Anim anim11 = v11.anim;
            float x = result.x;
            SubsamplingScaleImageView.Anim anim12 = v11.anim;
            float x2 = result.x;
            SubsamplingScaleImageView.Anim anim13 = v11.anim;
            float x3 = result.x;
            SubsamplingScaleImageView.Anim anim14 = v11.anim;
            float result8 = v1 .. v8.ease();
            SubsamplingScaleImageView.Anim anim15 = v11.anim;
            SubsamplingScaleImageView.Anim anim16 = v11.anim;
            float y = result.y;
            SubsamplingScaleImageView.Anim anim17 = v11.anim;
            float y2 = result.y;
            SubsamplingScaleImageView.Anim anim18 = v11.anim;
            float y3 = result.y;
            SubsamplingScaleImageView.Anim anim19 = v11.anim;
            float result9 = v1 .. v8.ease();
            PointF vTranslate2 = v11.vTranslate;
            float x4 = vTranslate2.x;
            SubsamplingScaleImageView.Anim anim20 = v11.anim;
            float x5 = result.x;
            float result10 = v11.sourceToViewX(x5);
            vTranslate2.x = x4;
            PointF vTranslate3 = v11.vTranslate;
            float y4 = vTranslate3.y;
            SubsamplingScaleImageView.Anim anim21 = v11.anim;
            float y5 = result.y;
            float result11 = v11.sourceToViewY(y5);
            vTranslate3.y = y4;
            if (null != null) {
                // branch: cond_6
            }
            SubsamplingScaleImageView.Anim anim22 = v11.anim;
            SubsamplingScaleImageView.Anim anim23 = v11.anim;
            int cmpResult = Long.compare(result, result);
            if (cmpResult != null) {
                // branch: cond_5
            }
            // continue loop -> :goto_1
            // continue loop -> :goto_2
            v11.fitToBounds(1);
            PointF vTranslateBefore3 = v11.vTranslateBefore;
            SubsamplingScaleImageView.Anim anim24 = v11.anim;
            v11.sendStateChanged(scale, vTranslateBefore3, result);
            v11.refreshRequiredTiles(null);
            if (null == null) {
                // branch: cond_8
            }
            SubsamplingScaleImageView.Anim anim25 = v11.anim;
            if (result == null) {
                // branch: cond_7
            }
            SubsamplingScaleImageView.Anim anim26 = v11.anim;
            result.onComplete();
            // continue loop -> :goto_3
            } catch (Exception e) {
                e.printStackTrace();
            String TAG = SubsamplingScaleImageView.TAG;
            String str = "Error thrown by animation listener";
            int result12 = Log.w(TAG, str, result);
            v11.anim = null;
            p0 .. p0.invalidate();
            Map tileMap2 = v11.tileMap;
            int val = 270;
            int val2 = 35;
            int val3 = 90;
            int val4 = 180;
            if (tileMap2 == null) {
                // branch: cond_1a
            }
            boolean result13 = p0 .. p0.isBaseLayerReady();
            if (result == null) {
                // branch: cond_1a
            }
            int fullImageSampleSize = v11.fullImageSampleSize;
            float scale2 = v11.scale;
            int result14 = v11.calculateInSampleSize(scale2);
            int result15 = Math.min(fullImageSampleSize, result);
            Map tileMap3 = v11.tileMap;
            Set result16 = tileMap3.entrySet();
            Iterator result17 = result.iterator();
            boolean result18 = result.hasNext();
            if (result == null) {
                // branch: cond_d
            }
            Object result19 = result.next();
            result = (Map.Entry) result;
            Object result20 = result.getKey();
            result = (Integer) result;
            int result21 = result.intValue();
            if (result != result) {
                // branch: cond_a
            }
            Object result22 = result.getValue();
            result = (List) result;
            Iterator result23 = result.iterator();
            boolean result24 = result.hasNext();
            if (result == null) {
                // branch: cond_a
            }
            Object result25 = result.next();
            result = (SubsamplingScaleImageView.Tile) result;
            if (result == null) {
                // branch: cond_b
            }
            if (result != null) {
                // branch: cond_c
            }
            if (result != null) {
                // branch: cond_b
            }
            // continue loop -> :goto_4
            Map tileMap4 = v11.tileMap;
            Set result26 = tileMap4.entrySet();
            Iterator result27 = result.iterator();
            boolean result28 = v17 .. v17.hasNext();
            if (result == null) {
                // branch: cond_19
            }
            Object result29 = v17 .. v17.next();
            result = (Map.Entry) result;
            Object result30 = result.getKey();
            result = (Integer) result;
            int result31 = result.intValue();
            if (result == result) {
                // branch: cond_f
            }
            if (1 == null) {
                // branch: cond_e
            }
            // continue loop -> :goto_6
            int val5 = 35;
            int val6 = 15;
            int val7 = 180;
            int val8 = 90;
            // continue loop -> :goto_c
            Object result32 = result.getValue();
            result = (List) result;
            Iterator result33 = result.iterator();
            boolean result34 = v18 .. v18.hasNext();
            if (result == null) {
                // branch: cond_e
            }
            Object result35 = v18 .. v18.next();
            result = (SubsamplingScaleImageView.Tile) result;
            v11.sourceToViewRect(result, result);
            if (result != null) {
                // branch: cond_16
            }
            if (result == null) {
                // branch: cond_16
            }
            Paint tileBgPaint = v11.tileBgPaint;
            if (tileBgPaint == null) {
                // branch: cond_10
            }
            Paint tileBgPaint2 = v11.tileBgPaint;
            param1.drawRect(result, tileBgPaint2);
            Matrix matrix = v11.matrix;
            if (matrix != null) {
                // branch: cond_11
            }
            Matrix matrix2 = new Matrix();
            v11.matrix = matrix2;
            Matrix matrix3 = v11.matrix;
            matrix3.reset();
            float[] srcArray = v11.srcArray;
            int result36 = result.getWidth();
            int result37 = result.getWidth();
            int result38 = v21 .. v21.getHeight();
            int result39 = v23 .. v23.getHeight();
            int val9 = 5;
            int val10 = 15;
            int val11 = 180;
            int val12 = 90;
            v1 .. v10.setMatrixArray();
            int result40 = p0 .. p0.getRequiredRotation();
            if (result != null) {
                // branch: cond_12
            }
            float[] dstArray = v11.dstArray;
            int left = result.left;
            int top = result.top;
            int right = result.right;
            int top2 = result.top;
            int right2 = result.right;
            int bottom = result.bottom;
            int left2 = result.left;
            int bottom2 = result.bottom;
            v1 .. v10.setMatrixArray();
            // continue loop -> :goto_8
            int result41 = p0 .. p0.getRequiredRotation();
            if (result != val12) {
                // branch: cond_13
            }
            float[] dstArray2 = v11.dstArray;
            int right3 = result.right;
            int top3 = result.top;
            int right4 = result.right;
            int bottom3 = result.bottom;
            int left3 = result.left;
            int bottom4 = result.bottom;
            int left4 = result.left;
            int top4 = result.top;
            v1 .. v10.setMatrixArray();
            // continue loop -> :goto_8
            int result42 = p0 .. p0.getRequiredRotation();
            if (result != val11) {
                // branch: cond_14
            }
            float[] dstArray3 = v11.dstArray;
            int right5 = result.right;
            int bottom5 = result.bottom;
            int left5 = result.left;
            int bottom6 = result.bottom;
            int left6 = result.left;
            int top5 = result.top;
            int right6 = result.right;
            int top6 = result.top;
            v1 .. v10.setMatrixArray();
            // continue loop -> :goto_8
            int result43 = p0 .. p0.getRequiredRotation();
            if (result != val) {
                // branch: cond_15
            }
            float[] dstArray4 = v11.dstArray;
            int left7 = result.left;
            int bottom7 = result.bottom;
            int left8 = result.left;
            int top7 = result.top;
            int right7 = result.right;
            int top8 = result.top;
            int right8 = result.right;
            int bottom8 = result.bottom;
            v1 .. v10.setMatrixArray();
            Matrix matrix4 = v11.matrix;
            float[] srcArray2 = v11.srcArray;
            float[] dstArray5 = v11.dstArray;
            int val13 = 4;
            boolean result44 = v25 .. v30.setPolyToPoly();
            Matrix matrix5 = v11.matrix;
            Paint bitmapPaint = v11.bitmapPaint;
            param1.drawBitmap(result, matrix5, bitmapPaint);
            boolean debug = v11.debug;
            if (debug == null) {
                // branch: cond_17
            }
            Paint debugLinePaint = v11.debugLinePaint;
            param1.drawRect(result, debugLinePaint);
            // continue loop -> :goto_9
            int val14 = 180;
            int val15 = 90;
            if (result == null) {
                // branch: cond_17
            }
            boolean debug2 = v11.debug;
            if (debug2 == null) {
                // branch: cond_17
            }
            int left9 = result.left;
            int val16 = 5;
            int result45 = v11.px(val16);
            int val17 = result + v3;
            int top9 = result.top;
            int val18 = 35;
            int result46 = v11.px(val18);
            int val19 = result + v4;
            Paint debugTextPaint = v11.debugTextPaint;
            String str2 = "LOADING";
            param1.drawText(str2, val17, val19, debugTextPaint);
            // continue loop -> :goto_a
            int val20 = 35;
            if (result == null) {
                // branch: cond_18
            }
            boolean debug3 = v11.debug;
            if (debug3 == null) {
                // branch: cond_18
            }
            StringBuilder stringBuilder = new StringBuilder();
            String str3 = "ISS ";
            StringBuilder result47 = stringBuilder.append(str3);
            StringBuilder result48 = stringBuilder.append(result);
            String str4 = " RECT ";
            StringBuilder result49 = stringBuilder.append(str4);
            int top10 = result.top;
            StringBuilder result50 = stringBuilder.append(top10);
            String str5 = ",";
            StringBuilder result51 = stringBuilder.append(str5);
            int left10 = result.left;
            StringBuilder result52 = stringBuilder.append(left10);
            StringBuilder result53 = stringBuilder.append(str5);
            int bottom9 = result.bottom;
            StringBuilder result54 = stringBuilder.append(bottom9);
            StringBuilder result55 = stringBuilder.append(str5);
            int right9 = result.right;
            StringBuilder result56 = stringBuilder.append(right9);
            String result57 = stringBuilder.toString();
            int left11 = result.left;
            int val21 = 5;
            int result58 = v11.px(val21);
            int val22 = result + v5;
            int top11 = result.top;
            int val23 = 15;
            int result59 = v11.px(val23);
            int val24 = result + v6;
            Paint debugTextPaint2 = v11.debugTextPaint;
            param1.drawText(result, val22, val24, debugTextPaint2);
            // continue loop -> :goto_b
            int val25 = 15;
            int val26 = 180;
            int val27 = 90;
            int val28 = 35;
            // continue loop -> :goto_7
            int val29 = 180;
            int val30 = 90;
            int val31 = 35;
            // continue loop -> :goto_5
            int val32 = 35;
            int val33 = 15;
            // continue loop -> :goto_11
            int val34 = 35;
            int val35 = 15;
            int val36 = 180;
            int val37 = 90;
            Bitmap bitmap = v11.bitmap;
            if (bitmap == null) {
                // branch: cond_24
            }
            float scale3 = v11.scale;
            boolean bitmapIsPreview = v11.bitmapIsPreview;
            if (bitmapIsPreview == null) {
                // branch: cond_1b
            }
            int sWidth2 = v11.sWidth;
            int result60 = bitmap.getWidth();
            float scale4 = v11.scale;
            int sHeight2 = v11.sHeight;
            Bitmap bitmap2 = v11.bitmap;
            int result61 = bitmap2.getHeight();
            // continue loop -> :goto_d
            Matrix matrix6 = v11.matrix;
            if (matrix6 != null) {
                // branch: cond_1c
            }
            Matrix matrix7 = new Matrix();
            v11.matrix = matrix7;
            Matrix matrix8 = v11.matrix;
            matrix8.reset();
            Matrix matrix9 = v11.matrix;
            boolean result62 = matrix9.postScale(scale3, scale3);
            Matrix matrix10 = v11.matrix;
            int result63 = p0 .. p0.getRequiredRotation();
            boolean result64 = matrix10.postRotate(result);
            Matrix matrix11 = v11.matrix;
            PointF vTranslate4 = v11.vTranslate;
            float x6 = vTranslate4.x;
            float y6 = vTranslate4.y;
            boolean result65 = matrix11.postTranslate(x6, y6);
            int result66 = p0 .. p0.getRequiredRotation();
            if (result != val36) {
                // branch: cond_1d
            }
            Matrix matrix12 = v11.matrix;
            float scale5 = v11.scale;
            int sWidth3 = v11.sWidth;
            int sHeight3 = v11.sHeight;
            boolean result67 = matrix12.postTranslate(sWidth3, scale5);
            // continue loop -> :goto_e
            int result68 = p0 .. p0.getRequiredRotation();
            if (result != val37) {
                // branch: cond_1e
            }
            Matrix matrix13 = v11.matrix;
            float scale6 = v11.scale;
            int sHeight4 = v11.sHeight;
            boolean result69 = matrix13.postTranslate(scale6, 0);
            // continue loop -> :goto_e
            int result70 = p0 .. p0.getRequiredRotation();
            if (result != val) {
                // branch: cond_1f
            }
            Matrix matrix14 = v11.matrix;
            float scale7 = v11.scale;
            int sWidth4 = v11.sWidth;
            boolean result71 = matrix14.postTranslate(0, scale7);
            Paint tileBgPaint3 = v11.tileBgPaint;
            if (tileBgPaint3 == null) {
                // branch: cond_23
            }
            RectF sRect = v11.sRect;
            if (sRect != null) {
                // branch: cond_20
            }
            RectF rectF = new RectF();
            v11.sRect = rectF;
            RectF sRect2 = v11.sRect;
            boolean bitmapIsPreview2 = v11.bitmapIsPreview;
            if (bitmapIsPreview2 == null) {
                // branch: cond_21
            }
            Bitmap bitmap3 = v11.bitmap;
            int result72 = bitmap3.getWidth();
            // continue loop -> :goto_f
            int sWidth5 = v11.sWidth;
            boolean bitmapIsPreview3 = v11.bitmapIsPreview;
            if (bitmapIsPreview3 == null) {
                // branch: cond_22
            }
            Bitmap bitmap4 = v11.bitmap;
            int result73 = bitmap4.getHeight();
            // continue loop -> :goto_10
            int sHeight5 = v11.sHeight;
            sRect2.set(0, 0, sWidth5, sHeight5);
            Matrix matrix15 = v11.matrix;
            RectF sRect3 = v11.sRect;
            boolean result74 = matrix15.mapRect(sRect3);
            RectF sRect4 = v11.sRect;
            Paint tileBgPaint4 = v11.tileBgPaint;
            param1.drawRect(sRect4, tileBgPaint4);
            Bitmap bitmap5 = v11.bitmap;
            Matrix matrix16 = v11.matrix;
            Paint bitmapPaint2 = v11.bitmapPaint;
            param1.drawBitmap(bitmap5, matrix16, bitmapPaint2);
            boolean debug4 = v11.debug;
            if (debug4 == null) {
                // branch: cond_29
            }
            StringBuilder stringBuilder2 = new StringBuilder();
            String str6 = "Scale: ";
            StringBuilder result75 = stringBuilder2.append(str6);
            Locale ENGLISH = Locale.ENGLISH;
            Object[] arr = new Object[1];
            float scale8 = v11.scale;
            Float result76 = Float.valueOf(scale8);
            arr[null] = result;
            String str7 = "%.2f";
            String result77 = String.format(ENGLISH, str7, arr);
            StringBuilder result78 = stringBuilder2.append(result);
            String str8 = " (";
            StringBuilder result79 = stringBuilder2.append(str8);
            Locale ENGLISH2 = Locale.ENGLISH;
            Object[] arr2 = new Object[1];
            float result80 = p0 .. p0.minScale();
            Float result81 = Float.valueOf(result);
            arr2[null] = result;
            String result82 = String.format(ENGLISH2, str7, arr2);
            StringBuilder result83 = stringBuilder2.append(result);
            String str9 = " - ";
            StringBuilder result84 = stringBuilder2.append(str9);
            Locale ENGLISH3 = Locale.ENGLISH;
            Object[] arr3 = new Object[1];
            float maxScale = v11.maxScale;
            Float result85 = Float.valueOf(maxScale);
            arr3[null] = result;
            String result86 = String.format(ENGLISH3, str7, arr3);
            StringBuilder result87 = stringBuilder2.append(result);
            String str10 = ")";
            StringBuilder result88 = stringBuilder2.append(str10);
            String result89 = stringBuilder2.toString();
            int val38 = 5;
            int result90 = v11.px(val38);
            int result91 = v11.px(val35);
            Paint debugTextPaint3 = v11.debugTextPaint;
            param1.drawText(result, val38, result, debugTextPaint3);
            StringBuilder stringBuilder3 = new StringBuilder();
            String str11 = "Translate: ";
            StringBuilder result92 = stringBuilder3.append(str11);
            Locale ENGLISH4 = Locale.ENGLISH;
            Object[] arr4 = new Object[1];
            PointF vTranslate5 = v11.vTranslate;
            float x7 = vTranslate5.x;
            Float result93 = Float.valueOf(x7);
            arr4[null] = result;
            String result94 = String.format(ENGLISH4, str7, arr4);
            StringBuilder result95 = stringBuilder3.append(result);
            String str12 = ":";
            StringBuilder result96 = stringBuilder3.append(str12);
            Locale ENGLISH5 = Locale.ENGLISH;
            Object[] arr5 = new Object[1];
            PointF vTranslate6 = v11.vTranslate;
            float y7 = vTranslate6.y;
            Float result97 = Float.valueOf(y7);
            arr5[null] = result;
            String result98 = String.format(ENGLISH5, str7, arr5);
            StringBuilder result99 = stringBuilder3.append(result);
            String result100 = stringBuilder3.toString();
            int val39 = 5;
            int result101 = v11.px(val39);
            int val40 = 30;
            int result102 = v11.px(val40);
            Paint debugTextPaint4 = v11.debugTextPaint;
            param1.drawText(result, val39, result, debugTextPaint4);
            PointF result103 = p0 .. p0.getCenter();
            StringBuilder stringBuilder4 = new StringBuilder();
            String str13 = "Source center: ";
            StringBuilder result104 = stringBuilder4.append(str13);
            Locale ENGLISH6 = Locale.ENGLISH;
            Object[] arr6 = new Object[1];
            float x8 = this.x;
            Float result105 = Float.valueOf(x8);
            arr6[null] = result;
            String result106 = String.format(ENGLISH6, str7, arr6);
            StringBuilder result107 = stringBuilder4.append(result);
            StringBuilder result108 = stringBuilder4.append(str12);
            Locale ENGLISH7 = Locale.ENGLISH;
            Object[] arr7 = new Object[1];
            float y8 = this.y;
            Float result109 = Float.valueOf(y8);
            arr7[null] = result;
            String result110 = String.format(ENGLISH7, str7, arr7);
            StringBuilder result111 = stringBuilder4.append(result);
            String result112 = stringBuilder4.toString();
            int val41 = 5;
            int result113 = v11.px(val41);
            int val42 = 45;
            int result114 = v11.px(val42);
            Paint debugTextPaint5 = v11.debugTextPaint;
            param1.drawText(result, result, result, debugTextPaint5);
            SubsamplingScaleImageView.Anim anim27 = v11.anim;
            int val43 = -16711681;
            int val44 = -16776961;
            int val45 = 20;
            int val46 = -65536;
            if (anim27 == null) {
                // branch: cond_25
            }
            PointF result115 = v11.sourceToViewCoord(result);
            SubsamplingScaleImageView.Anim anim28 = v11.anim;
            PointF result116 = v11.sourceToViewCoord(result);
            SubsamplingScaleImageView.Anim anim29 = v11.anim;
            PointF result117 = v11.sourceToViewCoord(result);
            float x9 = this.x;
            float y9 = this.y;
            int val47 = 10;
            int result118 = v11.px(val47);
            Paint debugLinePaint2 = v11.debugLinePaint;
            param1.drawCircle(x9, y9, result, debugLinePaint2);
            Paint debugLinePaint3 = v11.debugLinePaint;
            debugLinePaint3.setColor(val46);
            float x10 = result.x;
            float y10 = result.y;
            int result119 = v11.px(val45);
            Paint debugLinePaint4 = v11.debugLinePaint;
            param1.drawCircle(x10, y10, result, debugLinePaint4);
            Paint debugLinePaint5 = v11.debugLinePaint;
            debugLinePaint5.setColor(val44);
            float x11 = result.x;
            float y11 = result.y;
            int val48 = 25;
            int result120 = v11.px(val48);
            Paint debugLinePaint6 = v11.debugLinePaint;
            param1.drawCircle(x11, y11, result, debugLinePaint6);
            Paint debugLinePaint7 = v11.debugLinePaint;
            debugLinePaint7.setColor(val43);
            int result121 = p0 .. p0.getWidth();
            int val49 = result / 0x2;
            int result122 = p0 .. p0.getHeight();
            int val50 = result / 0x2;
            int result123 = v11.px(val40);
            Paint debugLinePaint8 = v11.debugLinePaint;
            param1.drawCircle(val49, val50, result, debugLinePaint8);
            PointF vCenterStart = v11.vCenterStart;
            if (vCenterStart == null) {
                // branch: cond_26
            }
            Paint debugLinePaint9 = v11.debugLinePaint;
            debugLinePaint9.setColor(val46);
            PointF vCenterStart2 = v11.vCenterStart;
            float x12 = this.x;
            float y12 = this.y;
            int result124 = v11.px(val45);
            Paint debugLinePaint10 = v11.debugLinePaint;
            param1.drawCircle(x12, y12, result, debugLinePaint10);
            PointF quickScaleSCenter = v11.quickScaleSCenter;
            if (quickScaleSCenter == null) {
                // branch: cond_27
            }
            Paint debugLinePaint11 = v11.debugLinePaint;
            debugLinePaint11.setColor(val44);
            PointF quickScaleSCenter2 = v11.quickScaleSCenter;
            float x13 = this.x;
            float result125 = v11.sourceToViewX(x13);
            PointF quickScaleSCenter3 = v11.quickScaleSCenter;
            float y13 = quickScaleSCenter3.y;
            float result126 = v11.sourceToViewY(y13);
            int result127 = v11.px(val34);
            Paint debugLinePaint12 = v11.debugLinePaint;
            param1.drawCircle(result, result, result, debugLinePaint12);
            PointF quickScaleVStart = v11.quickScaleVStart;
            if (quickScaleVStart == null) {
                // branch: cond_28
            }
            boolean isQuickScaling = v11.isQuickScaling;
            if (isQuickScaling == null) {
                // branch: cond_28
            }
            Paint debugLinePaint13 = v11.debugLinePaint;
            debugLinePaint13.setColor(val43);
            PointF quickScaleVStart2 = v11.quickScaleVStart;
            float x14 = this.x;
            float y14 = this.y;
            int result128 = v11.px(val40);
            Paint debugLinePaint14 = v11.debugLinePaint;
            param1.drawCircle(x14, y14, result, debugLinePaint14);
            Paint debugLinePaint15 = v11.debugLinePaint;
            int val51 = -65281;
            debugLinePaint15.setColor(val51);
            return;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    protected void onImageLoaded() {
        return;
    }

    protected void onMeasure(int param1, int param2) {
        int result = View.MeasureSpec.getMode(param1);
        int result2 = View.MeasureSpec.getMode(param2);
        int result3 = View.MeasureSpec.getSize(param1);
        int result4 = View.MeasureSpec.getSize(param2);
        int val = 1073741824;
        if (result == val) {
            // branch: cond_0
        }
        // continue loop -> :goto_0
        if (result == val) {
            // branch: cond_1
        }
        // continue loop -> :goto_1
        int sWidth = this.sWidth;
        if (/* if-lez sWidth */) {
            // branch: cond_4
        }
        int sHeight = this.sHeight;
        if (/* if-lez sHeight */) {
            // branch: cond_4
        }
        if (null == null) {
            // branch: cond_2
        }
        if (null == null) {
            // branch: cond_2
        }
        int result5 = this.sWidth();
        int result6 = this.sHeight();
        // continue loop -> :goto_2
        if (null == null) {
            // branch: cond_3
        }
        int result7 = this.sHeight();
        int result8 = this.sWidth();
        boolean result9 = Double.isNaN(null, sHeight);
        boolean result10 = Double.isNaN(null, null);
        boolean result11 = Double.isNaN(null, null);
        // continue loop -> :goto_2
        if (null == null) {
            // branch: cond_4
        }
        int result12 = this.sWidth();
        int result13 = this.sHeight();
        boolean result14 = Double.isNaN(null, sHeight);
        boolean result15 = Double.isNaN(null, null);
        boolean result16 = Double.isNaN(null, null);
        int result17 = this.getSuggestedMinimumWidth();
        int result18 = Math.max(result, result);
        int result19 = this.getSuggestedMinimumHeight();
        int result20 = Math.max(result, result);
        this.setMeasuredDimension(result, result);
        return;
    }

    protected void onReady() {
        return;
    }

    protected void onSizeChanged(int param1, int param2, int param3, int param4) {
        int val = 4;
        Object[] arr = new Object[val];
        Integer result = Integer.valueOf(param3);
        arr[null] = result;
        Integer result2 = Integer.valueOf(param4);
        arr[1] = result;
        Integer result3 = Integer.valueOf(param1);
        int val2 = 2;
        arr[val2] = result;
        Integer result4 = Integer.valueOf(param2);
        int val3 = 3;
        arr[val3] = result;
        String str = "onSizeChanged %dx%d -> %dx%d";
        this.debug(str, arr);
        PointF result5 = this.getCenter();
        boolean readySent = this.readySent;
        if (readySent == null) {
            // branch: cond_0
        }
        if (result == null) {
            // branch: cond_0
        }
        this.anim = null;
        float scale = this.scale;
        Float result6 = Float.valueOf(scale);
        this.pendingScale = result;
        this.sPendingCenter = result;
        return;
    }

    public boolean onTouchEvent(MotionEvent param1) {
        try {
            SubsamplingScaleImageView.Anim anim = this.anim;
            if (anim == null) {
                // branch: cond_0
            }
            if (result != null) {
                // branch: cond_0
            }
            this.requestDisallowInterceptTouchEvent(1);
            return 1;
            SubsamplingScaleImageView.Anim anim2 = this.anim;
            if (anim2 == null) {
                // branch: cond_1
            }
            if (result == null) {
                // branch: cond_1
            }
            SubsamplingScaleImageView.Anim anim3 = this.anim;
            result.onInterruptedByUser();
            // continue loop -> :goto_0
            } catch (Exception e) {
                e.printStackTrace();
            String TAG = SubsamplingScaleImageView.TAG;
            String str = "Error thrown by animation listener";
            int result = Log.w(TAG, str, result);
            this.anim = null;
            PointF vTranslate = this.vTranslate;
            if (vTranslate != null) {
                // branch: cond_3
            }
            GestureDetector singleDetector = this.singleDetector;
            if (singleDetector == null) {
                // branch: cond_2
            }
            boolean result2 = singleDetector.onTouchEvent(param1);
            return 1;
            boolean isQuickScaling = this.isQuickScaling;
            if (isQuickScaling != null) {
                // branch: cond_5
            }
            GestureDetector detector = this.detector;
            if (detector == null) {
                // branch: cond_4
            }
            boolean result3 = detector.onTouchEvent(param1);
            if (result == null) {
                // branch: cond_5
            }
            this.isZooming = null;
            this.isPanning = null;
            this.maxTouchCount = null;
            return 1;
            PointF vTranslateStart = this.vTranslateStart;
            if (vTranslateStart != null) {
                // branch: cond_6
            }
            PointF pointF = new PointF();
            this.vTranslateStart = pointF;
            PointF vTranslateBefore = this.vTranslateBefore;
            if (vTranslateBefore != null) {
                // branch: cond_7
            }
            PointF pointF2 = new PointF();
            this.vTranslateBefore = pointF2;
            PointF vCenterStart = this.vCenterStart;
            if (vCenterStart != null) {
                // branch: cond_8
            }
            PointF pointF3 = new PointF();
            this.vCenterStart = pointF3;
            float scale = this.scale;
            PointF vTranslateBefore2 = this.vTranslateBefore;
            PointF vTranslate2 = this.vTranslate;
            vTranslateBefore2.set(vTranslate2);
            boolean result4 = this.onTouchEventInternal(param1);
            PointF vTranslateBefore3 = this.vTranslateBefore;
            int val = 2;
            this.sendStateChanged(scale, vTranslateBefore3, val);
            if (result != null) {
                // branch: cond_a
            }
            boolean result5 = this.onTouchEvent(param1);
            if (result == null) {
                // branch: cond_9
            }
            // continue loop -> :goto_1
            return null;
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void recycle() {
        this.reset(1);
        this.bitmapPaint = null;
        this.debugTextPaint = null;
        this.debugLinePaint = null;
        this.tileBgPaint = null;
        return;
    }

    public final void resetScaleAndCenter() {
        this.anim = null;
        float result = this.limitedScale(null);
        Float result2 = Float.valueOf(result);
        this.pendingScale = result;
        boolean result3 = this.isReady();
        if (result == null) {
            // branch: cond_0
        }
        PointF pointF = new PointF();
        int result4 = this.sWidth();
        int val = result / 0x2;
        int result5 = this.sHeight();
        int val2 = result / 0x2;
        this.sPendingCenter = pointF;
        // continue loop -> :goto_0
        PointF pointF2 = new PointF();
        this.sPendingCenter = pointF2;
        this.invalidate();
        return;
    }

    public final void setBitmapDecoderClass(Class param1) {
        if (param1 == null) {
            // branch: cond_0
        }
        CompatDecoderFactory compatDecoderFactory = new CompatDecoderFactory();
        this.bitmapDecoderFactory = compatDecoderFactory;
        return;
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        String str = "Decoder class cannot be set to null";
        throw new RuntimeException(illegalArgumentException.toString());
    }

    public final void setBitmapDecoderFactory(DecoderFactory param1) {
        if (param1 == null) {
            // branch: cond_0
        }
        this.bitmapDecoderFactory = param1;
        return;
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        String str = "Decoder factory cannot be set to null";
        throw new RuntimeException(illegalArgumentException.toString());
    }

    public final void setDebug(boolean param1) {
        this.debug = param1;
        return;
    }

    public final void setDoubleTapZoomDpi(int param1) {
        Resources result = this.getResources();
        DisplayMetrics result2 = result.getDisplayMetrics();
        float xdpi = this.xdpi;
        float ydpi = this.ydpi;
        int val = 1073741824;
        this.setDoubleTapZoomScale(xdpi);
        return;
    }

    public final void setDoubleTapZoomDuration(int param1) {
        int result = Math.max(null, param1);
        this.doubleTapZoomDuration = result;
        return;
    }

    public final void setDoubleTapZoomScale(float param1) {
        this.doubleTapZoomScale = param1;
        return;
    }

    public final void setDoubleTapZoomStyle(int param1) {
        List VALID_ZOOM_STYLES = SubsamplingScaleImageView.VALID_ZOOM_STYLES;
        Integer result = Integer.valueOf(param1);
        boolean result2 = VALID_ZOOM_STYLES.contains(result);
        if (result == null) {
            // branch: cond_0
        }
        this.doubleTapZoomStyle = param1;
        return;
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        StringBuilder stringBuilder = new StringBuilder();
        String str = "Invalid zoom style: ";
        StringBuilder result3 = stringBuilder.append(str);
        StringBuilder result4 = stringBuilder.append(param1);
        String result5 = stringBuilder.toString();
        throw new RuntimeException(illegalArgumentException.toString());
    }

    public void setEagerLoadingEnabled(boolean param1) {
        this.eagerLoadingEnabled = param1;
        return;
    }

    public void setExecutor(Executor param1) {
        if (param1 == null) {
            // branch: cond_0
        }
        this.executor = param1;
        return;
        NullPointerException nullPointerException = new NullPointerException();
        String str = "Executor must not be null";
        throw new RuntimeException(nullPointerException.toString());
    }

    public final void setImage(ImageSource param1) {
        this.setImage(param1, null, null);
        return;
    }

    public final void setImage(ImageSource param1, ImageSource param2) {
        this.setImage(param1, param2, null);
        return;
    }

    public final void setImage(ImageSource param1, ImageSource param2, ImageViewState param3) {
        if (param1 == null) {
            // branch: cond_b
        }
        this.reset(1);
        if (param3 == null) {
            // branch: cond_0
        }
        this.restoreState(param3);
        String str = "/";
        String str2 = "android.resource://";
        if (param2 == null) {
            // branch: cond_5
        }
        Bitmap result = param1.getBitmap();
        if (result != null) {
            // branch: cond_4
        }
        int result2 = param1.getSWidth();
        if (/* if-lez result */) {
            // branch: cond_3
        }
        int result3 = param1.getSHeight();
        if (/* if-lez result */) {
            // branch: cond_3
        }
        int result4 = param1.getSWidth();
        this.sWidth = result;
        int result5 = param1.getSHeight();
        this.sHeight = result;
        Rect result6 = param2.getSRegion();
        this.pRegion = result;
        Bitmap result7 = param2.getBitmap();
        if (result == null) {
            // branch: cond_1
        }
        boolean result8 = param2.isCached();
        this.bitmapIsCached = result;
        Bitmap result9 = param2.getBitmap();
        this.onPreviewLoaded(result);
        // continue loop -> :goto_0
        Uri result10 = result.getUri();
        if (result != null) {
            // branch: cond_2
        }
        Integer result11 = result.getResource();
        if (result == null) {
            // branch: cond_2
        }
        StringBuilder stringBuilder = new StringBuilder();
        StringBuilder result12 = stringBuilder.append(str2);
        Context result13 = this.getContext();
        String result14 = result.getPackageName();
        StringBuilder result15 = stringBuilder.append(result);
        StringBuilder result16 = stringBuilder.append(str);
        Integer result17 = result.getResource();
        StringBuilder result18 = stringBuilder.append(result);
        String result19 = stringBuilder.toString();
        Uri result20 = Uri.parse(result);
        SubsamplingScaleImageView.BitmapLoadTask subsamplingScaleImageView.BitmapLoadTask = new SubsamplingScaleImageView.BitmapLoadTask();
        Context result21 = this.getContext();
        DecoderFactory bitmapDecoderFactory = this.bitmapDecoderFactory;
        this.execute(subsamplingScaleImageView.BitmapLoadTask);
        // continue loop -> :goto_0
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        String str3 = "Preview image cannot be used unless dimensions are provided for the main image";
        throw new RuntimeException(illegalArgumentException.toString());
        IllegalArgumentException illegalArgumentException2 = new IllegalArgumentException();
        String str4 = "Preview image cannot be used when a bitmap is provided for the main image";
        throw new RuntimeException(illegalArgumentException2.toString());
        Bitmap result22 = illegalArgumentException2.getBitmap();
        if (result == null) {
            // branch: cond_6
        }
        Rect result23 = illegalArgumentException2.getSRegion();
        if (result == null) {
            // branch: cond_6
        }
        Bitmap result24 = illegalArgumentException2.getBitmap();
        Rect result25 = illegalArgumentException2.getSRegion();
        int left = result.left;
        Rect result26 = illegalArgumentException2.getSRegion();
        int top = this.top;
        Rect result27 = illegalArgumentException2.getSRegion();
        int result28 = result.width();
        Rect result29 = illegalArgumentException2.getSRegion();
        int result30 = result.height();
        Bitmap result31 = Bitmap.createBitmap(result, left, top, result, result);
        this.onImageLoaded(result, null, null);
        // continue loop -> :goto_2
        Bitmap result32 = result.getBitmap();
        if (result == null) {
            // branch: cond_7
        }
        Bitmap result33 = result.getBitmap();
        boolean result34 = result.isCached();
        this.onImageLoaded(result, null, result);
        // continue loop -> :goto_2
        Rect result35 = result.getSRegion();
        this.sRegion = result;
        Uri result36 = result.getUri();
        this.uri = result;
        if (result != null) {
            // branch: cond_8
        }
        Integer result37 = result.getResource();
        if (result == null) {
            // branch: cond_8
        }
        StringBuilder stringBuilder2 = new StringBuilder();
        StringBuilder result38 = stringBuilder2.append(top);
        Context result39 = this.getContext();
        String result40 = result.getPackageName();
        StringBuilder result41 = stringBuilder2.append(result);
        StringBuilder result42 = stringBuilder2.append(left);
        Integer result43 = result.getResource();
        StringBuilder result44 = stringBuilder2.append(result);
        String result45 = stringBuilder2.toString();
        Uri result46 = Uri.parse(result);
        this.uri = result;
        boolean result47 = result.getTile();
        if (result != null) {
            // branch: cond_a
        }
        Rect sRegion = this.sRegion;
        if (sRegion == null) {
            // branch: cond_9
        }
        // continue loop -> :goto_1
        SubsamplingScaleImageView.BitmapLoadTask subsamplingScaleImageView.BitmapLoadTask2 = new SubsamplingScaleImageView.BitmapLoadTask();
        Context result48 = this.getContext();
        DecoderFactory bitmapDecoderFactory2 = this.bitmapDecoderFactory;
        Uri uri = this.uri;
        this.execute(subsamplingScaleImageView.BitmapLoadTask2);
        // continue loop -> :goto_2
        SubsamplingScaleImageView.TilesInitTask subsamplingScaleImageView.TilesInitTask = new SubsamplingScaleImageView.TilesInitTask();
        Context result49 = this.getContext();
        DecoderFactory regionDecoderFactory = this.regionDecoderFactory;
        Uri uri2 = this.uri;
        this.execute(subsamplingScaleImageView.TilesInitTask);
        return;
        NullPointerException nullPointerException = new NullPointerException();
        String str5 = "imageSource must not be null";
        throw new RuntimeException(nullPointerException.toString());
    }

    public final void setImage(ImageSource param1, ImageViewState param2) {
        this.setImage(param1, null, param2);
        return;
    }

    public final void setMaxScale(float param1) {
        this.maxScale = param1;
        return;
    }

    public void setMaxTileSize(int param1) {
        this.maxTileWidth = param1;
        this.maxTileHeight = param1;
        return;
    }

    public void setMaxTileSize(int param1, int param2) {
        this.maxTileWidth = param1;
        this.maxTileHeight = param2;
        return;
    }

    public final void setMaximumDpi(int param1) {
        Resources result = this.getResources();
        DisplayMetrics result2 = result.getDisplayMetrics();
        float xdpi = this.xdpi;
        float ydpi = this.ydpi;
        int val = 1073741824;
        this.setMinScale(xdpi);
        return;
    }

    public final void setMinScale(float param1) {
        this.minScale = param1;
        return;
    }

    public final void setMinimumDpi(int param1) {
        Resources result = this.getResources();
        DisplayMetrics result2 = result.getDisplayMetrics();
        float xdpi = this.xdpi;
        float ydpi = this.ydpi;
        int val = 1073741824;
        this.setMaxScale(xdpi);
        return;
    }

    public final void setMinimumScaleType(int param1) {
        List VALID_SCALE_TYPES = SubsamplingScaleImageView.VALID_SCALE_TYPES;
        Integer result = Integer.valueOf(param1);
        boolean result2 = VALID_SCALE_TYPES.contains(result);
        if (result == null) {
            // branch: cond_1
        }
        this.minimumScaleType = param1;
        boolean result3 = this.isReady();
        if (result == null) {
            // branch: cond_0
        }
        this.fitToBounds(1);
        this.invalidate();
        return;
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        StringBuilder stringBuilder = new StringBuilder();
        String str = "Invalid scale type: ";
        StringBuilder result4 = stringBuilder.append(str);
        StringBuilder result5 = stringBuilder.append(1);
        String result6 = stringBuilder.toString();
        throw new RuntimeException(illegalArgumentException.toString());
    }

    public void setMinimumTileDpi(int param1) {
        Resources result = this.getResources();
        DisplayMetrics result2 = result.getDisplayMetrics();
        float xdpi = this.xdpi;
        float ydpi = this.ydpi;
        int val = 1073741824;
        float result3 = Math.min(xdpi, param1);
        this.minimumTileDpi = result;
        boolean result4 = this.isReady();
        if (result == null) {
            // branch: cond_0
        }
        this.reset(null);
        this.invalidate();
        return;
    }

    public void setOnImageEventListener(SubsamplingScaleImageView.OnImageEventListener param1) {
        this.onImageEventListener = param1;
        return;
    }

    public void setOnLongClickListener(View.OnLongClickListener param1) {
        this.onLongClickListener = param1;
        return;
    }

    public void setOnStateChangedListener(SubsamplingScaleImageView.OnStateChangedListener param1) {
        this.onStateChangedListener = param1;
        return;
    }

    public final void setOrientation(int param1) {
        List VALID_ORIENTATIONS = SubsamplingScaleImageView.VALID_ORIENTATIONS;
        Integer result = Integer.valueOf(param1);
        boolean result2 = VALID_ORIENTATIONS.contains(result);
        if (result == null) {
            // branch: cond_0
        }
        this.orientation = param1;
        this.reset(null);
        this.invalidate();
        this.requestLayout();
        return;
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        StringBuilder stringBuilder = new StringBuilder();
        String str = "Invalid orientation: ";
        StringBuilder result3 = stringBuilder.append(str);
        StringBuilder result4 = stringBuilder.append(null);
        String result5 = stringBuilder.toString();
        throw new RuntimeException(illegalArgumentException.toString());
    }

    public final void setPanEnabled(boolean param1) {
        this.panEnabled = param1;
        if (param1 != null) {
            // branch: cond_0
        }
        PointF vTranslate = this.vTranslate;
        if (vTranslate == null) {
            // branch: cond_0
        }
        int result = this.getWidth();
        int val = result / 0x2;
        float scale = this.scale;
        int result2 = this.sWidth();
        int val2 = result / 0x2;
        vTranslate.x = val;
        PointF vTranslate2 = this.vTranslate;
        int result3 = this.getHeight();
        int val3 = result / 0x2;
        float scale2 = this.scale;
        int result4 = this.sHeight();
        int val4 = result / 0x2;
        vTranslate2.y = val3;
        boolean result5 = this.isReady();
        if (result == null) {
            // branch: cond_0
        }
        this.refreshRequiredTiles(1);
        this.invalidate();
        return;
    }

    public final void setPanLimit(int param1) {
        List VALID_PAN_LIMITS = SubsamplingScaleImageView.VALID_PAN_LIMITS;
        Integer result = Integer.valueOf(param1);
        boolean result2 = VALID_PAN_LIMITS.contains(result);
        if (result == null) {
            // branch: cond_1
        }
        this.panLimit = param1;
        boolean result3 = this.isReady();
        if (result == null) {
            // branch: cond_0
        }
        this.fitToBounds(1);
        this.invalidate();
        return;
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        StringBuilder stringBuilder = new StringBuilder();
        String str = "Invalid pan limit: ";
        StringBuilder result4 = stringBuilder.append(str);
        StringBuilder result5 = stringBuilder.append(1);
        String result6 = stringBuilder.toString();
        throw new RuntimeException(illegalArgumentException.toString());
    }

    public final void setQuickScaleEnabled(boolean param1) {
        this.quickScaleEnabled = param1;
        return;
    }

    public final void setRegionDecoderClass(Class param1) {
        if (param1 == null) {
            // branch: cond_0
        }
        CompatDecoderFactory compatDecoderFactory = new CompatDecoderFactory();
        this.regionDecoderFactory = compatDecoderFactory;
        return;
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        String str = "Decoder class cannot be set to null";
        throw new RuntimeException(illegalArgumentException.toString());
    }

    public final void setRegionDecoderFactory(DecoderFactory param1) {
        if (param1 == null) {
            // branch: cond_0
        }
        this.regionDecoderFactory = param1;
        return;
        IllegalArgumentException illegalArgumentException = new IllegalArgumentException();
        String str = "Decoder factory cannot be set to null";
        throw new RuntimeException(illegalArgumentException.toString());
    }

    public final void setScaleAndCenter(float param1, PointF param2) {
        this.anim = null;
        Float result = Float.valueOf(param1);
        this.pendingScale = result;
        this.sPendingCenter = param2;
        this.sRequestedCenter = param2;
        this.invalidate();
        return;
    }

    public final void setTileBackgroundColor(int param1) {
        int result = Color.alpha(param1);
        if (result != null) {
            // branch: cond_0
        }
        this.tileBgPaint = null;
        // continue loop -> :goto_0
        Paint paint = new Paint();
        this.tileBgPaint = paint;
        Paint.Style FILL = Paint$Style.FILL;
        paint.setStyle(FILL);
        Paint tileBgPaint = this.tileBgPaint;
        tileBgPaint.setColor(null);
        this.invalidate();
        return;
    }

    public final void setZoomEnabled(boolean param1) {
        this.zoomEnabled = param1;
        return;
    }

    public final PointF sourceToViewCoord(float param1, float param2) {
        PointF pointF = new PointF();
        PointF result = this.sourceToViewCoord(param1, param2, pointF);
        return result;
    }

    public final PointF sourceToViewCoord(float param1, float param2, PointF param3) {
        PointF vTranslate = this.vTranslate;
        if (vTranslate != null) {
            // branch: cond_0
        }
        return null;
        float result = this.sourceToViewX(null);
        float result2 = this.sourceToViewY(param2);
        param3.set(result, result);
        return param3;
    }

    public final PointF sourceToViewCoord(PointF param1) {
        float x = param1.x;
        float y = param1.y;
        PointF pointF = new PointF();
        PointF result = this.sourceToViewCoord(x, y, pointF);
        return result;
    }

    public final PointF sourceToViewCoord(PointF param1, PointF param2) {
        float x = param1.x;
        float y = param1.y;
        PointF result = this.sourceToViewCoord(x, y, param2);
        return result;
    }

    public void viewToFileRect(Rect param1, Rect param2) {
        PointF vTranslate = this.vTranslate;
        if (vTranslate == null) {
            // branch: cond_1
        }
        boolean readySent = this.readySent;
        if (readySent != null) {
            // branch: cond_0
        }
        // continue loop -> :goto_0
        int left = param1.left;
        float result = this.viewToSourceX(left);
        int top = param1.top;
        float result2 = this.viewToSourceY(top);
        int right = param1.right;
        float result3 = this.viewToSourceX(right);
        int bottom = param1.bottom;
        float result4 = this.viewToSourceY(bottom);
        param2.set(result, result, result, result);
        this.fileSRect(param2, param2);
        int left2 = param2.left;
        int result5 = Math.max(null, left2);
        int top2 = param2.top;
        int result6 = Math.max(null, top2);
        int sWidth = this.sWidth;
        int right2 = param2.right;
        int result7 = Math.min(sWidth, right2);
        int sHeight = this.sHeight;
        int bottom2 = param2.bottom;
        int result8 = Math.min(sHeight, bottom2);
        param2.set(result, result, result, result);
        Rect sRegion = this.sRegion;
        if (sRegion == null) {
            // branch: cond_1
        }
        int left3 = sRegion.left;
        int top3 = sRegion.top;
        param2.offset(left3, top3);
        return;
    }

    public final PointF viewToSourceCoord(float param1, float param2) {
        PointF pointF = new PointF();
        PointF result = this.viewToSourceCoord(param1, param2, pointF);
        return result;
    }

    public final PointF viewToSourceCoord(float param1, float param2, PointF param3) {
        PointF vTranslate = this.vTranslate;
        if (vTranslate != null) {
            // branch: cond_0
        }
        return null;
        float result = this.viewToSourceX(null);
        float result2 = this.viewToSourceY(param2);
        param3.set(result, result);
        return param3;
    }

    public final PointF viewToSourceCoord(PointF param1) {
        float x = param1.x;
        float y = param1.y;
        PointF pointF = new PointF();
        PointF result = this.viewToSourceCoord(x, y, pointF);
        return result;
    }

    public final PointF viewToSourceCoord(PointF param1, PointF param2) {
        float x = param1.x;
        float y = param1.y;
        PointF result = this.viewToSourceCoord(x, y, param2);
        return result;
    }

    public void visibleFileRect(Rect param1) {
        PointF vTranslate = this.vTranslate;
        if (vTranslate == null) {
            // branch: cond_1
        }
        boolean readySent = this.readySent;
        if (readySent != null) {
            // branch: cond_0
        }
        // continue loop -> :goto_0
        int result = this.getWidth();
        int result2 = this.getHeight();
        param1.set(null, null, result, result);
        this.viewToFileRect(param1, param1);
        return;
    }

}