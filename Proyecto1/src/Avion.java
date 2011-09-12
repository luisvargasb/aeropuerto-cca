/*******************************************************************************
Autores: 
-Eddy Omar Castro Jauregui
-Ana Guisela Alfaro Marroquin
-Freddy Alejandro Chinchilla Culajay
Carne:11032
Seccion: 21
Fecha:  de 2011
Nombre del archivo: Avion.java
Breve descripcion: En esta clase se generan los nuevos aviones.
Utiliza metodos set() y get().
 *******************************************************************************/
public class Avion {
    //Definicion de atributos
    private String nombre;
    private char vNacional;
    private char vInternacional;
    private char cPrimera;
    private char cEjecutiva;
    private char cTurista;
    
    //Constructor
    public Avion(String n, char vn, char vi, char cp, char ce, char ct){
        nombre = n;
        vNacional = vn;
        vInternacional = vi;
        cPrimera = cp;
        cEjecutiva = ce;
        cTurista = ct;
    }
}
