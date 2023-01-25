package uniandes.dpoo.taller0.Modificacion;

import java.io.FileNotFoundException;
import java.io.IOException;

import uniandes.dpoo.taller0.procesamiento.CalculadoraEstadisticas;
import uniandes.dpoo.taller0.procesamiento.LoaderOlimpicos;

public class Modificacion {
    public static void main(String[] args) {
        System.out.println("Hola, mundo!");

        try {
            CalculadoraEstadisticas calc;
            calc = LoaderOlimpicos.cargarArchivo("Taller-1-DPOO-n.pradaq/Taller0_Olimpicos/data/atletas.csv");
            System.out.println(calc.paisConMasMedallistas());
        } catch (FileNotFoundException e) {
            System.out.println("No se encontro el archivo");
            e.printStackTrace();
        } catch (IOException e) {
            System.out.println("Hubo una excepcion de tipo IO");
            e.printStackTrace();
        }
        
    }
}
