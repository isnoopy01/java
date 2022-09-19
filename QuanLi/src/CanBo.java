public class CanBo {

    private String hoTen;
    private int namSinh;
    private boolean gioiTinh;
    private String diaChi;

    public CanBo() {
    }

    public CanBo(String hoTen, int namSinh, boolean gioiTinh, String diaChi) {
        this.hoTen = hoTen;
        this.namSinh = namSinh;
        this.gioiTinh = gioiTinh;
        this.diaChi = diaChi;
    }

    public String getHoTen() {
        return hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public String isGioiTinh() {
        if(gioiTinh==true)
            return "Nam";
        return "Nu";
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    @Override
    public String toString() {
        return "CanBo{" + "hoTen=" + hoTen + ", namSinh=" + namSinh + ", gioiTinh=" + this.isGioiTinh() + ", diaChi=" + diaChi + '}';
    }
}
