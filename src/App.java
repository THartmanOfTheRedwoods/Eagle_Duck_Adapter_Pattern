import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        List<Duck> ducks = new ArrayList<>();
        ducks.add(new MallardDuck());
        ducks.add(new RubberDuck());
        Eagle superMascott = new BaldEagle();
        ducks.add(new DuckEagleAdapter(superMascott));

        for(Duck d : ducks) {
            d.fly();
            d.quack();
        }

        System.out.println("================");
        List<Eagle> eagles = new ArrayList<>();
        eagles.add(superMascott);
        eagles.add(new DuckEagleAdapter(new RubberDuck()));

        for(Eagle e : eagles) {
            e.flyHigh();
            e.chatter();
            e.peal();
            e.kukKukKuk();
            e.scream();
        }
    }
}
