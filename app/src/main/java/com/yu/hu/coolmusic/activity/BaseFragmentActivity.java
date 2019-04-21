package com.yu.hu.coolmusic.activity;

import android.os.Bundle;

import com.yu.hu.coolmusic.R;
import com.yu.hu.coolmusic.fragment.BaseFragment;

import androidx.annotation.IdRes;
import androidx.annotation.Nullable;
import androidx.fragment.app.FragmentTransaction;

/**
 * 项目名：IMoocMusic
 * 包名：  com.yu.hu.imoocmusic.activity
 * 文件名：BaseActivity
 * 创建者：HY
 * 创建时间：2019/4/20 9:09
 * 描述：  BaseFragmentActivity
 * 布局相对复杂，需要嵌套Fragment的Activity
 * <p>
 * 比较重要的几个方法：
 *
 * @see #getLayoutId()
 * @see #getContentFragmentId()
 * @see #buildFragment()
 */
public abstract class BaseFragmentActivity extends BaseActivity {

    /**
     * 当前所显示的fragment
     */
    private BaseFragment mCurrentFragment;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        replaceFragment();
    }

    /**
     * 设置fragment
     */
    private void replaceFragment() {
        replaceFragment(getContentFragmentId(), buildFragment());
    }

    /**
     * 设置fragment
     *
     * @param containerId containerId
     * @param fragment    fragment extends BaseFragment
     * @param <T>         T
     */
    protected final <T extends BaseFragment> void replaceFragment(@IdRes int containerId, T fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        mCurrentFragment = fragment;
        transaction.replace(containerId, fragment);
        transaction.commitAllowingStateLoss();
    }

    /**
     * 加载所要显示的 fragment
     */
    public abstract BaseFragment buildFragment();


    /**
     * 所包含的fragment布局文件的id
     * <p>
     * 可以重写 默认为 R.id.fragment_container
     */
    @IdRes
    public int getContentFragmentId() {
        return R.id.fragment_container;
    }

    /**
     * 获取当前显示的fragment
     */
    @SuppressWarnings({"unchecked", "unused"})
    public final <T extends BaseFragment> T getCurrentFragment() {
        return (T) mCurrentFragment;
    }

}
