public class MallardDuck implements Duck {
    @Override
    public void fly() {
        System.out.println("Cruising at 200 - 4000 feet.");
    }

    @Override
    public void quack() {
        System.out.println("Quack quack quack");
    }
}
