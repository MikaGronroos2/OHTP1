import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class MikaDockerTest {

    MikaDocker testProgram = new MikaDocker();

    @Test
    public void nameTest() {
        String name = "Jussi";
        String greeting = "Hello, Jussi";
        assertEquals(greeting, testProgram.greetUser(name));
    }
}