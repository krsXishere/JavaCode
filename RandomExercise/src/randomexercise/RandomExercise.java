/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package randomexercise;

/**
 *
 * @author Kandang
 */
class Hp{
        String Handphone;
        String Brand;
        
        Hp(String Handphone, String Brand){
            this.Handphone = Handphone;
            this.Brand = Brand;
        }
        
        void display(){
            System.out.println("\nHanphone : " + this.Handphone);
            System.out.println("Brand : " + this.Brand);
        }
    }

public class RandomExercise {
    public static void main(String[] args) {
        Hp Hp1 = new Hp("Redmi 10s", "Xiaomi");
        Hp1.display();
    } 
}
