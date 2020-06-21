package com.example.appfit;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

public class ImageAdapter1 extends PagerAdapter {
    Context mContext;
    public ImageAdapter1(Context context)
    {
        this.mContext = context;
    }

    @Override
    public boolean isViewFromObject(View view, Object object)
    {
        return view == ((ImageView)object);
    }

    private int[] sliderImageId = new int[]{
      R.drawable.bt1_2,R.drawable.bt1_3,R.drawable.bt1_4,R.drawable.bt1_5
    };
    @Override
    public  Object instantiateItem(ViewGroup container, int position)
    {
        ImageView imageView = new ImageView(mContext);
        imageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
        imageView.setImageResource(sliderImageId[position]);
        ((ViewPager) container).addView(imageView, 0);
        return imageView;
    }

    @Override
    public void destroyItem(ViewGroup container, int positon, Object object)
    {
        ((ViewPager) container).removeView((ImageView) object);
    }

    @Override
    public int getCount(){
        return sliderImageId.length;
    }
}
