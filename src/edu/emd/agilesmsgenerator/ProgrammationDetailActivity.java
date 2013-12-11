package edu.emd.agilesmsgenerator;

import edu.emd.agilesmsgenerator.core.SimpleSmsSender;
import android.content.Intent;
import android.os.Bundle;
import android.sax.TextElementListener;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

/**
 * An activity representing a single Programmation detail screen. This activity
 * is only used on handset devices. On tablet-size devices, item details are
 * presented side-by-side with a list of items in a
 * {@link ProgrammationListActivity}.
 * <p>
 * This activity is mostly just a 'shell' activity containing nothing more than
 * a {@link ProgrammationDetailFragment}.
 */
public class ProgrammationDetailActivity extends FragmentActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_programmation_detail);

		// Show the Up button in the action bar.
		getActionBar().setDisplayHomeAsUpEnabled(true);

		Button envoi = (Button) findViewById(R.id.buttonValider);
		
		envoi.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				SimpleSmsSender sms = new SimpleSmsSender();
				EditText text = (EditText) findViewById(R.id.text_a_envoyer);
				sms.send("0642449213", text.getText().toString());
			}
		});
		
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case android.R.id.home:
			// This ID represents the Home or Up button. In the case of this
			// activity, the Up button is shown. Use NavUtils to allow users
			// to navigate up one level in the application structure. For
			// more details, see the Navigation pattern on Android Design:
			//
			// http://developer.android.com/design/patterns/navigation.html#up-vs-back
			//
			NavUtils.navigateUpTo(this, new Intent(this,
					ProgrammationListActivity.class));
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
