package unsw.barbie;

public class CarDecorator extends BarbieDecorator {
    public CarDecorator(Barbie decoratedBarbie) {
        super(decoratedBarbie);
    }

    @Override
    public String accessories() {
        return decoratedBarbie.accessories() + "And a car!\n";
    }

    @Override
    public int price() {
        return decoratedBarbie.price() + 20;
    }

}
