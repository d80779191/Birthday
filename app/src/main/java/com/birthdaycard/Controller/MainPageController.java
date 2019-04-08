package com.birthdaycard.Controller;

import android.support.v4.app.Fragment;
import android.view.View;

import com.birthdaycard.Fragment.Fragment1;
import com.birthdaycard.Fragment.Fragment2;
import com.birthdaycard.Fragment.Fragment3;
import com.birthdaycard.Fragment.Fragment4;
import com.birthdaycard.Fragment.Fragment5;
import com.birthdaycard.Fragment.Fragment6;
import com.birthdaycard.MainActivity;
import com.birthdaycard.Module.MainController;
import com.birthdaycard.Module.Tag;
import com.birthdaycard.R;
import com.birthdaycard.layout.MainPageLayout;

public class MainPageController extends MainController{
    private MainPageLayout layout;
    public MainPageController(Fragment frag) {
        super(frag);
    }

    @Override
    protected void init() {
        layout = (MainPageLayout) frag.getView();
        setOnClick();
    }

    private void setOnClick() {
        for (int i = 0;i < layout.getAllButtons().length;i++) {
            layout.getAllButtons()[i].setOnClickListener(new OnChangeFragOnClick(i));
        }
    }

    private class OnChangeFragOnClick implements View.OnClickListener {
        int buttonNumber = 0;
        private OnChangeFragOnClick(int buttonNumber) {
            this.buttonNumber = buttonNumber;
        }
        @Override
        public void onClick(View v) {
            switch (buttonNumber) {
                case 0:
                    changeFragment(new Fragment1(), Tag.FRAGMENT1);
                    break;
                case 1:
                    changeFragment(new Fragment2(), Tag.FRAGMENT2);
                    break;
                case 2:
                    changeFragment(new Fragment3(), Tag.FRAGMENT3);
                    break;
                case 3:
                    changeFragment(new Fragment4(), Tag.FRAGMENT4);
                    break;
                case 4:
                    changeFragment(new Fragment5(), Tag.FRAGMENT5);
                    break;
                case 5:
                    changeFragment(new Fragment6(), Tag.FRAGMENT6);
                    break;
            }
        }

        private void changeFragment(Fragment fragment, String tag) {
            ((MainActivity)context).getSupportFragmentManager()
                    .beginTransaction()
                    .setCustomAnimations(R.anim.animation_exit, R.anim.animation)
                    .replace(((MainActivity) context).getBasedLayout().getRlWholeFragment().getId(), fragment, tag).commit();
        }
    }
}
