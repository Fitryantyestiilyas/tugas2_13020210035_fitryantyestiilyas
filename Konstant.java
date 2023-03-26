import java.util.Scanner;
/* Membaca jari-jari, menghitung luas lingkaran */
/* latihan pemakaian konstanta */
public class Konstant {
/**
* @param args
*/
public static void main(String[] args) {
// TODO Auto-generated method stub
/* Kamus */

        System.out.println("NIM: 13020210035");
        System.out.println("NAMA: Fitry Antyesti Ilyas");
	System.out.println("Hari / Tanggal: Jumat / 17 Maret 2023");
	System.out.println("Waktu Pengerjaan : 20:54\n");
final float PHI = 3.1415f;
float r;
Scanner masukan=new Scanner(System.in);
/* program */ /* baca data */
System.out.print ("Jari-jari lingkaran ="); 
r = masukan.nextFloat();
/* Hitung dan tulis hasil */
System.out.print ("Luas lingkaran = "+ (PHI * r * r
)+"\n");
System.out.print ("Akhir program \n");
}
}
