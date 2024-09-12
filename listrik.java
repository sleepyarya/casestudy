import java.util.Scanner;


public class listrik {
    public static void main(String[] args) {
        int penggunaanL, tarif = 1500, totaltagih;
        boolean status;
        
        
        Scanner s = new Scanner(System.in);
        penggunaanL = s.nextInt();


        totaltagih = penggunaanL*tarif;
        status = penggunaanL > 500;


        System.out.println("Total tagihan = " + totaltagih);
        System.out.println("Jumlah penggunaan > 500 ?" + totaltagih);
        s.close();
    }
}
