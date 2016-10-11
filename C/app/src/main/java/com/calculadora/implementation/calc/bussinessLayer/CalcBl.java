package com.calculadora.implementation.calc.bussinessLayer;

/**
 * Created by esteban on 10/10/16.
 */

public class CalcBl {


    public int add(String firstNumber, String secondNumber) {
        try {
            return Integer.parseInt(firstNumber) + Integer.parseInt(secondNumber);
        } catch (NumberFormatException ex) {
            return 0;
        }
    }

}
