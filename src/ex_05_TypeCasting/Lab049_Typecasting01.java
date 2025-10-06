package ex_05_TypeCasting;

public class Lab049_Typecasting01 {
    public static void main(String[] args) {
       long phone_no = 9826583397l;
//            short s = phone_no  narrowing - implicit
        short s = (short)  phone_no;
//        Narrowing explicit
        System.out.println(s);


    }




}
