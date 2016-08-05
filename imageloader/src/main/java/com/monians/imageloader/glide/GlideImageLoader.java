package com.monians.imageloader.glide;

import android.widget.ImageView;

import com.bumptech.glide.Glide;
import com.monians.imageloader.ImageLoader;

/**
 * Created by ibore on 2016/8/1.
 */
public class GlideImageLoader extends ImageLoader {

    @Override
    public void display(Object object, ImageView imageView) {

        Glide.with(mConfig.getContext()).load(object).placeholder(mConfig.getLoadImageView()).error(mConfig.getErrorImageView()).into(imageView);
    }
}
