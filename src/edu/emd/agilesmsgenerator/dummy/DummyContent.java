package edu.emd.agilesmsgenerator.dummy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Helper class for providing sample content for user interfaces created by
 * Android template wizards.
 * <p>
 * TODO: Replace all uses of this class before publishing your app.
 */
public class DummyContent {

	/**
	 * An array of sample (dummy) items.
	 */
	public static List<DummyItem> ITEMS = new ArrayList<DummyItem>();

	/**
	 * A map of sample (dummy) items, by ID.
	 */
	public static Map<String, DummyItem> ITEM_MAP = new HashMap<String, DummyItem>();

	static {
		// Add 3 sample items.
		addItem(new DummyItem("1", "SMS Exemple 1", "023456789", "Hello"
				));
			addItem(new DummyItem("2", "SMS Exemple 2", "023456789", "Bonjour" 
				));
			addItem(new DummyItem("3", "SMS Exemple 3", "023456789", "Ciao" 
				));
	}

	private static void addItem(DummyItem item) {
		ITEMS.add(item);
		ITEM_MAP.put(item.id, item);
	}

	/**
	 * A dummy item representing a piece of content.
	 */
	public static class DummyItem {
		public String id;
		public String prog_name;
		public String num_phone;
		public String message;

		public DummyItem(String id, String prog_name, String num_phone, String message
	             ) 
		{
			this.id = id;
			this.prog_name = prog_name;
			this.num_phone = num_phone;
			this.message = message;
		}
		
		@Override
		public String toString() {
			return prog_name;
		}
	}
}
