package com.birthdaycard.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.view.View;
import android.widget.Button;

import com.birthdaycard.Module.MainParentLayout;
import com.birthdaycard.R;

public class MainPageLayout extends MainParentLayout{
    private Button[] allButtons;
    private TypedArray images;

    public MainPageLayout(Context context) {
        super(context);
    }

    @Override
    protected void init() {
        this.setBackgroundResource(R.drawable.main_page);
        images = context.getResources().obtainTypedArray(R.array.button_image);
        allButtons = new Button[6];
        setButton();
    }

    private void setButton() {
        for (int i = 0;i < allButtons.length; i++) {
            allButtons[i] = new Button(context);
            allButtons[i].setId(View.generateViewId());
            LayoutParams layoutParams = new LayoutParams(WH.getW(20), WH.getW(20));
            switch (i) {
                case 0:
                    layoutParams.topMargin = WH.getH(10);
                    layoutParams.leftMargin = WH.getW(20);
                    break;
                case 1:
                    layoutParams.topMargin = WH.getH(10);
                    layoutParams.leftMargin = WH.getW(60);
                    break;
                case 2:
                    layoutParams.topMargin = WH.getH(30);
                    layoutParams.leftMargin = WH.getW(20);
                    break;
                case 3:
                    layoutParams.topMargin = WH.getH(30);
                    layoutParams.leftMargin = WH.getW(60);
                    break;
                case 4:
                    layoutParams.topMargin = WH.getH(50);
                    layoutParams.leftMargin = WH.getW(20);
                    break;
                case 5:
                    layoutParams.topMargin = WH.getH(50);
                    layoutParams.leftMargin = WH.getW(60);
                    break;
            }
            allButtons[i].setLayoutParams(layoutParams);
            allButtons[i].setBackgroundResource(images.getResourceId(i, 0));
            this.addView(allButtons[i]);
        }
    }

    public Button[] getAllButtons() {
        return this.allButtons;
    }
}
