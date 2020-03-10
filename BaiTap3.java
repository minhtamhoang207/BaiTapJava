import java.util.Scanner;
public class BaiTap3 {
    public static void main(String[] args){
        float pi = 3.14f;
        float r , c, s;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhao vao ban kinh: ");
        r = sc.nextFloat();
        c= r * 2 * pi;
        s= r*r * pi;
        System.out.println("Chu vi hinh tron la: "+ c);
        System.out.println("Dien tich hinh tron la: "+ s);




    }

}
