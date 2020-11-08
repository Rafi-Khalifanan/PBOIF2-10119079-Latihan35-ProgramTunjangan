package pboif2.pkg10119079.latihan35.programtunjangan;
import java.util.Scanner;
/**
 *
 * @author Khaz
 * NAMA     :   Rafi Khalifanan Azanan
 * KELAS    :   IF2
 * NIM      :   10119079
 * DESKRIPSI:
 *
 */
public class PBOIF210119079Latihan35ProgramTunjangan {
    public static void main(String[] args) {
        int gajipokok;
        String status;
        Scanner input = new Scanner(System.in);
        Tunjangan menghitung = new Tunjangan();
        
        System.out.println("========Program Tunjangan========");
        System.out.printf("Berapa gaji pokok anda perbulan ? : Rp. ");
        gajipokok = input.nextInt();
        System.out.print("Status Anda ? (Menikah/Belum) : ");
        status = input.next();
        menghitung.hasilTunjangan(status,gajipokok);
    }
}
    

