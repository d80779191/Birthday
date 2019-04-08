package com.birthdaycard.Controller;

import android.support.v4.app.Fragment;

import com.birthdaycard.Module.MainController;
import com.birthdaycard.layout.Layout3;

import java.util.Calendar;
import java.util.Date;

public class Controller3 extends MainController{
    private Layout3 layout;

    public Controller3(Fragment frag) {
        super(frag);
    }

    @Override
    protected void init() {
        layout = (Layout3) frag.getView();
        setTogetherDays();
    }

    private void setTogetherDays() {
        Calendar togetherDay = Calendar.getInstance();
        togetherDay.set(2014, 10, 1);
        Date d1 = togetherDay.getTime();
        Calendar nowDay = Calendar.getInstance();
        Date d2 = nowDay.getTime();
        long day = ((d2.getTime() - d1.getTime()) / 1000 / 3600 / 24) + 1;
        layout.getTvDays().setText(String.valueOf(day));
    }
}
