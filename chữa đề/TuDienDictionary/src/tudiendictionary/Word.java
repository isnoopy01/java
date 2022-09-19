/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tudiendictionary;

import static tudiendictionary.TuDienDictionary.count;

/**
 *
 * @author Bùi Minh Toàn
 */
public class Word {
    
    private int id;
    private String en;
    private String vn;

    public Word(String en, String vn) {
        this.id = count++;
        this.en = en;
        this.vn = vn;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEn() {
        return en;
    }

    public void setEn(String en) {
        this.en = en;
    }

    public String getVn() {
        return vn;
    }

    public void setVn(String vn) {
        this.vn = vn;
    }

    @Override
    public String toString() {
        return "Word{" + "id=" + id + ", en=" + en + ", vn=" + vn + '}';
    }
}
