// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class HelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = sc.nextInt();
        int col = sc.nextInt();
        // pattern(row,col);
        pattern16(row);
    }
    static void pattern(int row,int col)
    {
       for(int i=0;i<row;i++)
       {
           for(int j=0;j<col;j++)
           {
               System.out.print("* ");
           }
           System.out.println();
       }
    }
    static void pattern1(int row)
    {
       for(int i=0;i<row;i++)
       {
           for(int j=0;j<i;j--)
           {
               System.out.print("* ");
           }
           System.out.println();
       }
    }
    static void pattern2(int row,int col)
    {
       for(int i=0;i<row;i++)
       {
           for(int j=0;j<col;j++)
           {   
               if(i==0||j==0||i==row-1||j==col-1)
               System.out.print("*");
               else
               System.out.print(" ");
               
           }
           System.out.println();
       }
    }
    static void pattern3(int row,int col)
    {
       for(int i=1;i<=row;i++)
       {
           for(int j=1;j<=i;j++)
           {   
               System.out.print(j);
               
           }
           System.out.println();
       }
    }
    static void pattern4(int row,int col)
    {
       for(int i=1;i<=row;i++)
       {
           for(int j=1;j<=i;j++)
           {   
               System.out.print(i);
               
           }
           System.out.println();
       }
    }
    static void pattern5(int row)
    {
       for(int i=0;i<row;i++)
       {
           for(int j=row;j>i;j--)
           {
               System.out.print("* ");
           }
           System.out.println();
       }
    }
    static void pattern6(int row)
    {
       for(int i=0;i<row;i++)
       {
           for(int j=row;j>i;j--)
           {
               System.out.print(row-j+1+" ");
           }
           System.out.println();
       }
    }
    static void pattern7(int row)
    {  
        int c1= 1;
        int c2=2;
       for(int i=1;i<=row;i++)
       {
           for(int j=1;j<=i;j++)
           {    if(i%2!=0){
               System.out.print(c1+" ");
               c1+=2;
           }
               else{
               System.out.print(c2+" ");
               c2+=2;
           }}
           System.out.println();
       }
    }
    static void pattern8(int row)
    {
       for(int i=1;i<=row;i++)
       {
           for(int j=1;j<=row-i;j++)
           {
               System.out.print(" ");
           }
           for(int j=1;j<=i;j++)
           {
               System.out.print("*");
           }
           System.out.println();
       }
    }
    
    static void pattern9(int row)
    {
       for(int i=1;i<=row;i++)
       {
           for(int j=1;j<=i;j++)
           {
               System.out.print("*");
           }
           for(int j=1;j<=row*2 - 2*i;j++)
           {
               System.out.print(" ");
           }
           for(int j=1;j<=i;j++)
           {
               System.out.print("*");
           }
           System.out.println();
       }
    }
    static void pattern10(int row)
    {
       for(int i=1;i<=row;i++)
       {
           for(int j=1;j<=i;j++)
           {
               System.out.print("*");
           }
           for(int j=1;j<=row*2 - 2*i;j++)
           {
               System.out.print(" ");
           }
           for(int j=1;j<=i;j++)
           {
               System.out.print("*");
           }
           System.out.println();
       }
       for(int i=row-1;i>=1;i--)
       {
           for(int j=1;j<=i;j++)
           {
               System.out.print("*");
           }
           for(int j=1;j<=row*2 - 2*i;j++)
           {
               System.out.print(" ");
           }
           for(int j=1;j<=i;j++)
           {
               System.out.print("*");
           }
           System.out.println();
       }
    }
    static void pattern11(int row)
    {
       for(int i=1;i<=row;i++)
       {
           for(int j=row/2;j>=1;j--)
           {
               System.out.print(" ");
           }
           for(int j=1;j<=row - (row/2);j++)
           {
               System.out.print("*");
           }
          
           System.out.println();
       }
    }
    static void pattern12(int row)
    {
       for(int i=1;i<=row;i++)
       {
           for(int j=1;j<=row-i;j++)
           {
               System.out.print(" ");
           }
           for(int j=1;j<=row;j++)
           {
               System.out.print("*");
           }
           System.out.println();
       }
    }
    
    static void pattern13(int row)
    {
       for(int i=1;i<=row;i++)
       {
           for(int j=1;j<=row-i;j++)
           {
               System.out.print(" ");
           }
           for(int j=1;j<=row;j++)
           {
               System.out.print("*");
           }
           System.out.println();
       }
    }
    static void pattern14(int row)
    {
       for(int i=1;i<=row;i++)
       {
           for(int j=1;j<=row-i;j++)
           {
               System.out.print(" ");
           }
           for(int j=1;j<=(2*i)-1;j++)
           {
               System.out.print("*");
           }
           for(int j=1;j<=row-i;j++)
           {
               System.out.print(" ");
           }
           System.out.println();
       }
    }
    static void pattern15(int row)
    {
       for(int i=row;i>=1;i--)
       {
           for(int j=1;j<=row-i;j++)
           {
               System.out.print(" ");
           }
           for(int j=1;j<=(2*i)-1;j++)
           {
               System.out.print("*");
           }
           for(int j=1;j<=row-i;j++)
           {
               System.out.print(" ");
           }
           System.out.println();
       }
    }
    static void pattern16(int row)
    {
       for(int i=1;i<=row;i++)
       {
           for(int j=1;j<=row-i;j++)
           {
               System.out.print(" ");
           }
           for(int j=1;j<=(2*i)-1;j++)
           {
               System.out.print("*");
           }
           for(int j=1;j<=row-i;j++)
           {
               System.out.print(" ");
           }
           System.out.println();
       }
       for(int i=row-1;i>=1;i--)
       {
           for(int j=1;j<=row-i;j++)
           {
               System.out.print(" ");
           }
           for(int j=1;j<=(2*i)-1;j++)
           {
               System.out.print("*");
           }
           for(int j=1;j<=row-i;j++)
           {
               System.out.print(" ");
           }
           System.out.println();
       }
    }
    
}