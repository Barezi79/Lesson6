package exercises;

import java.util.ArrayList;

public class Decorator {
	
ArrayList<Ornament> boxOfDecoration = new ArrayList<Ornament>();
	
	void hang(Ornament OR) {
		boxOfDecoration.add(OR);
		System.out.println("Hanging a " + OR.getColor() + "ornament");
	}

	public static void main(String[] args) {
		
		String[] ornamentColor = {"Navy", "Yellow", "Green", "Blue", "Red", "Purple"
				, "Orange", "Grey"};
		
		Decorator D = new Decorator();
		
		for (int i=0; i<ornamentColor.length; i++) {
			Ornament OR = new Ornament(ornamentColor[i]);
			D.hang(OR);
		}
		
		
	
	}

	}


