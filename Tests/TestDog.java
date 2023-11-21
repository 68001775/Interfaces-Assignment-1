import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class TestDog {


        Dog b = new Dog();
        @Test
        public void testSound(){
            String sound;
            sound = b.makeSound();
            assertEquals(sound, "Bark");
        }
        public void testMove(){
            String move;
            move = b.move();
            assertEquals(move, "I am running");
        }


}
