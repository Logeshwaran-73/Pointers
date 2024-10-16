import java.util.*;
class main {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
         int r = sc.nextInt();
         int count=1;
         for(int i=1;i<=r;i++)
         {
             for(int k=1;k<=r-i;k++)
             {
                 System.out.print(" ");
             }
             for(int j=1;j<=r;j++)
             {
                 System.out.print("*");
             }
             System.out.println();
         }
    }
}