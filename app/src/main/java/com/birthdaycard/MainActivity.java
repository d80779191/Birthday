package com.birthdaycard;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.Window;
import android.widget.Toast;

import com.birthdaycard.Fragment.DialogFragment;
import com.birthdaycard.Fragment.MainPageFragment;
import com.birthdaycard.Module.Tag;
import com.birthdaycard.View.ToastView;
import com.birthdaycard.layout.BasedLayout;

public class MainActivity extends FragmentActivity {
    private BasedLayout layout;
    private ToastView toastView;
    public static boolean iYesOrNo;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().requestFeature(Window.FEATURE_NO_TITLE);

        setContentView(layout = new BasedLayout(this));

        getSupportFragmentManager().beginTransaction().add(layout.getRlWholeFragment().getId(), new MainPageFragment(), Tag.MAIN_PAGE).commit();
        Toast toast = new Toast(this);
        toast.setGravity(Gravity.CENTER_VERTICAL, 0, 0);
        toast.setDuration(Toast.LENGTH_LONG);
        toast.setView(toastView = new ToastView(this, R.drawable.toast_view));
        toast.show();
        iYesOrNo = false;
    }

    @Override
    public boolean onKeyDown(int keyCode, KeyEvent event) {
        if (keyCode == KeyEvent.KEYCODE_BACK) {
            if (getSupportFragmentManager().findFragmentByTag(Tag.MAIN_PAGE) != null && getSupportFragmentManager().findFragmentByTag(Tag.DIALOG_BACK) == null) {
                getSupportFragmentManager().beginTransaction().replace(layout.getRlDialogArea().getId(), new DialogFragment(), Tag.DIALOG_BACK).commit();
                layout.getRlWholeFragment().setAlpha(0.3f);
            } else if(getSupportFragmentManager().findFragmentByTag(Tag.DIALOG_BACK) != null) {
                getSupportFragmentManager().beginTransaction().remove(getSupportFragmentManager().findFragmentByTag(Tag.DIALOG_BACK)).commit();
                layout.getRlWholeFragment().setAlpha(1.0f);
            } else {
                changeFragment(new MainPageFragment(), Tag.MAIN_PAGE);
            }
            return true;
        }
        return super.onKeyDown(keyCode, event);
    }

    private void changeFragment(Fragment fragment, String tag) {
        getSupportFragmentManager()
                .beginTransaction()
                .setCustomAnimations(R.anim.animation_back_exit, R.anim.animation_back)
                .replace(layout.getRlWholeFragment().getId(), fragment, tag).commit();
    }

    public boolean getYesOrNo() {
        return iYesOrNo;
    }

    public void setYesOrNo(boolean yesOrNo) {
        iYesOrNo = yesOrNo;
    }

    public BasedLayout getBasedLayout() {
        return this.layout;
    }
}
