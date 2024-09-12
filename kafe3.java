import java.util.Scanner;

public class kafe3{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        boolean anggota;
        int jkopi, jteh, jroti;
        double nominal, hkopi = 12000.0, hteh = 7000.0, hroti = 20000, totalharga;
        float  diskon = 10/100f;

// memasukkan data pembelian

        System.out.println("masukkan keanggotaan (true/false): ");
        anggota = s.nextBoolean();
        System.out.println("Masukkan jumlah pembelian kopi: ");
        jkopi = s.nextInt();
        System.out.println("masukkan jumlah pembelian teh: ");
        jteh = s.nextInt();
        System.out.println("masukkan jumlah pembelian roti: ");
        jroti = s.nextInt();

//menghitung total harga

        totalharga = (jkopi * hkopi) + (jteh * hteh) + (jroti * hroti);

// menghitung nominal bayar

        nominal = totalharga - (diskon * totalharga);

// tampilkan keanggotaan pelanggan

        System.out.println("keanggotaan pelanggan " + anggota);
        System.out.println("item pembelian " + jkopi + " kopi, " + jteh + " teh, " + jroti + " roti ");
        System.out.println("nominal bayar Rp " + nominal);

    }
}