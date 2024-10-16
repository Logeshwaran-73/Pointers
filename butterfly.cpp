import java.util.*;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int row = in.nextInt();
        for(int i=1;i<=row;i++){
            for(int h=1;h<=i;h++){
                System.out.print("*");
            }
            for(int k=1;k<=2*(row-i);k++)
            {
                System.out.print(" ");
            }
            for(int j=1;j<=i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=row;i>=1;i--){
            for(int h=1;h<=i;h++){
                System.out.print("*");
            }
            for(int k=1;k<=2*(row-i);k++)
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
}