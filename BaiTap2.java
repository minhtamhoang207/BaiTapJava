import java.util.Scanner;
public class BaiTap2 {
    public static void main(String[] args){
        float a, b, c, h, s, p;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap canh a: " );
        a= sc.nextFloat();
        System.out.print("Nhap canh b: " );
        b= sc.nextFloat();
        System.out.print("Nhap canh c: ");
        c= sc.nextFloat();
        System.out.print("Nhap vao chieu cao h: " );
        h= sc.nextFloat();
        p = a + b + c;
        s = (a*h)/2;
        System.out.println("Dien tich tam giac la: " + p);
        System.out.println("Dien tich hinh thang la: "+ s);


    }

}
