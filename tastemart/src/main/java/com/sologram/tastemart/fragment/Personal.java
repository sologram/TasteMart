package com.sologram.tastemart.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.sologram.tastemart.R;

public class Personal extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saved) {
		id = R.layout.personal;
		return super.onCreateView(inflater, container, saved);
	}
}
