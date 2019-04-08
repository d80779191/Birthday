package com.birthdaycard.layout;

import android.content.Context;
import android.view.View;
import android.widget.RelativeLayout;

import com.birthdaycard.Module.MainParentLayout;


public class BasedLayout extends MainParentLayout {
    private RelativeLayout rlWholeFragment;
    private RelativeLayout rlDialogArea;

    public BasedLayout(Context context) {
        super(context);
    }

    @Override
    protected void init() {
        {
            rlWholeFragment = new RelativeLayout(context);
            rlWholeFragment.setId(View.generateViewId());
            LayoutParams layoutParams = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
            rlWholeFragment.setLayoutParams(layoutParams);
            this.addView(rlWholeFragment);
        }
        {
            rlDialogArea = new RelativeLayout(context);
            rlDialogArea.setId(View.generateViewId());
            LayoutParams layoutParams = new LayoutParams(LayoutParams.MATCH_PARENT, WH.getH(50));
            layoutParams.addRule(CENTER_VERTICAL);
            rlDialogArea.setLayoutParams(layoutParams);
            this.addView(rlDialogArea);
        }
    }

    public RelativeLayout getRlWholeFragment() {
        return this.rlWholeFragment;
    }

    public RelativeLayout getRlDialogArea() {
        return this.rlDialogArea;
    }
}

