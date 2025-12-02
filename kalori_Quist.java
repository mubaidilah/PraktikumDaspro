import java.util.Scanner;

public class kalori_Quist {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // --- Input data atlet ---
        System.out.print("Masukkan berat badan (kg): ");
        double berat = input.nextDouble();

        System.out.print("Masukkan target kalori harian: ");
        double targetKalori = input.nextDouble();

        // Input data setiap aktivitas 
        // Lari
        System.out.print("Durasi lari (menit): ");
        double durasiLari = input.nextDouble();
        System.out.print("Kecepatan rata-rata lari (km/jam): ");
        double kecepatanLari = input.nextDouble();
        System.out.print("Ketinggian lari (meter): ");
        double tinggiLari = input.nextDouble();

        // Renang
        System.out.print("Durasi renang (menit): ");
        double durasiRenang = input.nextDouble();
        System.out.print("Kecepatan rata-rata renang (km/jam): ");
        double kecepatanRenang = input.nextDouble();
        System.out.print("Ketinggian renang (meter): ");
        double tinggiRenang = input.nextDouble();

        // Bersepeda
        System.out.print("Durasi bersepeda (menit): ");
        double durasiSepeda = input.nextDouble();
        System.out.print("Kecepatan rata-rata bersepeda (km/jam): ");
        double kecepatanSepeda = input.nextDouble();
        System.out.print("Ketinggian bersepeda (meter): ");
        double tinggiSepeda = input.nextDouble();

        //  Koefisien setiap aktivitas 
        double coefLari = 0.05;
        double coefRenang = 0.04;
        double coefSepeda = 0.03;

        //  Perhitungan kalori untuk tiap aktivitas 
        double kaloriLari = coefLari * durasiLari * berat * (kecepatanLari * 0.5) * (tinggiLari * 0.01);
        double kaloriRenang = coefRenang * durasiRenang * berat * (kecepatanRenang * 0.5) * (tinggiRenang * 0.01);
        double kaloriSepeda = coefSepeda * durasiSepeda * berat * (kecepatanSepeda * 0.5) * (tinggiSepeda * 0.01);

        //  Total & rata-rata 
        double totalKalori = kaloriLari + kaloriRenang + kaloriSepeda;
        double totalDurasi = durasiLari + durasiRenang + durasiSepeda;
        double rataKaloriPerMenit = totalKalori / totalDurasi;

        //  Persentase target 
        double persenTarget = (totalKalori / targetKalori) * 100;

        //  Output hasil 
        System.out.println("\n    HASIL PERHITUNGAN    ");
        System.out.println("Kalori terbakar saat lari     : " + kaloriLari);
        System.out.println("Kalori terbakar saat renang   : " + kaloriRenang);
        System.out.println("Kalori terbakar saat bersepeda: " + kaloriSepeda);
        System.out.println("---------------------------------");
        System.out.println("Total kalori terbakar         : " + totalKalori);
        System.out.println("Rata-rata kalori per menit    : " + rataKaloriPerMenit);
        System.out.println("Pencapaian target harian      : " + persenTarget + " %");

        input.close();

 }
}