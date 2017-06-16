package singleton.version3;

public class MultithreadedApp implements Runnable{

	public static void main(String[] args) throws InterruptedException {
		long start = System.currentTimeMillis();
		for(int i=1; i<=25; i++)
		{
			Thread t1 = new Thread(new MultithreadedApp());
			t1.start();
			//t1.join();
		}
		
		long end = System.currentTimeMillis();
		System.out.println(end-start + " ms to execute.");
	}
	@Override
	public void run() {
		SystemParameter obj = SystemParameter.getInstance();
		System.out.println("obj hash value: "+obj.hashCode());
	}

}
