package singleton.version0;

public class DbSingletonDemo {

	public static void main(String args[]) {
		
		DbSingleton instance = DbSingleton.getInstance();
		System.out.println(instance);

		DbSingleton anotherInstance = DbSingleton.getInstance();
		System.out.println(anotherInstance);
		
	}
	
}
