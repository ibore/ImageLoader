package com.monians.imageloader;

import android.widget.ImageView;

import com.bumptech.glide.Glide;

/**
 * Created by ibore on 2016/8/1.
 */
public class GlideImageLoader extends ImageLoader {

    @Override
    public void display(String imageUrl, ImageView imageView) {
        Glide.with(mContext).load(imageUrl).into(imageView);
    }

}
