package model;

public class Tour {

    private String ciudad;
    private String servicio;
    private int precio;
    private int cupos;


    public Tour(String ciudad, String servicio, int precio, int cupos) {
        this.ciudad = ciudad;
        this.servicio = servicio;
        this.precio = precio;
        this.cupos = cupos;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCupos() {
        return cupos;
    }

    public void setCupos(int cupos) {
        this.cupos = cupos;
    }


    @Override
    public String toString() {
        return ciudad + "," + servicio + "," + precio + "," + cupos;


    }
}






