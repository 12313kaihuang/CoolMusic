package com.yu.hu.coolmusic.page.album;

import com.yu.hu.coolmusic.mvp.activity.BaseFragmentActivity;
import com.yu.hu.coolmusic.mvp.fragment.BaseFragment;

/**
 * 项目名：CoolMusic
 * 包名：  com.yu.hu.coolmusic.page.album
 * 文件名：AlbumListActivity
 * 创建者：HY
 * 创建时间：2019/4/23 21:58
 * 描述：  专辑的音乐列表
 */
public class AlbumListActivity extends BaseFragmentActivity {

    @Override
    public BaseFragment buildFragment() {
        return AlbumListFragment.newInstance();
    }
}
