package cz.darmovzal.yoca.ui;

import android.widget.*;
import android.graphics.*;
import android.content.Context;

public class TitleView extends TextView {
	public TitleView(Context ctx){
		super(ctx);
		this.setText("Main > Certificate");
		this.setTypeface(Typeface.DEFAULT, Typeface.BOLD);
		this.setPadding(10, 10, 10, 10);
		this.setTextColor(Color.WHITE);
		this.setBackgroundColor(Color.BLACK);
	}
}

