package com.sologram.tastemart;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.view.View;

import com.sologram.tastemart.fragment.*;

public class Frame extends Activity implements Listener, View.OnClickListener {
	private static final String TAG = Frame.class.getSimpleName();

	private boolean flag;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.frame);
		((Toolbar) findViewById(R.id.toolbar)).init();
	}

	@Override
	public void onClick(View view) {
		onPageSelected(0, 0);
	}

	@Override
	public void onPageSelected(int page, int param) {
		Fragment fr = flag ? new Home() : new Personal();
		flag = !flag;

		FragmentManager fm = getFragmentManager();
		FragmentTransaction fragmentTransaction = fm.beginTransaction();
		fragmentTransaction.replace(R.id.pager, fr);
		fragmentTransaction.commit();
	}
}

interface Listener {
	void onPageSelected(int page, int param);
}
