package com.monians.imageloader;

import android.content.Context;
import android.widget.ImageView;

import java.io.Serializable;

/**
 * ImageLoader 图片加载类，进一步封装第三方网络请求框架，降低耦合
 * Created by ibore on 2016/7/31.
 */
public abstract class ImageLoader implements Serializable {

    protected static Context mContext;          // 上下文
    private static ImageLoader mImageLoader;    // 当前类对象

    /**
     * 在全局变量中进行初始化
     * @param context 上下文
     * @param imageLoader 当前类对象
     */
    public static void init(Context context, ImageLoader imageLoader) {
        mContext = context;
        mImageLoader = imageLoader;
    }

    /**
     * 获取单例
     * @return 当前类对象
     */
    public static ImageLoader getInstance() {
        synchronized (ImageLoader.class) {
            if (null != mImageLoader) {
                return mImageLoader;
            } else {
                throw new RuntimeException("Please, in the global variable initialization ImageLoader.init()");
            }
        }
    }

    public abstract void display(String imageUrl, ImageView imageView);

}
