/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decision_making;
import java.util.Scanner;

public class decision_making_if {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
       
        String nama;
        int nilai;
    
        System.out.print("Masukkan nama : ");
        nama = input.next();
        System.out.print("Masukkan nilai: ");
        nilai = input.nextInt();
     
        if (nilai >=65){
            System.out.println("Selamat, "+nama );
            System.out.println("Anda Lulus!");
            }
        }
    }

          
