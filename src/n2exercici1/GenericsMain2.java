package n2exercici1;

public class GenericsMain2 {

	public static void main(String[] args) {
		GenericMethods2 generics = new GenericMethods2();
		Persona persona = new Persona ("Pau", "Calabrés", 31);
		generics.<Persona, String, Integer>genericMethod(persona, "Hola", 2022);
	}

}
