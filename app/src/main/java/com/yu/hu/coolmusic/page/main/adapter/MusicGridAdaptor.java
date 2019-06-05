package com.yu.hu.coolmusic.page.main.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.blankj.utilcode.util.ActivityUtils;
import com.yu.hu.coolmusic.R;
import com.yu.hu.coolmusic.page.album.AlbumListActivity;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/**
 * 项目名：CoolMusic
 * 包名：  com.yu.hu.coolmusic.page.main.adapter
 * 文件名：MusicGridAdaptor
 * 创建者：HY
 * 创建时间：2019/4/22 23:27
 * 描述：  适配器
 */
public class MusicGridAdaptor extends RecyclerView.Adapter<MusicGridAdaptor.ViewHolder> {

    private Context mContext;

    public MusicGridAdaptor(Context context) {
        this.mContext = context;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new ViewHolder(LayoutInflater.from(mContext).inflate(R.layout.item_grid_music, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.itemView.setOnClickListener(v -> ActivityUtils.startActivity(new Intent(mContext, AlbumListActivity.class)));
    }

    @Override
    public int getItemCount() {
        return 6;
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        ViewHolder(@NonNull View itemView) {
            super(itemView);
        }
    }
}
