/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Usuario
 */
public class Tarjeta {
   String numero;
   String titular;
   private double saldo = 0;

    public Tarjeta(String numero, String titular) {
        this.numero = numero;
        this.titular = titular;
    }
   
   
   
   public static void pagar(double monto){
       
   }
   
   public double consultarSaldo(){
       return saldo;
   }
}
