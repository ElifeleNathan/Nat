import java.util.Scanner;
public class Pelajaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       //inisialisasi
       int stambuk;
       String nama;
       //set scanner
       Scanner a = new Scanner(System.in);
       //cetak perintah
       System.out.print("Masukkan Stambuk Anda = ");
       System.out.println("Masukkan Nama Anda = ");
       //set inputan
       stambuk = a.nextInt();
       nama = a.nextLine();
       //cetak inputan user 
       System.out.println("Stambuk Anda = " +stambuk);
       System.out.println("Nama Anda = " + nama);
       

    }
    
}
