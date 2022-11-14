package n1exercici2;

public class GenericsMain {

	public static void main(String[] args) {
		GenericMethods generics = new GenericMethods();
		Persona persona = new Persona ("Pau", "Calabrés", 31);
		generics.<Persona, String, Integer>genericMethod(persona, "Hola", 2022);
	}

}
