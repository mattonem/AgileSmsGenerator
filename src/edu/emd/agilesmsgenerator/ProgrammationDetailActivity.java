package edu.emd.agilesmsgenerator;

import edu.emd.agilesmsgenerator.core.SimpleSmsSender;
import edu.emd.agilesmsgenerator.core.StyleSmsNewYear;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.support.v4.app.NavUtils;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

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

	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_programmation_detail);

		// Show the Up button in the action bar.
		getActionBar().setDisplayHomeAsUpEnabled(true);

		Button envoi = (Button) findViewById(R.id.buttonValider);
		envoi.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				EditText textarea  = (EditText) findViewById(R.id.text_a_envoyer);
				EditText nodetel = (EditText) findViewById(R.id.nodetelephone);
				SimpleSmsSender sms = new SimpleSmsSender();
				sms.send(nodetel.getText().toString(), textarea.getText().toString());
			}
		});
		
		
		Button changerLeTexte = (Button) findViewById(R.id.buttonChangerLeTexte);
		changerLeTexte.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				EditText textarea  = (EditText) findViewById(R.id.text_a_envoyer);
				EditText nomdest = (EditText) findViewById(R.id.contact);
				StyleSmsNewYear smsny = new StyleSmsNewYear();
				smsny.changeParameter(nomdest.getText().toString());
				String message = smsny.generateMessage();
				textarea.setText(message);
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
