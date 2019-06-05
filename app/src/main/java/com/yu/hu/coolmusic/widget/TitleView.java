package com.yu.hu.coolmusic.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.TextView;

import com.yu.hu.coolmusic.R;
import com.yu.hu.coolmusic.mvp.widget.BaseCustomView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import butterknife.BindView;

/**
 * 项目名：CoolMusic
 * 包名：  com.yu.hu.coolmusic.widget
 * 文件名：TitleView
 * 创建者：HY
 * 创建时间：2019/4/23 0:16
 * 描述：  TitleView
 */
public class TitleView extends BaseCustomView {

    @BindView(R.id.tv_title)
    TextView mTitleTextView;

    public TitleView(@NonNull Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public TitleView(@NonNull Context context, @Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }

    @Override
    protected int getLayoutId() {
        return R.layout.item_title_list;
    }

    @Override
    protected int[] getStyleable() {
        return R.styleable.TitleView;
    }

    @Override
    protected void initParams(TypedArray typedArray, AttributeSet attrs) {
        mTitleTextView.setText(typedArray.getString(R.styleable.TitleView_tvTitle));
    }
}
