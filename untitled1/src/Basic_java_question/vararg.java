import java.util.Arrays;

public class vararg {
    static void demo(int ...v){
        System.out.println(Arrays.toString(v));
    }
    public static void main(String[] args) {

        demo(52,8,6,9,58,6,9,2,9,52,69,5,9,6,59,5,9,5,959,5);
    }
}
