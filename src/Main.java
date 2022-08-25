public class Main {
    public static void main(String[] args) {
         Dog dog=new Dog("met","home","Barbos","play with childen");
         Cat cat=new Cat("milk","kitchen","home");
         Horse horse=new Horse("frass ","barn","sugar");
         Animal[] animals={cat,dog,horse};
         for(Animal animal:animals){
             System.out.println(animal.getClass());
             Veterinar.treatAnimal(animal);
             animal.eat();
             animal.makeNoise();
             animal.sleep();
             System.out.println("-------------------------------------------------");

         }
    }
}