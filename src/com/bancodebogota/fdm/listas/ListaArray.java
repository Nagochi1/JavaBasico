/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.bancodebogota.fdm.listas;

import java.util.Arrays;

/**
 *
 * @author NAGOCHI
 */
public class ListaArray {

    private Object[] dato;
    private int dimension = 4;
    private int incremento = 2;
    private int posicion;

    public ListaArray() {
        this.dato = new Object[this.dimension];
        this.posicion = 0;
    }

    public void insertar(Object obj) throws Exception {

        if (dato[posicion] instanceof String) {
            dato[posicion] = obj;

            if (posicion == (dimension / incremento)) {
                dato = Arrays.copyOf(dato, (dimension * incremento));
                dimension = dimension * incremento;

            }

            posicion++;
        }else{
            throw new Exception("Tipo no válido");
        }
    }

    public void imprimir() {
        for (int i = 0; i < posicion; i++) {
            System.out.println("Se agregó digito: " + dato[i] + " en posición: " + i);
        }
    }

}
