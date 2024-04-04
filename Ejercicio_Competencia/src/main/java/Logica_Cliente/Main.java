/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int opcion =0;
        do{
       String menu = JOptionPane.showInputDialog("Competencia \n"
                + "1. Registrar Atleta \n"
                + "2. Datos del Campeón \n"
                + "3. Atletas del país \n"
                + "4. Tiempo promedio de todos los atletas \n"
                + "5. salir\n"
        );

         opcion = Integer.parseInt(menu);//cambiando a numero 

        switch (opcion) {
            case 1:
                String nombreAtleta=JOptionPane.showInputDialog("ingresar el nombre del Atleta ");
                break;
            case 2:
                String nombreCampeon=JOptionPane.showInputDialog("ingresar el nombre del Campeon ");
                String nacionalidad=JOptionPane.showInputDialog("ingresar la nacionalidad del campeon");
                String tiempo=JOptionPane.showInputDialog("ingresar el tiempo del campeon ");
                break;
            case 3:

                break;
            case 4:

                break;
            default:
                throw new AssertionError();
        }  
        
        }while(opcion!=5);
    }

       

    }


