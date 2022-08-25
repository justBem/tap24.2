public class Dog extends Animal {
    private String nikeName;
    private String hobby;

    public Dog(String food, String lacation, String nikeName, String hobby) {
        super(food, lacation);
        this.nikeName = nikeName;
        this.hobby = hobby;
    }

    public String getNikeName() {
        return nikeName;
    }

    public void setNikeName(String nikeName) {
        this.nikeName = nikeName;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public void makeNoise() {
        System.out.println("gav-gav");
    }

    @Override
    public void eat() {
        System.out.println("eat meat");

    }

    @Override
    public void sleep() {
        System.out.println(" now  don't sleeping");

    }

    @Override
    public String toString() {
        return super.toString()+"\t nikeName:"+nikeName+"\t hobby: "+hobby;
    }
}

