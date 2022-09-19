public class KySu extends CanBo{
    private String nganhDaoTao;

    public KySu() {
    }

    public KySu(String hoTen, int namSinh, boolean gioiTinh, String diaChi, String nganhDaoTao) {
        super(hoTen, namSinh, gioiTinh, diaChi);
        this.nganhDaoTao = nganhDaoTao;
    }

    @Override
    public String toString() {
        return super.toString() + "KySu{" + "nganhDaoTao=" + nganhDaoTao + '}';
    }
}