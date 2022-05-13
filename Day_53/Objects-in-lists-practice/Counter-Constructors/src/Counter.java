public class Counter {
    
    int currentValue;

    public Counter() {
        currentValue = 0;   
    }

    public Counter(int startValue) {
        currentValue = startValue;
    }

    public int value() {
        return currentValue;
    }

    public void increase() {
        currentValue += 1;
    }

    public void increase(int increaseBy) {
        if(increaseBy >= 0) {
            currentValue += increaseBy;
        } else {
            System.out.println("Cannot increase by a negative number");
        }
    }

    public void decrease() {
        currentValue -= 1;
    }

    public void decrease(int decreaseBy) {
        if(decreaseBy >= 0) {
            currentValue -= decreaseBy;
        } else {
            System.out.println("Cannot decrease by a negative number");
        }
    }
}
