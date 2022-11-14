package n3exercici1;

public class Generic {
	// aquest mètode no pot cridar al metode takePicture perque es exclusiu de la classe smartphone
	public<T> void genericTelephone (Telephone t1, Smartphone s1) {
		System.out.println(t1.trucar(s1.getNum()));
	}
	public<T> void genericSmartphone (Smartphone t2, Smartphone s2) {
		System.out.println(t2.trucar(s2.getNum()));
		System.out.println(t2.takePicture());
	}
}
