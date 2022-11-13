
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MSI_2022
 */
public class DesicionPerulangan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner a = new Scanner(System.in);
        int nilai,kehadiran;
        System.out.print("Masukkan Nilai = ");
        nilai = a.nextInt();
        System.out.print("Masukkan Kehadiran = ");
        kehadiran = a.nextInt();
       if (nilai>=50)
       {
           if(kehadiran>=12)
           {
               System.out.println("Lulus");
           }
           else
           {
               System.out.println("Tidak Lulus");
           }
       }
       else 
       {
           System.out.println("Tidak Lulus");
       }
    }
    
}
