
import java.util.LinkedList;

public class LinkedlistExample {
    public static void main(String[] args) {
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
   //     System.out.println(cars);
        for (String list1:cars
        ) {
            System.out.println(list1);
        }
    }
}