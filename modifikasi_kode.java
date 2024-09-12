import java.util.Scanner;


public class modifikasi_kode {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double nilaikuis, nilaitugas, nilaiuts, nilaiuas, nilaiakhir;

        System.out.println("Masukkan nkuis : ");
        nilaikuis = s.nextDouble();
        System.out.println("Masukkan tugas : ");
        nilaitugas = s.nextDouble();
        System.out.println("Masukkan nuts  : ");
        nilaiuts = s.nextDouble();
        System.out.println("Masukkan nuas : ");
        nilaiuas = s.nextDouble();

        nilaiakhir = (nilaikuis*20/100 + nilaitugas*15/100 + nilaiuts*30/100 + nilaiuas*35/100);
        System.out.println("Nilai Akhir : " + nilaiakhir);
    }
}