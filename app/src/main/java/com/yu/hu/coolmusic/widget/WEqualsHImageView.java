package com.yu.hu.coolmusic.widget;

import android.content.Context;
import android.util.AttributeSet;

import androidx.appcompat.widget.AppCompatImageView;

/**
 * 项目名：CoolMusic
 * 包名：  com.yu.hu.coolmusic.widget
 * 文件名：WEqualsHImageView
 * 创建者：HY
 * 创建时间：2019/4/23 9:40
 * 描述：  高=宽相等的ImageView
 */
public class WEqualsHImageView extends AppCompatImageView {

    public WEqualsHImageView(Context context) {
        super(context);
    }

    public WEqualsHImageView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    public WEqualsHImageView(Context context, AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        //noinspection SuspiciousNameCombination
        super.onMeasure(widthMeasureSpec, widthMeasureSpec);

        //获取 View 的高度
        //int width = MeasureSpec.getSize(widthMeasureSpec);

        //获取View模式，即布局文件中所设置的（match_parent wrap_content 具体dp）
        //MeasureSpec.getMode(widthMeasureSpec);
    }
}
