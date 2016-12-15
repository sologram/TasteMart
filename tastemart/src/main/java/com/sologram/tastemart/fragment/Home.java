package com.sologram.tastemart.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sologram.tastemart.R;

public class Home extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saved) {
		id = R.layout.home;
		return super.onCreateView(inflater, container, saved);
	}
}
