import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MikaDockerTest {

    MikaDocker testProgram = new MikaDocker();

    @Test
    public void testNaming() {
        String name = "Jussi";
        String greeting = "Hello, Jussi";
        assertEquals(greeting, testProgram.greetUser(name));
    }
}