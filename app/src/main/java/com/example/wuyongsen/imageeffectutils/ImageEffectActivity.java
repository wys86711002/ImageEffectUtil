package com.example.wuyongsen.imageeffectutils;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.SeekBar;

public class ImageEffectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_image_effect);
        ImageView ivSrc = findViewById(R.id.ivSrc);
        ImageView ivResult = findViewById(R.id.ivResult);
        final Bitmap bitmap = BitmapFactory.decodeResource(getResources(), R.mipmap.girl);
        ivSrc.setImageBitmap(bitmap);
        final Bitmap resultBitmap = ImageEffectUtils.setBitmapEffect(bitmap, 10, 40, 40);
        ivResult.setImageBitmap(resultBitmap);
        SeekBar sbHue = findViewById(R.id.sbHue);
        SeekBar sbatureation = findViewById(R.id.sbatureation);
        SeekBar sbLum = findViewById(R.id.sbLum);
//        sbHue.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener() {
//            @Override
//            public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
//
//            }
//
//            @Override
//            public void onStartTrackingTouch(SeekBar seekBar) {
//
//            }
//
//            @Override
//            public void onStopTrackingTouch(SeekBar seekBar) {
//
//            }
//        });
    }
}
