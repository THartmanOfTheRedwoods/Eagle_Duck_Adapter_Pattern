import java.util.Random;

/*
This class is considered a Two-Way Adapter because it can adapt an Eagle to a Duck or a Duck to an Eagle as shown in
the App class.
 */
public class DuckEagleAdapter implements Duck, Eagle {
    private Duck duck;
    private Eagle eagle;
    private Random random;

    public DuckEagleAdapter(Eagle eagle) {
        this.eagle = eagle;
        this.random = new Random();
    }

    public DuckEagleAdapter(Duck duck) {
        this.duck = duck;
    }

    @Override
    public void fly() {
        this.eagle.flyHigh();
    }

    @Override
    public void quack() {
        int choice = random.nextInt(4);
        switch (choice) {
            case 0:
                eagle.scream();
                break;
            case 1:
                eagle.peal();
                break;
            case 2:
                eagle.kukKukKuk();
                break;
            case 3:
                eagle.chatter();
                break;
        }
    }

    @Override
    public void flyHigh() {
        this.duck.fly();
    }

    @Override
    public void scream() {
        this.duck.quack();
    }

    @Override
    public void peal() {
        this.duck.quack();
    }

    @Override
    public void chatter() {
        this.duck.quack();
    }

    @Override
    public void kukKukKuk() {
        this.duck.quack();
    }
}
