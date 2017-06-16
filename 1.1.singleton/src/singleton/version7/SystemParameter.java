package singleton.version7;

public class SystemParameter implements Cloneable{
	 private String name;
     private String address;
     private float intRate;
     
     private static SystemParameter instance = new SystemParameter();

     private SystemParameter(){
    	 System.out.println("Inside SystemParameter constructor");
     }

     public static SystemParameter GetInstance(){
         return instance;
     }     

     public Object Clone() throws CloneNotSupportedException{
         throw new CloneNotSupportedException ("Clone not supported");
     }    
 }
