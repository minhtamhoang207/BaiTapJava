import java.util.Scanner;

public class BaiTap4_1 {
    public static int UCLN(int a, int b){
        return a == 0 ? b: UCLN(b%a, a);

    }
    public static void main(String[] args){
        int a, b, c, d, ucln1, ucln2;
        Scanner sc = new Scanner(System.in);
        a =sc.nextInt();
        b =sc.nextInt();
        c =sc.nextInt();
        d =sc.nextInt();
        ucln1=UCLN(a,b);
        ucln2=UCLN(c,d);
        System.out.println("UCLN la: " + UCLN(ucln1,ucln2));
    }
}
