package com.example.androidanimatedimages;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import java.io.IOException;
public class MainActivity extends AppCompatActivity {
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView imageView = findViewById(R.id.animated_image_view);
// Animated gif
      /**  try {
            Drawable drawable = ImageDecoder.decodeDrawable(ImageDecoder.createSource
                    (getResources(), R.drawable.ezgif));

            imageView.setImageDrawable(drawable);
            if(drawable instanceof AnimatedImageDrawable) {
                ((AnimatedImageDrawable) drawable).start();
            }


        } catch (IOException e) {
            e.printStackTrace();
        } **/


    }
}