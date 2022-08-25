public class Cat extends  Animal{
    private String live;

    public Cat(String food, String lacation, String live) {
        super(food, lacation);
        this.live = live;
    }

    public String getLive() {
        return live;
    }

    public void setLive(String live) {
        this.live = live;
    }

    @Override
    public void makeNoise() {
        System.out.println("miya-miya");
    }

    @Override
    public void eat() {
        System.out.println(" eat cat food");
    }

    @Override
    public void sleep() {
        System.out.println("everytimes sleeping");
    }

    @Override
    public String toString() {
        return super.toString()+"\tlive:"+live;
    }
}
