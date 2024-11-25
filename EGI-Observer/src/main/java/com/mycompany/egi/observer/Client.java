/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.egi.observer;

/**
 *
 * @author emi-jm
 */
public class Client implements Observer{
    private String name;

    public Client(String name) {
        this.name = name;
    }
    
    @Override
    public void update(String nameProduct, double price) {
        System.out.println("Usuario notificado: " + this.name + "\nProducto: " + nameProduct + "\nNuevo Precio: " + price);
    }
    
}
