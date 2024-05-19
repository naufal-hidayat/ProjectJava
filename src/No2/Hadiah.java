/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No2;

/**
 *
 * @author lenovo
 */
public class Hadiah {
    private String namaHadiah;
    private int pointDibutuhkan;

    public Hadiah(String namaHadiah, int pointDibutuhkan) {
        this.namaHadiah = namaHadiah;
        this.pointDibutuhkan = pointDibutuhkan;
    }

    public String getNamaHadiah() {
        return namaHadiah;
    }

    public int getPointDibutuhkan() {
        return pointDibutuhkan;
    }
}