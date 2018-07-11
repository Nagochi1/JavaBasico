/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.listas;

/**
 *
 * @author NAGOCHI
 */
public class JavaBasico {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        ListaSimple lista = new ListaSimple();
        
        lista.ingresarNodo(1);
        lista.ingresarNodo(2);
        lista.ingresarNodo(3);
        lista.ingresarNodo(4);
        lista.ingresarNodo(5);
        lista.ingresarNodo(6);
        lista.ingresarNodo(7);
        lista.ingresarNodo(8);
        lista.ingresarNodo(9);
        lista.ingresarNodo(10);
        
        lista.imprimirLista();
        
    }
    
}
