import java.util.ArrayList;

public class Arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> list =  new ArrayList<>(5);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        System.out.println(list);
        System.out.println(list.contains(566));
        list.set(0 ,89);
        System.out.println(list);



    }
}
