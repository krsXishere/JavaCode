/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package learnfunction;

/**
 *
 * @author Kandang
 */
public class LearnFunction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int luas = luasBalok(200, 2, 10);
        System.out.println("Luas balok adalah " + luas);
    }
    
    static int luasBalok(int panjang, int lebar, int tinggi){
        return 2 * ((panjang * lebar) + (panjang * tinggi) + (lebar * tinggi));
    }
    
}
