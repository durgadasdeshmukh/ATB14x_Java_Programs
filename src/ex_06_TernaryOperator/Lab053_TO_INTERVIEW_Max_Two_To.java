package ex_06_TernaryOperator;

public class Lab053_TO_INTERVIEW_Max_Two_To {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
//        find the maxium number between the two numbers

        System.out.println(Math.max(x,y));


//        This is ternary operator method neeche wala
        int max = x > y ? x : y ;
        System.out.println(max);
    }



}
