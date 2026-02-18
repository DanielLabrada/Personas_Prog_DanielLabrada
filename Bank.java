/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

import java.util.ArrayList;

/**
 *
 * @author Usuario
 */
public class Bank {
    String nombre;
    ArrayList <Tarjeta> tarjetas = new ArrayList<>();
    
    public void agregarTarjeta(Tarjeta t){
        tarjetas.add(t);
    }

    public String getNombre() {
        return nombre;
    }

    public Bank(String nombre) {
        this.nombre = nombre;
    }
    
    public void mostrarTarjetas(){
        System.out.println(tarjetas); 
    }
    
    
}    

