/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.proyectoposnet.posnet321;

/**
 *
 * @author luqas
 */
public class Posnet321 {

    public static void main(String[] args) {
        Cliente cliente1 = new Cliente("39466587","Lucas", "Aranda", "12555666","lucas@hotmail.com");
        TarjetaCredito tarjeta1 = new TarjetaCredito(EntidadFinanciera.VISA, "BBVA", "4545555666111",cliente1,30000);
        
        Posnet posnet1 = new Posnet();
        
        System.out.print(posnet1.efectuarPago(tarjeta1, 20000, 2));
        
    }
} 
