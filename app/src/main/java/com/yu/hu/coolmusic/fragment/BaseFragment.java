package com.yu.hu.coolmusic.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yu.hu.coolmusic.activity.BaseActivity;
import com.yu.hu.coolmusic.presenter.Presence;
import com.yu.hu.coolmusic.presenter.Presenter;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.LayoutRes;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**
 * 项目名：IMoocMusic
 * 包名：  com.yu.hu.imoocmusic.fragment
 * 文件名：BaseFragment
 * 创建者：HY
 * 创建时间：2019/4/20 10:13
 * 描述：  BaseFragment
 */
public abstract class BaseFragment extends Fragment implements Presence {

    private View mView;
    private List<Presenter> mPresenterList;

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        mView = inflater.inflate(getLayoutId(), container, false);
        createPresenterList();
        return mView;
    }

    private void createPresenterList() {
        mPresenterList = getPresenters();
        for (Presenter presenter : mPresenterList) {
            presenter.create(this);
        }
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        onPrepare();
        bindPresenterList();
    }

    private void bindPresenterList() {
        for (Presenter presenter : mPresenterList) {
            presenter.bind(mView);
        }
    }

    /**
     * 准备工作
     * <p>
     * 如设置默认值，初始化参数等
     */
    @SuppressWarnings("WeakerAccess")
    protected void onPrepare() {

    }

    /**
     * 布局文件Id
     */
    @LayoutRes
    protected abstract int getLayoutId();

    /**
     * 添加Presenter
     */
    @NonNull
    protected List<Presenter> getPresenters() {
        return new ArrayList<>();
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T extends BaseActivity> T getCurrentActivity() {
        return (T) getActivity();
    }

    @SuppressWarnings("unchecked")
    @Override
    public <T extends BaseFragment> T getCurrentFragment() {
        return (T) this;
    }

    /**
     * 获取当前View布局
     */
    @SuppressWarnings("unused")
    protected View getCurrentView() {
        return mView;
    }

}
