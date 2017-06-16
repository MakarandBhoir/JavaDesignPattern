package version1;

public class DecoratorSandwichDemo {

    public static void main(String[] args) {
        Sandwich sandwich = new DressingDecorator(new MeatDecorator(new SimpleSandwich()));
        System.out.println(sandwich.make());
        
        Sandwich simple = new DressingDecorator(new SimpleSandwich());
        System.out.println(simple.make());
    }
}
