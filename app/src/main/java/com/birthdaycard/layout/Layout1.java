package com.birthdaycard.layout;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.birthdaycard.MainActivity;
import com.birthdaycard.Module.MainParentLayout;
import com.birthdaycard.R;

public class Layout1 extends MainParentLayout{
    private TextView tvFollowing;
    private TextView tvQuestion;
    private Button btnYes;
    private Button btnNo;
    private ImageView ivYes;
    private TextView tvYeah;

    public Layout1(Context context) {
        super(context);
    }

    @Override
    protected void init() {
        this.setBackgroundResource(R.drawable.draw_page);
        setWholeView();
    }

    private void setWholeView() {
        {
            tvFollowing = new TextView(context);
            tvFollowing.setId(View.generateViewId());
            LayoutParams layoutParams = new LayoutParams(WH.getW(70), LayoutParams.WRAP_CONTENT);
            layoutParams.addRule(CENTER_HORIZONTAL);
            layoutParams.topMargin = WH.getH(10);
            tvFollowing.setLayoutParams(layoutParams);
            tvFollowing.setText(R.string.FollowingText);
            tvFollowing.setTextSize(PX, WH.getTextSize(40));
            tvFollowing.setTextColor(0xFF00CFCF);
            this.addView(tvFollowing);
        }
        {
            tvQuestion = new TextView(context);
            tvQuestion.setId(View.generateViewId());
            LayoutParams layoutParams = new LayoutParams(WH.getW(70), LayoutParams.WRAP_CONTENT);
            layoutParams.addRule(BELOW, tvFollowing.getId());
            layoutParams.addRule(CENTER_HORIZONTAL);
            layoutParams.topMargin = WH.getH(2);
            tvQuestion.setLayoutParams(layoutParams);
            tvQuestion.setText(R.string.QuestionText);
            tvQuestion.setTextSize(PX, WH.getTextSize(40));
            tvQuestion.setTextColor(0xFFF4A460);
            this.addView(tvQuestion);
        }
        {
            btnNo = new Button(context);
            btnNo.setId(View.generateViewId());
            LayoutParams layoutParams = new LayoutParams(WH.getW(30), WH.getH(10));
            layoutParams.addRule(BELOW, tvQuestion.getId());
            layoutParams.leftMargin = WH.getW(15);
            btnNo.setLayoutParams(layoutParams);
            btnNo.setGravity(Gravity.CENTER);
            btnNo.setText(R.string.no);
            btnNo.setTextColor(0xFFCD5C5C);
            btnNo.setTextSize(PX, WH.getTextSize(30));
            btnNo.setBackgroundColor(0xFFFFC0CB);
            this.addView(btnNo);
        }
        {
            btnYes = new Button(context);
            btnYes.setId(View.generateViewId());
            LayoutParams layoutParams = new LayoutParams(WH.getW(30), WH.getH(10));
            layoutParams.addRule(BELOW, tvQuestion.getId());
            layoutParams.addRule(ALIGN_PARENT_RIGHT);
            layoutParams.rightMargin = WH.getW(15);
            btnYes.setLayoutParams(layoutParams);
            btnYes.setGravity(Gravity.CENTER);
            btnYes.setText(R.string.yes);
            btnYes.setTextColor(0xFFCD5C5C);
            btnYes.setTextSize(PX, WH.getTextSize(30));
            btnYes.setBackgroundColor(0xFFFFC0CB);
            this.addView(btnYes);
        }
        {
            ivYes = new ImageView(context);
            ivYes.setId(View.generateViewId());
            LayoutParams layoutParams = new LayoutParams(WH.getW(50), WH.getH(30));
            layoutParams.addRule(BELOW, btnNo.getId());
            layoutParams.addRule(CENTER_HORIZONTAL);
            ivYes.setLayoutParams(layoutParams);
            if (((MainActivity)context).getYesOrNo()) {
                ivYes.setBackgroundResource(R.drawable.image_yes);
            }
            this.addView(ivYes);
        }
        {
            tvYeah = new TextView(context);
            tvYeah.setId(View.generateViewId());
            LayoutParams layoutParams = new LayoutParams(WH.getW(70), LayoutParams.WRAP_CONTENT);
            layoutParams.addRule(BELOW, ivYes.getId());
            layoutParams.addRule(CENTER_HORIZONTAL);
            layoutParams.topMargin = WH.getH(2);
            tvYeah.setLayoutParams(layoutParams);
            if (((MainActivity)context).getYesOrNo()) {
                tvYeah.setText(R.string.Yeah);
            }
            tvYeah.setTextSize(PX, WH.getTextSize(70));
            tvYeah.setTextColor(0xFFD87093);
            tvYeah.setGravity(Gravity.CENTER);
            this.addView(tvYeah);
        }
    }

    public Button getBtnYes() {
        return this.btnYes;
    }

    public Button getBtnNo() {
        return this.btnNo;
    }

    public ImageView getIvYes() {
        return this.ivYes;
    }

    public TextView getTvYeah() {
        return this.tvYeah;
    }
}
