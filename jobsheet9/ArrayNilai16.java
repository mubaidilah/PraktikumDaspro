package jobsheet9;

public class ArrayNilai16 {
    public static void main(String[] args) {
        int[] nilaiakhir = new int[10];
        for (int i = 0; i < 10; i++){
            System.out.println("Masukkan Nilai Akhir Ke-"+i+" : ");
            nilaiakhir[i] = sc.nextInt();
            }
            for (int i = 0; i < 10; i++){
                System.out.println("Nilai Akhir ke-"+i+" adalah "+nilaiakhir[i]);

            }
        
    }
}
