public class BaldEagle implements Eagle {
    @Override
    public void flyHigh() {
        System.out.println("Mile high club bald eagle style at 10000 feet");
    }

    @Override
    public void scream() {
        System.out.println("Screaming, cause you're being threatened");
    }

    @Override
    public void peal() {
        System.out.println("High-pitched, prolonged gull-like call to show off.");
    }

    @Override
    public void chatter() {
        System.out.println("3-4 intro notes, followed by rapid sequence of descending notes.");
    }

    @Override
    public void kukKukKuk() {
        System.out.println("Lower pitch call");
    }
}
