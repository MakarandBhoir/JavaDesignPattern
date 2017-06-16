package singleton.version9;

public class SystemParameter {
	private static String name;
    private static String address;
    private static float intRate;
    private static SystemParameter instance;

    public SystemParameter(){
    	System.out.println("Inside SystemParameter Constructor");
    }
    
    public static float GetIntRate(){
        return intRate;
    }
}