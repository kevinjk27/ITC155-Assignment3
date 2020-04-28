import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.ArrayList;

public class doubleListTest {

	@Test
	public void testDoubleList() {
		ArrayList<String> senteceBefore = new ArrayList<String>();
		senteceBefore.add("I");
		senteceBefore.add("Want");
		senteceBefore.add("Burger");

		assertEquals(senteceBefore.size(), 3);

		ArrayList<String> senteceAfter = new ArrayList<String>();
		senteceAfter.add("I");
		senteceAfter.add("I");
		senteceAfter.add("Want");
		senteceAfter.add("Want");
		senteceAfter.add("Burger");
		senteceAfter.add("Burger");

		assertEquals(senteceAfter.size(), 6);

		for (int i = 0; i < senteceAfter.size(); i += 2) {
			assertSame(senteceAfter.get(i), senteceAfter.get(i + 1));
		}
//		assertEquals(senteceAfter, doubleList(senteceBefore));

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

//		assertEquals(clauseAfter, doubleList(clauseAfter));

	}

}
