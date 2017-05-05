package com.yan.pullrefreshlayout.mvp;

/**
 * name of class: RefreshLayout-master
 * creater: scx
 * time: 2017/5/4 14:38
 */

public interface BaseView {
    /**
     * 错误时，提示 generally toast
     */
    void onError(String err);

    /**
     * 成功时，提示 success
     * @param err
     */
    void onFinish(String err);
}
