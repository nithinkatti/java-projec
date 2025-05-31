package NEW;

class Car implements Runnable{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("Bmw Car moving"+i);
			try {
				Thread.sleep(5000);
			}catch(Exception e) {
			}
		}
	}
}
class Bike implements Runnable{
	public void run() {
		for(int i=1;i<=3;i++) {
			System.out.println("ninja Bike moving"+i);
			try {
				Thread.sleep(5000);
			}catch(Exception e){
			}
		}
	}
}
	public class SimpleRace1{
		public static void main(String[]args) {
			Thread caThread=new Thread(new Car());
			Thread baThread=new Thread(new Bike());
			 caThread.start();
			 baThread.start();
		}
	}




