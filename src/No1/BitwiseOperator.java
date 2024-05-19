/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package No1;

/**
 *
 *
 */
public class BitwiseOperator {
    public static void main(String[] args) {
        int number1 = 60;
        int number2 = 13;

        // Shift (>>)
        int shiftRightResult = number1 >> 2;  
        System.out.println("Shift Right (60 >> 2): " + shiftRightResult);

        // AND (&)
        int andResult = number1 & number2;  
        System.out.println("AND (60 & 13): " + andResult);
    }
}