package n3exercici1;

public class MainSmartphone {

	public static void main(String[] args) {
		Generic generic = new Generic();
		Smartphone NokiaN15 = new Smartphone("665447235");
		Smartphone SamsungGalaxyJ4 = new Smartphone("644895214");
		generic.<Telephone>genericTelephone(NokiaN15, SamsungGalaxyJ4);
		generic.<Smartphone>genericSmartphone(SamsungGalaxyJ4, NokiaN15);

	}

}
