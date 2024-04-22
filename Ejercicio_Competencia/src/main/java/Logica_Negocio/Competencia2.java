/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author ACER
 */
public class Competencia2 {

    private ArrayList<Atleta> Atletas;

    public Competencia2() {
        Atletas = new ArrayList<>();
    }

    public void registrarAtleta(String nombre, String nacionalidad, double tiempo) {
        Atleta nuevoAtleta = new Atleta(nombre, nacionalidad, tiempo);
        Atletas.add(nuevoAtleta);
    }

    public Atleta encontrarCampeon() {
        Atleta campeon = Atletas.get(0);
        for (Atleta atleta : Atletas) {
            if (atleta.getTiempo() < campeon.getTiempo()) {
                campeon = atleta;
            }
        }

        return campeon;
    }

    public ArrayList<String> atletaPorPais(String pais) {
        ArrayList<String> atletaPorPais = new ArrayList<>();
        for (Atleta atleta : Atletas) {
            if (atleta.getNacionalidad().equalsIgnoreCase(pais)) {
                atletaPorPais.add(atleta.getNombre());
            }
        }

        return atletaPorPais;

    }

    public double binarySearch(ArrayList<Atleta> atletas, double tiempo) {
        double tiempo2=0;
        // Collections.sort(atletas.c); //metodo para ordenar la lista
        int left = 0; //indice del arreglo inicial
        int right = atletas.size() - 1;//posicion hacia la derecha
        
        while (left <= right) {
            int mid = left + (right - left) / 2;
            
              if (atletas.get(mid).getTiempo() == tiempo) {
                  tiempo2=tiempo;
            }
              if (atletas.get(mid)==atletas.get(mid)){
                  return mid;
              
              }
            
            
        }

        return 0;

    }
}
