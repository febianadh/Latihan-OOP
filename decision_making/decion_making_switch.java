/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decision_making;
import java.util.Scanner;

public class decion_making_switch {

    
    public static void main(String[] args) {
        String kalkulator;
        Scanner input = new Scanner (System.in);
        
        Float a, b, hasil;
        
        System.out.print("nilai a = ");
        a = input.nextFloat();
        System.out.print("operasi (+/-/* / ) = ");
        kalkulator = input.next();
        System.out.print("nilai b = ");
        b = input.nextFloat();
        
        
        switch(kalkulator) {
            case "+":
                hasil = a + b;
                System.out.print("Hasil = " + hasil);
                break;
            case "-":
                hasil = a - b;
                System.out.print("Hasil = " + hasil);
                break;
            case "*":
                hasil = a * b;
                System.out.print("Hasil = " + hasil);
                break;
            case "/":
                hasil = a / b;
                System.out.print("Hasil = " + hasil);
                break;
            default:
                    System.out.print("operasi" + kalkulator + "tidak ditemukan");
                
        }
        
                
    }
    
}
