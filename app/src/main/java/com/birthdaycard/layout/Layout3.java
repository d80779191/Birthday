package com.birthdaycard.layout;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.birthdaycard.Module.MainParentLayout;
import com.birthdaycard.R;

public class Layout3 extends MainParentLayout {
    private TextView tvWe;
    private TextView tvHave;
    private TextView tvDays;
    private ImageView ivLove;
    private TextView tvDayText;

    public Layout3(Context context) {
        super(context);
    }

    @Override
    protected void init() {
        this.setBackgroundResource(R.drawable.draw_page);
        setDayView();
    }

    private void setDayView() {
        {
            tvWe = new TextView(context);
            tvWe.setId(View.generateViewId());
            LayoutParams layoutParams = new LayoutParams(LayoutParams.MATCH_PARENT, WH.getH(10));
            layoutParams.topMargin = WH.getH(5);
            tvWe.setLayoutParams(layoutParams);
            tvWe.setText(R.string.TogetherTitle);
            tvWe.setTextSize(PX, WH.getTextSize(70));
            tvWe.setTextColor(0xFF00CFCF);
            tvWe.setGravity(Gravity.CENTER);
            this.addView(tvWe);
        }
        {
            tvHave = new TextView(context);
            tvHave.setId(View.generateViewId());
            LayoutParams layoutParams = new LayoutParams(LayoutParams.MATCH_PARENT, WH.getH(10));
            layoutParams.addRule(BELOW, tvWe.getId());
            tvHave.setLayoutParams(layoutParams);
            tvHave.setText(R.string.TogetherText);
            tvHave.setTextSize(PX, WH.getTextSize(55));
            tvHave.setTextColor(0xFFF4A460);
            tvHave.setGravity(Gravity.CENTER);
            this.addView(tvHave);
        }
        {
            tvDays = new TextView(context);
            tvDays.setId(View.generateViewId());
            LayoutParams layoutParams = new LayoutParams(LayoutParams.MATCH_PARENT, WH.getH(20));
            layoutParams.addRule(BELOW, tvHave.getId());
            tvDays.setLayoutParams(layoutParams);
            tvDays.setTextSize(PX, WH.getTextSize(150));
            tvDays.setTextColor(0xFFD87093);
            tvDays.setGravity(Gravity.CENTER);
            this.addView(tvDays);
        }
        {
            tvDayText = new TextView(context);
            tvDayText.setId(View.generateViewId());
            LayoutParams layoutParams = new LayoutParams(LayoutParams.MATCH_PARENT, WH.getH(20));
            layoutParams.addRule(BELOW, tvDays.getId());
            tvDayText.setLayoutParams(layoutParams);
            tvDayText.setText(R.string.TogetherDay);
            tvDayText.setTextSize(PX, WH.getTextSize(70));
            tvDayText.setTextColor(0xFF00CFCF);
            tvDayText.setGravity(Gravity.CENTER);
            this.addView(tvDayText);
        }
        {
            ivLove = new ImageView(context);
            ivLove.setId(View.generateViewId());
            LayoutParams layoutParams = new LayoutParams(WH.getW(50), WH.getH(30));
            layoutParams.addRule(BELOW, tvDayText.getId());
            layoutParams.addRule(CENTER_HORIZONTAL);
            ivLove.setLayoutParams(layoutParams);
            ivLove.setBackgroundResource(R.drawable.together);
            this.addView(ivLove);
        }
    }

    public TextView getTvDays() {
        return this.tvDays;
    }
}
