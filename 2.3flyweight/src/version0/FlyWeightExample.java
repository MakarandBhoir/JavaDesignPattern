package version0;

public class FlyWeightExample {
    public static void main(String[] args) {
        Integer firstInt = Integer.valueOf(5);
        Integer secondInt = Integer.valueOf(5); // shares the same hashcode i.e. firstInt & secondInt are the same object
        Integer thirdInt = Integer.valueOf(10);

        System.out.println(System.identityHashCode(firstInt));
        System.out.println(System.identityHashCode(secondInt));
        System.out.println(System.identityHashCode(thirdInt));

        
        String s1 = "Capgemini";
        String s2 = "Capgemini";
        
    }
}
