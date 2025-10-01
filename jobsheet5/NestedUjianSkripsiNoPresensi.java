package jobsheet5;

import java.util.Scanner;

public class NestedUjianSkripsiNoPresensi {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String pesan;
        System.out.print("Apakah Mahasiswa Sudah Bebas Dari Kompen (Ya/Tidak) : ");
        String bebasKompen = sc.nextLine().trim();

        System.out.print("Masukkan Jumlah Log Bimbingan Pembimbing 1: ");
        int bimbinganP1 = sc.nextInt();
        System.out.print("Masukkan Jumlah Log Bimbingan Pembimbing 2: ");
        int bimbinganP2 = sc.nextInt();

        if (bebasKompen.equalsIgnoreCase("Ya")) {
            if (bimbinganP1 >= 8 && bimbinganP2 >= 4) {
                pesan = "Semua Syarat Terpenuhi. Mahasiswa boleh mendaftar ujian skripsi";
            } else if (bimbinganP1 < 8 && bimbinganP2 < 4) {
                pesan = "Gagal! Log Bimbingan P1 belum mencapai 8 kali";
            } else {
                pesan = "Gagal! Log bimbingan P2 belum mencapai 4 kali";
            }
        } else {
            pesan = "Gagal! Mahasiswa Masih Memiliki Tanggungan Kompen";
        }
        System.out.println(pesan);
    }


}
