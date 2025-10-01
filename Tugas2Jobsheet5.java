// Tugas2Jobsheet5.java
//MUHAMMAD DEIZAN NAFI' FAKHRI /1E/16/SISTEM INFORMASI BISNIS


import java.util.Scanner;  

public class Tugas2Jobsheet5 {
    public static void main(String[] args) {
        int angka;

        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        angka = input.nextInt();

        if (angka % 2 == 0) {
            System.out.println(angka + " adalah bilangan genap.");
        } else {
            System.out.println(angka + " adalah bilangan ganjil.");


        }
    }
}