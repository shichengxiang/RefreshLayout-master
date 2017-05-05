package com.yan.pullrefreshlayout.network;

/**
 * name of class: RefreshLayout-master
 * creater: scx
 * time: 2017/5/4 14:52
 */

public class Server {
    private static Server mInstance;

    private Server() {

    }

    /**
     * obtain the instance
     * @return
     */
    public static Server getInstance() {
        if (mInstance == null)
            mInstance = new Server();
        return mInstance;
    }
}
