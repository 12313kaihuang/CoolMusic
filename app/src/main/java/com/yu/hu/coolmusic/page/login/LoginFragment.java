package com.yu.hu.coolmusic.page.login;

import com.yu.hu.coolmusic.R;
import com.yu.hu.coolmusic.fragment.BaseFragment;
import com.yu.hu.coolmusic.page.main.TitleBarPresenter;
import com.yu.hu.coolmusic.presenter.Presenter;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;

/**
 * 项目名：CoolMusic
 * 包名：  com.yu.hu.coolmusic.page.login
 * 文件名：LoginFragment
 * 创建者：HY
 * 创建时间：2019/4/20 15:59
 * 描述：  LoginFragment
 */
public class LoginFragment extends BaseFragment {

    static LoginFragment newInstance() {
        return new LoginFragment();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_login;
    }

    @NonNull
    @Override
    protected List<Presenter> getPresenters() {
        List<Presenter> presenterList = new ArrayList<>();
        //标题栏
        presenterList.add(new TitleBarPresenter(false, false, getResources().getString(R.string.title_login)));
        //登录
        presenterList.add(new LoginPresenter());
        //跳转到注册页面
        presenterList.add(new ToRegisterPresenter());
        return presenterList;
    }
}
