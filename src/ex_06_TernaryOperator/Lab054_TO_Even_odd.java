package ex_06_TernaryOperator;

public class Lab054_TO_Even_odd {
    public static void main(String[] args) {
//        step 1 - input , output - datatype

        int num1 = 16;
//        int num = 14;

//        step - 2
//         num%2 == 0 >even else 1 odd.
        String result = (num1 % 2 == 0) ? "Even" : "Odd" ;
        System.out.println(result);
    }
}
