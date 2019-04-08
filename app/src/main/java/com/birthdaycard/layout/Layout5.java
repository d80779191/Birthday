package com.birthdaycard.layout;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.birthdaycard.Module.MainParentLayout;
import com.birthdaycard.R;

public class Layout5 extends MainParentLayout {
    private ImageView ivBack;
    private ScrollView svText;
    private RelativeLayout rlText;
    private TextView tvText1;
    private TextView tvText2;
    private TextView tvText3;

    public Layout5(Context context) {
        super(context);
    }

    @Override
    protected void init() {
        this.setBackgroundResource(R.drawable.draw_page);
        setTextArea();
    }

    private void setTextArea() {
        {
            ivBack = new ImageView(context);
            ivBack.setId(View.generateViewId());
            LayoutParams layoutParams = new LayoutParams(WH.getW(25), WH.getH(15));
            layoutParams.addRule(CENTER_HORIZONTAL);
            layoutParams.addRule(ALIGN_PARENT_BOTTOM);
            layoutParams.bottomMargin = WH.getH(4);
            ivBack.setLayoutParams(layoutParams);
            ivBack.setBackgroundResource(R.drawable.love_back);
            this.addView(ivBack);
        }
        {
            svText = new ScrollView(context);
            svText.setId(View.generateViewId());
            LayoutParams layoutParams = new LayoutParams(WH.getW(70), WH.getH(80));
            layoutParams.addRule(CENTER_IN_PARENT);
            svText.setLayoutParams(layoutParams);
            this.addView(svText);
        }
        {
            rlText = new RelativeLayout(context);
            rlText.setId(View.generateViewId());
            LayoutParams layoutParams = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
            rlText.setLayoutParams(layoutParams);
            svText.addView(rlText);
        }
        {
            tvText1 = new TextView(context);
            tvText1.setId(View.generateViewId());
            LayoutParams layoutParams = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
            tvText1.setLayoutParams(layoutParams);
            tvText1.setText(R.string.MyFeels1);
            tvText1.setTextSize(PX, WH.getTextSize(40));
            tvText1.setTextColor(0xFF00CFCF);
            rlText.addView(tvText1);
        }
        {
            tvText2 = new TextView(context);
            tvText2.setId(View.generateViewId());
            LayoutParams layoutParams = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
            layoutParams.addRule(BELOW, tvText1.getId());
            tvText2.setLayoutParams(layoutParams);
            tvText2.setText(R.string.MyFeels2);
            tvText2.setTextSize(PX, WH.getTextSize(40));
            tvText2.setTextColor(0xFFFF8800);
            rlText.addView(tvText2);
        }
        {
            tvText3 = new TextView(context);
            tvText3.setId(View.generateViewId());
            LayoutParams layoutParams = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.WRAP_CONTENT);
            layoutParams.addRule(BELOW, tvText2.getId());
            tvText3.setLayoutParams(layoutParams);
            tvText3.setText(R.string.MyFeels3);
            tvText3.setTextSize(PX, WH.getTextSize(60));
            tvText3.setTextColor(0xFFD87093);
            tvText3.setGravity(Gravity.CENTER);
            rlText.addView(tvText3);
        }
    }
}
