package version0;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class AdapterDemo {

    public static void main(String args[]) {
        Integer[] arrayOfInts = new Integer[] {42, 43, 44};
                
        
        List<Integer> listOfInts = Arrays.asList(arrayOfInts);
                        
        //listOfInts = arrayOfInts;
        
        System.out.println(arrayOfInts);
        //listOfInts.add(41);
        
        System.out.println(listOfInts);
    }
}
