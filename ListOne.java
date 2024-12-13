import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListOne {
    public static void main(String[] args) {
        // Creating ArrayList
        ArrayList<Integer> numbers = new ArrayList<>();  // Type-safe list
        
        // Adding elements
        numbers.add(1);  
        System.out.println(numbers);              // append in Python
        numbers.add(0, 2);    // insert in Python
        System.out.println(numbers);
        // Accessing elements
        int first = numbers.get(0);    // numbers[0] in Python
        int last = numbers.get(numbers.size() - 1);  // numbers[-1] in Python
        
        // Removing elements
        numbers.remove(numbers.size() - 1);  // pop() in Python
        System.out.println(numbers);
        numbers.remove(Integer.valueOf(1));   // remove(1) in Python
        System.out.println(numbers);
        numbers.remove(0);             // del numbers[0] in Python
        System.out.println(numbers);

        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(1);
        //nums.add("string");  // will not work because generic predefines all content as integers


        nums.add(4);           // Add to end
        int length =  nums.size();  // Get length


        ArrayList<Integer> numbers2 = new ArrayList<>(Arrays.asList(1, 2, 3, 4, 5));
        List<Integer> subset = numbers2.subList(1, 4);  // [2, 3, 4]
    }
}
