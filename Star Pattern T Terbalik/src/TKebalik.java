/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MSI_2022
 */
public class TKebalik {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //menambahkan dan mengset variabel M dimana nilai M adalah satu kemudian M lebih kecil atau sama dengan 3 kemudian M ditambah satu
        for (int m = 1; m <= 3; m++)
        {
            //menambahkan dan mengset variabel N dimana nilai N adalah satu kemudian N lebih kecil atau sama dengan 3 kemudian N ditambah satu
            for (int n = 1; n <= 3; n++)
        {
            //Jika M tidak sama dengan 3
    if (m != 3){
        //dan jika N sama dengan 1 atau N sama dengan 3
    if(n==1||n==3)
    {
        //maka di cetak kosong
        System.out.print(" ");
    }
    else{
        //jika pernyataan kedua tidak memenuhi maka dicetak bintang
    System.out.print("*");}
        }    
    else{
        //jika pernyataan pertama tidak memenuhi maka dicetak bintang
        System.out.print("*");
    }
        }
            //cetakan ini agar semua bintang yang di cetak bisa tersusun dengan baik (tidak menumpuk dalam satu baris)
            System.out.println(" ");
        }
    }
    
}
