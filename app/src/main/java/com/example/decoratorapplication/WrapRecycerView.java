package com.example.decoratorapplication;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.recyclerview.widget.RecyclerView;

import org.jetbrains.annotations.NotNull;

public class WrapRecycerView extends RecyclerView {
    private WrapRecycleAdapter mAdapter;
    public WrapRecycerView(@NonNull @NotNull Context context) {
        super(context);
    }

    public WrapRecycerView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attrs) {
        super(context, attrs);
    }

    public WrapRecycerView(@NonNull @NotNull Context context, @Nullable @org.jetbrains.annotations.Nullable AttributeSet attrs, int defStyleAttr) {
        super(context, attrs, defStyleAttr);
    }


    @Override
    public void setAdapter(@Nullable @org.jetbrains.annotations.Nullable RecyclerView.Adapter adapter) {
        mAdapter = new WrapRecycleAdapter(adapter);
        super.setAdapter(adapter);

    }

    /**
     * 添加头部
     */
    public void addHeaderView(View view) {
        if (mAdapter != null) {
            mAdapter.addHeaderView(view);
        }

    }

    /**
     * 添加底部
     */
    public void addFooterView(View view) {
        if (mAdapter != null) {
            mAdapter.addFooterView(view);
        }
    }

    /**
     * 移除头部
     */
    public void removeHeaderView(View view) {
        if (mAdapter!=null){
            mAdapter.removeHeaderView(view);
        }
    }

    /**
     * 移除底部
     */
    public void removeFooterrView(View view) {
        if (mAdapter!=null){
            mAdapter.removeFooterrView(view);
        }
    }

}
