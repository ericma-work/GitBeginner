/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chenche.ma
 */
public class OddNumbers {
    public static void main(String[] args) {
        
    }
    
    public static void printOddNumbers(int i) {
        System.out.println("Odd numbers upto "+i);
        for(int x = 1; x < i; x += 2)
            System.out.println(x);
    }
}
