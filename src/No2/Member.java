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
public class Member {
    private String kodeMember;
    private String namaMember;
    private int point;

    public Member(String kodeMember, String namaMember) {
        this.kodeMember = kodeMember;
        this.namaMember = namaMember;
        this.point = 0;
    }

    public void tambahTransaksi(int jumlahRupiah) {
        int pointBaru = jumlahRupiah / 10000;
        this.point += pointBaru;
        System.out.println("Transaksi berhasil! Point bertambah: " + pointBaru);
    }

    public void tukarPoint(Hadiah hadiah) {
        if (this.point >= hadiah.getPointDibutuhkan()) {
            this.point -= hadiah.getPointDibutuhkan();
            System.out.println("Penukaran berhasil! Anda mendapatkan " + hadiah.getNamaHadiah());
        } else {
            System.out.println("Point tidak cukup untuk menukar hadiah ini.");
        }
    }

    
    public String toString() {
        return "Member [kodeMember=" + kodeMember + ", namaMember=" + namaMember + ", point=" + point + "]";
    }
}