package ex_05_TypeCasting;

public class Lab050_TypecastingUsed {
    public static void main(String[] args) {
           int course = 100;
           float GST = 18.45f;
//           int toatl1 = course+GST;
//          Narrowing - Implicit
        int total1 =  course+(int)GST;      // Narrowing - Explicit


        System.out.println(total1);


    }




}
