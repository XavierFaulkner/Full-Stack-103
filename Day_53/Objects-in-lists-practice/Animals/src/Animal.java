public class Animal {
    String name;
    boolean isDog;

    public Animal() {}

    public Animal(String name) {
        this.name = name;
    }

    public Animal(boolean isDog) {
        this.isDog = isDog;
    }

    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    public String getName() {
        return name;
    }

    public boolean getIsDog() {
        return isDog;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setIsDog(boolean isDog) {
        this.isDog = isDog;
    }

    @Override
    public String toString() {
        return getName() + " is a dog = " + getIsDog();
    }
}