import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class doubleListTest {

	@Test
	public void testDoubleList() {
		ArrayList<String> sentenceBefore = new ArrayList<String>();
		
		sentenceBefore.add("I");
		sentenceBefore.add("Want");
		sentenceBefore.add("Burger");

		assertEquals(sentenceBefore.size(), 3);

		ArrayList<String> sentenceAfter = new ArrayList<String>();
		sentenceAfter.add("I");
		sentenceAfter.add("I");
		sentenceAfter.add("Want");
		sentenceAfter.add("Want");
		sentenceAfter.add("Burger");
		sentenceAfter.add("Burger");

		assertEquals(sentenceAfter.size(), 6);

		for (int i = 0; i < sentenceAfter.size(); i += 2) {
			assertSame(sentenceAfter.get(i), sentenceAfter.get(i + 1));
		}
		
		doubleList dr = new doubleList();
		assertEquals(sentenceAfter, doubleList.doubleList(sentenceBefore));

		
		ArrayList<String> clauseBefore = new ArrayList<String>();
		clauseBefore.add("The");
		clauseBefore.add("Quick");
		clauseBefore.add("Brown");
		clauseBefore.add("Fox");
		clauseBefore.add("Jumps");
		clauseBefore.add("Over");
		clauseBefore.add("The");
		clauseBefore.add("Lazy");
		clauseBefore.add("Dog");

		assertEquals(clauseBefore.size(), 9);

		ArrayList<String> clauseAfter = new ArrayList<String>();
		clauseAfter.add("The");
		clauseAfter.add("The");
		clauseAfter.add("Quick");
		clauseAfter.add("Quick");
		clauseAfter.add("Brown");
		clauseAfter.add("Brown");
		clauseAfter.add("Fox");
		clauseAfter.add("Fox");
		clauseAfter.add("Jumps");
		clauseAfter.add("Jumps");
		clauseAfter.add("Over");
		clauseAfter.add("Over");
		clauseAfter.add("The");
		clauseAfter.add("The");
		clauseAfter.add("Lazy");
		clauseAfter.add("Lazy");
		clauseAfter.add("Dog");
		clauseAfter.add("Dog");

		assertEquals(clauseAfter.size(), 18);

		for (int i = 0; i < clauseAfter.size(); i += 2) {
			assertSame(clauseAfter.get(i), clauseAfter.get(i + 1));
		}
		
		assertEquals(clauseAfter, doubleList.doubleList(clauseBefore));


	}


}
