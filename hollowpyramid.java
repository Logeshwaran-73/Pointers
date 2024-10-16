// Online Java Compiler
// Use this editor to write, compile and run your Java code online

class HelloWorld {
    public static void main(String[] args) {
        int row=4;
        for(int i=1;i<=row;i++)
       {
           for(int j=1;j<=row-i;j++)
           {
               System.out.print(" ");
           }
           for(int j=1;j<=(2*i)-1;j++)
           {   
               if(i==row||j==(2*i)-1|| j==1)
               System.out.print("*");
               else
               System.out.print(" ");
               
           }
           for(int j=1;j<=row-i;j++)
           {
               System.out.print(" ");
           }
           System.out.println();
       }
    }
}