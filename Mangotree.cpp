import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int row=in.nextInt();
        int col=in.nextInt();
        int tree=in.nextInt();
        if((tree>=1 && tree<=col)||tree%col==1||tree%4==0)
        System.out.print("Mango tree");
        else
        System.out.print("Apple tree");
    }
}