package com.yu.hu.coolmusic.mvp.activity;

import android.os.Bundle;

import com.yu.hu.coolmusic.R;

import androidx.annotation.LayoutRes;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import butterknife.ButterKnife;


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

        prepare();
    }

    /**
     * 设置布局文件
     * 默认为 R.layout.activity_base
     */
    @LayoutRes
    protected int getLayoutId() {
        return R.layout.activity_base;
    }

    private void prepare() {
        ButterKnife.bind(this);
        onPrepare();
    }

    /**
     * 准备工作
     * <p>
     * 如设置默认值，初始化参数等
     */
    protected void onPrepare() {

    }
}
