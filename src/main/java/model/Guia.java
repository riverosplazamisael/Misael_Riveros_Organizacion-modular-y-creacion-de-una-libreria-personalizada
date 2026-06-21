package model;

import java.util.ArrayList;
import java.util.List;

public class Guia {

    private String nombre;
    private List<Tour> tourlista;

    public Guia(String nombre){
        this.nombre = nombre;
        this.tourlista = new ArrayList<>();

    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public List<Tour> getTourlista() {
        return tourlista;
    }

    public void setTourlista(List<Tour> tourlista) {
        this.tourlista = tourlista;
    }

    public void agregarTour(Tour tour){
        this.tourlista.add(tour);

    }
}
