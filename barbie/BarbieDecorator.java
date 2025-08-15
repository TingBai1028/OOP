package unsw.barbie;

public abstract class BarbieDecorator extends Barbie {
    protected Barbie decoratedBarbie;

    public BarbieDecorator(Barbie decoratedBarbie) {
        this.decoratedBarbie = decoratedBarbie;
    }

    public abstract String accessories();

    public abstract int price();
}
