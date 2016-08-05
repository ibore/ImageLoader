package com.monians.demo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import com.monians.imageloader.ImageLoader;

public class MainActivity extends AppCompatActivity {

    private ImageView imageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.image);
        ImageLoader.getInstance().display("http://p0.so.qhimg.com/t01eec925a424c666f0.jpg", imageView);
    }
}
