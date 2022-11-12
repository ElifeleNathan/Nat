import java.util.Scanner;
import java.text.DecimalFormat;
public class MenghitungLuasDanKelilingLingkaran {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double phi=3.14;
        double r,L,K;
        Scanner a=new Scanner(System.in);
        DecimalFormat b=new DecimalFormat("#.##");
        System.out.print("Diketahui nilai r = ");
        r =a.nextDouble();
        L =phi*(r*r);
        K =2*phi*r;
        System.out.println("Luas Lingkaran ="+b.format(L));
        System.out.println("Keliling Lingkaran ="+b.format(K));
    }
    
}
