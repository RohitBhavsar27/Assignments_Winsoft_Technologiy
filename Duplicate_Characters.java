package coding_questions;

import java.util.HashMap;
import java.util.Map;

public class Duplicate_Characters {

	public static void main(String[] args) {
		String str = "Mississippi";

		// Convert the input string into a character array
		char[] charArray = str.toCharArray();

		// Create a HashMap to store character frequencies
		Map<Character, Integer> charCount = new HashMap<>();

		// Count the occurrence of each character
		for (char c : charArray) {
			if (c != ' ') {
				charCount.put(c, charCount.getOrDefault(c, 0) + 1);
			}
		}

		// Print duplicate characters
		System.out.println("Duplicate characters in the given string:");
		for (Map.Entry<Character, Integer> entry : charCount.entrySet()) {
			if (entry.getValue() > 1) {
				System.out.print(entry.getKey() + " ");
			}
		}
	}
}
