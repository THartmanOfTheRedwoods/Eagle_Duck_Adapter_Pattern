public class RubberDuck implements Duck {
    @Override
    public void fly() {
        System.out.println("Sad duck, I can't fly.");
    }

    @Override
    public void quack() {
        System.out.println("Squeaks");
    }
}
