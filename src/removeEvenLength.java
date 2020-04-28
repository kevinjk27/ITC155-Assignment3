/*
 * Kevin Kantono
 * 04/26/2020
 * Removing any even length strings from the list
 */

import java.io.FileNotFoundException;
import java.util.*;

public class removeEvenLength  {
	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<String> list = new ArrayList<String>();
		list.add("Apple"); // 5
		list.add("Blackberry"); // 10
		list.add("Cherry"); // 6
		list.add("Melon"); // 5
		list.add("+"); // 1
		list.add("Durian"); // 6
		list.add("Elderberry"); // 10
		list.add("Fig"); // 3
		list.add("Grape"); // 5
		list.add("Honeydew"); // 8
		removeEvenLength(list);
	}

	public static ArrayList<String>removeEvenLength(ArrayList<String> list) {
		for (int i = 0; i < list.size(); i++) {
			int letterCount = list.get(i).length();
			if (letterCount % 2 == 0) {
				list.remove(i);
				i--; 
				/*
				Since item in list.remove(i) has been gone, the next item on the ArrayList will take place of that index and not being conditioned(skipped). By doing i-- this will bring the i (counter) location at where the previous index was.
				*/
			}
		}
		System.out.println(list);
		return list;
	}
}
