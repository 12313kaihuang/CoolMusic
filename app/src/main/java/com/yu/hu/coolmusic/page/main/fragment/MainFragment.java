package com.yu.hu.coolmusic.page.main.fragment;

import com.yu.hu.coolmusic.R;
import com.yu.hu.coolmusic.fragment.BaseFragment;
import com.yu.hu.coolmusic.page.login.ToRegisterPresenter;
import com.yu.hu.coolmusic.page.main.TitleBarPresenter;
import com.yu.hu.coolmusic.page.main.ToPersonPresenter;
import com.yu.hu.coolmusic.presenter.Presenter;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;

/**
 * 项目名：IMoocMusic
 * 包名：  com.yu.hu.imoocmusic.page.main
 * 文件名：MainFragment
 * 创建者：HY
 * 创建时间：2019/4/20 10:13
 * 描述：  MainFragment
 */
public class MainFragment extends BaseFragment {

    public static MainFragment newInstance(){
        return new MainFragment();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_main;
    }

    @NonNull
    @Override
    protected List<Presenter> getPresenters() {
        List<Presenter> presenterList = new ArrayList<>();
        //标题栏
        presenterList.add(new TitleBarPresenter(false,true,
                getResources().getString(R.string.app_name)));

        //跳转到个人中心
        presenterList.add(new ToPersonPresenter());
        return presenterList;
    }
}
