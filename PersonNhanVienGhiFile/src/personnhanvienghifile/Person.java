/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package personnhanvienghifile;

/**
 *
 * @author Bùi Minh Toàn
 */
public class Person {
    private String hoTen;
    private String ngaySinh;
    private String diaChi;
    private boolean nam;

    public Person() {
    }

    public Person(String hoTen, String ngaySinh, String diaChi, boolean nam) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.nam = nam;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public boolean isNam() {
        return nam;
    }

    public void setNam(boolean nam) {
        this.nam = nam;
    }

    @Override
    public String toString() {
        return "Person{" + "hoTen=" + hoTen + ", ngaySinh=" + ngaySinh + ", diaChi=" + diaChi + ", nam=" + nam + '}';
    }
    
    
}
