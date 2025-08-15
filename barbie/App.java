package unsw.barbie;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.List;

public class App {
    public static void main(String[] args) {
        // Create some barbie dolls
        Barbie barbie1 = new DreamHouseDecorator(new CarDecorator(new Barbie()));
        Barbie barbie2 = new DreamHouseDecorator(new Barbie());
        Barbie barbie3 = new CarDecorator(new Barbie());

        // Create some Ken dolls
        Ken ken1 = new Ken();
        Ken ken2 = new Ken();
        Ken ken3 = new Ken();

        // Create a box to store our barbies
        BarbieBox barbieBox = new BarbieBox();

        // Later, we decide to give Barbie 3 a dreamhouse as well
        barbie3 = new DreamHouseDecorator(barbie3);

        barbieBox.putBarbieInBox(barbie1);
        barbieBox.putBarbieInBox(barbie2);
        barbieBox.putBarbieInBox(barbie3);

        List<Barbie> allBarbies = barbieBox.getBarbies();

        allBarbies.forEach(b -> System.out.println(b.sayHello()));

        allBarbies.forEach(b -> System.out.print(b.accessories()));

        System.out.println("The total price of all the barbies is $"
                + allBarbies.stream().map(Barbie::price).reduce(0, Integer::sum));
    }

    public String output() {
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        System.setOut(new PrintStream(out));
        App.main(new String[] {});
        System.setOut(System.out);

        return out.toString();
    }
}
