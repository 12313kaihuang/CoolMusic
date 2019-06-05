package com.yu.hu.coolmusic.page.main.presenter;

import com.yu.hu.coolmusic.R;
import com.yu.hu.coolmusic.mvp.presenter.Presenter;
import com.yu.hu.coolmusic.page.main.GridSpaceItemDecoration;
import com.yu.hu.coolmusic.page.main.adapter.MusicGridAdaptor;

import androidx.recyclerview.widget.DividerItemDecoration;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import butterknife.BindView;

/**
 * 项目名：CoolMusic
 * 包名：  com.yu.hu.coolmusic.page.main.presenter
 * 文件名：GridPresenter
 * 创建者：HY
 * 创建时间：2019/4/22 23:23
 * 描述：  实现网格布局显示音乐集合
 */
public class GridPresenter extends Presenter {

    @BindView(R.id.rv_grid)
    RecyclerView mGridRecyclerView;

    @Override
    protected void onBind() {
        mGridRecyclerView.setNestedScrollingEnabled(false);
        mGridRecyclerView.setLayoutManager(new GridLayoutManager(getCurrentActivity(), 3));
        //横向的细线分割
        //new DividerItemDecoration(getCurrentActivity(), DividerItemDecoration.HORIZONTAL)
        mGridRecyclerView.addItemDecoration(new GridSpaceItemDecoration(getResources().getDimensionPixelSize(R.dimen.albumMarginSize),mGridRecyclerView));
        mGridRecyclerView.setAdapter(new MusicGridAdaptor(getCurrentActivity()));
    }
}
