package singleton.version6;

public class SystemParameter {
	  private String name;
      private String address;
      private float intRate;
      
      private static SystemParameter instance=new SystemParameter();
      
      private SystemParameter(){
    	  System.out.println("Inside constructor of SystemParameter class");
      }
      
      public static SystemParameter getInstance(){    	 
    	  return instance;
      }
}
