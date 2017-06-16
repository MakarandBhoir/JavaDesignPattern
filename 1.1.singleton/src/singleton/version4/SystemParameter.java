package singleton.version4;

public class SystemParameter implements Cloneable{
	  private String name;
      private String address;
      private float intRate;
      private static SystemParameter instance;
      
      private SystemParameter(){
    	  System.out.println("Inside constructor of SystemParameter class");
      }
      
      public Object clone() throws CloneNotSupportedException
      {
    	  //return super.clone();
    	  throw new CloneNotSupportedException("Object creation is not allowed.");
      }      
      
      public static SystemParameter getInstance(){
    	  if(instance==null)
    	  {
    		  synchronized(SystemParameter.class)
    		  {      
    			  if (instance == null) 			  
    				 	instance=new SystemParameter();
    		  }
    	  }
    	  return instance;
      }
}
