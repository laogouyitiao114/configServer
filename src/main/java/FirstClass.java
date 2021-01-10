import java.util.ArrayList;

public class FirstClass {
    public static void main(String[] args) {
        ArrayList<Object> objects = new ArrayList<>();
        objects.forEach(System.out::print);
    }
}
