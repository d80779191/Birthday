package com.birthdaycard.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.birthdaycard.Controller.Controller4;
import com.birthdaycard.Module.MainController;
import com.birthdaycard.Module.MainFragment;
import com.birthdaycard.layout.Layout4;

public class Fragment4 extends MainFragment{
    private Layout4 layout;
    private Controller4 controller;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return layout = new Layout4(getActivity());
    }

    @Override
    protected MainController onControllerCreated() {
        return controller = new Controller4(this);
    }
}
