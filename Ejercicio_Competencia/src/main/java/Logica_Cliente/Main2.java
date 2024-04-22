/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Logica_Cliente;

import Logica_Negocio.Atleta;
import Logica_Negocio.Competencia;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 *
 * @author ACER
 */
public class Main2 {

    /**
     * @param args the command line arguments
     */
  public static void main(String[] args) {
        int opcion = 0;
        ArrayList<Atleta> ListaAtletas = new ArrayList<>();
        ArrayList<Atleta> Listacampeon = new ArrayList<>();
        do {
            String menu = JOptionPane.showInputDialog("Competencia \n"
                    + "1. Registrar Atleta \n"
                    + "2. Datos del Campeón \n"
                    + "3. Atletas del país \n"
                    + "4. Tiempo promedio de todos los atletas \n"
                    + "5. Mostrar Atletas y campeon \n"
                    + "6. salir\n"
            );

            opcion = Integer.parseInt(menu);//cambiando a numero 

            switch (opcion) {
                case 1:
                    String cantidadAtleta = JOptionPane.showInputDialog("Ingrese la cantidad de atletas que se va a ingresar: ");
                    int numAtleta = Integer.parseInt(cantidadAtleta);

                    for (int i = 0; i < numAtleta; i++) {
                        String nombreAtleta = JOptionPane.showInputDialog("ingresar el nombre del Atleta ");
                        String tiempo = JOptionPane.showInputDialog("ingresar el tiempo en SEGUNDOS del atleta ");
                        String nacionalidadAtleta = JOptionPane.showInputDialog("ingresar la nacionalidad del atleta");
                        double tiempoAtleta = Double.parseDouble(tiempo);

                        Atleta objatleta = new Atleta(nombreAtleta, nacionalidadAtleta, tiempoAtleta);
                        ListaAtletas.add(objatleta);

                        Competencia objcompetencia = new Competencia(ListaAtletas);
                    }

                    break;
                case 2:
                    String nombreCampeon = JOptionPane.showInputDialog("ingresar el nombre del Campeon ");
                    String nacionalidadCapeon = JOptionPane.showInputDialog("ingresar la nacionalidad del campeon");
                    String tiempoCampeon = JOptionPane.showInputDialog("ingresar el tiempo en segundos del campeon ");
                    double tiempoCampeon2 = Double.parseDouble(tiempoCampeon);

                    Atleta objcampeon = new Atleta(nombreCampeon, nacionalidadCapeon, tiempoCampeon2);
                    Listacampeon.add(objcampeon);

                    break;
                case 3:
                    if (ListaAtletas.isEmpty()) {

                        JOptionPane.showMessageDialog(null, "No hay atletas registrados", "Aviso", 1);
                    } else {
                        String nombrePais = JOptionPane.showInputDialog("Ingrese el nombre del pais");
                        for (int i = 0; i < ListaAtletas.size(); i++) {
                            if (ListaAtletas.get(i).getNacionalidad().equalsIgnoreCase(nombrePais)) {
                                JOptionPane.showMessageDialog(null, "los atletas del pais " + nombrePais + " son: " + "\n"
                                        + "\n" + " Nombre: " + ListaAtletas.get(i).getNombre()
                                        + "\n" + " Nacionalidad: " + ListaAtletas.get(i).getNacionalidad()
                                        + "\n" + " Tiempo: " + ListaAtletas.get(i).getTiempo()
                                );
                            }
                        }
                    }

                    break;
                case 4:
                    if (ListaAtletas.isEmpty()) {

                        JOptionPane.showMessageDialog(null, "No hay atletas registrados", "Aviso", 1);
                    } else {
                        double suma = 0;
                        double promedio = 0;

                        for (int i = 0; i < ListaAtletas.size(); i++) {
                            suma += ListaAtletas.get(i).getTiempo();
                        }

                        promedio = suma / ListaAtletas.size();
                        JOptionPane.showMessageDialog(null, "El promedio del tiempo de los atletas en segundos fue de: \n"
                                + promedio + " segundos"
                        );

                        break;
                    }
                case 5:

                    if (ListaAtletas.isEmpty() && Listacampeon.isEmpty()) {

                        JOptionPane.showMessageDialog(null, "No hay atletas registrados", "Aviso", 1);
                    } else {
                        for (int i = 0; i < ListaAtletas.size(); i++) {
                            JOptionPane.showMessageDialog(null, "Informacion de los Atletas: \n"
                                 
                                    + "Informacion del CAMPEON:\n"
                                    + " Nombre: " + Listacampeon.get(i).getNombre() + "\n"
                                    + " Nacionalidad: " + Listacampeon.get(i).getNacionalidad() + "\n"
                                    + " Tiempo:" + Listacampeon.get(i).getTiempo() + "\n"
                                 + "Informacion de los ATLETAS:\n"
                                    + " Nombre: " + ListaAtletas.get(i).getNombre() + "\n"
                                    + " Nacionalidad: " + ListaAtletas.get(i).getNacionalidad() + "\n"
                                    + " Tiempo:" + ListaAtletas.get(i).getTiempo() + "\n"
                            );
                        }
                    }

                    break;

                case 6:

                    break;

                default:
                    throw new AssertionError();
            }

        } while (opcion != 6);
    }
    
}
