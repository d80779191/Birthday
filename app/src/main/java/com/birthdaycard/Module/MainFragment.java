package com.birthdaycard.Module;

import android.os.Bundle;
import android.support.v4.app.Fragment;

public abstract class MainFragment extends Fragment{
	protected MainController MC;
	
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		MC = onControllerCreated();
	}
	
	protected abstract MainController onControllerCreated();
	
	public MainController getController(){
		return MC;
	}
	
	public void onDestroyController() {
		MC.onDestroyController();
	}

	public void onDestroyView() {
		onDestroyController();
		
		super.onDestroyView();
	}
	
	
}
