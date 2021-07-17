package pashogus.main;

import pashogus.addition.Addition;
import pashogus.addition.AdditionImpl;
import pashogus.subraction.Subraction;
import pashogus.subraction.SubractionImpl;

public class Main {

	public static void main(String[] args) {

		Addition addition = new AdditionImpl();
		System.out.println(addition.add(3, 5));
		
		Subraction subraction = new SubractionImpl();
		System.out.println(subraction.sub(5, 3));
		
		
	}

}
