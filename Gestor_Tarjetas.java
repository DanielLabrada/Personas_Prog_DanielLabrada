/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package gestor_tarjetas;

import java.util.Scanner;
import model.Bank;

/**
 *
 * @author Usuario
 */
public class Gestor_Tarjetas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduce el nombre del banco");
        Bank bank = new Bank(sc.nextLine());
        
        System.out.println("Bienvenido al "+ bank.getNombre());
        System.out.println("1- Crear Tarjeta");
        System.out.println("2- Realizar pagos");
        System.out.println("3- Mostrar el saldo");
        int opcion = 0;
        
        switch(opcion){
            case -> 
        }
           
        

        
    }
    
    

}
