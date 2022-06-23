import java.util.Scanner;

public class LuasLingkaran {

    private static void LuasLingkaran(){

        double luas;
        double phi ;
        double jarijari;
        phi = 3.14d;

        Scanner inputJari = new Scanner(System.in);
        System.out.print("Masukan Jari - Jari Lingkaran : ");
        jarijari = inputJari.nextDouble();

        luas = phi * jarijari * jarijari;

        System.out.println("Luas Lingakaran Adalah : " + luas);
    }
    public static void main(String[] args) {
        LuasLingkaran();

    }
    //Scanner inputUser = new Scanner(System.in);
    //double JariJari;
    //double LuasLingkaran;
        //System.out.println("\nMasukan JariJari = ");
    //JariJari = inputUser.nextDouble();
    //LuasLingkaran = Math.PI * JariJari * JariJari;
        //System.out.println("Luas Lingkaran = " + LuasLingkaran);
}
