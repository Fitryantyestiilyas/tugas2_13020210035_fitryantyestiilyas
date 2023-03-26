
import java.util.Scanner;
/* contoh baca nilai x, */
/* Jumlahkan nilai yang dibaca dengan WHILE */
public class PrintXWhile {
/**
* @param args
*/
public static void main(String[] args) {
// TODO Auto-generated method stub
/* Kamus : */
        System.out.println("NIM: 13020210035");
        System.out.println("NAMA: Fitry Antyesti Ilyas");
	System.out.println("Hari / Tanggal: Jumat / 17 Maret 2023");
	System.out.println("Waktu Pengerjaan : 20:54\n");
int Sum;
int x;
Scanner masukan=new Scanner(System.in);
/* Program */
Sum = 0; /* Inisialisasi */
System.out.print ("Masukkan nilai x (int), akhiri dg999 : ");
x = masukan.nextInt();/* First Elmt*/
while (x != 999) /* Kondisi berhenti */ { 
Sum = Sum + x; /* Proses */
System.out.print("Masukkan nilai x (int), akhiridg 999 : ");
x = masukan.nextInt();/* First Elmt*/
}
System.out.println("Hasil penjumlahan = "+ Sum); /* 
Terminasi */
}
}
