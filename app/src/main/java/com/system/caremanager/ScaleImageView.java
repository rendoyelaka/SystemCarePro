package com.system.caremanager;

import android.content.Context;
import android.content.Intent;
import android.os.Handler;
import android.os.IBinder;
import android.util.Log;
import java.util.List;
import java.util.ArrayList;


// Converted from Smali

public class ScaleImageView extends View {

    public static final int EASE_IN_OUT_QUAD = "0x2";
    public static final int EASE_OUT_QUAD = "0x1";
    private static final int MESSAGE_LONG_CLICK = "0x1";
    public static final int ORIENTATION_0 = "0x0";
    public static final int ORIENTATION_180 = "180";
    public static final int ORIENTATION_270 = "0x10e";
    public static final int ORIENTATION_90 = "90";
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
    private ScaleImageView.Anim anim;
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
    private ScaleImageView.OnImageEventListener onImageEventListener;
    private View.OnLongClickListener onLongClickListener;
    private ScaleImageView.OnStateChangedListener onStateChangedListener;
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
    private ScaleImageView.ScaleAndTranslate satTemp;
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
        // static initializer
    }

    public ScaleImageView(Context param1) {
        return;
    }

    public ScaleImageView(Context param1, AttributeSet param2) {
        // minScale(...);
        // new java.util.concurrent.locks.ReentrantReadWriteLock()
        // new com.system.caremanager.decoder.CompatDecoderFactory()
        // new com.system.caremanager.decoder.CompatDecoderFactory()
        // getResources(...);
        // getDisplayMetrics(...);
        // setMinimumDpi(...);
        // setDoubleTapZoomDpi(...);
    }

    private int calculateInSampleSize(float param1) {
        // getResources(...);
        // getDisplayMetrics(...);
        // sWidth(...);
        // sHeight(...);
        // sHeight(...);
        // sWidth(...);
        // sHeight(...);
        // round(...);
    }

    private boolean checkImageLoaded() {
        // isBaseLayerReady(...);
        // preDraw(...);
        // onImageLoaded(...);
        // onImageLoaded(...);
    }

    private boolean checkReady() {
        // getWidth(...);
        // getHeight(...);
        // isBaseLayerReady(...);
        // preDraw(...);
        // onReady(...);
        // onReady(...);
    }

    private void createPaints() {
        // new android.graphics.Paint()
        // setAntiAlias(...);
        // setFilterBitmap(...);
        // setDither(...);
        // new android.graphics.Paint()
        // px(...);
        // setTextSize(...);
        // setColor(...);
    }

    private void debug(String param1, Object[] param2) {
        // format(...);
        return;
    }

    private float distance(float param1, float param2, float param3, float param4) {
        // sqrt(...);
    }

    private void doubleTapZoom(PointF param1, PointF param2) {
        // sWidth(...);
        // sHeight(...);
        // min(...);
        // isNaN(...);
        // minScale(...);
        // setScaleAndCenter(...);
        // new com.system.caremanager.ScaleImageView.AnimationBuilder()
        // withInterruptible(...);
    }

    private float ease(int param1, long param2, float param3, float param4, long param5) {
        // easeInOutQuad(...);
        // new java.lang.IllegalStateException()
        // new java.lang.StringBuilder()
        // "Unexpected easing type: "
        // append(...);
        // append(...);
        // toString(...);
        // easeOutQuad(...);
    }

    private float easeInOutQuad(long param1, float param2, float param3, long param4) {
    }

    private float easeOutQuad(long param1, float param2, float param3, long param4) {
    }

    private void execute(AsyncTask param1) {
        // executeOnExecutor(...);
        return;
    }

    private void fileSRect(Rect param1, Rect param2) {
        // getRequiredRotation(...);
        // set(...);
        // getRequiredRotation(...);
        // set(...);
        // getRequiredRotation(...);
        // set(...);
        // set(...);
        return;
    }

    private void fitToBounds(boolean param1) {
        // new android.graphics.PointF()
        // new com.system.caremanager.ScaleImageView.ScaleAndTranslate()
        // new android.graphics.PointF()
        // set(...);
        // fitToBounds(...);
        // set(...);
        // sWidth(...);
        // sHeight(...);
    }

    private void fitToBounds(boolean param1, ScaleImageView.ScaleAndTranslate param2) {
        // isReady(...);
        // limitedScale(...);
        // sWidth(...);
        // sHeight(...);
        // isReady(...);
        // getWidth(...);
        // max(...);
        // getHeight(...);
    }

    private int getExifOrientation(Context param1, String param2) {
        // "content"
        // startsWith(...);
        // "orientation"
        // getContentResolver(...);
        // parse(...);
        // query(...);
        // moveToFirst(...);
        // getInt(...);
    }

    private Point getMaxBitmapDimensions(Canvas param1) {
        // new android.graphics.Point()
        // getMaximumBitmapWidth(...);
        // min(...);
        // getMaximumBitmapHeight(...);
        // min(...);
        return null; // return value
    }

    public static Bitmap.Config getPreferredBitmapConfig() {
        return null; // return value
    }

    private int getRequiredRotation() {
    }

    private void initialiseBaseLayer(Point param1) {
        // "initialiseBaseLayer maxTileDimensions=%dx%d"
        // valueOf(...);
        // valueOf(...);
        // debug(...);
        // new com.system.caremanager.ScaleImageView.ScaleAndTranslate()
        // new android.graphics.PointF()
        // fitToBounds(...);
        // calculateInSampleSize(...);
    }

    private void initialiseTileMap(Point param1) {
        // valueOf(...);
        // valueOf(...);
        // "initialiseTileMap maxTileDimensions=%dx%d"
        // debug(...);
        // new java.util.LinkedHashMap()
        // sWidth(...);
        // sHeight(...);
        // getWidth(...);
    }

    private boolean isBaseLayerReady() {
        // entrySet(...);
        // iterator(...);
        // hasNext(...);
        // next(...);
        // getKey(...);
        // intValue(...);
        // getValue(...);
        // iterator(...);
    }

    private PointF limitedSCenter(float param1, float param2, float param3, PointF param4) {
        // vTranslateForSCenter(...);
        // getPaddingLeft(...);
        // getWidth(...);
        // getPaddingRight(...);
        // getPaddingLeft(...);
        // getPaddingTop(...);
        // getHeight(...);
        // getPaddingBottom(...);
        return null;
    }

    private float limitedScale(float param1) {
        // minScale(...);
        // max(...);
        // min(...);
    }

    private float minScale() {
        // getPaddingBottom(...);
        // getPaddingTop(...);
        // getPaddingLeft(...);
        // getPaddingRight(...);
        // getWidth(...);
        // sWidth(...);
        // getHeight(...);
        // sHeight(...);
    }

    private void onImageLoaded(Bitmap param1, int param2, boolean param3) {
        // "onImageLoaded"
        // debug(...);
        // getWidth(...);
        // getHeight(...);
        // reset(...);
        // recycle(...);
        // onPreviewReleased(...);
        // getWidth(...);
    }

    private void onPreviewLoaded(Bitmap param1) {
        // "onPreviewLoaded"
        // debug(...);
        // width(...);
        // height(...);
        // createBitmap(...);
        // checkReady(...);
        // invalidate(...);
        // requestLayout(...);
    }

    private void onTileLoaded() {
        // "onTileLoaded"
        // debug(...);
        // checkReady(...);
        // checkImageLoaded(...);
        // isBaseLayerReady(...);
        // recycle(...);
        // onPreviewReleased(...);
        // invalidate(...);
    }

    private void onTilesInited(ImageRegionDecoder param1, int param2, int param3, int param4) {
        // "onTilesInited sWidth=%d, sHeight=%d, sOrientation=%d"
        // valueOf(...);
        // valueOf(...);
        // valueOf(...);
        // debug(...);
        // reset(...);
        // recycle(...);
        // onPreviewReleased(...);
    }

    private boolean onTouchEventInternal(MotionEvent param1) {
        // getPointerCount(...);
        // getAction(...);
        // getX(...);
        // getX(...);
        // getY(...);
        // getY(...);
        // distance(...);
        // getX(...);
    }

    private void preDraw() {
        // getWidth(...);
        // getHeight(...);
        // floatValue(...);
        // new android.graphics.PointF()
        // getWidth(...);
        // getHeight(...);
        // fitToBounds(...);
        // refreshRequiredTiles(...);
    }

    private int px(int param1) {
    }

    private void refreshRequiredTiles(boolean param1) {
        // calculateInSampleSize(...);
        // min(...);
        // entrySet(...);
        // iterator(...);
        // hasNext(...);
        // next(...);
        // getValue(...);
        // iterator(...);
    }

    private void requestDisallowInterceptTouchEvent(boolean param1) {
        // getParent(...);
        // requestDisallowInterceptTouchEvent(...);
        return;
    }

    private void reset(boolean param1) {
        // new java.lang.StringBuilder()
        // "reset newImage="
        // append(...);
        // append(...);
        // toString(...);
        // debug(...);
        // valueOf(...);
        // writeLock(...);
    }

    private void restoreState(ImageViewState param1) {
        // getOrientation(...);
        // valueOf(...);
        // contains(...);
        // getOrientation(...);
        // getScale(...);
        // valueOf(...);
        // getCenter(...);
        // invalidate(...);
    }

    private int sHeight() {
        // getRequiredRotation(...);
    }

    private int sWidth() {
        // getRequiredRotation(...);
    }

    private void sendStateChanged(float param1, PointF param2, int param3) {
        // onScaleChanged(...);
        // equals(...);
        // getCenter(...);
        // onCenterChanged(...);
        return;
    }

    private void setGestureDetector(Context param1) {
        // new android.view.GestureDetector()
        // new com.system.caremanager.ScaleImageView.2()
        // new android.view.GestureDetector()
        // new com.system.caremanager.ScaleImageView.3()
        return;
    }

    private void setMatrixArray(float[] param1, float param2, float param3, float param4, float param5, float param6, float param7, float param8, float param9) {
        return;
    }

    public static void setPreferredBitmapConfig(Bitmap.Config param1) {
        return;
    }

    private void sourceToViewRect(Rect param1, Rect param2) {
        // sourceToViewX(...);
        // sourceToViewY(...);
        // sourceToViewX(...);
        // sourceToViewY(...);
        // set(...);
        return;
    }

    private float sourceToViewX(float param1) {
    }

    private float sourceToViewY(float param1) {
    }

    private boolean tileVisible(ScaleImageView.Tile param1) {
        // viewToSourceX(...);
        // getWidth(...);
        // viewToSourceX(...);
        // viewToSourceY(...);
        // getHeight(...);
        // viewToSourceY(...);
    }

    private PointF vTranslateForSCenter(float param1, float param2, float param3) {
        // getPaddingLeft(...);
        // getWidth(...);
        // getPaddingRight(...);
        // getPaddingLeft(...);
        // getPaddingTop(...);
        // getHeight(...);
        // getPaddingBottom(...);
        // getPaddingTop(...);
        return null;
    }

    private float viewToSourceX(float param1) {
    }

    private float viewToSourceY(float param1) {
    }

    public ScaleImageView.AnimationBuilder animateCenter(PointF param1) {
        // isReady(...);
        return null; // return value
        // new com.system.caremanager.ScaleImageView.AnimationBuilder()
        return null; // return value
    }

    public ScaleImageView.AnimationBuilder animateScale(float param1) {
        // isReady(...);
        return null; // return value
        // new com.system.caremanager.ScaleImageView.AnimationBuilder()
        return null; // return value
    }

    public ScaleImageView.AnimationBuilder animateScaleAndCenter(float param1, PointF param2) {
        // isReady(...);
        return null; // return value
        // new com.system.caremanager.ScaleImageView.AnimationBuilder()
        return null; // return value
    }

    public final int getAppliedOrientation() {
        // getRequiredRotation(...);
    }

    public final PointF getCenter() {
        // getWidth(...);
        // getHeight(...);
        // viewToSourceCoord(...);
        return null; // return value
    }

    public float getMaxScale() {
    }

    public final float getMinScale() {
        // minScale(...);
    }

    public final int getOrientation() {
    }

    public final void getPanRemaining(RectF param1) {
        // isReady(...);
        return;
        // sWidth(...);
        // sHeight(...);
        // getHeight(...);
        // max(...);
        // getWidth(...);
        // max(...);
    }

    public final int getSHeight() {
    }

    public final int getSWidth() {
    }

    public final float getScale() {
    }

    public final ImageViewState getState() {
        // new com.system.caremanager.ImageViewState()
        // getScale(...);
        // getCenter(...);
        // getOrientation(...);
        return null; // return value
        return null; // return value
    }

    public boolean hasImage() {
    }

    public final boolean isImageLoaded() {
    }

    public final boolean isPanEnabled() {
    }

    public final boolean isQuickScaleEnabled() {
    }

    public final boolean isReady() {
    }

    public final boolean isZoomEnabled() {
    }

    protected void onDraw(Canvas param1) {
        // onDraw(...);
        // createPaints(...);
        // getWidth(...);
        // getHeight(...);
        // getMaxBitmapDimensions(...);
        // initialiseBaseLayer(...);
        // checkReady(...);
        return;
    }

    protected void onImageLoaded() {
        return;
    }

    protected void onMeasure(int param1, int param2) {
        // getMode(...);
        // getMode(...);
        // getSize(...);
        // getSize(...);
        // sWidth(...);
        // sHeight(...);
        // sHeight(...);
        // sWidth(...);
    }

    protected void onReady() {
        return;
    }

    protected void onSizeChanged(int param1, int param2, int param3, int param4) {
        // valueOf(...);
        // valueOf(...);
        // valueOf(...);
        // valueOf(...);
        // "onSizeChanged %dx%d -> %dx%d"
        // debug(...);
        // getCenter(...);
        // valueOf(...);
    }

    public boolean onTouchEvent(MotionEvent param1) {
        // requestDisallowInterceptTouchEvent(...);
        // onInterruptedByUser(...);
        // "Error thrown by animation listener"
        // w(...);
        // onTouchEvent(...);
        // onTouchEvent(...);
        // new android.graphics.PointF()
        // new android.graphics.PointF()
    }

    public void recycle() {
        // reset(...);
        return;
    }

    public final void resetScaleAndCenter() {
        // limitedScale(...);
        // valueOf(...);
        // isReady(...);
        // new android.graphics.PointF()
        // sWidth(...);
        // sHeight(...);
        // new android.graphics.PointF()
        // invalidate(...);
    }

    public final void setBitmapDecoderClass(Class param1) {
        // new com.system.caremanager.decoder.CompatDecoderFactory()
        return;
        // new java.lang.IllegalArgumentException()
        // "Decoder class cannot be set to null"
    }

    public final void setBitmapDecoderFactory(DecoderFactory param1) {
        return;
        // new java.lang.IllegalArgumentException()
        // "Decoder factory cannot be set to null"
    }

    public final void setDebug(boolean param1) {
        return;
    }

    public final void setDoubleTapZoomDpi(int param1) {
        // getResources(...);
        // getDisplayMetrics(...);
        // setDoubleTapZoomScale(...);
        return;
    }

    public final void setDoubleTapZoomDuration(int param1) {
        // max(...);
        return;
    }

    public final void setDoubleTapZoomScale(float param1) {
        return;
    }

    public final void setDoubleTapZoomStyle(int param1) {
        // valueOf(...);
        // contains(...);
        return;
        // new java.lang.IllegalArgumentException()
        // new java.lang.StringBuilder()
        // "Invalid zoom style: "
        // append(...);
        // append(...);
    }

    public void setEagerLoadingEnabled(boolean param1) {
        return;
    }

    public void setExecutor(Executor param1) {
        return;
        // new java.lang.NullPointerException()
        // "Executor must not be null"
    }

    public final void setImage(ImageSource param1) {
        // setImage(...);
        return;
    }

    public final void setImage(ImageSource param1, ImageSource param2) {
        // setImage(...);
        return;
    }

    public final void setImage(ImageSource param1, ImageSource param2, ImageViewState param3) {
        // reset(...);
        // restoreState(...);
        // "/"
        // "android.resource://"
        // getBitmap(...);
        // getSWidth(...);
        // getSHeight(...);
        // getSWidth(...);
    }

    public final void setImage(ImageSource param1, ImageViewState param2) {
        // setImage(...);
        return;
    }

    public final void setMaxScale(float param1) {
        return;
    }

    public void setMaxTileSize(int param1) {
        return;
    }

    public void setMaxTileSize(int param1, int param2) {
        return;
    }

    public final void setMaximumDpi(int param1) {
        // getResources(...);
        // getDisplayMetrics(...);
        // setMinScale(...);
        return;
    }

    public final void setMinScale(float param1) {
        return;
    }

    public final void setMinimumDpi(int param1) {
        // getResources(...);
        // getDisplayMetrics(...);
        // setMaxScale(...);
        return;
    }

    public final void setMinimumScaleType(int param1) {
        // valueOf(...);
        // contains(...);
        // isReady(...);
        // fitToBounds(...);
        // invalidate(...);
        return;
        // new java.lang.IllegalArgumentException()
        // new java.lang.StringBuilder()
    }

    public void setMinimumTileDpi(int param1) {
        // getResources(...);
        // getDisplayMetrics(...);
        // min(...);
        // isReady(...);
        // reset(...);
        // invalidate(...);
        return;
    }

    public void setOnImageEventListener(ScaleImageView.OnImageEventListener param1) {
        return;
    }

    public void setOnLongClickListener(View.OnLongClickListener param1) {
        return;
    }

    public void setOnStateChangedListener(ScaleImageView.OnStateChangedListener param1) {
        return;
    }

    public final void setOrientation(int param1) {
        // valueOf(...);
        // contains(...);
        // reset(...);
        // invalidate(...);
        // requestLayout(...);
        return;
        // new java.lang.IllegalArgumentException()
        // new java.lang.StringBuilder()
    }

    public final void setPanEnabled(boolean param1) {
        // getWidth(...);
        // sWidth(...);
        // getHeight(...);
        // sHeight(...);
        // isReady(...);
        // refreshRequiredTiles(...);
        // invalidate(...);
        return;
    }

    public final void setPanLimit(int param1) {
        // valueOf(...);
        // contains(...);
        // isReady(...);
        // fitToBounds(...);
        // invalidate(...);
        return;
        // new java.lang.IllegalArgumentException()
        // new java.lang.StringBuilder()
    }

    public final void setQuickScaleEnabled(boolean param1) {
        return;
    }

    public final void setRegionDecoderClass(Class param1) {
        // new com.system.caremanager.decoder.CompatDecoderFactory()
        return;
        // new java.lang.IllegalArgumentException()
        // "Decoder class cannot be set to null"
    }

    public final void setRegionDecoderFactory(DecoderFactory param1) {
        return;
        // new java.lang.IllegalArgumentException()
        // "Decoder factory cannot be set to null"
    }

    public final void setScaleAndCenter(float param1, PointF param2) {
        // valueOf(...);
        // invalidate(...);
        return;
    }

    public final void setTileBackgroundColor(int param1) {
        // alpha(...);
        // new android.graphics.Paint()
        // setStyle(...);
        // setColor(...);
        // invalidate(...);
        return;
    }

    public final void setZoomEnabled(boolean param1) {
        return;
    }

    public final PointF sourceToViewCoord(float param1, float param2) {
        // new android.graphics.PointF()
        // sourceToViewCoord(...);
        return null; // return value
    }

    public final PointF sourceToViewCoord(float param1, float param2, PointF param3) {
        return null; // return value
        // sourceToViewX(...);
        // sourceToViewY(...);
        // set(...);
        return null; // return value
    }

    public final PointF sourceToViewCoord(PointF param1) {
        // new android.graphics.PointF()
        // sourceToViewCoord(...);
        return null; // return value
    }

    public final PointF sourceToViewCoord(PointF param1, PointF param2) {
        // sourceToViewCoord(...);
        return null; // return value
    }

    public void viewToFileRect(Rect param1, Rect param2) {
        // viewToSourceX(...);
        // viewToSourceY(...);
        // viewToSourceX(...);
        // viewToSourceY(...);
        // set(...);
        // fileSRect(...);
        // max(...);
        // max(...);
    }

    public final PointF viewToSourceCoord(float param1, float param2) {
        // new android.graphics.PointF()
        // viewToSourceCoord(...);
        return null; // return value
    }

    public final PointF viewToSourceCoord(float param1, float param2, PointF param3) {
        return null; // return value
        // viewToSourceX(...);
        // viewToSourceY(...);
        // set(...);
        return null; // return value
    }

    public final PointF viewToSourceCoord(PointF param1) {
        // new android.graphics.PointF()
        // viewToSourceCoord(...);
        return null; // return value
    }

    public final PointF viewToSourceCoord(PointF param1, PointF param2) {
        // viewToSourceCoord(...);
        return null; // return value
    }

    public void visibleFileRect(Rect param1) {
        // getWidth(...);
        // getHeight(...);
        // set(...);
        // viewToFileRect(...);
        return;
    }

        public class Task1 implements Handler.Callback {
    
            Task1(ScaleImageView param1) {
            return;
            }
    
            public boolean handleMessage(Message param1) {
            // performLongClick(...);
            }
    
        }

        public class Task2 extends GestureDetector.SimpleOnGestureListener {
    
            Task2(ScaleImageView param1, Context param2) {
            return;
            }
    
            public boolean onDoubleTap(MotionEvent param1) {
            // new android.graphics.PointF()
            // getX(...);
            // getY(...);
            // new android.graphics.PointF()
            // viewToSourceCoord(...);
            // new android.graphics.PointF()
            // getX(...);
            // getY(...);
            }
    
            public boolean onFling(MotionEvent param1, MotionEvent param2, float param3, float param4) {
            // getX(...);
            // getX(...);
            // abs(...);
            // getY(...);
            // getY(...);
            // abs(...);
            // abs(...);
            // abs(...);
            }
    
            public boolean onSingleTapConfirmed(MotionEvent param1) {
            // performClick(...);
            }
    
        }

        public class Task3 extends GestureDetector.SimpleOnGestureListener {
    
            Task3(ScaleImageView param1) {
            return;
            }
    
            public boolean onSingleTapConfirmed(MotionEvent param1) {
            // performClick(...);
            }
    
        }

        public class Anim {
    
            private long duration;
            private int easing;
            private boolean interruptible;
            private ScaleImageView.OnAnimationEventListener listener;
            private int origin;
            private PointF sCenterEnd;
            private PointF sCenterEndRequested;
            private PointF sCenterStart;
            private float scaleEnd;
            private float scaleStart;
            private long time;
            private PointF vFocusEnd;
            private PointF vFocusStart;
    
            private Anim() {
            // currentTimeMillis(...);
            return;
            }
    
        }

        public class AnimationBuilder {
    
            private long duration;
            private int easing;
            private boolean interruptible;
            private ScaleImageView.OnAnimationEventListener listener;
            private int origin;
            private boolean panLimited;
            private final PointF targetSCenter;
            private final float targetScale;
            private final PointF vFocus;
    
            private AnimationBuilder(ScaleImageView param1, float param2) {
            // getCenter(...);
            return;
            }
    
            private AnimationBuilder(ScaleImageView param1, float param2, PointF param3) {
            return;
            }
    
            private AnimationBuilder(ScaleImageView param1, float param2, PointF param3, PointF param4) {
            return;
            }
    
            private AnimationBuilder(ScaleImageView param1, PointF param2) {
            return;
            }
    
            private ScaleImageView.AnimationBuilder withOrigin(int param1) {
            return null; // return value
            }
    
            private ScaleImageView.AnimationBuilder withPanLimited(boolean param1) {
            return null; // return value
            }
    
            public void start() {
            // onInterruptedByNewAnim(...);
            // "Error thrown by animation listener"
            // w(...);
            // getPaddingLeft(...);
            // getWidth(...);
            // getPaddingRight(...);
            // getPaddingLeft(...);
            // getPaddingTop(...);
            }
    
            public ScaleImageView.AnimationBuilder withDuration(long param1) {
            return null; // return value
            }
    
            public ScaleImageView.AnimationBuilder withEasing(int param1) {
            // valueOf(...);
            // contains(...);
            return null; // return value
            // new java.lang.IllegalArgumentException()
            // new java.lang.StringBuilder()
            // "Unknown easing type: "
            // append(...);
            // append(...);
            }
    
            public ScaleImageView.AnimationBuilder withInterruptible(boolean param1) {
            return null; // return value
            }
    
            public ScaleImageView.AnimationBuilder withOnAnimationEventListener(ScaleImageView.OnAnimationEventListener param1) {
            return null; // return value
            }
    
        }

        public class BitmapLoadTask extends AsyncTask {
    
            private Bitmap bitmap;
            private final WeakReference contextRef;
            private final WeakReference decoderFactoryRef;
            private Exception exception;
            private final boolean preview;
            private final Uri source;
            private final WeakReference viewRef;
    
            BitmapLoadTask(ScaleImageView param1, Context param2, DecoderFactory param3, Uri param4, boolean param5) {
            // new java.lang.ref.WeakReference()
            // new java.lang.ref.WeakReference()
            // new java.lang.ref.WeakReference()
            return;
            }
    
            protected Integer doInBackground(Void[] param1) {
            // toString(...);
            // get(...);
            // get(...);
            // get(...);
            // "BitmapLoadTask.doInBackground"
            // make(...);
            // decode(...);
            // valueOf(...);
        return 0;
    }
    
            protected void onPostExecute(Integer param1) {
            // get(...);
            // intValue(...);
            // onPreviewLoadError(...);
            // onImageLoadError(...);
            return;
            }
    
        }

        public class DefaultOnAnimationEventListener implements ScaleImageView.OnAnimationEventListener {
    
            public DefaultOnAnimationEventListener() {
            return;
            }
    
            public void onComplete() {
            return;
            }
    
            public void onInterruptedByNewAnim() {
            return;
            }
    
            public void onInterruptedByUser() {
            return;
            }
    
        }

        public class DefaultOnImageEventListener implements ScaleImageView.OnImageEventListener {
    
            public DefaultOnImageEventListener() {
            return;
            }
    
            public void onImageLoadError(Exception param1) {
            return;
            }
    
            public void onImageLoaded() {
            return;
            }
    
            public void onPreviewLoadError(Exception param1) {
            return;
            }
    
            public void onPreviewReleased() {
            return;
            }
    
            public void onReady() {
            return;
            }
    
            public void onTileLoadError(Exception param1) {
            return;
            }
    
        }

        public class DefaultOnStateChangedListener implements ScaleImageView.OnStateChangedListener {
    
            public DefaultOnStateChangedListener() {
            return;
            }
    
            public void onCenterChanged(PointF param1, int param2) {
            return;
            }
    
            public void onScaleChanged(float param1, int param2) {
            return;
            }
    
        }

        public interface OnAnimationEventListener {
    
            public abstract void onComplete();
    
            public abstract void onInterruptedByNewAnim();
    
            public abstract void onInterruptedByUser();
    
        }

        public interface OnImageEventListener {
    
            public abstract void onImageLoadError(Exception param1);
    
            public abstract void onImageLoaded();
    
            public abstract void onPreviewLoadError(Exception param1);
    
            public abstract void onPreviewReleased();
    
            public abstract void onReady();
    
            public abstract void onTileLoadError(Exception param1);
    
        }

        public interface OnStateChangedListener {
    
            public abstract void onCenterChanged(PointF param1, int param2);
    
            public abstract void onScaleChanged(float param1, int param2);
    
        }

        public class ScaleAndTranslate {
    
            private float scale;
            private final PointF vTranslate;
    
            private ScaleAndTranslate(float param1, PointF param2) {
            return;
            }
    
        }

        public class Tile {
    
            private Bitmap bitmap;
            private Rect fileSRect;
            private boolean loading;
            private Rect sRect;
            private int sampleSize;
            private Rect vRect;
            private boolean visible;
    
            private Tile() {
            return;
            }
    
        }

        public class TileLoadTask extends AsyncTask {
    
            private final WeakReference decoderRef;
            private Exception exception;
            private final WeakReference tileRef;
            private final WeakReference viewRef;
    
            TileLoadTask(ScaleImageView param1, ImageRegionDecoder param2, ScaleImageView.Tile param3) {
            // new java.lang.ref.WeakReference()
            // new java.lang.ref.WeakReference()
            // new java.lang.ref.WeakReference()
            return;
            }
    
            protected Bitmap doInBackground(Void[] param1) {
            // get(...);
            // get(...);
            // get(...);
            // isReady(...);
            // valueOf(...);
            // readLock(...);
            // lock(...);
            // isReady(...);
        return null;
    }
    
            protected void onPostExecute(Bitmap param1) {
            // get(...);
            // get(...);
            // onTileLoadError(...);
            return;
            }
    
        }

        public class TilesInitTask extends AsyncTask {
    
            private final WeakReference contextRef;
            private ImageRegionDecoder decoder;
            private final WeakReference decoderFactoryRef;
            private Exception exception;
            private final Uri source;
            private final WeakReference viewRef;
    
            TilesInitTask(ScaleImageView param1, Context param2, DecoderFactory param3, Uri param4) {
            // new java.lang.ref.WeakReference()
            // new java.lang.ref.WeakReference()
            // new java.lang.ref.WeakReference()
            return;
            }
    
            protected int[] doInBackground(Void[] param1) {
            // toString(...);
            // get(...);
            // get(...);
            // get(...);
            // "TilesInitTask.doInBackground"
            // make(...);
            // init(...);
            // max(...);
            }
    
            protected void onPostExecute(int[] param1) {
            // get(...);
            // onImageLoadError(...);
            return;
            }
    
        }

}