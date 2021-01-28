package com.example.frameanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.view.animation.Animation;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {


    ImageView imageview;
    AnimationDrawable frameanimation;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        imageview=findViewById(R.id.imageView);
        imageview.setImageResource(R.drawable.frameanimation);

        frameanimation=(AnimationDrawable)imageview.getDrawable();
        frameanimation.start();


    }
}