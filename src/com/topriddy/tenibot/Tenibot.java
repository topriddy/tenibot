package com.topriddy.tenibot;

import java.util.StringTokenizer;

public class Tenibot {

	public static String processMessage(String message) {
		StringTokenizer tokens = new StringTokenizer(message);
		String result = MyDictionary.lookup(tokens.nextToken());
		return result;
	}
}
