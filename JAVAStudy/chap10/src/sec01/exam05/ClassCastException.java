package sec01.exam05;

public class ClassCastException {
    Dog dog = new Dog();


    Cat cat = new Cat();

    public static void main(String[] args) {
//        changeCat(cat);
//        changeDog(dog);
    }

    private static void changeCat(Cat cat) {
    }

    public static void changeDog(Animal animal) {
        if (animal instanceof Dog) {
            Dog dog = (Dog) animal;
        } else if (animal instanceof Cat) {
            Cat cat = (Cat) animal;
    }


}
class Animal {}
class Dog extends ClassCastException.Animal {}
class Cat extends ClassCastException.Animal {}
}