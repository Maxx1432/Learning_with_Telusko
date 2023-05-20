public class Pascal_WIth_Iteration {
    public static void main(String[] args) {
        int row = 6;

        for(int i=1;i<=row;i++)
        {
            //to represent the value
            int TEMP=1;

            for(int k=1;k<=row-i;k++)
                System.out.print(" ");

            for(int j=1;j<=i;j++)
            {
                //First value is 1
                System.out.print(TEMP);
                System.out.print(" ");
                //to calculate the value
                TEMP = TEMP * (i-j)/j;
            }
            System.out.println("");
        }
    }
}
