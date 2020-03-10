import java.util.Scanner;

public class BaiTap8 {
    public static int hoVaTen(){
        String a;
        Scanner sc = new Scanner(System.in);
        a = sc.nextLine();
        System.out.println("Ho va ten la: "+ a);
        return 0;
    }
    public static int maSV(){
        String b;
        Scanner sc = new Scanner(System.in);
        b = sc.nextLine();
        System.out.println("Ma SV la: "+ b);
        return 0;
    }
    public static void main(String[] args){
        hoVaTen();
        maSV();
    }

}
