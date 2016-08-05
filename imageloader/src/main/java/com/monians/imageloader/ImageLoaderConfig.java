package com.monians.imageloader;

import android.content.Context;

/**
 * Created by ibore on 2016/8/4.
 */
public class ImageLoaderConfig {
    /** 加载模式 */
    public static final int LOAD_STRATEGY_NORMAL = 0;
    public static final int LOAD_STRATEGY_ONLY_WIFI = 1;
    /** 上下文 */
    private Context context;
    /** 创建ImageLoader */
    private ImageLoader imageLoader;
    /** 加载的策略模式 */
    private int wifiStrategy;
    /** 加载中的图片 */
    private int LoadImageView;
    /** 加载失败的图片 */
    private int ErrorImageView;
    /** 非WIfi模式不加载图片 */
    private int WifiImageView;

    public int getWifiImageView() {
        return WifiImageView;
    }

    public ImageLoaderConfig setWifiImageView(int wifiImageView) {
        WifiImageView = wifiImageView;
        return this;
    }

    public int getErrorImageView() {
        return ErrorImageView;
    }

    public ImageLoaderConfig setErrorImageView(int errorImageView) {
        ErrorImageView = errorImageView;
        return this;
    }

    public int getLoadImageView() {
        return LoadImageView;
    }

    public ImageLoaderConfig setLoadImageView(int loadImageView) {
        LoadImageView = loadImageView;
        return this;
    }

    public ImageLoader getImageLoader() {
        return imageLoader;
    }

    public ImageLoaderConfig setImageLoader(ImageLoader imageLoader) {
        this.imageLoader = imageLoader;
        return this;
    }

    public Context getContext() {
        return context;
    }

    public ImageLoaderConfig setContext(Context context) {
        this.context = context;
        return this;
    }

    public int getWifiStrategy() {
        return wifiStrategy;
    }

    public ImageLoaderConfig setWifiStrategy(int wifiStrategy) {
        this.wifiStrategy = wifiStrategy;
        return this;
    }
}