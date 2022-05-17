public class CustomTacoBox implements TacoBox{

    int tacos;

    public CustomTacoBox(int numOfTacos) {
        tacos = numOfTacos;
    }

    @Override
    public int tacosRemaining() {
        return tacos;
    }

    @Override
    public void eat() {
        tacos -= 1;
    }
}
