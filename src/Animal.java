import java.util.StringJoiner;

public abstract class Animal {
    private String food, lacation;

    public Animal(String food, String lacation) {
        this.food = food;
        this.lacation = lacation;
    }

    public  String getFood() {
        return food;
    }

    public void setFood(String food) {
        this.food = food;
    }

    public String getLacation() {
        return lacation;
    }

    public void setLacation(String lacation) {
        this.lacation = lacation;
    }

    public  abstract void makeNoise();


    public abstract  void eat();
    public abstract  void sleep();

    @Override
    public String toString() {
        return new StringJoiner(", ", Animal.class.getSimpleName() + "", "")
                .add(" food='" + food + "'")
                .add("lacation='" + lacation + "'")
                .toString();
    }
}
