
public class MyPhone {
	public void call() {
		System.out.println("calling");
	}

	class SmartPhone extends MyPhone {
		public void call() {
			System.out.println("videoconference");
		}
		class Battery{
			public void call() {
				System.out.println("battery");
			}
		}
	}

	public static void main(String[] args) {
		MyPhone phone = new MyPhone();
		phone.call();

		MyPhone.SmartPhone sm = new MyPhone().new SmartPhone();
		sm.call();

		MyPhone sm2 = new SmartPhoneAndroid();
		sm2.call();

		MyPhone innerClass = new MyPhone() {
			public void call() {
				System.out.println("making new call");
			}
		};

		innerClass.call();

		SmartPhoneAndroid myInnerInterface = new SmartPhoneAndroid() {
			public void charge() {
				System.out.println("Charge was completed");
			}
		};
		
		

		myInnerInterface.charge();
		
		InnerInterface myInnerInterface2 = ()->{
			System.out.println("5% load");
		};
		
		
		myInnerInterface2.charge();
		
		
		MyPhone.SmartPhone.Battery battery = new MyPhone().new SmartPhone().new Battery();
		battery.call();
		

	}
}

class SmartPhoneAndroid extends MyPhone implements InnerInterface {
	public void call() {
		System.out.println("videoconference android");
	}

	@Override
	public void charge() {
		System.out.println("loading phone");
	}
}
