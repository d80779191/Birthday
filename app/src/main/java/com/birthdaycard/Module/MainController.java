package com.birthdaycard.Module;

import android.content.Context;
import android.support.v4.app.Fragment;

public abstract class MainController {
	protected Fragment frag;
	protected Context context;

	public MainController(Fragment frag) {
		this.frag = frag;
		this.context = frag.getActivity();
		init();
	}

	public MainFragment findFragmentByTag(String tag){
		return (MainFragment) frag.getFragmentManager().findFragmentByTag(tag);
	}
	
	protected abstract void init();
	
	public void onDestroyController() {}
	
}
