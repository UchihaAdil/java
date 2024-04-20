package ex1;

public class Main {
    public static void main(String[] args) {
        System.out.println("Exercise 1:");
        Cat cat1 = new Cat("Kitty");
        cat1.greets();
        Dog dog1 = new Dog("Buddy");
        dog1.greets();
        BigDog bigDog1 = new BigDog("Max");
        bigDog1.greets();
        Animal animal1 = new Cat("Tom");
        animal1.greets();
        Animal animal2 = new Dog("Rex");
        animal2.greets();
        Animal animal3 = new BigDog("Bruno");
        animal3.greets();
        Dog dog2 = (Dog) animal2;
        BigDog bigDog2 = (BigDog) animal3;
        Dog dog3 = (Dog) animal3;
       dog2.greets(dog3);
        dog3.greets(dog2);
        dog2.greets(bigDog2);
        bigDog2.greets(dog2);
        bigDog2.greets(bigDog1);
    }
}