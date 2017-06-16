package singleton.version4;

public class MultithreadedApp implements Runnable{

	public static void main(String[] args) throws InterruptedException {
		for(int i=1; i<=25; i++)
		{
			Thread t1 = new Thread(new MultithreadedApp());
			t1.start();
		}
		System.out.println("outside for loop");
	}
	@Override
	public void run() {
		SystemParameter obj = SystemParameter.getInstance();
		System.out.println("obj hash value: "+obj.hashCode());
	}

}
