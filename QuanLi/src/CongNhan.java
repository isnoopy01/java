public class CongNhan extends CanBo{
    private int bac;

    public CongNhan() {
    }

    public CongNhan(int bac, String hoTen, int namSinh, boolean gioiTinh, String diaChi) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.bac = bac;
    }

    public int getBac() {
        return bac;
    }

    public void setBac(int bac) {
        this.bac = bac;
    }

    @Override
    public String toString() {
        return super.toString() + "CongNhan{" + "bac=" + bac + '}';
    }
}