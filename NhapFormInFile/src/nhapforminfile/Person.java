/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nhapforminfile;

/**
 *
 * @author Bùi Minh Toàn
 */
public class Person {
    private String hoTen;
    private String ngaySinh;
    private String diaChi;
    private boolean gioiTinh;

    public Person() {
    }

    public Person(String hoTen, String ngaySinh, String diaChi, boolean gioiTinh) {
        this.hoTen = hoTen;
        this.ngaySinh = ngaySinh;
        this.diaChi = diaChi;
        this.gioiTinh = gioiTinh;
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

    public boolean isGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(boolean gioiTinh) {
        this.gioiTinh = gioiTinh;
    }
    
    public String getGioiTinh()
    {
        return gioiTinh?"Nam":"Nu";
    }

    @Override
    public String toString() {
        return hoTen + "$" + ngaySinh + "$" + diaChi + "$" + getGioiTinh();
    }
    
    
}
