package com.sologram.tastemart.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Fragment extends android.app.Fragment {
	protected int id;

	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saved) {
		return inflater.inflate(id, container, false);
	}
}
