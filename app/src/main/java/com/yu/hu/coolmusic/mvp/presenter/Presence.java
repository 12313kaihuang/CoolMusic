package com.yu.hu.coolmusic.mvp.presenter;

import com.yu.hu.coolmusic.mvp.activity.BaseActivity;
import com.yu.hu.coolmusic.mvp.fragment.BaseFragment;

/**
 * 项目名：CoolMusic
 * 包名：  com.yu.hu.coolmusic.mvp.presenter
 * 文件名：Presence
 * 创建者：HY
 * 创建时间：2019/4/21 20:10
 * 描述：  使用Presenter 需要实现的接口
 */
public interface Presence {

    /**
     * 获取当前Fragment
     * <p>
     * 要求Fragment继承自BaseFragment
     */
    <T extends BaseFragment> T getCurrentFragment();

    /**
     * 获取当前Activity
     * <p>
     * 要求Activity继承自BaseActivity
     */
    <T extends BaseActivity> T getCurrentActivity();

}
