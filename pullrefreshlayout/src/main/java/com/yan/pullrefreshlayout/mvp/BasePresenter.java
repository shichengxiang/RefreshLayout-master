package com.yan.pullrefreshlayout.mvp;

/**
 * name of class: RefreshLayout-master
 * creater: scx
 * time: 2017/5/4 14:38
 */

public class BasePresenter<V extends BaseView,M extends BaseModel> {

    public V mView;
    public M mModel;
    BasePresenter(BaseView view,BaseModel model){
        this.mView= (V) view;
        this.mModel= (M) model;
    }

    /**
     * 回收 在onDestory执行
     */
    public void detach(){
        mView=null;
        mModel=null;
    }
}
