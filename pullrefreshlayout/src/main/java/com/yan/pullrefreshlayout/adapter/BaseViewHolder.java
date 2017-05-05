package com.yan.pullrefreshlayout.adapter;

import android.support.annotation.IdRes;
import android.support.v7.widget.RecyclerView;
import android.util.SparseArray;
import android.view.View;

/**
 * name of class: RefreshLayout-master
 * creater: scx
 * time: 2017/5/4 13:39
 */

public class BaseViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

    private SparseArray<View> mViews;
    private OnItemClickListener mOnItemClickListener;

    public BaseViewHolder(View itemView) {
        super(itemView);
        itemView.setOnClickListener(this);
        this.mViews = new SparseArray();
    }

    public View getView(@IdRes int viewId) {
        return retrieveView(viewId);
    }

    protected <T extends View> T retrieveView(@IdRes int viewId) {
        View view = mViews.get(viewId);
        if (view == null) {
            view = itemView.findViewById(viewId);
            mViews.put(viewId, view);
        }
        return (T) view;

    }

    public void setOnItemClickListener(OnItemClickListener onItemClickListener) {
        this.mOnItemClickListener = onItemClickListener;
    }

    @Override
    public void onClick(View v) {
        if (mOnItemClickListener != null)
            mOnItemClickListener.onItemClick(v, getLayoutPosition());
    }

    public interface OnItemClickListener {
        void onItemClick(View view, int id);
    }
}
