package edu.emd.agilesmsgenerator;

import android.app.ActionBar.Tab;
import android.app.ActionBar.TabListener;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;

/**
 * An activity representing a list of Programmations. This activity has
 * different presentations for handset and tablet-size devices. On handsets, the
 * activity presents a list of items, which when touched, lead to a
 * {@link ProgrammationDetailActivity} representing item details. On tablets,
 * the activity presents the list of items and item details side-by-side using
 * two vertical panes.
 * <p>
 * The activity makes heavy use of fragments. The list of items is a
 * {@link ProgrammationListFragment} and the item details (if present) is a
 * {@link ProgrammationDetailFragment}.
 * <p>
 * This activity also implements the required
 * {@link ProgrammationListFragment.Callbacks} interface to listen for item
 * selections.
 */
public class ProgrammationListActivity extends FragmentActivity implements
		ProgrammationListFragment.Callbacks {

	/**
	 * Whether or not the activity is in two-pane mode, i.e. running on a tablet
	 * device.
	 */
	private boolean mTwoPane;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_programmation_list);

		if (findViewById(R.id.programmation_detail_container) != null) {
			// The detail container view will be present only in the
			// large-screen layouts (res/values-large and
			// res/values-sw600dp). If this view is present, then the
			// activity should be in two-pane mode.
			mTwoPane = true;

			// In two-pane mode, list items should be given the
			// 'activated' state when touched.
			((ProgrammationListFragment) getSupportFragmentManager()
					.findFragmentById(R.id.programmation_list))
					.setActivateOnItemClick(true);
		}
		

		// TODO: If exposing deep links into your app, handle intents here.
	}

	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		MenuInflater inflater = getMenuInflater();
	    inflater.inflate(R.menu.activity_list_actions, menu);
		return super.onCreateOptionsMenu(menu);
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
	    // Handle presses on the action bar items
	    switch (item.getItemId()) {
	        case R.id.addButton:
	        	Intent myIntent = new Intent(ProgrammationListActivity.this, ProgrammationDetailActivity.class);
	        	this.startActivity(myIntent);
	            return true;
	        default:
	        	return true;
	    }
	}

	/**
	 * Callback method from {@link ProgrammationListFragment.Callbacks}
	 * indicating that the item with the given ID was selected.
	 */
	@Override
	public void onItemSelected(String id) {
		if (mTwoPane) {
			// In two-pane mode, show the detail view in this activity by
			// adding or replacing the detail fragment using a
			// fragment transaction.
			Bundle arguments = new Bundle();
			arguments.putString(ProgrammationDetailFragment.ARG_ITEM_ID, id);
			ProgrammationDetailFragment fragment = new ProgrammationDetailFragment();
			fragment.setArguments(arguments);
			getSupportFragmentManager().beginTransaction()
					.replace(R.id.programmation_detail_container, fragment)
					.commit();

		} else {
			// In single-pane mode, simply start the detail activity
			// for the selected item ID.
			Intent detailIntent = new Intent(this,
					ProgrammationDetailActivity.class);
			detailIntent.putExtra(ProgrammationDetailFragment.ARG_ITEM_ID, id);
			startActivity(detailIntent);
		}
	}
}
