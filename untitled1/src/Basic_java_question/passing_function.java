import java.lang.reflect.Array;
import java.util.Arrays;

public class passing_function {
    static void paasing(int []arr){
        arr[0]=45;
    }

    public static void main(String[] args) {
       int []num = {1,2,3,4};
        System.out.println(Arrays.toString(num));
        paasing(num);
        System.out.println(Arrays.toString(num));

    }
}
