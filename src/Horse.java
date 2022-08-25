import java.util.StringJoiner;

public class Horse extends Animal {
    public String like;

    public Horse(String food, String lacation, String like) {
        super(food, lacation);
        this.like = like;
    }

    public String getLike() {
        return like;
    }

    public void setLike(String like) {
        this.like = like;
    }

    @Override
    public void makeNoise() {
        System.out.println("hry-hry");
    }

    @Override
    public void eat() {
        System.out.println("eat grass");
    }

    @Override
    public void sleep() {
        System.out.println("is sleeping now");
    }

    @Override
    public String toString() {
        return super.toString() +"\tlike:"+like;
    }
}
