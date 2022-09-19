public class NhanVien extends CanBo{
    private String congViec;

    public NhanVien() {
    }

    public NhanVien(String congViec, String hoTen, int namSinh, boolean gioiTinh, String diaChi) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.congViec = congViec;
    }

    @Override
    public String toString() {
        return super.toString() + "NhanVien{" + "congViec=" + congViec + '}';
    }
}