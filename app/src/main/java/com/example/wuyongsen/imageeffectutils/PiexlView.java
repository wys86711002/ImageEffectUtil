package com.example.wuyongsen.imageeffectutils;


import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;

/**
 * Created by wuyongsen on 2018/3/26.
 */

public class PiexlView extends View {

    Bitmap mBitmap;
    int[] piexls;

    public PiexlView(Context context) {
        super(context);
        init(context);
    }

    public PiexlView(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    public PiexlView(Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context);
    }

    private void init(Context context){
        mBitmap = BitmapFactory.decodeResource(context.getResources(),R.mipmap.other_girl);
        piexls = new int[mBitmap.getWidth() * mBitmap.getHeight()];
        mBitmap.getPixels(piexls,0,mBitmap.getWidth(),0,0,mBitmap.getWidth(),mBitmap.getHeight());
//        mBitmap.setPixels(piexls,0,mBitmap.getWidth(),0,0,mBitmap.getWidth(),mBitmap.getHeight());
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);

        canvas.drawBitmap(mBitmap,0,0,null);
    }
}
