package com.birthdaycard.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.view.View;
import android.widget.TextView;

import com.birthdaycard.Module.MainParentLayout;
import com.birthdaycard.R;

public class Layout2 extends MainParentLayout {
    private TextView tvPhoto1;
    private TextView tvPhoto2;
    private TypedArray playImage;
    private Paint paint;
    private Bitmap bitmap;

    public Layout2(Context context) {
        super(context);
    }

    @Override
    protected void init() {
        this.setBackgroundResource(R.drawable.draw_page);
        paint = new Paint();
        playImage = context.getResources().obtainTypedArray(R.array.Photos);
        setPhotos(playImage.getResourceId(0, 0));
        setView();
    }

    public void setPhotos(int res) {
        Bitmap oBitmap = BitmapFactory.decodeResource(getResources(), res);
        int oWidth = oBitmap.getWidth();
        int oHeight = oBitmap.getHeight();
        Matrix matrix = new Matrix();
        matrix.postScale(WH.getW(80) / (float) oWidth, WH.getH(30) / (float) oHeight);
        bitmap = Bitmap.createBitmap(oBitmap, 0, 0, oWidth, oHeight, matrix, true);
        invalidate();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawBitmap(bitmap, WH.getW(10), WH.getH(8), paint);
    }

    private void setView() {
        {
            tvPhoto1 = new TextView(context);
            tvPhoto1.setId(View.generateViewId());
            LayoutParams layoutParams = new LayoutParams(WH.getW(70), LayoutParams.WRAP_CONTENT);
            layoutParams.addRule(CENTER_HORIZONTAL);
            layoutParams.topMargin = WH.getH(45);
            tvPhoto1.setLayoutParams(layoutParams);
            tvPhoto1.setText(R.string.Photo1);
            tvPhoto1.setTextSize(PX, WH.getTextSize(40));
            tvPhoto1.setTextColor(0xFF00CFCF);
            this.addView(tvPhoto1);
        }
        {
            tvPhoto2 = new TextView(context);
            tvPhoto2.setId(View.generateViewId());
            LayoutParams layoutParams = new LayoutParams(WH.getW(70), LayoutParams.WRAP_CONTENT);
            layoutParams.addRule(BELOW, tvPhoto1.getId());
            layoutParams.addRule(CENTER_HORIZONTAL);
            layoutParams.topMargin = WH.getH(5);
            tvPhoto2.setLayoutParams(layoutParams);
            tvPhoto2.setText(R.string.Photo2);
            tvPhoto2.setTextSize(PX, WH.getTextSize(40));
            tvPhoto2.setTextColor(0xFFD87093);
            this.addView(tvPhoto2);
        }
    }
}
