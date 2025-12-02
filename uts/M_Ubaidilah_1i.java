package uts;
import java.util.Scanner;

public class M_Ubaidilah_1i {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        //  input pengguna cafe 
        System.out.print("Masukkan waktu (pagi/sore/malam): ");
        String waktu = input.nextLine().toLowerCase();

        System.out.print("Masukkan suhu minuman (panas/dingin): ");
        String suhu = input.nextLine().toLowerCase();
        
        System.out.println("\n memakai seperti itu aja"); // Baris tambahan sesuai permintaan

        // Variabel untuk hasil 
        int hargaDasar = 0;
        double diskonPersen = 0.0;

        //  Logika Validasi, Harga Dasar, dan Diskon menggunakan If-Else 

        //  Validasi Input
        boolean waktuValid = waktu.equals("pagi") || waktu.equals("sore") || waktu.equals("malam");
        boolean suhuValid = suhu.equals("panas") || suhu.equals("dingin");

        if (!waktuValid || !suhuValid) {
            System.out.println("Input tidak valid! Waktu = (pagi/sore/malam) dan suhu = (panas/dingin).");
            return;
        }

        //  Menentukan Harga Dasar
        // Pagi
        if (waktu.equals("pagi") && suhu.equals("panas")) {
            hargaDasar = 15000;
        } else if (waktu.equals("pagi") && suhu.equals("dingin")) {
            hargaDasar = 18000;
        }
        // sore
        else if (waktu.equals("sore") && suhu.equals("panas")) {
            hargaDasar = 20000;
        } else if (waktu.equals("sore") && suhu.equals("dingin")) {
            hargaDasar = 22000;
        }
        // Malam
        else if (waktu.equals("malam") && suhu.equals("panas")) {
            hargaDasar = 17000;
        } else if (waktu.equals("malam") && suhu.equals("dingin")) {
            hargaDasar = 19000;
        }

        //  Menentukan Diskon
        if (waktu.equals("pagi") && suhu.equals("panas")) {
            diskonPersen = 0.10; // 10% pagi panas
        } else if (waktu.equals("sore")) {
            diskonPersen = 0.05; // 5% semua sore
        } else if (waktu.equals("malam") && suhu.equals("dingin")) {
            diskonPersen = 0.15; // 15% malam dingin
        }
        // else diskonPersen tetap 0.0

        //  menghitung total bayar 
        double jumlahDiskon = hargaDasar * diskonPersen;
        int totalBayar = (int) Math.round(hargaDasar - jumlahDiskon);

        //  menampilkan hasil 
        System.out.println("\nHarga dasar: Rp" + hargaDasar);
        System.out.println("Diskon: " + (int)(diskonPersen * 100) + "%");
        System.out.println("Total bayar: Rp" + totalBayar);

        input.close();
    }
}