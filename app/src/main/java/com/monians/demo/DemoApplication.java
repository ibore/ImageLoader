package com.monians.demo;

import android.app.Application;

import com.monians.imageloader.ImageLoaderConfig;
import com.monians.imageloader.ImageLoader;
import com.monians.imageloader.glide.GlideImageLoader;

/**
 * Created by ibore on 2016/8/4.
 */
public class DemoApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ImageLoaderConfig config = new ImageLoaderConfig();
        config.setContext(getApplicationContext())
                .setImageLoader(new GlideImageLoader())
                .setLoadImageView(R.mipmap.ic_launcher)
                .setErrorImageView(R.mipmap.ic_launcher)
                .setWifiStrategy(ImageLoaderConfig.LOAD_STRATEGY_NORMAL);
        ImageLoader.init(config);
    }
}
