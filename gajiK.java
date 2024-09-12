import java.util.Scanner;

public class gajiK {
    public static void main(String[] args) {
        int jamkerja, upahpjam;
        double pbonus = 0.1, ppajak = 0.05, totalgaji;

        Scanner s = new Scanner(System.in);
        jamkerja = s.nextInt();
        upahpjam = s.nextInt();



        totalgaji = jamkerja*upahpjam;
        double bonus = pbonus*totalgaji;
        double pajak = ppajak*(totalgaji+bonus);
        double gajib = (totalgaji+bonus)-pajak;



        System.out.println("total gaji = " + totalgaji);
        System.out.println("bonus = " + bonus);
        System.out.println("Pajak = " + pajak);
        System.out.println("gaji bersih = " + gajib);
    }
}
