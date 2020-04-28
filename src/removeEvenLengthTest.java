import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class removeEvenLengthTest {

	@Test
	public void testRemoveEvenLengthTest() {
		
		ArrayList<String> listBefore = new ArrayList<String>();
		listBefore.add("Apple");
		listBefore.add("Blackberry");
		listBefore.add("Cherry");
		listBefore.add("Melon");
		listBefore.add("+");
		listBefore.add("Durian");
		listBefore.add("Elderberry");
		listBefore.add("Fig");
		listBefore.add("Grape");
		listBefore.add("Honeydew");
		assertEquals(listBefore.size(), 10);

		ArrayList<String> listAfter = new ArrayList<String>();
		listAfter.add("Apple");
		listAfter.add("Melon");
		listAfter.add("+");
		listAfter.add("Fig");
		listAfter.add("Grape");
		for (int i = 0; i < listAfter.size(); i++) {
			int letterCount = listAfter.get(i).length();
			int oddNumber = letterCount % 2;
			assertEquals(oddNumber, 1);
		}

		removeEvenLength dr = new removeEvenLength();
		assertEquals(listAfter,dr.removeEvenLength(listBefore));
		
		
	}

}
