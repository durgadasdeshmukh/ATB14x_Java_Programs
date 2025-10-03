package ex_04_Operators;

public class Lab032_RelationalOperators {
    public static void main(String[] args) {
//         < less than
//         <= less than or equal to
//                > greater than
//            >= Greater than or equal to
//                == Equal to (but checking)
//        ! => Not qual

        int a = 10;
        int b = 30;
        boolean c = a > b;
        System.out.println(c);
//        boolean me sirf do condition hoti hain true or false or 10>30 se bada nhi hain isiliye false


        int age_mamitha = 33;
        int age_pramod = 34;

        boolean result = age_pramod >= age_mamitha;
        System.out.println(result);

    }
}
