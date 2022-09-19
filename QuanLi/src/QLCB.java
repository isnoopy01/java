import java.util.*;
public class QLCB {

    public static CongNhan CreateWorker(){
        Scanner input = new Scanner (System.in);
        System.out.print("Nhap bac cua cong nhan: ");
        int bac = input.nextInt();
        if(bac > 7) {
            do {
                System.out.println("Nhap bac nho hon hoac bang 7!!!");
                bac = input.nextInt();
            } while (bac > 7);
        }
        System.out.print("Nhap ho ten cong nhan: ");
        input.nextLine();
        String hoTen = input.nextLine();
        System.out.print("Nhap nam sinh: ");
        int namSinh = input.nextInt();
        System.out.print("Nhap gioi tinh(true/false): ");
        boolean gioiTinh = input.nextBoolean();
        System.out.print("Nhap dia chi: ");
        input.nextLine();
        String diaChi = input.nextLine();
        CongNhan worker = new CongNhan(bac,hoTen,namSinh,gioiTinh,diaChi);
        return worker;
    }

    public static KySu CreateEngineer(){
        Scanner input = new Scanner (System.in);
        System.out.print("Nhap nganh dao tao cua ky su: ");
        String nganhDaoTao = input.nextLine();
        System.out.print("Nhap ho ten ky su: ");
        String hoTen = input.nextLine();
        System.out.print("Nhap nam sinh: ");
        int namSinh = input.nextInt();
        System.out.print("Nhap gioi tinh(true/false): ");
        boolean gioiTinh = input.nextBoolean();
        System.out.print("Nhap dia chi: ");
        input.nextLine();
        String diaChi = input.nextLine();
        KySu engineer = new KySu(hoTen,namSinh,gioiTinh,diaChi,nganhDaoTao);
        return engineer;
    }

    public static NhanVien CreateStaff(){
        Scanner input = new Scanner (System.in);
        System.out.print("Nhap cong viec cua nhan vien: ");
        String congViec = input.nextLine();
        System.out.print("Nhap ho ten nhan vien: ");
        String hoTen = input.nextLine();
        System.out.print("Nhap nam sinh: ");
        int namSinh = input.nextInt();
        System.out.print("Nhap gioi tinh(true/false): ");
        boolean gioiTinh = input.nextBoolean();
        System.out.print("Nhap dia chi: ");
        input.nextLine();
        String diaChi = input.nextLine();
        NhanVien staff = new NhanVien(congViec,hoTen,namSinh,gioiTinh,diaChi);
        return staff;
    }

    public static void SearchAnEmployee(ArrayList<CanBo> arrList, String hoten){
        for (int i = 0; i < arrList.size(); i++){
            if(arrList.get(i).getHoTen().compareTo(hoten)==0){
                System.out.println(arrList.get(i).toString());
            }
        }
    }

    public static void DisplayAll(ArrayList<CanBo> arrList){
        for (CanBo n: arrList) {
            System.out.println(n.toString());
        }
    }
}
