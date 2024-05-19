/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No3;

import java.util.Scanner;
/**
 *
 * @author lenovo
 */
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan jumlah data yang akan dimasukkan: ");
        int jumlahData = scanner.nextInt();
        scanner.nextLine();

        Mahasiswa[] mahasiswaArray = new Mahasiswa[jumlahData];

        for (int i = 0; i < jumlahData; i++) {
            System.out.println("Masukkan data mahasiswa ke-" + (i + 1));

            System.out.print("NIM: ");
            String nim = scanner.nextLine();

            String nama;
            while (true) {
                System.out.print("Nama (3-20 karakter): ");
                nama = scanner.nextLine();
                if (nama.length() >= 3 && nama.length() <= 20) {
                    break;
                } else {
                    System.out.println("Nama harus antara 3 hingga 20 karakter.");
                }
            }

            int nilai;
            while (true) {
                System.out.print("Nilai (0-100): ");
                nilai = scanner.nextInt();
                if (nilai >= 0 && nilai <= 100) {
                    scanner.nextLine();
                    break;
                } else {
                    System.out.println("Nilai harus antara 0 hingga 100.");
                }
            }

            mahasiswaArray[i] = new Mahasiswa(nim, nama, nilai);
        }

        Mahasiswa mahasiswaNilaiTertinggi = mahasiswaArray[0];
        for (Mahasiswa mahasiswa : mahasiswaArray) {
            if (mahasiswa.getNilai() > mahasiswaNilaiTertinggi.getNilai()) {
                mahasiswaNilaiTertinggi = mahasiswa;
            }
        }

        System.out.println("Mahasiswa dengan nilai tertinggi:");
        System.out.println("NIM: " + mahasiswaNilaiTertinggi.getNim());
        System.out.println("Nama: " + mahasiswaNilaiTertinggi.getNama());
        System.out.println("Nilai: " + mahasiswaNilaiTertinggi.getNilai());
        
        scanner.close();
    }
}