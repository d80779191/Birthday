package com.birthdaycard.layout;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.Gravity;
import android.view.View;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.birthdaycard.Module.MainParentLayout;
import com.birthdaycard.R;

public class Layout6 extends MainParentLayout {
    private Bitmap bitmap;
    private Paint paint;
    private ScrollView svText;
    private RelativeLayout rlText;
    private TextView tvText1;
    private TextView tvText2;
    private TextView tvText3;

    public Layout6(Context context) {
        super(context);
    }

    @Override
    protected void init() {
        this.setBackgroundResource(R.drawable.draw_page);
        paint = new Paint();
        setPhotos();
        setTextArea();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(bitmap, WH.getW(10), WH.getH(8), paint);
    }

    private void setPhotos() {
        Bitmap oBitmap = BitmapFactory.decodeResource(getResources(), R.drawable.future_back);
        int oWidth = oBitmap.getWidth();
        int oHeight = oBitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(WH.getW(80) / (float) oWidth, WH.getH(80) / (float) oHeight);
        bitmap = Bitmap.createBitmap(oBitmap, 0, 0, oWidth, oHeight, matrix, true);
        invalidate();
    }

    private void setTextArea() {
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
            tvText1.setText(R.string.Future1);
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
            tvText2.setText(R.string.Future2);
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
            tvText3.setText(R.string.Future3);
            tvText3.setTextSize(PX, WH.getTextSize(60));
            tvText3.setTextColor(0xFFD87093);
            tvText3.setGravity(Gravity.CENTER);
            rlText.addView(tvText3);
        }
    }
}
