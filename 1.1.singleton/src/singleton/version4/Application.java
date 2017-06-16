package singleton.version4;

public class Application// extends SystemParameter 
{
	public static void main(String[] args) throws CloneNotSupportedException {		
		//for(int i=1; i<=5; i++)
		{
			SystemParameter s1=SystemParameter.getInstance();
			SystemParameter s2=SystemParameter.getInstance();
			
			System.out.println(s1.hashCode());
			SystemParameter s3 = (SystemParameter) s1.clone();
			System.out.println(s3.hashCode());
		}
	}
}
