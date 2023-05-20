public class Pascal_With_Recursion {
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
        if(i == 0 || j == 0)
            return 1;
        else
            return pascal(i-1,j-1) + pascal(i-1,j);
    }
}
