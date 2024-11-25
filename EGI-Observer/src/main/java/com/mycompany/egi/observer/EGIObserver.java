/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.egi.observer;

/**
 Sistema de Notificaciones para Cambios de Precios de Productos
Descripción del Problema:
utilizamos el patron observer para resolver el problema

 **/
public class EGIObserver {

    public static void main(String[] args) {
        System.out.println("SISTEMA DE NOTIFICACIONES DE CAMBIOS DE PRECIOS\n");
        System.out.println("Patron Observer \n");
        System.out.println("Ingresamos un producto y el valor de ese producto \n");
        Product notebookHP = new Product("Notebook HP", 500000.0);
        Product monitorAsus = new Product("Monitor 27 pulgadas Asus", 245000.0);
        System.out.println("ingresa usuario Pepito");
        Observer pepito = new Client("Pepito");
        System.out.println("pepito se suscribe a dos productos");
        notebookHP.addObserver(pepito);
        monitorAsus.addObserver(pepito);
        System.out.println("ingresa usuario Maria");
        Observer maria= new Client("Maria");
        System.out.println("maria se suscribe a dos productos");
        notebookHP.addObserver(maria);
        monitorAsus.addObserver(maria);
        System.out.println("actualizamos precio de notebook y monitor");
        notebookHP.updatePrice(650000.0);
        monitorAsus.updatePrice(270000.0);
        System.out.println("maria se desuscribe de monitorAsus");
        monitorAsus.removeObservador(maria);
        System.out.println("actualizamos precio de notebook y monitor");
        notebookHP.updatePrice(750000.0);
        monitorAsus.updatePrice(370000.0);
    }
}
