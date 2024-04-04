package coding_questions;

import java.util.*;

public class Word_count {
	public static void main(String[] args) {
		String str = "This is an assignment for Winsoft Technologies";

		String[] words = str.split(" ");
		Map<String, Integer> wordCount = new HashMap<>();

		for (String word : words) {
			if (wordCount.containsKey(word)) {
				wordCount.put(word, wordCount.get(word) + 1);
			} else {
				wordCount.put(word, 1);
			}
		}

		int totalWordCount = 0;
		for (int count : wordCount.values()) {
			totalWordCount += count;
		}

		System.out.println("Total word count: " + totalWordCount);
	}
}
