package com.birthdaycard.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.birthdaycard.Controller.DialogController;
import com.birthdaycard.Module.MainController;
import com.birthdaycard.Module.MainFragment;
import com.birthdaycard.layout.DialogLayout;

public class DialogFragment extends MainFragment{
    private DialogLayout layout;
    private DialogController controller;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return layout = new DialogLayout(getActivity());
    }

    @Override
    protected MainController onControllerCreated() {
        return controller = new DialogController(this);
    }
}
