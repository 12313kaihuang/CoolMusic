package com.yu.hu.coolmusic.mvp.presenter;

import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;

import com.yu.hu.coolmusic.mvp.activity.BaseActivity;
import com.yu.hu.coolmusic.mvp.fragment.BaseFragment;

import androidx.annotation.ColorRes;
import androidx.annotation.DimenRes;
import androidx.annotation.DrawableRes;
import androidx.annotation.StringRes;
import butterknife.ButterKnife;

/**
 * 项目名：CoolMusic
 * 包名：  com.yu.hu.coolmusic.mvp.presenter
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

    public final void unBind(){
        onUnBind();
    }

    protected void onUnBind(){

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

    /**
     * getCurrentActivity().getResources
     */
    @SuppressWarnings("unused")
    protected final Resources getResources() {
        return getCurrentActivity().getResources();
    }

    /**
     * getString
     */
    @SuppressWarnings("unused")
    public final String getString(@StringRes int id) {
        return getResources().getString(id);
    }

    /**
     * getDrawable
     */
    @SuppressWarnings("unused")
    public final Drawable getDrawable(@DrawableRes int id) {
        return getResources().getDrawable(id, null);
    }

    /**
     * getColor
     */
    @SuppressWarnings("unused")
    public final int getColor(@ColorRes int id) {
        return getResources().getColor(id);
    }

    /**
     * getDimensionPixelSize
     */
    @SuppressWarnings("unused")
    public final int getDimensionPixelSize(@DimenRes int id) {
        return getResources().getDimensionPixelSize(id);
    }
}
