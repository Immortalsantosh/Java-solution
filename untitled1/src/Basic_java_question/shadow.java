public class shadow {

     static int x = 58;
     static void fun(){
         System.out.println(x);
     }

    public static void main(String[] args) {
        System.out.println(x);
        int x = 96;
        System.out.println(x);
        fun();
    }
}
