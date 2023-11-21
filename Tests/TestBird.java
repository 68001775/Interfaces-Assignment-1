import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;
public class TestBird {


        Bird b = new Bird();
        @Test
        public void testSound(){
            String sound;
            sound = b.makeSound();
            assertEquals(sound, "Chirp");
        }
        public void testMove(){
            String move;
            move = b.move();
            assertEquals(move, "I am flying");
        }


}
