/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasdarihyung;

import java.util.*;

/**
 *
 * @author Kandang
 */
public class TugasDariHyung {
    public static void main(String[] args) {
       Scanner input = new Scanner (System.in);
        int[] array = new int [5];
        System.out.println("Input : ");
        for (int elements = 0; elements < 5; elements++)
            array[elements] = input.nextInt();
        Arrays.sort(array);
        System.out.println("Elements : " + Arrays.toString(array));
    }   
}
