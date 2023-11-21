public class AnimalDriver {
    public static void main(String[] args) {
        Dog dog = new Dog();
        Bird bird = new Bird();
        System.out.println(bird.makeSound());
        System.out.println(dog.makeSound());
        System.out.println(dog.misbehave("homework"));
    }
}
