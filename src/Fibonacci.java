import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    private static final Map<Integer,Integer> cache = new HashMap<>();

    public static void main(String[] args) {

        int pos = 9;
        int result = fib(pos);

        System.out.println(result);
    }
    public static int fib(int pos){

        int result;
        if(pos == 0)
            return 0;
        else if (pos == 1 || pos == 2)
            return 1;
        else
        {
            if(cache.containsKey(pos))
                return cache.get(pos);
        }

        result = fib(pos-1) + fib(pos -2);
        cache.put(pos,result);
        return result;
    }
}
