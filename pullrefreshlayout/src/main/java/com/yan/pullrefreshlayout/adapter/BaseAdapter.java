package com.yan.pullrefreshlayout.adapter;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;
import java.util.List;

/**
 * name of class: RefreshLayout-master
 * creater: scx
 * time: 2017/5/4 13:58
 */

public abstract class BaseAdapter<T, H extends BaseViewHolder> extends RecyclerView.Adapter<BaseViewHolder> {

    private Context mContext;
    @LayoutRes
    private int mLayoutId;
    public List<T> mDatas = new ArrayList<>();

    BaseAdapter(Context context, @LayoutRes int layoutId) {
        this.mContext = context;
        this.mLayoutId = layoutId;
    }

    @Override
    public BaseViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(mLayoutId, parent, false);
        BaseViewHolder holder = new BaseViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(BaseViewHolder holder, int position) {
        T bean = getItem(position);
        convert((H) holder, bean);
    }

    public void refresh(List<T> list) {
        mDatas = (list == null ? new ArrayList<T>() : list);
        notifyDataSetChanged();
    }
    public void loadMore(List<T> list){
        if(mDatas==null)
            mDatas=new ArrayList<>();
        if(list!=null)
            mDatas.addAll(list);
        notifyDataSetChanged();
    }

    @Override
    public int getItemCount() {
        if(mDatas==null || mDatas.size()<0)
            return 0;
        return mDatas.size();
    }

    private T getItem(int position) {
        if (mDatas != null || position >= mDatas.size())
            return null;
        return mDatas.get(position);
    }

    /**
     * 匹配赋值
     *
     * @param holder
     * @param bean
     */
    public abstract void convert(H holder, T bean);
}
