/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package decision_making;
    import java.util.Scanner;

public class decision_making_if_else {

    
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
   
    String nama;
    int nilai;
    char grade;
    
    System.out.print("Masukkan nama : ");
    nama = input.next();
    System.out.print("Masukkan nilai: ");
    nilai = input.nextInt();
    
    if (nilai >= 80){
        grade = 'A';
    }else if (nilai >= 70){
        grade = 'B';        
    }else if (nilai >= 60){
        grade = 'C';
    }else if (nilai >= 50){
        grade = 'D';
    }else{
        grade = 'E';
    }
    
    if (grade=='A'){
        System.out.println("Selamat, "+nama );
        System.out.println("Grade Anda A, Anda Lulus!");
    }else if (grade=='B'){
        System.out.println("Bagus, "+nama );
        System.out.println("Grade Anda B, Anda Lulus!");
    }else if (grade=='C'){
        System.out.println("Lumayan, "+nama );
        System.out.println("Grade Anda C, Anda Lulus!");
    }else if (grade=='D'){
        System.out.println("Maaf, "+nama );
        System.out.println("Grade Anda D, Anda Tidak Lulus!");
    }else {
        System.out.println("Maaf, "+nama );
        System.out.println("Grade Anda E, Anda Tidak Lulus!");
        
        } 
    }
}
