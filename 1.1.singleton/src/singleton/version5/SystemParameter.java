package singleton.version5;

public class SystemParameter {
	  private String name;
      private String address;
      private float intRate;
      private static SystemParameter instance;
      
      private SystemParameter(){
    	  System.out.println("Inside constructor of SystemParameter class");
      }
      
      public static SystemParameter getInstance(){
    	  if(instance==null){
    		  synchronized(SystemParameter.class){
    			  if(instance==null)
    				  instance=new SystemParameter();
    		  }
    	  }
    	  return instance;
      }
}
