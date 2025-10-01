//Tugas1Jobsheet5.java
//MUHAMMAD DEIZAN NAFI' FAKHRI /1E/16/SISTEM INFORMASI BISNIS

import java.util.Scanner;

    public class Tugas1Jobsheet5 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("--- Cetak KRS SIAKAD ---");
        System.out.print("Apakah UKT sudah lunas? (ya/tidak): ");
        boolean uktLunas = input.nextBoolean();

        String Hasil = uktLunas ? "Pembayaran UKT terverifikasi? Silakan cetak KRS dan minta tanda tangan DPA" : "Registrasi ditolak. Silakan lunasi UKT terlebih dahulu.";
        System.out.println(Hasil);


    }
    }
