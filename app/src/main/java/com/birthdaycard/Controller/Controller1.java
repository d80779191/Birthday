package com.birthdaycard.Controller;

import android.support.v4.app.Fragment;
import android.view.Gravity;
import android.view.View;
import android.widget.Toast;

import com.birthdaycard.MainActivity;
import com.birthdaycard.Module.MainController;
import com.birthdaycard.R;
import com.birthdaycard.View.ToastView;
import com.birthdaycard.layout.Layout1;

public class Controller1 extends MainController{
    private Layout1 layout;
    private ToastView toastView;
    public Controller1(Fragment frag) {
        super(frag);
    }

    @Override
    protected void init() {
        layout = (Layout1) frag.getView();
        setOnClick();
    }

    private void setOnClick() {
        layout.getBtnYes().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                layout.getIvYes().setBackgroundResource(R.drawable.image_yes);
                layout.getTvYeah().setText(R.string.Yeah);
                ((MainActivity)context).setYesOrNo(true);
            }
        });

        layout.getBtnNo().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast toast = new Toast(context);
                toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
                toast.setDuration(Toast.LENGTH_SHORT);
                toast.setView(toastView = new ToastView(context, R.drawable.toast_view_broke));
                toast.show();
            }
        });
    }
}
