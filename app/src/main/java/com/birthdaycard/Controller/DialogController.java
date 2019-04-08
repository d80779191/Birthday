package com.birthdaycard.Controller;

import android.support.v4.app.Fragment;
import android.view.View;

import com.birthdaycard.MainActivity;
import com.birthdaycard.Module.MainController;
import com.birthdaycard.Module.Tag;
import com.birthdaycard.layout.DialogLayout;

public class DialogController extends MainController{
    private DialogLayout layout;
    public DialogController(Fragment frag) {
        super(frag);
    }

    @Override
    protected void init() {
        layout = (DialogLayout) frag.getView();
        setOnClick();
    }

    private void setOnClick() {
        layout.getBtnOK().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                System.exit(0);
            }
        });

        layout.getBtnCancel().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                ((MainActivity)context).getSupportFragmentManager().beginTransaction().remove(((MainActivity)context).getSupportFragmentManager().findFragmentByTag(Tag.DIALOG_BACK)).commit();
                ((MainActivity)context).getBasedLayout().getRlWholeFragment().setAlpha(1.0f);
            }
        });
    }
}
