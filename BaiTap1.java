import java.util.Scanner;
public class BaiTap1 {
    public static void main(String[] args){
        float a, b, h, s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap day a: " );
        a= sc.nextFloat();
        System.out.println("Nhap day b: " );
        b= sc.nextFloat();
        System.out.println("Nhap vao chieu cao h: " );
        h= sc.nextFloat();
        s = h * ((a+b)/2);
        System.out.println("Dien tich hinh thang la: "+ s);


    }

}
