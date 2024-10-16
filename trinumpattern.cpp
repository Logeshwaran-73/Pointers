import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int r=in.nextInt();
        int count=1;
        for(int i=1;i<r;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(count);
                count++;
            }
            System.out.println();
        }
        
    }
}