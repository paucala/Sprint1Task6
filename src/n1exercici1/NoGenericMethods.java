package n1exercici1;

public class NoGenericMethods {
	private String nom;
	private String cognom1;
	private String cognom2;
	
	public NoGenericMethods (String nom, String cognom1, String cognom2) {
		this.nom = nom;
		this.cognom1 = cognom1;
		this.cognom2 = cognom2;
	}

	public String getNom() {
		return nom;
	}

	public String getCognom1() {
		return cognom1;
	}

	public String getCognom2() {
		return cognom2;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public void setCognom1(String cognom1) {
		this.cognom1 = cognom1;
	}

	public void setCognom2(String cognom2) {
		this.cognom2 = cognom2;
	}

	@Override
	public String toString() {
		return "NoGenericMethods [nom=" + nom + ", cognom1=" + cognom1 + ", cognom2=" + cognom2 + "]";
	}
	

}
