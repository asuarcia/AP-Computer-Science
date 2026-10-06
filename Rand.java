import java.util.concurrent.ThreadLocalRandom;

public class Rand {
    public static void main(String[] args) {
        int randomInt = ThreadLocalRandom.current().nextInt(1, 100);
        System.out.println(randomInt);
    }
}