package jobsheet6;
import java.util.Scanner;

public class Jobsheet6Kelulusan {

    // Fungsi untuk mengkonversi Nilai Akhir menjadi Nilai Huruf dan Status Kelulusan MK
    public static String[] konversiGradeDanStatus(double nilaiAkhir) {
        String nilaiHuruf;
        String statusMK;

        // 1. Penentuan Nilai Huruf (Grade)
        if (nilaiAkhir > 80 && nilaiAkhir <= 100) {
            nilaiHuruf = "A"; // 80 < N <= 100 
        } else if (nilaiAkhir > 73 && nilaiAkhir <= 80) {
            nilaiHuruf = "B+"; // 73 < N <= 80 
        } else if (nilaiAkhir > 65 && nilaiAkhir <= 73) {
            nilaiHuruf = "B"; // 65 < N <= 73 
        } else if (nilaiAkhir > 60 && nilaiAkhir <= 65) {
            nilaiHuruf = "C+"; // 60 < N <= 65 
        } else if (nilaiAkhir > 50 && nilaiAkhir <= 60) {
            nilaiHuruf = "C"; // 50 < N <= 60 
        } else if (nilaiAkhir > 39 && nilaiAkhir <= 50) {
            nilaiHuruf = "D"; // 39 < N <= 50 
        } else { // N <= 39
            nilaiHuruf = "E"; // N <= 39 
        }

        // 2. Penentuan Status Kelulusan Mata Kuliah
        if (nilaiAkhir >= 60) {
            statusMK = "LULUS"; // Nilai akhir >= 60 
        } else {
            statusMK = "TIDAK LULUS"; // Nilai akhir < 60 [cite: 25]
        }

        return new String[]{nilaiHuruf, statusMK};
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Konstanta Mata Kuliah
        final String MK1_NAMA = "Algoritma dan Pemrograman"; // Nama MK 1 [cite: 17]
        final String MK2_NAMA = "Struktur Data"; // Nama MK 2 [cite: 18]

        // --- INPUT DATA MAHASISWA ---
        System.out.println("==============================================");
        System.out.println("SISTEM PENENTUAN KELULUSAN AKADEMIK");
        System.out.println("==============================================");
        System.out.println("INPUT DATA MAHASISWA");
        System.out.print("Nama: ");
        String nama = input.nextLine();
        System.out.print("NIM: ");
        String nim = input.nextLine();

        // --- INPUT NILAI MK 1 ---
        System.out.println("\n--- Nilai Mata Kuliah 1: " + MK1_NAMA + " ---");
        System.out.print("Nilai UTS (30%): ");
        double uts1 = input.nextDouble();
        System.out.print("Nilai UAS (40%): ");
        double uas1 = input.nextDouble();
        System.out.print("Nilai Tugas (30%): ");
        double tugas1 = input.nextDouble();

        // --- INPUT NILAI MK 2 ---
        System.out.println("\n--- Nilai Mata Kuliah 2: " + MK2_NAMA + " ---");
        System.out.print("Nilai UTS (30%): ");
        double uts2 = input.nextDouble();
        System.out.print("Nilai UAS (40%): ");
        double uas2 = input.nextDouble();
        System.out.print("Nilai Tugas (30%): ");
        double tugas2 = input.nextDouble();

        // --- PROSES PERHITUNGAN NILAI AKHIR (NA) ---
        // Formula: NA = (UTS * 0.3) + (UAS * 0.4) + (Tugas * 0.3) 
        double na1 = (uts1 * 0.30) + (uas1 * 0.40) + (tugas1 * 0.30);
        double na2 = (uts2 * 0.30) + (uas2 * 0.40) + (tugas2 * 0.30);

        // Pembulatan 2 desimal
        na1 = Math.round(na1 * 100.0) / 100.0;
        na2 = Math.round(na2 * 100.0) / 100.0;
        
        // Konversi Grade dan Status MK
        String[] hasil1 = konversiGradeDanStatus(na1);
        String huruf1 = hasil1[0];
        String status1 = hasil1[1];

        String[] hasil2 = konversiGradeDanStatus(na2);
        String huruf2 = hasil2[0];
        String status2 = hasil2[1];

        // Hitung Rata-rata Nilai Akhir
        double rataRataNA = (na1 + na2) / 2.0;
        rataRataNA = Math.round(rataRataNA * 100.0) / 100.0;

        // --- PROSES PENENTUAN STATUS SEMESTER (NESTED IF) ---
        String statusSemester;
        String keteranganSemester;

        // KONDISI UTAMA: Cek apakah kedua mata kuliah LULUS 
        if (status1.equals("LULUS") && status2.equals("LULUS")) {
            // NESTED IF: Cek rata-rata nilai akhir
            if (rataRataNA >= 70) {
                statusSemester = "LULUS"; // Rata-rata >= 70 [cite: 37]
                keteranganSemester = "(Rata-rata >= 70)";
            } else {
                statusSemester = "TIDAK LULUS"; // Rata-rata < 70 [cite: 38]
                keteranganSemester = "(Rata-rata < 70)";
            }
        } else {
            // KONDISI ELSE: Jika salah satu atau kedua MK TIDAK LULUS [cite: 39, 40, 41, 42]
            statusSemester = "TIDAK LULUS";
            keteranganSemester = "";
        }

        // --- TAMPILAN HASIL PENILAIAN AKADEMIK ---
        System.out.println("\n==============================================");
        System.out.println("HASIL PENILAIAN AKADEMIK");
        System.out.println("==============================================");
        System.out.printf("Nama: %s\n", nama);
        System.out.printf("NIM : %s\n", nim);
        System.out.println("----------------------------------------------------------------------");
        System.out.printf("%-25s%5s%5s%7s%8s%7s%10s\n", 
                          "Mata Kuliah", "UTS", "UAS", "Tugas", "NA", "Huruf", "Status");
        System.out.println("----------------------------------------------------------------------");
        
        // Output MK 1
        System.out.printf("%-25s%5.0f%5.0f%7.0f%8.2f%7s%10s\n", 
                          MK1_NAMA, uts1, uas1, tugas1, na1, huruf1, status1);
        // Output MK 2
        System.out.printf("%-25s%5.0f%5.0f%7.0f%8.2f%7s%10s\n", 
                          MK2_NAMA, uts2, uas2, tugas2, na2, huruf2, status2);
        System.out.println("----------------------------------------------------------------------");

        // Output Rata-rata dan Status Semester
        System.out.printf("\nRata-rata Nilai Akhir: %.2f\n", rataRataNA); // Contoh Output [cite: 60]
        System.out.printf("Status Semester      : %s %s\n", statusSemester, keteranganSemester); // Contoh Output [cite: 61, 62]
        System.out.println("==============================================");

        input.close();
    }
}