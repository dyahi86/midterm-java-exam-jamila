package datastructure;

import java.util.*;

public class
UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 *
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MySql] to store data and retrieve data.
		 *
		 */
		List<String> color= new ArrayList<>();
		color.add("blue");
		color.add("red");
		color.add("green");
		//add array list to map
		Map<String,List<String>> map = new HashMap<String,List<String>>();
		map.put("color", color);
		//Use For Each loop and while loop with Iterator to retrieve data.
		//for each loop
		for (String fruit:map.get("color")){
			System.out.println(color);
		}
		//while loop
		Iterator<String> iterator=map.get("color").iterator();
		while(iterator.hasNext()){
			System.out.println(iterator.next());
		}




	}

}
