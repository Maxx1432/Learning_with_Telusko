// Factorial
// 5! = 5*4*3*2*1 = 120
public class Main {
    public static void main(String[] args){
    System.out.println();

    int num = 6;
    int result =0;

    result = fact(num);
        System.out.println(result);
    }

    public static int fact(int num){

        if(num == 1)
            return 1;
        // Using Recursion
        return num * fact(num-1);

    }
}
