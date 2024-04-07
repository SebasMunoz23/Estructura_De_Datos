/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica_Negocio;

/**
 *
 * @author ACER
 */
public class Atleta {
        public String Nombre ;
        public String Nacionalidad ;
        public double Tiempo;
      

    public Atleta() {
    }

    public Atleta(String Nombre, String Nacionalidad, double Tiempo) {
        this.Nombre = Nombre;
        this.Nacionalidad = Nacionalidad;
        this.Tiempo = Tiempo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getNacionalidad() {
        return Nacionalidad;
    }

    public void setNacionalidad(String Nacionalidad) {
        this.Nacionalidad = Nacionalidad;
    }

    public double getTiempo() {
        return Tiempo;
    }

    public void setTiempo(double Tiempo) {
        this.Tiempo = Tiempo;
    }

   


    

  
        
        
}
