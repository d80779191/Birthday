package com.birthdaycard.Fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.birthdaycard.Controller.MainPageController;
import com.birthdaycard.Module.MainController;
import com.birthdaycard.Module.MainFragment;
import com.birthdaycard.layout.MainPageLayout;

public class MainPageFragment extends MainFragment{
    private MainPageLayout layout;
    private MainPageController controller;
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        return layout = new MainPageLayout(getActivity());
    }

    @Override
    protected MainController onControllerCreated() {
        return controller = new MainPageController(this);
    }
}
