/* contoh pemakaian IF satu kasus */
/* membaca nilai integer, menuliskan nilainya jika positif */ 
import java.util.Scanner;
public class If1 {
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

Scanner masukan=new Scanner(System.in); 
int a;
/* Program */
System.out.print ("Contoh IF satu kasus \n"); 
System.out.print ("Ketikkan suatu nilai integer : "); 
a = masukan.nextInt();
if (a >= 0)
System.out.print ("\nNilai a positif "+ a);
System.out.println("\n");
}
}
