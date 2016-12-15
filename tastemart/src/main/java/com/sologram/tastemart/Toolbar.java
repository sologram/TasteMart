package com.sologram.tastemart;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.LinearLayout;

public class Toolbar extends LinearLayout implements View.OnClickListener {

	public Toolbar(Context context, AttributeSet attrs) {
		super(context, attrs);
	}

	public void init() {
		setListener(R.id.cmd_home);
		setListener(R.id.cmd_mine);
		setListener(R.id.cmd_search);
	}

	@Override
	public void onClick(View view) {
		((Frame) getContext()).setPage(0, 0);
	}

	private void setListener(int id) {
		findViewById(id).setOnClickListener(this);
	}
}
