package com.example.wuyongsen.imageeffectutils;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by wuyongsen on 2018/3/26.
 */

public class CircleImageViewByXfer extends View {
    private Paint mPaint;
    private Bitmap mBitmap;
    public CircleImageViewByXfer(Context context) {
        super(context);
    }

    public CircleImageViewByXfer(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init();
    }

    public CircleImageViewByXfer(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    private void init(){
        mPaint = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.DITHER_FLAG);
        mBitmap = BitmapFactory.decodeResource(getResources(),R.mipmap.fourth_girl);
        mPaint.setStyle(Paint.Style.FILL_AND_STROKE);
        mPaint.setColor(Color.YELLOW);
        mPaint.setStrokeWidth(10);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        //离线缓屏
        final int i = canvas.saveLayer(0, 0, 600, 600, mPaint, Canvas.ALL_SAVE_FLAG);
        canvas.drawCircle(300,300,300,mPaint);
        mPaint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
        canvas.drawBitmap(mBitmap,0,0,mPaint);
        mPaint.setXfermode(null);
        canvas.restoreToCount(i);
    }
}
