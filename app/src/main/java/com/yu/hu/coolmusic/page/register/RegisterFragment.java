package com.yu.hu.coolmusic.page.register;

import com.yu.hu.coolmusic.R;
import com.yu.hu.coolmusic.mvp.fragment.BaseFragment;
import com.yu.hu.coolmusic.page.main.presenter.TitleBarPresenter;
import com.yu.hu.coolmusic.mvp.presenter.Presenter;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;

/**
 * 项目名：CoolMusic
 * 包名：  com.yu.hu.coolmusic.page.register
 * 文件名：RegisterFragment
 * 创建者：HY
 * 创建时间：2019/4/21 21:30
 * 描述：  RegisterFragment
 */
public class RegisterFragment extends BaseFragment {

    static RegisterFragment newInstance() {
        return new RegisterFragment();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_register;
    }

    @NonNull
    @Override
    protected List<Presenter> getPresenters() {
        List<Presenter> presenterList = new ArrayList<>();
        //TitleBar
        presenterList.add(new TitleBarPresenter(true, false, getResources().getString(R.string.title_register)));

        return presenterList;
    }
}
