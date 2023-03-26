import java.io.BufferedReader; 
import java.io.IOException; 
import java.io.InputStreamReader;
import javax.swing.*; 
public class BacaString {
/**
* @param args
* @throws IOException
*/
public static void main(String[] args) throws IOException {
// TODO Auto-generated method stub
/* Kamus */ 

        System.out.println("NIM: 13020210035");
        System.out.println("NAMA: Fitry Antyesti Ilyas");
	System.out.println("Hari / Tanggal: Jumat / 17 Maret 2023");
	System.out.println("Waktu Pengerjaan : 20:54\n");
        
String str;
BufferedReader datAIn = new BufferedReader(new 
InputStreamReader(System.in));
/* Program */
System.out.print ("\nBaca string dan Integer: \n"); 
System.out.print("masukkan sebuah string: ");
str= datAIn.readLine();
System.out.print ("String yang dibaca : "+ str);
System.out.println("\n");
        
}
}
