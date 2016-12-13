package com.sologram.tastemart;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

/**
 * Created by hans on 16/12/13.
 */

public class Toolbar extends LinearLayout implements View.OnClickListener {
	private Frame frame;

	public Toolbar(Context context, AttributeSet attrs) {
		super(context, attrs);
		frame = (Frame) context;
	}

	public void init() {
		setListener(R.id.cmd_home);
		setListener(R.id.cmd_mine);
	}

	@Override
	public void onClick(View view) {
		frame.onPageSelected(0, 0);
	}

	private void setListener(int id) {
		findViewById(id).setOnClickListener(this);
	}
}
