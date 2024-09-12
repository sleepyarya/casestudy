import java.util.Scanner;

public class siakad3{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        String nama, nim;
        String kelas;
        byte absen;
        double nilaikuis, nilaitugas, nilaiujian, nilaiakhir;

        //memasukkan data mahasiswa

        System.out.print("Masukkan Nama : ");
        nama = s.nextLine();
        System.out.print("Masukkan NIM : ");
        nim = s.nextLine();
        System.out.print("Masukkan Kelas : ");
        kelas = s.nextLine();
        System.out.print("Masukkan Nomor Absen : ");
        absen = s.nextByte();

        //memasukkan nilai

        System.out.print("Masukkan Nilai Kuis : ");
        nilaikuis = s.nextDouble();
        System.out.print("Masukkan Nilai Tugas : ");
        nilaitugas = s.nextDouble();
        System.out.print("Masukkan Nilai Ujian : ");
        nilaiujian = s.nextDouble();

        //menghitung nilai akhir

        nilaiakhir = (nilaikuis + nilaitugas + nilaiujian) / 3;

        //menampilkan data mahasiswa beserta nilai

        System.out.println("Nama : " + nama + " || NIM : " + nim);
        System.out.println("Kelas : " + kelas + " || Absen : " + absen);
        System.out.println("Nilai Akhir : " + nilaiakhir);




    }
}