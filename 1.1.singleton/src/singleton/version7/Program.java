package singleton.version7;

public class Program {
	public static void main(String[] args) throws CloneNotSupportedException {
		SystemParameter obj1 = SystemParameter.GetInstance();
		SystemParameter obj2 = (SystemParameter)obj1.Clone();
	}
}