/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tinhtoanphanso;

/**
 *
 * @author Bùi Minh Toàn
 */
public class PhanSo {
    private int tuSo;
    private int mauSo;

    public PhanSo() {
    }

    public PhanSo(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        this.mauSo = mauSo;
    }
    
    public boolean laToiGian(){
        return TinhToan.UCLN(tuSo, mauSo)!=1;
    }
    
    public void toiGian(){
        int ucln = TinhToan.UCLN(tuSo, mauSo);
        tuSo /= ucln;
        mauSo /= ucln;
    }
    
    public void cong (PhanSo a)
    {
        this.tuSo = this.tuSo * a.mauSo + a.tuSo * this.mauSo;
        this.mauSo = this.mauSo * a.mauSo;
        this.toiGian();
    }
    
    public void tru (PhanSo a)
    {
        this.tuSo = this.tuSo * a.mauSo - a.tuSo * this.mauSo;
        this.mauSo = this.mauSo * a.mauSo;
        this.toiGian();
    }
    
    public void nhan (PhanSo a)
    {
        this.tuSo = this.tuSo * a.tuSo;
        this.mauSo = this.mauSo * a.mauSo;
        this.toiGian();
    }
    
    public void chia (PhanSo a)
    {
        this.nhan(new PhanSo (a.mauSo,a.tuSo));
    }

    @Override
    public String toString() {
        if (this.tuSo ==0)
            return "0";
        if (this.mauSo==0)
            return "Khong phai phan so";
        if (this.mauSo==1)
            return this.tuSo+"";
        return this.tuSo+"/"+this.mauSo;
    }
    
    
    
}
