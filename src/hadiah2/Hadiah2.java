
package hadiah2;

import java.util.Scanner;
public class Hadiah2 {

   
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
     int angka1,angka2,hasil;
     
     //input
     System.out.println("Tekan 1 untuk penjumlahan");
     System.out.println("Tekan 2 untuk pengurangan");
     System.out.println("Tekan 2 untuk perkalian");
     System.out.println("Tekan 4 untuk pembagian");
     System.out.println("Tekan 5 untuk modulus"); 
     System.out.print("Masukkan Angka1: ");
     angka1 = input.nextInt();
     System.out.print("Masukkan Angka2: ");
     angka2 = input.nextInt();
     System.out.print("Masukkan Kode di Atas: ");
     hasil = input.nextInt();
     System.out.println("*****************************");
    
     
     
     //output
     switch (hasil){
         case 1:
             hasil= angka1+angka2;
             System.out.println(angka1+" + "+angka2+" = "+hasil);
             break;
         case 2:
             hasil= angka1-angka2;
             System.out.println(angka1+" - "+angka2+" = "+hasil);
             break;
         case 3:
             hasil= angka1*angka2;
             System.out.println(angka1+"*"+angka2+" = "+hasil); 
             break;
         case 4:
             hasil= angka1 / angka2;
             System.out.println(angka1+" / "+angka2+" = "+hasil);  
             break;
         case 5:
             hasil= angka1%angka2;
             System.out.println(angka1+" % "+angka2+" = "+hasil);
         default:
             
     }
     
     
    }
    
}
