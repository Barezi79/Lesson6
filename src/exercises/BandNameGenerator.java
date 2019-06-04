package exercises;

import java.util.ArrayList;
import java.util.Random;

/* 
 * Make 2 ArrayLists; 
 *      1 full of adjectives (e.g. slimy, blind)
 *      1 full of plural nouns (e.g. pants, bones)
 *      
 * When the program is run, one word is randomly selected from each list to generate a band name.
*/
public class BandNameGenerator {

	public static void main(String[] args) {

		Random R = new Random();

		ArrayList<String> adj = new ArrayList<String>();
		adj.add("regular");
		adj.add("slim fit");
		adj.add("short");
		adj.add("navy blue");
		adj.add("grey");
		adj.add("streight");
		adj.add("void");
		adj.add("reliable");

		ArrayList<String> plnouns = new ArrayList<String>();
		plnouns.add("t shirt");
		plnouns.add("dog");
		plnouns.add("land");
		plnouns.add("bicycle");
		plnouns.add("arrow");
		plnouns.add("pants");
		plnouns.add("pencil");
		plnouns.add("flower");

		int random = R.nextInt(adj.size());
		System.out.println(adj.get(random) + " " + plnouns.get(random));

	}

}
