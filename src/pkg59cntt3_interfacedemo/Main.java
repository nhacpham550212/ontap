/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg59cntt3_interfacedemo;

/**
 *
 * @author Administrator
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ICalculate calculator = new CasioCalculator();
        System.out.println("4+5="+calculator.cong(4, 5));
    }
    
}
