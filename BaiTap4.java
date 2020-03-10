import java.util.Scanner;

public class BaiTap4 {
    public static int UCLN(int a, int b){
        return a == 0 ? b: UCLN(b%a, a);

    }
    public static void main(String[] args){
        int a, b;
        Scanner sc = new Scanner(System.in);
        a =sc.nextInt();
        b =sc.nextInt();
        int c= UCLN(a,b);
        System.out.println("UCLN la: " + c);
    }
}
