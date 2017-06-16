package version3;


public class ComputerFactory {
	
	private static ComputerFactory instance = new ComputerFactory();
	
	private ComputerFactory(){}
	
	public static ComputerFactory getFactory()
	{
		/*if(instance == null)
			instance = new ComputerFactory();*/
		return instance;
	}
	
	public static Computer getComputer(String type, String ram, String hdd, String cpu)
	{
		if("PC".equalsIgnoreCase(type)) 
			return new PC(ram, hdd, cpu);
		else if("Server".equalsIgnoreCase(type)) 
			return new Server(ram, hdd, cpu);		
		return null;
	}
}