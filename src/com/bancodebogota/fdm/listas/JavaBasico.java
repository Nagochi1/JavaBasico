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
        try {
            lista.ingresarNodo(1);
            lista.ingresarNodo(2);
            lista.ingresarNodo("3");
            lista.ingresarNodo("4");
            lista.ingresarNodo("5");
            lista.ingresarNodo("6");
            lista.ingresarNodo("7");
            lista.ingresarNodo("8");
            lista.ingresarNodo("9");
            lista.ingresarNodo("10");

        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Lista Simple");
        lista.imprimirLista();

        ListaArray listaArray = new ListaArray();

        listaArray.insertar("1");
        listaArray.insertar("2");
        listaArray.insertar("3");
        listaArray.insertar("4");
        listaArray.insertar("5");
        listaArray.insertar("6");
        listaArray.insertar("7");
        listaArray.insertar("8");
        listaArray.insertar("9");
        listaArray.insertar("10");

        System.out.println("\nLista Array");
        listaArray.imprimir();

    }

}
