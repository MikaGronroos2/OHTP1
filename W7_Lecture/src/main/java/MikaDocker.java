import java.util.Scanner;

public class MikaDocker {

    public MikaDocker() {}

    public static void main(String[] args) {
        MikaDocker test = new MikaDocker();
        test.run();
    }

    public void run() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Hello! What is your name?");

        String name = scanner.nextLine();
        greetUser(name);
    }

    public String greetUser(String name) {
        String greeting = "Hello, " + name;
        System.out.println(greeting);
        return greeting;
    }

}
