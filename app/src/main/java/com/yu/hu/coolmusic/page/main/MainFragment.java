package com.yu.hu.coolmusic.page.main;

import com.yu.hu.coolmusic.R;
import com.yu.hu.coolmusic.fragment.BaseFragment;

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
}
