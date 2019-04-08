package com.birthdaycard.layout;

import android.content.Context;
import android.graphics.Typeface;
import android.text.InputFilter;
import android.text.InputType;
import android.view.Gravity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.birthdaycard.Module.MainParentLayout;
import com.birthdaycard.R;


public class Layout4 extends MainParentLayout {
    private ScrollView svScore;
    private RelativeLayout rlScore;
    private TextView tvTitle;
    private TextView tvFeel;
    private EditText etScore;
    private TextView tvScore;
    private TextView tvBecause;
    private EditText etBecause;
    private Button btnOK;

    public Layout4(Context context) {
        super(context);
    }

    @Override
    protected void init() {
        this.setBackgroundResource(R.drawable.draw_page);
        setScoreView();
    }

    private void setScoreView() {
        {
            svScore = new ScrollView(context);
            svScore.setId(View.generateViewId());
            LayoutParams layoutParams = new LayoutParams(WH.getW(70), WH.getH(70));
            layoutParams.addRule(CENTER_IN_PARENT);
            svScore.setLayoutParams(layoutParams);
            this.addView(svScore);
        }
        {
            rlScore = new RelativeLayout(context);
            rlScore.setId(View.generateViewId());
            LayoutParams layoutParams = new LayoutParams(LayoutParams.MATCH_PARENT, LayoutParams.MATCH_PARENT);
            rlScore.setLayoutParams(layoutParams);
            svScore.addView(rlScore);
        }
        {
            tvTitle = new TextView(context);
            tvTitle.setId(View.generateViewId());
            LayoutParams layoutParams = new LayoutParams(LayoutParams.MATCH_PARENT, WH.getH(10));
            tvTitle.setLayoutParams(layoutParams);
            tvTitle.setText(R.string.ScoreTitle);
            tvTitle.setTextSize(PX, WH.getTextSize(80));
            tvTitle.setTextColor(0xFF00CFCF);
            tvTitle.setGravity(Gravity.CENTER);
            rlScore.addView(tvTitle);
        }
        {
            tvFeel = new TextView(context);
            tvFeel.setId(View.generateViewId());
            LayoutParams layoutParams = new LayoutParams(LayoutParams.MATCH_PARENT, WH.getH(10));
            layoutParams.addRule(BELOW, tvTitle.getId());
            tvFeel.setLayoutParams(layoutParams);
            tvFeel.setText(R.string.ScoreFeel);
            tvFeel.setTextSize(PX, WH.getTextSize(40));
            tvFeel.setTextColor(0xFF00CFCF);
            tvFeel.setGravity(Gravity.CENTER);
            rlScore.addView(tvFeel);
        }
        {
            etScore = new EditText(context);
            etScore.setId(View.generateViewId());
            LayoutParams layoutParams = new LayoutParams(WH.getW(50), WH.getH(20));
            layoutParams.addRule(BELOW, tvFeel.getId());
            layoutParams.leftMargin = WH.getW(10);
            etScore.setLayoutParams(layoutParams);
            etScore.setTextSize(PX, WH.getTextSize(90));
            etScore.setTextColor(0xFFD87093);
            etScore.setTypeface(etScore.getTypeface(), Typeface.BOLD_ITALIC);
            etScore.setHint(R.string.ScoreHint);
            etScore.setHintTextColor(0xFFFFE4B5);
            etScore.setGravity(Gravity.CENTER);
            etScore.setInputType(InputType.TYPE_CLASS_NUMBER);
            etScore.setFilters(new InputFilter[]{new InputFilter.LengthFilter(3)});
            rlScore.addView(etScore);
        }
        {
            tvScore = new TextView(context);
            tvScore.setId(View.generateViewId());
            LayoutParams layoutParams = new LayoutParams(WH.getW(30), WH.getH(20));
            layoutParams.addRule(BELOW, tvFeel.getId());
            layoutParams.addRule(RIGHT_OF, etScore.getId());
            tvScore.setLayoutParams(layoutParams);
            tvScore.setText(R.string.Score);
            tvScore.setTextSize(PX, WH.getTextSize(40));
            tvScore.setTextColor(0xFF00CFCF);
            tvScore.setGravity(Gravity.BOTTOM);
            rlScore.addView(tvScore);
        }
        {
            tvBecause = new TextView(context);
            tvBecause.setId(View.generateViewId());
            LayoutParams layoutParams = new LayoutParams(WH.getW(25), WH.getH(20));
            layoutParams.addRule(BELOW, tvScore.getId());
            tvBecause.setLayoutParams(layoutParams);
            tvBecause.setText(R.string.ScoreBecause);
            tvBecause.setTextSize(PX, WH.getTextSize(40));
            tvBecause.setTextColor(0xFF00CFCF);
            tvBecause.setGravity(Gravity.CENTER_VERTICAL);
            rlScore.addView(tvBecause);
        }
        {
            etBecause = new EditText(context);
            etBecause.setId(View.generateViewId());
            LayoutParams layoutParams = new LayoutParams(WH.getW(55), WH.getH(20));
            layoutParams.addRule(BELOW, tvScore.getId());
            layoutParams.leftMargin = WH.getW(10);
            etBecause.setLayoutParams(layoutParams);
            etBecause.setTextSize(PX, WH.getTextSize(40));
            etBecause.setTextColor(0xFFD87093);
            etBecause.setTypeface(etBecause.getTypeface(), Typeface.BOLD_ITALIC);
            rlScore.addView(etBecause);
        }
        {
            btnOK = new Button(context);
            btnOK.setId(View.generateViewId());
            LayoutParams layoutParams = new LayoutParams(WH.getW(30), WH.getH(10));
            layoutParams.addRule(BELOW, etBecause.getId());
            layoutParams.addRule(ALIGN_PARENT_RIGHT);
            layoutParams.rightMargin = WH.getW(5);
            btnOK.setLayoutParams(layoutParams);
            btnOK.setGravity(Gravity.CENTER);
            btnOK.setText(R.string.ScoreOK);
            btnOK.setTextColor(0xFFCD5C5C);
            btnOK.setTextSize(PX, WH.getTextSize(40));
            btnOK.setBackgroundColor(0xFFFFC0CB);
            rlScore.addView(btnOK);
        }
    }

    public EditText getEtScore() {
        return this.etScore;
    }

    public EditText getEtBecause() {
        return this.etBecause;
    }

    public Button getBtnOK() {
        return this.btnOK;
    }
}
