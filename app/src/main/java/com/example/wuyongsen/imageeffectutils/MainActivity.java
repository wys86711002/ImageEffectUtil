package com.example.wuyongsen.imageeffectutils;

import android.content.Intent;
import android.graphics.BitmapFactory;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        getWindow().setFlags(WindowManager.LayoutParams.FLAG_HARDWARE_ACCELERATED,WindowManager.LayoutParams.FLAG_HARDWARE_ACCELERATED);
    }

    public void setImageEffect(View view){
        startActivity(new Intent(this,ImageEffectActivity.class));
    }

    public void setBitmapPiexl(View view){
        startActivity(new Intent(this, BitmapPiexlActivity.class));
    }

    public void setRoundImageView(View view){
        startActivity(new Intent(this, CircleImageViewActivity.class));
    }

    public void startReflectionView(View view){
        startActivity(new Intent(this, ReflectionViewActivity.class));
    }

    public void setImageScale(View view){
        startActivity(new Intent(this,ScaleImageViewActivity.class));
    }

    public void drawMesh(View view){
        startActivity(new Intent(this,DrawMeshActivity.class));
    }
}
