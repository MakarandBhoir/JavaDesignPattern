package singleton.version6;

public class Application {
	public static void main(String[] args) {		
		SystemParameter s1=SystemParameter.getInstance();
		SystemParameter s2=SystemParameter.getInstance();
	}
}
