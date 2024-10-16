import java.util.*;
class main
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a=in.nextInt();
        if(a>90 && a<=100)
        System.out.println("Grade O");
        else if(a>80 && a<=90)
        System.out.println("Grade A");
        else if(a>70 && a<=80)
        System.out.println("Grade B");
        else if(a>60 && a<=70)
        System.out.println("Grade c");
        else if(a>50 && a<=60)
        System.out.println("Grade D");
        else if(a<=50&&a<0)
        System.out.println("Grade U");
        else
        System.out.println("Enter the correct marks");
    }
}