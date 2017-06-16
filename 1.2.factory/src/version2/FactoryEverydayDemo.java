package version2;

import java.util.Calendar;

public class FactoryEverydayDemo 
{
    public static void main(String args []) 
    {
    	Integer.valueOf(100);
    	
        Calendar cal = Calendar.getInstance();
        System.out.println(cal);
        System.out.println(cal.get(Calendar.DAY_OF_MONTH));
        
    }
}