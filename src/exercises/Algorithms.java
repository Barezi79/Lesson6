package exercises;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Algorithms {

	static int findBrokenEgg(List<String> eggs) {
		for (int i = 0; i < eggs.size(); i++) {
			String egg = eggs.get(i);
			if(egg.contains("crack")) {
				return i;
			}
		}
		return -1;
	}

	public static Object countPearls(List<Boolean> oysters) {
		int OwithPearls = 0;
		for (int i = 0; i < oysters.size(); i++) {
			boolean OhasPearls = oysters.get(i);
			if (OhasPearls) {
				OwithPearls++;
			}
		}
		return OwithPearls;
	}

	static double findTallest(List<Double> peeps) {
		double Tallest = 0.0;
		for (int i = 0; i < peeps.size(); i++) {
			if (peeps.get(i) > Tallest) {
				Tallest = peeps.get(i);
			}
		}
		return Tallest;
	}

	static String findLongestWord(List<String> words) {
		int L = 0;
		int I = 0;
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).length() > L) {
				L = words.get(i).length();
				I = i;
			}
		}
		return words.get(I);
	}

	static Object containsSOS(List<String> message) {
		for (int i = 0; i < message.size(); i++) {
			if (message.get(i).contains(".... . .-. .-. ---")) {
				return true;
			}
		}
		return false;
	}

	static List<Double> sortScores(List<Double> results) {
		
		results.sort(null);
		return results;
	}

	static Object sortDNA(List<String> unsortedSequences) {
		Collections.sort(unsortedSequences, Comparator.comparingInt(String::length));
		return unsortedSequences;
	}

	static List<String> sortWords(List<String> words) {
		Collections.sort(words);
		return words;
	}
	
	
	
	

}
