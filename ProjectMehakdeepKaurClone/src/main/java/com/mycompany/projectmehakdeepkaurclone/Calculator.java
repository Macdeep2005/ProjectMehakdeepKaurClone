/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.projectmehakdeepkaurclone;

/**
 *
 * @author Mehakdeep Kaur, 2026
 */
public class Calculator {
     public double divide(double i, double j) {
        if (j == 0) {
            throw new ArithmeticException("Cannot divide by zero");
        }

        return i / j;
    }

}
