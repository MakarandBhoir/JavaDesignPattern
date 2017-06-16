package version1;

public abstract class SandwichDecorator implements Sandwich {

    protected Sandwich customSandwich;

    // Sandwich can be concrete class or other decorator instance
    public SandwichDecorator(Sandwich customSandwich) {
        this.customSandwich = customSandwich;
    }

    public String make() {
        return customSandwich.make();
    }

}
