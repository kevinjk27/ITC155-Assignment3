
/*
 * Kevin Kantono
 * 04/26/2020
 * Replace every sting with two of that same string
 */
import java.util.ArrayList;

public class doubleList {

	public static void main(String[] args) {
		ArrayList<String> sentence = new ArrayList<String>();
		sentence.add("I");
		sentence.add("Want");
		sentence.add("Burger");
		doubleList(sentence);

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
		doubleList(clause);
	}

	public static ArrayList<String> doubleList(ArrayList<String> sentence) {
		for (int i = 0; i < sentence.size(); i++) {
			String copy = sentence.get(i);
			sentence.add(i + 1, copy);
			i++;
		}
		System.out.println(sentence);
		return sentence;

	}

}
