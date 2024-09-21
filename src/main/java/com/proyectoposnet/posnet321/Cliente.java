/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.proyectoposnet.posnet321;


public class Cliente {
    
    private final String DNI; // cuando son constantes hay que inicializarla 
    private String nombre;
    private String apellido;
    private String telefono;
    private String mail;
    
    public Cliente(String dni, String nombre, String apellido, String telefono, String mail){
        DNI = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.mail = mail;
        
    }
    
    public String getNombreCompleto(){
        return nombre +" " + apellido;
    }
    
}
