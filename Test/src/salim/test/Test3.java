package salim.test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Test3 {

	public static void main(String[] args) {
		/*
		 * var list = new List<KeyValuePair<int, string>>(); list.Add(new
		 * KeyValuePair<int, string>(1, “Valeur 1”)); list.Add(new KeyValuePair<int,
		 * string>(2, “Valeur 2”)); list.Add(new KeyValuePair<int, string>(4, “Valeur
		 * 4”)); list.Add(new KeyValuePair<int, string>(5, “Valeur 5”)); list.Add(new
		 * KeyValuePair<int, string>(6, “Valeur 6”));
		 * 
		 * var result = new List<string>();
		 * 
		 * For(int i = 0 ; i <= 10 ; i++){ string x = list[i].Value; result.Add(x); }
		 */

		HashMap<Integer, String> list = new HashMap<>();

		list.put(1, "Valeur 1");
		list.put(2, "Valeur 2");
		list.put(4, "Valeur 4");
		list.put(5, "Valeur 5");
		list.put(6, "Valeur 6");

		List<String> result = new ArrayList<>();

		for (int i = 0; i <= 10; i++) {
			String x = list[i].Value;
			result.add(x);
		}

	}

}
