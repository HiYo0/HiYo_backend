package day15.추상클레스2;

public class Step3 {//class start

    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.sound();

        Cat cat =new Cat();
        cat.sound();

        Animal dog2 = new Dog();
        animalSound(dog2);
        animalSound(new Cat());

    }
    //
    public static void animalSound(Animal animal){
        animal.sound();
    }
}//class end
