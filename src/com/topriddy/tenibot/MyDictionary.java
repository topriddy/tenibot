package com.topriddy.tenibot;

import java.util.List;

import com.topriddy.tenibot.client.Definition;
import com.topriddy.tenibot.client.DictService;
import com.topriddy.tenibot.client.DictServiceSoap;
import com.topriddy.tenibot.client.WordDefinition;

public class MyDictionary {
	public static String lookup(String word) {
		return doLookup(word);
	}

	private static String doLookup(String word) {
		String meaning = "Not Found";
		System.out.println("Looking up word definition...");
		try {
			DictService service = new DictService();
			DictServiceSoap soap = service.getDictServiceSoap();
			WordDefinition wordDefinition = soap.define(word);
			List<Definition> definitionList = wordDefinition.getDefinitions()
					.getDefinition();
			meaning = definitionList.get(0).getWordDefinition();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return meaning;
	}

	public static void main(String args[]) {
		StringBuilder stringBuilder = new StringBuilder();
		stringBuilder.append("");
		String love = Tenibot.processMessage("Love");
		System.out.println("Love: " + love);
	}
}
