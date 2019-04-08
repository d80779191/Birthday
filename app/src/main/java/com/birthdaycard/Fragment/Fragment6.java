package com.birthdaycard.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.birthdaycard.Controller.Controller6;
import com.birthdaycard.Module.MainController;
import com.birthdaycard.Module.MainFragment;
import com.birthdaycard.layout.Layout6;

public class Fragment6 extends MainFragment{
    private Layout6 layout;
    private Controller6 controller;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return layout = new Layout6(getActivity());
    }

    @Override
    protected MainController onControllerCreated() {
        return controller = new Controller6(this);
    }
}
