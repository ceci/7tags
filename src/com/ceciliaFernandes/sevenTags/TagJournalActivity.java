package com.ceciliaFernandes.sevenTags;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class TagJournalActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_tag_journal);
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.tag_journal, menu);
		return true;
	}

}
