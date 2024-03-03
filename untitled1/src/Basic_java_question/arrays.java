import java.util.Arrays;
import java.util.Scanner;

public class arrays {
    public static void main(String[] args) {

//        int[] arr = new int[4];
////        System.out.println(arr[0]);
////
//
        Scanner sc = new Scanner(System.in);
//        //input loop from user
//        for(int i=0 ; i<arr.length ; i++){
//            arr[i]= sc.nextInt();
//        }
//        for(int i=0 ; i<arr.length ; i++){
////            System.out.print(Arrays.toString(arr));
//            System.out.println(arr[i]);

            String [] str = new String[4];
            for (int i=0; i<str.length; i++){
                str[i]= sc.next();
            }
        System.out.println(Arrays.toString(str));

            //modify
        str[0]= "s";
        System.out.println(Arrays.toString(str));

    }
}
