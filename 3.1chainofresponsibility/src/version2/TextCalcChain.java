package version2;


public class TextCalcChain {

    public static void main(String[] args) {

        Chain chainCacl1 = new AddNumbers();
        Chain chainCacl2 = new SubstractNumbers();
        Chain chainCacl3 = new MultNumbers();
        Chain chainCacl4 = new DivideNumbers();

        chainCacl1.setNextChain(chainCacl2);
        chainCacl2.setNextChain(chainCacl3);
        chainCacl3.setNextChain(chainCacl4);

        Numbers request = new Numbers(4, 2, "add");
        chainCacl1.calculate(request);

        Numbers request2 = new Numbers(4, 2, "div");
        chainCacl1.calculate(request2);

    }

}
