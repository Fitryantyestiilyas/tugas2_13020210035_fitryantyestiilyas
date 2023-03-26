import java.util.Scanner;
/* Maksimum dua bilangan yang dibaca */
public class Max2 {
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
int a, b;
Scanner masukan=new Scanner(System.in);
/* Program */
System.out.print ("Maksimum dua bilangan : \n"); 
System.out.print ("Ketikkan dua bilangan, pisahkan dg RETURN :\n");
a=masukan.nextInt(); 
b=masukan.nextInt();
System.out.println ("Ke dua bilangan : a = "+ a+" b = "+b);
if (a >= b){
System.out.println ("Nilai a yang maksimum "+ a);
}else /* a > b */{
System.out.println ("Nilai b yang maksimum: "+ b);
}
}
}
