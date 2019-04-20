package com.yu.hu.coolmusic.activity;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.yu.hu.coolmusic.R;


/**
 * 项目名：IMoocMusic
 * 包名：  com.yu.hu.imoocmusic.activity
 * 文件名：BaseActivity
 * 创建者：HY
 * 创建时间：2019/4/20 9:09
 * 描述：  BaseActivity
 * 布局比较简单的
 * 不需要嵌套fragment的Activity
 * <p>
 * 一个必须重写的方法：
 *
 * @see #getLayoutId()
 */
public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(getLayoutId());
        onPrepare();
    }

    /**
     * 设置布局文件
     * 默认为 R.layout.activity_base
     */
    @LayoutRes
    protected int getLayoutId() {
        return R.layout.activity_base;
    }

    /**
     * 准备工作
     * <p>
     * 如设置默认值，初始化参数等
     */
    protected void onPrepare() {

    }
}
