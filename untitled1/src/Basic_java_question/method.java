
import java.util.Arrays;
import java.util.Scanner;

public class method {
    static void sum(){
        int a; int b; int sum;
        a =10; b=52; sum=a+b;
        System.out.println(sum);
    }
    static int sum2(){
        Scanner sc = new Scanner(System.in);
        System.out.println("netr the first number");
        int a = sc.nextInt();
        System.out.println("enter the 2nd number");
        int b = sc.nextInt();
        int sum = a+b;
        return sum;
    }
     static void swap(){
        Scanner sc = new Scanner(System.in);
         System.out.print("ist number");
         int a  = sc.nextInt();
         System.out.print("2nd number");
         int b = sc.nextInt();
          int temp = a;
           a =b ;
           b = temp;
           System.out.println(a + "  " + b);
     }
     static int changevalue(int []arr){
        arr[1]= 55;
         return 1;
     }


    static String message(String name){
        String message = "HELLO" + name;
        return message;
    }
    public static void main(String[] args) {
//        sum();
//        int ans =  sum2();
//        System.out.println(ans);
//
//        String ans1 = message("santosh");
//        System.out.println(ans1);

//        swap();
        int arr[] = {21,56,88,36,55,44};
        changevalue(arr);
        System.out.println(Arrays.toString(arr));

    }
}
