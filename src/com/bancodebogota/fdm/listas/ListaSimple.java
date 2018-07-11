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
public class ListaSimple {

    private Nodo root;
    private Nodo ultimo;

    public Nodo getRoot() {
        return root;
    }

    public void setRoot(Nodo root) {
        this.root = root;
    }

    public Nodo getUltimo() {
        return ultimo;
    }

    public void setUltimo(Nodo ultimo) {
        this.ultimo = ultimo;
    }

    public ListaSimple() {
        this.root = null;
        this.ultimo = null;
    }

    public void ingresarNodo(int dato) {
        Nodo nodoNuevo = new Nodo();
        nodoNuevo.setDato(dato);

        if (root == null) {
            root = nodoNuevo;
            root.setSiguiente(null);
            ultimo = root;

        } else {
            ultimo.setSiguiente(nodoNuevo);
            nodoNuevo.setSiguiente(null);
            ultimo = nodoNuevo;
        }
    }

    public void imprimirLista() {
        Nodo actual = new Nodo();
        actual = root;
        while (actual != null) {
            System.out.println(actual.getDato());
            actual = actual.getSiguiente();
        }
    }

}
