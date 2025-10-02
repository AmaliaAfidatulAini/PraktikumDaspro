package jobsheet5;

import java.util.Scanner;

public class IfCetakKRSNoPresensi {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Cetak KRS Siakad ---");
        System.out.print("Apakah UKT sudah lunas? (true/false): ");
        
        boolean uktLunas = sc.nextBoolean();

        // Versi IF-ELSE
        if (uktLunas) {
            System.out.println("Pembayaran UKT Terverifikasi");
            System.out.println("Silakan Cetak KRS dan Minta Tanda tangan DPA");
        } else {
            System.out.println("Registrasi ditolak. Silakan lunasi UKT terlebih dahulu!");
        }

        // Versi Ternary Operator
        String pesan = uktLunas
                ? "Pembayaran UKT Terverifikasi\nSilakan Cetak KRS dan Minta Tanda tangan DPA"
                : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu!";

        System.out.println("--- Versi Ternary ---");
        System.out.println(pesan);

        sc.close();
    }
}
