package n3exercici1;

public class Smartphone implements Telephone {
	
	private String num;
	
	public Smartphone (String num) {
		this.num = num;
	}

	public String getNum() {
		return num;
	}

	public void setNum(String num) {
		this.num = num;
	}
	public String trucar (String otherNum) {
		return "S'està trucant al numero: " + otherNum;
	}
	public String takePicture() {
		return "Foto feta";
	}
	

}
