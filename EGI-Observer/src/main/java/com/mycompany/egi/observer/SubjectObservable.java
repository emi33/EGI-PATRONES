/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.egi.observer;

/**
 *
 * @author emi-jm
 */
public interface SubjectObservable {
    void addObserver(Observer observer);
    void removeObservador(Observer observer);
    void notifyObservers();
}
