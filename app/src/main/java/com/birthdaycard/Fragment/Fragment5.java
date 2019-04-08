package com.birthdaycard.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.birthdaycard.Controller.Controller5;
import com.birthdaycard.Module.MainController;
import com.birthdaycard.Module.MainFragment;
import com.birthdaycard.layout.Layout5;

public class Fragment5 extends MainFragment{
    private Layout5 layout;
    private Controller5 controller;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return layout = new Layout5(getActivity());
    }

    @Override
    protected MainController onControllerCreated() {
        return controller = new Controller5(this);
    }
}
