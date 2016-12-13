package com.sologram.tastemart;

/**
 * Created by hans on 16/12/13.
 */

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class Home extends Fragment {
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle saved) {
		return inflater.inflate(R.layout.home, container, false);
	}
}
