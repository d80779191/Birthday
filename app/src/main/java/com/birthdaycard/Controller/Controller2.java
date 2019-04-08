package com.birthdaycard.Controller;

import android.content.res.TypedArray;
import android.os.Handler;
import android.support.v4.app.Fragment;

import com.birthdaycard.Module.MainController;
import com.birthdaycard.R;
import com.birthdaycard.layout.Layout2;

public class Controller2 extends MainController{
    private Layout2 layout;
    private Handler handler;
    private int count;
    private TypedArray playImage;
    private Runnable runPlaying;

    public Controller2(Fragment frag) {
        super(frag);
    }

    @Override
    protected void init() {
        layout = (Layout2) frag.getView();
        count = 0;
        playImage = context.getResources().obtainTypedArray(R.array.Photos);
        setRunPlaying();
        setPlaying();
    }

    private void setPlaying() {
        handler = new Handler();
        handler.post(runPlaying);
    }

    private void setRunPlaying() {
        runPlaying = new Runnable() {
            @Override
            public void run() {
                layout.setPhotos(playImage.getResourceId(count, 0));
                if (count < 15) {
                    count++;
                } else {
                    count = 0;
                }
                handler.postDelayed(this, 3000);
            }
        };
    }

    @Override
    public void onDestroyController() {
        super.onDestroyController();
        handler.removeCallbacks(runPlaying);
        if (handler != null) {
            handler = null;
        }
    }
}
