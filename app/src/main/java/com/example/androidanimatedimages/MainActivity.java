package com.example.androidanimatedimages;
import android.content.Intent;
import android.graphics.ImageDecoder;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import java.io.IOException;
public class MainActivity extends AppCompatActivity {
    private ImageView ImageView;
    boolean playing;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ImageView = findViewById(R.id.animated_image_view);



//animated vector

        ImageView.setImageDrawable(getDrawable(R.drawable.avd_anim));
        playing = false;
        ImageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(!playing) {
                    ImageView.setImageDrawable(getDrawable(R.drawable.avd_anim));
                    playing = true;
                } else{
                    ImageView.setImageDrawable(getDrawable(R.drawable.avd_anim));
                    playing = false;
                }
                final Drawable drawable = ((ImageView).getDrawable());
                if(drawable instanceof Animatable) {

                    ((Animatable)drawable).start();
                }
            }
        });
    }
}
