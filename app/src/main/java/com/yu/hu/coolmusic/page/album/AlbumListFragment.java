package com.yu.hu.coolmusic.page.album;

import com.yu.hu.coolmusic.R;
import com.yu.hu.coolmusic.mvp.fragment.BaseFragment;
import com.yu.hu.coolmusic.mvp.presenter.Presenter;
import com.yu.hu.coolmusic.page.main.presenter.MusicListPresenter;
import com.yu.hu.coolmusic.page.main.presenter.TitleBarPresenter;

import java.util.ArrayList;
import java.util.List;

import androidx.annotation.NonNull;

/**
 * 项目名：CoolMusic
 * 包名：  com.yu.hu.coolmusic.page.album
 * 文件名：AlbumListFragment
 * 创建者：HY
 * 创建时间：2019/4/23 22:01
 * 描述：  AlbumListFragment
 */
public class AlbumListFragment extends BaseFragment {

    public static AlbumListFragment newInstance() {
        return new AlbumListFragment();
    }

    @Override
    protected int getLayoutId() {
        return R.layout.fragment_album_list;
    }

    @NonNull
    @Override
    protected List<Presenter> getPresenters() {
        List<Presenter> presenterList = new ArrayList<>();

        presenterList.add(new TitleBarPresenter(true, false, getString(R.string.album_list)));

        presenterList.add(new MusicListPresenter());

        return presenterList;
    }
}
