package singleton.version3;

public class SystemParameter {
	  private String name;
      private String address;
      private float intRate;
      private static SystemParameter instance;
      
      private SystemParameter(){
    	  System.out.println("Inside constructor of SystemParameter class");
      }
      
      public static synchronized SystemParameter getInstance(){
    	  if(instance==null)
    		  instance=new SystemParameter();
    	  return instance;
      }
}
