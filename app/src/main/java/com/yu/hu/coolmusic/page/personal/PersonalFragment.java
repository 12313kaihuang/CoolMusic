package com.yu.hu.coolmusic.page.personal;

import com.yu.hu.coolmusic.R;
import com.yu.hu.coolmusic.mvp.fragment.BaseFragment;
import com.yu.hu.coolmusic.page.main.presenter.TitleBarPresenter;
import com.yu.hu.coolmusic.mvp.presenter.Presenter;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;

/**
 * 项目名：CoolMusic
 * 包名：  com.yu.hu.coolmusic.page.personal
 * 文件名：PersonalFragment
 * 创建者：HY
 * 创建时间：2019/4/21 23:15
 * 描述：  PersonalFragment
 */
public class PersonalFragment extends BaseFragment {

    static PersonalFragment newInstance() {
        return new PersonalFragment();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_personal;
    }

    @NonNull
    @Override
    protected List<Presenter> getPresenters() {
        List<Presenter> presenterList = new ArrayList<>();
        //标题
        presenterList.add(new TitleBarPresenter(true, false, getString(R.string.title_personal)));
        //退出登录
        presenterList.add(new LogoutPresenter());
        //修改密码
        presenterList.add(new ToChangePasswordPresenter());
        return presenterList;
    }
}
