package com.yan.pullrefreshlayout.navigation;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;

import com.yan.pullrefreshlayout.R;

/**
 * name of class: RefreshLayout-master
 * creater: scx
 * time: 2017/5/5 15:31
 */

public class BottomItem extends FrameLayout {

    public BottomItem(Context context) {
        super(context);
        init(context);
    }

    public BottomItem(Context context, AttributeSet attrs) {
        super(context, attrs);
        init(context);
    }

    private void init(Context context){
        View inflate = LayoutInflater.from(context).inflate(R.layout.support_simple_spinner_dropdown_item, null);
        addView(inflate);
    }
    public void setSelected(boolean b){

    }
}
