package NEW;
abstract class Machine {
	abstract void ATM();
	public void ATM2() {
		System.out.println("ATM USING JAVA WITH PHP");
	}
}
class Bank extends Machine{
	void ATM() {
		System.out.println("kdsndjjnkd");
	}
}
public class A{
	public static void main(String[]args) {
		Bank obj=new Bank();
		obj.ATM();
		obj.ATM2();
	}
}
