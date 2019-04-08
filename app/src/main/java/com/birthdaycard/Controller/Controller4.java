package com.birthdaycard.Controller;

import android.content.SharedPreferences;
import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import com.birthdaycard.Module.MainController;
import com.birthdaycard.R;
import com.birthdaycard.View.ToastView;
import com.birthdaycard.layout.Layout4;

public class Controller4 extends MainController{
    private SharedPreferences sharedPreferences;
    private static final String birthdayCard = "BIRTHDAY_CARD";
    private static final String score = "SCORE";
    private static final String reason = "REASON";
    private Layout4 layout;
    private ToastView toastView;

    public Controller4(Fragment frag) {
        super(frag);
    }

    @Override
    protected void init() {
        layout = (Layout4) frag.getView();
        sharedPreferences = context.getSharedPreferences(birthdayCard, 0);
        setRead();
        setSharedPrefensClick();
    }

    private void setRead() {
        if (sharedPreferences.getInt(score, 0) == 0) {
            layout.getEtScore().setText("");
        } else {
            String string = String.valueOf(sharedPreferences.getInt(score, 0));
            layout.getEtScore().setText(string);
        }
        if (!sharedPreferences.getString(reason, "").equals("")) {
            layout.getEtBecause().setText(sharedPreferences.getString(reason, ""));
        }
    }

    private void setSharedPrefensClick() {
        layout.getBtnOK().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (layout.getEtScore().getText().toString().equals("")) {
                    sharedPreferences.edit().putInt(score, 0).apply();
                } else {
                    int value = Integer.parseInt(layout.getEtScore().getText().toString());
                    sharedPreferences.edit().putInt(score, value).apply();
                }

                if (layout.getEtBecause().getText().toString().equals("")) {
                    sharedPreferences.edit().putString(reason, "").apply();
                } else {
                    sharedPreferences.edit().putString(reason, layout.getEtBecause().getText().toString()).apply();
                }
                Toast toast = new Toast(context);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setView(toastView = new ToastView(context, R.drawable.toast_view_score));
                toast.show();
            }
        });
    }
}
