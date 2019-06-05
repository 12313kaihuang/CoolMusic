package com.yu.hu.coolmusic.mvp.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;


import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.StyleableRes;
import butterknife.ButterKnife;

/**
 * 项目名：CoolMusic
 * 包名：  com.yu.hu.coolmusic.mvp.widget
 * 文件名：BaseCustomView
 * 创建者：HY
 * 创建时间：2019/4/23 8:37
 * 描述：  自定义控件基类
 */
public abstract class BaseCustomView extends FrameLayout {

    protected View mView;

    public BaseCustomView(@NonNull Context context) {
        this(context, null);
    }

    public BaseCustomView(@NonNull Context context, @Nullable AttributeSet attrs) {
        this(context, attrs, 0);
    }

    public BaseCustomView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
        init(context, attrs);
    }

    /**
     * 初始化操作
     */
    private void init(Context context, AttributeSet attrs) {
        mView = LayoutInflater.from(context).inflate(getLayoutId(), this, false);
        ButterKnife.bind(this, mView);

        if (null != attrs) {
            TypedArray typedArray = context.obtainStyledAttributes(attrs, getStyleable());
            initParams(typedArray, attrs);
            typedArray.recycle();
        }
        addView(mView);
    }

    /**
     * 布局文件Id
     */
    @LayoutRes
    protected abstract int getLayoutId();

    /**
     * 自定义属性Id
     */
    @StyleableRes
    protected abstract int[] getStyleable();

    /**
     * 初始化自定义参数
     * <p>
     * typedArray直接用，已recycle()不需再手动 recycle()否则会报错
     * 需要自定义参数的话一定要同时重写{@code getStyleable()}
     *
     * @param typedArray typedArray
     * @param attrs      attrs
     * @see #getStyleable()
     */
    protected abstract void initParams(TypedArray typedArray, AttributeSet attrs);
}
