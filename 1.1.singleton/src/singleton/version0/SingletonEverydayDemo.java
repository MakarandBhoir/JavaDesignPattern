package singleton.version0;


public class SingletonEverydayDemo {

	public static void main(String[] args) {
		//Runtime obj = new Runtime();
		
		Runtime singletonRuntime = Runtime.getRuntime();
		//Runtime obj = new Runtime();
		
		singletonRuntime.gc();
		
		System.out.println("Hash Code: "+singletonRuntime.hashCode());

		Runtime anotherInstance = Runtime.getRuntime();
		
		//Runtime obj = (Runtime) singletonRuntime.clone();
		
		System.out.println("Hash Code: "+anotherInstance.hashCode());
		
		if(singletonRuntime == anotherInstance) {
			System.out.println("They are the same instance");
		}
		
	}

}
