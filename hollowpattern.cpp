import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int r=in.nextInt();
        int c=in.nextInt();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<c;j++)
            {
                if(i==0 || i==r-1 || j==0 || j==c-1)
                System.out.print(" * ");
                else
                System.out.print("   ");
            }
            System.out.println();
            
        }
    }
}