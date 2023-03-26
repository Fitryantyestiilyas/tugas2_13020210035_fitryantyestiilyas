
import java.util.Scanner;
/* Baca N, */
/* Print i = 1 s/d N dengan ITERATE */
public class PrintIterasi {
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
int N;
int i;
Scanner masukan=new Scanner(System.in);
/* Program */
System.out.print ("Nilai N >0 = "); /* Inisialisasi*/
N = masukan.nextInt();
i = 1; /* First Elmt */
System.out.print ("Print i dengan ITERATE : \n");
for (;;){
System.out.println(i); /* Proses */
if (i == N)
/* Kondisi Berhenti */ break;
else {
i++; /* Next Elmt */
}
} /* (i == N) */
}
}