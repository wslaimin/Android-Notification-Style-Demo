package cw.per.cn;

import android.app.Activity;
import android.os.Bundle;
import android.support.v4.app.NavUtils;
import android.widget.TextView;

public class TestActivity extends Activity {

	@Override
	protected void onCreate (Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);

		TextView text = new TextView(this);
		text.setText("Test activity");
		setContentView(text);
	}

}
