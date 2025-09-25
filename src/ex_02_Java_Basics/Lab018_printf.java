package ex_02_Java_Basics;

public class Lab018_printf {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        System.out.println(a);
        System.out.println(b);


        System.out.print(a);
        System.out.print(b);


        System.out.printf("value of a=%d",a);
        System.out.println();
        System.out.printf("value of b=%d",b);

//        %d -> int, byte, long, short, data-type
//         %s -> string
//        %f -> float, double
//        %b -> boolean
    }
}
