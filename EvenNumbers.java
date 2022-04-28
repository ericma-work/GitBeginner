/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author chenche.ma
 */
public class EvenNumbers {
    public static void main(String[] args) {
        printEvenNumbers(20);
    }
    
    public static void printEvenNumbers(int i) {
        System.out.println("Even numbers upto "+i);
        for(int x = 0; x < i; x += 2)
            System.out.println(x);
    }
}
