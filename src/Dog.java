public class Dog implements Devilish, Animal{

    @Override
    public String makeSound() {
        return "Bark";
    }

    @Override
    public String move() {
        return "I am running";
    }

    @Override
    public String misbehave(String str) {
        return "I Chewed up your " + str;
    }
}
