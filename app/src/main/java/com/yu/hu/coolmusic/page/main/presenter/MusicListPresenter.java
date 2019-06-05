package com.yu.hu.coolmusic.page.main.presenter;

import com.yu.hu.coolmusic.R;
import com.yu.hu.coolmusic.mvp.presenter.Presenter;
import com.yu.hu.coolmusic.page.main.adapter.MusicListAdapter;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;

/**
 * 项目名：CoolMusic
 * 包名：  com.yu.hu.coolmusic.page.main.presenter
 * 文件名：MusicListPresenter
 * 创建者：HY
 * 创建时间：2019/4/23 20:47
 * 描述：  MusicListPresenter
 */
public class MusicListPresenter extends Presenter {

    @BindView(R.id.rv_list)
    RecyclerView mListRecyclerView;

    @Override
    protected void onBind() {
        mListRecyclerView.setNestedScrollingEnabled(false);
        mListRecyclerView.addItemDecoration(new DividerItemDecoration(getCurrentActivity(), DividerItemDecoration.VERTICAL));
        mListRecyclerView.setLayoutManager(new LinearLayoutManager(getCurrentActivity()));
        mListRecyclerView.setAdapter(new MusicListAdapter(getCurrentActivity(), mListRecyclerView));
    }

    @Override
    protected void onUnBind() {
        super.onUnBind();
    }
}
