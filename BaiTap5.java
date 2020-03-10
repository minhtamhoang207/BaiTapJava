import java.util.Scanner;

public class BaiTap5 {
    public static int fi(int n){
        if (n==1 || n==2) return 1;
        return fi(n-1)+ fi (n-2);
    }

    public static void main(String[] args){
        int n ;
        Scanner sc= new Scanner(System.in);
        n =sc.nextInt();
        System.out.println("So fibonacci thu "  + n + " la "  + fi(n));
    }
}
