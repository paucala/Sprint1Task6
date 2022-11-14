package n1exercici1;

public class NoGenericMain {

	public static void main(String[] args) {
		String nom = "Pau";
		String cognom1 = "Calabrés";
		String cognom2 = "Garcia-Carpintero";
		
		NoGenericMethods prova1 = new NoGenericMethods(nom, cognom1, cognom2);
		NoGenericMethods prova2 = new NoGenericMethods(cognom1, cognom2, nom);
		System.out.println(prova1.toString());
		System.out.println(prova2.toString());
		

	}

}
