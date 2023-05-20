import java.util.HashMap;
import java.util.Map;

public class Pascal_With_Recursion_And_Memoization {
    //to store the value of the index i and j as key
    private static final Map<String,Integer> VALUE = new HashMap<>();
    public static void main(String[] args) {
        int row = 6;

        for(int i=1;i<=row;i++)
        {
            for(int k=1;k<=row-i;k++)
                System.out.print(" ");
            for(int j=1;j<=i;j++)
            {
                int result;
                result = pascal(i,j);
                System.out.print(result+" ");
            }
            System.out.println();
        }
    }
    public static int pascal(int i, int j){
        int result;
            if(j == 1 || j == i)
            return 1;
            else {
                if (VALUE.containsKey(i+" "+j)) {
                return VALUE.get(i+" "+j);
                }
                result = pascal(i - 1, j - 1) + pascal(i - 1, j);
                VALUE.put(i+" "+j, result);
                return result;
             }
    }
}
