
enum MobileE {
	
	
	APPLE(10),SAMSUNG(30),HTC;
	//APPLE,SAMSUNG,HTC;
	
	int price = 0;
	
	MobileE() {
		price = 90;
	}
	
	MobileE(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return this.price;
	}
}

public class MobileEnum {
	public static void main(String[] args) {
		System.out.println(MobileE.APPLE);
		System.out.println(MobileE.SAMSUNG.price);
		System.out.println(MobileE.APPLE.price);
		System.out.println(MobileE.HTC.price);
	}
}
