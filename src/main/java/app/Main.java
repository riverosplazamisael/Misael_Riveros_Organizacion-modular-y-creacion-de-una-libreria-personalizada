package app;

import data.dataManager;
import model.Guia;
import model.Tour;


public class Main {
    public static void main(String[] args){

        dataManager dataManager = new dataManager();
        Guia guia = new Guia("Francisco Silva");

        guia.agregarTour(new Tour("Valdivia", "Treking", 20000, 20));
        guia.agregarTour(new Tour("Pto Montt", "Senderismo", 30000, 10));
        guia.agregarTour(new Tour("Pto Varas", "Caminata por la ciudad", 20000, 15));
        guia.agregarTour(new Tour("Santiago", "Tour guiado", 15000, 20));
        guia.agregarTour(new Tour("La Serena", "Tour Valle del Elqui", 25000, 25));


       // dataManager.guardaTour(guia);
       // System.out.println("Lista de tour guardada");


        Guia guiaCargado = dataManager.cargarTourlista();
        if (guiaCargado != null){
            System.out.println("--Guia Cargado--");
            System.out.println("Guia turistico: " + guiaCargado.getNombre());
            System.out.println("Tours: ");
            for (Tour tr : guiaCargado.getTourlista()){
                System.out.println("- "+ "Ciudad: " + tr.getCiudad()+ " - Servicio: "+ tr.getServicio()+ " - Precio: " + tr.getPrecio()+ " - Cupos: " + tr.getCupos());
            }
        }





    }

}
