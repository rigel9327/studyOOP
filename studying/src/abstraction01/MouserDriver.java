package abstraction01;

public class MouserDriver {
    public static void main(String[] args) {
        Mouse mickey = new Mouse();
        mickey.name = "미키";
        mickey.age = 87;
        mickey.countOfTail = 1;

        mickey.sing();

        mickey = null;

        Mouse jerry = new Mouse();

        jerry.name = "제리";
        jerry.age = 75;
        jerry.countOfTail = 1;

        jerry.sing();
    }
}
