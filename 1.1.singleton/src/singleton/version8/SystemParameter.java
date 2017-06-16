package singleton.version8;

public class SystemParameter {
	 private String name;
     private String address;
     private float intRate;
     
     private static SystemParameter instance;
     private static  int refCount;

     private SystemParameter(){
    	 System.out.println("Inside SystemParameter Constructor");    	 
     }
     
     public static SystemParameter GetInstance(){
         if (instance == null)
             instance = new SystemParameter();
         refCount++;
         return instance;
     }
     
     private static void ReleaseInstance(){
         refCount--;
         if (refCount==0)
        	 instance=null;
     }
}
