package com.yu.hu.coolmusic.page.main.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.yu.hu.coolmusic.R;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * 项目名：CoolMusic
 * 包名：  com.yu.hu.coolmusic.page.main.adapter
 * 文件名：MusicListAdapter
 * 创建者：HY
 * 创建时间：2019/4/23 20:50
 * 描述：  MusicListAdapter
 */
public class MusicListAdapter extends RecyclerView.Adapter<MusicListAdapter.ViewHolder> {

    private Context mContext;
    private RecyclerView mRecyclerView;
    private View mItemView;

    private boolean hasSetRVHeight = false;

    public MusicListAdapter(Context context, RecyclerView recyclerView) {
        this.mContext = context;
        this.mRecyclerView = recyclerView;
    }

    /**
     * 1、获取ItemView的高度
     * 2、itemView的数量
     * 3、使用ItemViewHeight * ItemViewNum = RecyclerViewHeight
     */
    private void setRecyclerViewHeight() {

        if (hasSetRVHeight || mRecyclerView == null) {
            return;
        }

        hasSetRVHeight = true;
        RecyclerView.LayoutParams ItemViewLP = (RecyclerView.LayoutParams) mItemView.getLayoutParams();

        ViewGroup.LayoutParams mRVLP = mRecyclerView.getLayoutParams();
        mRVLP.height = ItemViewLP.height * getItemCount();
        mRecyclerView.requestLayout();
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        mItemView = LayoutInflater.from(mContext).inflate(R.layout.item_music_list, parent, false);
        return new ViewHolder(mItemView);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        setRecyclerViewHeight();
    }

    @Override
    public int getItemCount() {
        return 8;
    }

    class ViewHolder extends RecyclerView.ViewHolder {

        ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
