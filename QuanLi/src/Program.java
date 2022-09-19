import java.util.ArrayList;
import java.util.Scanner;

public class Program {

    public static void menu(){
        System.out.println("1. Them 1 cong nhan");
        System.out.println("2. Them 1 ky su");
        System.out.println("3. Them 1 nhan vien");
        System.out.println("4. Hien thi danh sach can bo");
        System.out.println("5. Tim kiem can bo");
        System.out.print("Chon: ");
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        ArrayList<CanBo> arrList = new ArrayList();
        while(true) {
            menu();
            int select = input.nextInt();

            switch (select) {
                case 1:
                    arrList.add(QLCB.CreateWorker());
                    break;

                case 2:
                    arrList.add(QLCB.CreateEngineer());
                    break;

                case 3:
                    arrList.add(QLCB.CreateStaff());
                    break;

                case 4:
                    QLCB.DisplayAll(arrList);
                    break;

                case 5:
                    System.out.println("Nhap ho ten can tim: ");
                    input.nextLine();
                    String hoTen = input.nextLine();
                    QLCB.SearchAnEmployee(arrList, hoTen);
                    break;

                case 6:
                    return;

                default:
                    System.out.println("Ban da nhap sai, vui long chon lai!");
                    System.out.println();
                    break;
            }
        }
    }
}
