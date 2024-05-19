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
public class Main {
    public static void main(String[] args) {
        
        Member member1 = new Member("M001", "Agnes Monica");

        member1.tambahTransaksi(23000);
        System.out.println(member1);
        
        Hadiah boneka = new Hadiah("Boneka", 10000);
        Hadiah mainan = new Hadiah("Mainan", 7000);
        Hadiah mieInstant = new Hadiah("Mie instant", 5000);
        Hadiah biskuit = new Hadiah("Biskuit", 4000);

        member1.tukarPoint(biskuit);
        System.out.println(member1);

        member1.tambahTransaksi(800000000);
        System.out.println(member1);

        member1.tukarPoint(mieInstant);
        System.out.println(member1);
    }
}