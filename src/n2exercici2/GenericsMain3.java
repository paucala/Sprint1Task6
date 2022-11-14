package n2exercici2;

import java.util.ArrayList;

public class GenericsMain3 {

	public static void main(String[] args) {
		GenericMethods3 generics = new GenericMethods3();
		Persona p1 = new Persona ("Pau", "Calabrés", 31);
		Persona p2 = new Persona ("Maria", "Lopez", 31);
		ArrayList<Persona> persones = new ArrayList<Persona>();
		persones.add(p1);
		persones.add(p2);
		generics.<Persona>genericArray(persones);
	}

}
