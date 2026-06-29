package ui;

import data.GestorServicios;
import model.ServicioTuristico;

public class Main {

    public static void main(String[] args) {

        // Crear la instancia del gestor
        GestorServicios gestor = new GestorServicios();
        ServicioTuristico[] servicios = gestor.crearServicios();

        // Mensaje intro
        System.out.println("");
        System.out.println(" Servicios Turísticos - Llanquihue Tour App \n");
        System.out.println("Servicios : \n ");

        // iteracion de la lista la recorre y la muestra .
        for (ServicioTuristico s : servicios) {
            System.out.println(s);
        }
    }
}