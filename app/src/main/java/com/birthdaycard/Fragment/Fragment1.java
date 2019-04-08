package com.birthdaycard.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.birthdaycard.Controller.Controller1;
import com.birthdaycard.Module.MainController;
import com.birthdaycard.Module.MainFragment;
import com.birthdaycard.layout.Layout1;

public class Fragment1 extends MainFragment{
    private Layout1 layout;
    private Controller1 controller;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return layout = new Layout1(getActivity());
    }

    @Override
    protected MainController onControllerCreated() {
        return controller = new Controller1(this);
    }
}
