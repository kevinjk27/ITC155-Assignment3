import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.Test;

public class doubleListTest {

	@Test
	public void testDoubleList() {
		ArrayList<String> sentece = new ArrayList<String>();
		sentece.add("I");
		sentece.add("Want");
		sentece.add("Burger");
		assertEquals(sentece.size(), 3);

		ArrayList<String> clause = new ArrayList<String>();
		clause.add("The");
		clause.add("Quick");
		clause.add("Brown");
		clause.add("Fox");
		clause.add("Jumps");
		clause.add("Over");
		clause.add("The");
		clause.add("Lazy");
		clause.add("Dog");
		assertEquals(clause.size(), 9);
	}

}
