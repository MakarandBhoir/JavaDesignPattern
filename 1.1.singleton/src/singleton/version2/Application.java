package singleton.version2;

public class Application {
	public static void main(String[] args) {
		//SystemParameter obj = new SystemParameter();
		SystemParameter s1=SystemParameter.getInstance();
		SystemParameter s2=SystemParameter.getInstance();
		
		for(int i=1; i<10; i++)
		{
			SystemParameter s3=SystemParameter.getInstance();
		}
		
		System.out.println("s1: "+s1.hashCode());
		System.out.println("s2: "+s2.hashCode());
	}
}
