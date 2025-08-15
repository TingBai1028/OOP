package unsw.barbie;

public class DreamHouseDecorator extends BarbieDecorator {
    public DreamHouseDecorator(Barbie decoratedBarbie) {
        super(decoratedBarbie);
    }

    @Override
    public String accessories() {
        return decoratedBarbie.accessories() + "As well as a dreamhouse!!!\n";
    }

    @Override
    public int price() {
        return decoratedBarbie.price() + 30;
    }

}
