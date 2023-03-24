package quiz;

public class Increment {
    static int a = 10;

    public void print() {
        System.out.println(++a);
    }

    public static void main(String[] args) {
        Increment increment = new Increment();
        increment.print();

        Increment increment1 = new Increment();
        increment1.print();

        Increment increment2 = new Increment();
        increment2.print();
        //Output-> 11,12,13
    }
}
