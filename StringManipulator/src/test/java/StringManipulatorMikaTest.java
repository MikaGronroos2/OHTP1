import org.junit.*;
import org.junit.Assert.*;

public class StringManipulatorMikaTest {

    StringManipulatorMika manipulator;
    static String tobeReversedStatic;
    static String tobeCapitalizedStatic;
    String word1;
    String word2;

    @BeforeClass
    public static void staticPreparations() {
        tobeReversedStatic= "Reverse this";
        tobeCapitalizedStatic = "Capitalize This";
    }

    @AfterClass
    public static void endResutls() {
        System.out.println("tobeReversedStatic is now: " + tobeReversedStatic);
        System.out.println("tobeCapitalizedStatic is now: " + tobeCapitalizedStatic);
    }

    @Before
    public void normalPrep() {
        manipulator = new StringManipulatorMika();
        word1 = "NoWord";
        word2 = "YesWord";
    }

    @Test
    public void capitalizeTest() {
        tobeCapitalizedStatic = manipulator.capitalize(tobeCapitalizedStatic);
        org.junit.Assert.assertEquals("CAPITALIZE THIS", tobeCapitalizedStatic);

    }

    @Test
    public void reverseTest(){
        tobeReversedStatic = manipulator.reverse(tobeReversedStatic);
        org.junit.Assert.assertEquals("siht esreveR", tobeReversedStatic);
    }

    @Test
    public void reverseWord1Test() {
        String reversedWord1 = manipulator.reverse(word1);
        Assert.assertEquals("droWoN", reversedWord1);
    }

    @Test
    public void reverseWord2Test() {
        String reversedWord2 = manipulator.reverse(word2);
        Assert.assertEquals("droWseY", reversedWord2);
    }

    @Test
    public void capitalizeWord1Test() {
        String capitalizedWord1 = manipulator.capitalize(word1);
        Assert.assertEquals("NOWORD", capitalizedWord1);
    }

    @Test
    public void capitalizeWord2Test() {
        String capitalizedWord2 = manipulator.capitalize(word2);
        Assert.assertEquals("YESWORD", capitalizedWord2);
    }




}
