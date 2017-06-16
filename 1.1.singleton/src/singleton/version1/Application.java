package singleton.version1;

public class Application {
	public static void main(String[] args) {
		SystemParameter s1=new SystemParameter();
		SystemParameter s2=new SystemParameter();
		
		System.out.println(s1.hashCode());
		System.out.println(s2.hashCode());
		System.out.println(System.identityHashCode(s1));
	}
}
