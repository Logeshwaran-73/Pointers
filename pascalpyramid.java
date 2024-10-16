import java.util.*;
public class Main {
    static int fact(int n){
        if(n==1 || n==0){
            return 1;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row = 5;
        for(int i=0;i<row;i++){
            for(int k=0;k<row-i;k++){
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                int ans = fact(i)/(fact(i-j)*fact(j));
                System.out.print(ans);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}