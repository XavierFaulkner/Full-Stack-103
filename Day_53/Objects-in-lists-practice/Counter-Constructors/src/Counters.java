public class Counters {
    public static void main(String[] args) throws Exception {
        //Create counters
        Counter a = new Counter();
        Counter b = new Counter(10);
        //default increase
        a.increase();
        //overloaded increase
        b.increase(10);
        //value method
        System.out.println(a.value());
        System.out.println(b.value());
        //default decrease
        a.decrease();
        //overloaded decrease
        b.decrease(5);
        //value method
        System.out.println(a.value());
        System.out.println(b.value());
    }
}
