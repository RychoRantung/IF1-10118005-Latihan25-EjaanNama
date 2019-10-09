/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan25.ejaannama;

import java.util.Scanner;

/**
 *
 * @author USER
 * NAMA : Rycho Rantung
 * KELAS : IF1
 * NIM : 10118005
 * Deskripsi Program :Program berisi program yang menampilkan pengejaan nama
 */
public class IF110118005Latihan25EjaanNama {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Masukkan nama depan anda untuk di eja : ");
        String nama = sc.next();
        System.out.println("Ejaan untuk \"" + nama + "\"");
        for ( int i = 0; i < nama.length(); i++) 
            System.out.println("Huruf ke- " + (i+1) + " : " + nama.charAt(i));
    
    }
    
}
