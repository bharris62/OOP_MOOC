public class Main {
    public static void main(String[] args) {
        DecreasingCounter counter = new DecreasingCounter(10);

        counter.printValue();
        counter.decrease();
        counter.decrease();
        counter.printValue();
        counter.reset();
        counter.decrease();
        counter.printValue();
        counter.printValue();
        counter.setInitial();
        counter.printValue();
    }
}