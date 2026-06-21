package data;

import model.Guia;
import model.Tour;

import java.io.*;

public class dataManager {

//CREACION DE ARCHIVO TXT
    private static final String DATA_FILE = "guiaTours.txt";

//GUARDAR SOBRE EL ARCHIVO
    public void guardaTour(Guia guia){
        try(BufferedWriter writer = new BufferedWriter(new FileWriter(DATA_FILE))){
            writer.write(guia.getNombre()+ "\n");
            for(Tour tr : guia.getTourlista()){
                writer.write(tr.toString()+"\n");

            }




        } catch (IOException e) {
            System.out.println("Error al guardar tour"+e.getMessage());


        }


    }

    public Guia cargarTourlista(){
        Guia guia = null;
        try(BufferedReader reader = new BufferedReader(new FileReader(DATA_FILE))) {
            String primeraLinea = reader.readLine();
            if (primeraLinea != null){
                guia = new Guia(primeraLinea);
                String linea;
                while((linea = reader.readLine()) != null){
                    String[] partes = linea.split(",");
                    if (partes.length == 4){
                        Tour tour = new Tour(
                                partes[0],
                                partes[1],
                                Integer.parseInt(partes[2]),
                                Integer.parseInt(partes[3])
                        );
                        guia.agregarTour(tour);

                    }



                }


            }




        }catch(IOException e){
            System.out.println("Error al cargar los tour"+e.getMessage());

        }
        return guia;


    }




}
