/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoarray;

// import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author reroes
 */
public class ArrayList03 {

    public static void main(String[] args) {

        // creación de un ArrayList 
        ArrayList<String> arreglo2 = new ArrayList<>();
        ArrayList<String> arreglo3 = new ArrayList<>();

        boolean bandera = true;
        String pais;
        Scanner entrada = new Scanner(System.in);
        String opcion;
        while (bandera) {
            System.out.println("Ingrese un nombre de un país");
            pais = entrada.nextLine();
            arreglo2.add(pais);
            System.out.println("Desea ingresar salir, ingrese (s)");
            opcion = entrada.nextLine();
            if (opcion.equals("s")) {
                bandera = false;
            }
        }

        System.out.println("Presentar los valor en pantalla");
        arreglo3 = convertirMayuscula(arreglo2);
        for (int i = 0; i < arreglo3.size(); i++) {
            System.out.printf("%s\n", arreglo3.get(i));
        }
        /*
        ArrayList <String> arreglo2 = new ArrayList<>();
        ArrayList <Boolean> arreglo4 = new ArrayList<>();
         */
    }

    public static ArrayList<String> convertirMayuscula(ArrayList<String> arreglo2) {
        ArrayList<String> arreglo3 = new ArrayList<>();
        for (int i = 0; i < arreglo2.size(); i++) {
            arreglo3.add(arreglo2.get(i).toUpperCase());
        }
        return arreglo3;
    }
}
