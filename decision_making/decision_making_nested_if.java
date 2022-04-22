/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decision_making;
import java.util.Scanner;

public class decision_making_nested_if {

    
    public static void main(String[] args) {
        int belanjaan, diskon, bayar;
        String kartu_ATM;
        Scanner scan = new Scanner(System.in);
        
        System.out.print("Apakah Anda Memiliki Kartu Member : ");
        kartu_ATM = scan.nextLine();
        System.out.print("Total Belanjaan : ");
        belanjaan = scan.nextInt();
        
       if (kartu_ATM.equalsIgnoreCase("ya")){
            if(belanjaan > 500000){
                diskon = 50000;
            } else if (belanjaan > 100000){
                diskon = 5000;
            } else {
                diskon = 0;
            }
       } else {
           if (belanjaan > 100000){
               diskon = 5000;
            } else {
               diskon = 0;
            }
        }
       
       bayar = belanjaan - diskon;
       
       System.out.println("Total bayar : Rp " + bayar);
       
    }
}
