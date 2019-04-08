package com.birthdaycard.layout;

import android.content.Context;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.birthdaycard.Module.MainParentLayout;
import com.birthdaycard.R;

public class DialogLayout extends MainParentLayout{
    private ImageView ivBack;
    private TextView tvBack;
    private Button btnOK;
    private Button btnCancel;
    public DialogLayout(Context context) {
        super(context);
    }

    @Override
    protected void init() {
        setBackView();
    }

    private void setBackView() {
        {
            ivBack = new ImageView(context);
            ivBack.setId(View.generateViewId());
            LayoutParams layoutParams = new LayoutParams(WH.getW(20), WH.getH(20));
            layoutParams.addRule(CENTER_HORIZONTAL);
            ivBack.setLayoutParams(layoutParams);
            ivBack.setBackgroundResource(R.drawable.dialog_logo);
            this.addView(ivBack);
        }
        {
            tvBack = new TextView(context);
            tvBack.setId(View.generateViewId());
            LayoutParams layoutParams = new LayoutParams(LayoutParams.WRAP_CONTENT, WH.getH(10));
            layoutParams.addRule(BELOW, ivBack.getId());
            layoutParams.addRule(CENTER_HORIZONTAL);
            tvBack.setLayoutParams(layoutParams);
            tvBack.setGravity(Gravity.CENTER);
            tvBack.setText(R.string.back_text);
            tvBack.setTextColor(0xFFCD5C5C);
            tvBack.setTextSize(PX, WH.getTextSize(50));
            this.addView(tvBack);
        }
        {
            btnCancel = new Button(context);
            btnCancel.setId(View.generateViewId());
            LayoutParams layoutParams = new LayoutParams(WH.getW(30), WH.getH(10));
            layoutParams.addRule(BELOW, tvBack.getId());
            layoutParams.leftMargin = WH.getW(15);
            btnCancel.setLayoutParams(layoutParams);
            btnCancel.setGravity(Gravity.CENTER);
            btnCancel.setText(R.string.cancel);
            btnCancel.setTextColor(0xFFCD5C5C);
            btnCancel.setTextSize(PX, WH.getTextSize(40));
            btnCancel.setBackgroundColor(0xFFFFC0CB);
            this.addView(btnCancel);
        }
        {
            btnOK = new Button(context);
            btnOK.setId(View.generateViewId());
            LayoutParams layoutParams = new LayoutParams(WH.getW(30), WH.getH(10));
            layoutParams.addRule(BELOW, tvBack.getId());
            layoutParams.addRule(ALIGN_PARENT_RIGHT);
            layoutParams.rightMargin = WH.getW(15);
            btnOK.setLayoutParams(layoutParams);
            btnOK.setGravity(Gravity.CENTER);
            btnOK.setText(R.string.ok);
            btnOK.setTextColor(0xFFCD5C5C);
            btnOK.setTextSize(PX, WH.getTextSize(40));
            btnOK.setBackgroundColor(0xFFFFC0CB);
            this.addView(btnOK);
        }
    }

    public Button getBtnOK() {
        return this.btnOK;
    }

    public Button getBtnCancel() {
        return this.btnCancel;
    }
}
