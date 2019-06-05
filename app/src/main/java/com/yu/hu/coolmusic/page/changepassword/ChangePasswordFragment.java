package com.yu.hu.coolmusic.page.changepassword;

import com.yu.hu.coolmusic.R;
import com.yu.hu.coolmusic.mvp.activity.BaseActivity;
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
public class ChangePasswordFragment extends BaseFragment {

    static ChangePasswordFragment newInstance() {
        return new ChangePasswordFragment();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_change_password;
    }

    @NonNull
    @Override
    protected List<Presenter> getPresenters() {
        List<Presenter> presenterList = new ArrayList<>();
        //TitleBar
        presenterList.add(new TitleBarPresenter(true, false, getString(R.string.change_password)));

        return presenterList;
    }
}
