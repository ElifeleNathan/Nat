/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author MSI_2022
 */
public class TestES {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      //menambahkan variabel i dan j
      int i, j;
      //untuk variabel i di set dimana variabel i adalah 0 kemudian i lebih kecil dari 3 kemudian i ditambah 1
      for(i=0; i<3; i++)
      {
          //untuk variabel j di set dimana variabel j adalah 0 kemudian variabel j di tambah 1
         for(j=0; j<=i; j++)
         {
             //cetak bintang yang di hasilkan dari rumus diatas
            System.out.print("* ");
         }
         //cetak ini untuk menyusun bintang agar lebih rapih (tidak sebaris) 
         System.out.print("\n");
      }
    }
    
}
