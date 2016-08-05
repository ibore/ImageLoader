package com.monians.imageloader;

import android.widget.ImageView;

import java.io.Serializable;

/**
 * ImageLoader 图片加载类，进一步封装第三方网络请求框架，降低耦合
 * Created by ibore on 2016/7/31.
 */
public abstract class ImageLoader implements Serializable {

    protected static ImageLoaderConfig mConfig;
    /**
     * 在全局变量中进行初始化
     * @param config
     */
    public static void init(ImageLoaderConfig config) {
        mConfig = config;
    }

    /**
     * 获取单例
     * @return 当前类对象
     */
    public static ImageLoader getInstance() {
        synchronized (ImageLoader.class) {
            if (null != mConfig) {
                return mConfig.getImageLoader();
            } else {
                throw new RuntimeException("Please, in the global variable initialization ImageLoader.init()");
            }
        }
    }

    public abstract void display(Object object, ImageView imageView);


}
