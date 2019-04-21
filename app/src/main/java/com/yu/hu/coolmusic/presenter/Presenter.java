package com.yu.hu.coolmusic.presenter;

import android.view.View;

import com.yu.hu.coolmusic.activity.BaseActivity;
import com.yu.hu.coolmusic.fragment.BaseFragment;

import butterknife.ButterKnife;

/**
 * 项目名：CoolMusic
 * 包名：  com.yu.hu.coolmusic.presenter
 * 文件名：Presenter
 * 创建者：HY
 * 创建时间：2019/4/20 13:27
 * 描述：  Presenter基类
 */
public class Presenter {

    private Presence mPresence;

    public final void create(Presence presence) {
        this.mPresence = presence;
        onCreate();
    }

    /**
     * onCreate
     */
    @SuppressWarnings("WeakerAccess")
    protected void onCreate() {

    }

    public final void bind(View view) {
        ButterKnife.bind(this, view);
        onBind();
    }

    /**
     * 绑定了view之后的操作
     */
    protected void onBind() {

    }

    /**
     * 获得当前Fragment
     */
    @SuppressWarnings("unused")
    protected final BaseFragment getCurrentFragment() {
        return mPresence.getCurrentFragment();
    }

    /**
     * 获得当前Activity
     */
    @SuppressWarnings("unused")
    protected final BaseActivity getCurrentActivity() {
        return mPresence.getCurrentActivity();
    }
}
