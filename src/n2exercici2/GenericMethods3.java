package n2exercici2;

import java.util.ArrayList;

public class GenericMethods3 {
	
	public<T> void genericArray (ArrayList<T> arraylist) {
		for (T t : arraylist) {
			System.out.println(t);
		}
	}

	

}
