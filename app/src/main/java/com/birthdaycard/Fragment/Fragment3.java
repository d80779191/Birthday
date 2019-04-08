package com.birthdaycard.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.birthdaycard.Controller.Controller3;
import com.birthdaycard.Module.MainController;
import com.birthdaycard.Module.MainFragment;
import com.birthdaycard.layout.Layout3;

public class Fragment3 extends MainFragment{
    private Layout3 layout;
    private Controller3 controller;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return layout = new Layout3(getActivity());
    }

    @Override
    protected MainController onControllerCreated() {
        return controller = new Controller3(this);
    }
}
