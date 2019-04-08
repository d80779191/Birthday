package com.birthdaycard.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.birthdaycard.Controller.Controller2;
import com.birthdaycard.Module.MainController;
import com.birthdaycard.Module.MainFragment;
import com.birthdaycard.layout.Layout2;

public class Fragment2 extends MainFragment{
    private Layout2 layout;
    private Controller2 controller;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return layout = new Layout2(getActivity());
    }

    @Override
    protected MainController onControllerCreated() {
        return controller = new Controller2(this);
    }
}
