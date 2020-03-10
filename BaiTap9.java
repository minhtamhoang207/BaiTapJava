import java.util.Scanner;

public class BaiTap9 {
    public static void main(String[] args){
        int a , b , c;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        int max= a;
        if (a < b)
        max = (b>c)? b:c;
        System.out.println("So lon nhat la: "+ max);
    }
}
