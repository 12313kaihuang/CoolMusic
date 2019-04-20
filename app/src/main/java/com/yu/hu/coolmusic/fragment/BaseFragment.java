package com.yu.hu.coolmusic.fragment;

import android.os.Bundle;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 项目名：IMoocMusic
 * 包名：  com.yu.hu.imoocmusic.fragment
 * 文件名：BaseFragment
 * 创建者：HY
 * 创建时间：2019/4/20 10:13
 * 描述：  BaseFragment
 */
public abstract class BaseFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(getLayoutId(), container, false);
        return view;
    }

    @LayoutRes
    protected abstract int getLayoutId();
}
