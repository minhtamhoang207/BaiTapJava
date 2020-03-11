import java.util.Scanner;

public class BaiTap8_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String ten, diaChi, sdt;
        int tuoi, diemT, diemL, diemH ;
        System.out.print("Ho va ten: ");
        ten= sc.nextLine();
        System.out.print("Dia chi: ");
        diaChi= sc.nextLine();
        System.out.print("Tuoi: ");
        tuoi= Integer.parseInt(sc.nextLine());
        System.out.print("So dien thoai: ");
        sdt= sc.nextLine();
        System.out.print("Diem Toan: ");
        diemT= sc.nextInt();
        System.out.print("Diem Ly: ");
        diemL= sc.nextInt();
        System.out.print("Diem Hoa: ");
        diemH= sc.nextInt();
        System.out.print("\n \n \n \n \n \n");

        System.out.print( ten + "\n" +diaChi+ "\n" +tuoi + "\n" +sdt+ "\n" + diemT+ "\n" +diemL+ "\n" +diemH);

    }

}
