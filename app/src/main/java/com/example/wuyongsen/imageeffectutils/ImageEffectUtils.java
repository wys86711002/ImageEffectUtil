package com.example.wuyongsen.imageeffectutils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.Paint;

/**
 * Created by wuyongsen on 2018/3/26.
 */

public class ImageEffectUtils {
    public static Bitmap setBitmapEffect(Bitmap src,int hue,int satureation,int lum){
        final Bitmap result = Bitmap.createBitmap(src.getWidth(), src.getHeight(), Bitmap.Config.ARGB_8888);
        Paint paint = new Paint(Paint.ANTI_ALIAS_FLAG | Paint.DITHER_FLAG);
        Canvas canvas = new Canvas(result);
        ColorMatrix hueMatrix = new ColorMatrix();
        hueMatrix.setRotate(0,hue);
        hueMatrix.setRotate(1,hue);
        hueMatrix.setRotate(2,hue);
        ColorMatrix satureationMatrix = new ColorMatrix();
        satureationMatrix.setSaturation(satureation);
        ColorMatrix lumMatrix = new ColorMatrix();
        lumMatrix.setScale(lum,lum,lum,1.0f);
        ColorMatrix resultMatrix = new ColorMatrix();
        resultMatrix.postConcat(hueMatrix);
        resultMatrix.postConcat(satureationMatrix);
        resultMatrix.postConcat(lumMatrix);
        paint.setColorFilter(new ColorMatrixColorFilter(resultMatrix));
        canvas.drawBitmap(src,0,0,paint);
        return result;
    }
}
