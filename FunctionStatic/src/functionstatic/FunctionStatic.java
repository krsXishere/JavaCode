/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functionstatic;

/**
 *
 * @author Kandang
 */
public class FunctionStatic {
    void kegiatanIkis(String aktifitas){
        System.out.println("Saya ingin " + aktifitas);
    }
    
    static void codingIkis(String ngoding){
        System.out.println("Tapi saya sedang belajar bahasa " + ngoding);
    }
    
    public static void main(String[] args) {
        FunctionStatic ane = new FunctionStatic();
        ane.kegiatanIkis("tidur");
        codingIkis("Java");
    }
    
}
