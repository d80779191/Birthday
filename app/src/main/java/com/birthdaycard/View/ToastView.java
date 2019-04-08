package com.birthdaycard.View;

import android.content.Context;
import android.widget.RelativeLayout;

import com.birthdaycard.R;

public class ToastView extends RelativeLayout{
    private int res;
    public ToastView(Context context, int res) {
        super(context);
        this.res = res;
        init();
    }

    private void init() {
        this.setBackgroundResource(res);
    }
}
