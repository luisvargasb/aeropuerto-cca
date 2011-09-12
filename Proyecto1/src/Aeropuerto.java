/*******************************************************************************
Autores: 
    -Eddy Omar Castro Jauregui
    -Ana Guisela Alfaro Marroquin
    -Freddy Alejandro Chinchilla Culajay
Carne:11032
Seccion: 21
Fecha:  de 2011
Nombre del archivo: Aeropuerto.java
Breve descripcion: En esta clase se generan los nuevos aviones
Utiliza metodos set() y get().
*******************************************************************************/
public class Aeropuerto {
    //Definicion de atributos
    private String nombre;
    private String direccion;
    private String coordenadas;
    private char tipo;
    
    //Constructor
    public Aeropuerto(String n, String d, String c, char t){
        nombre = n;
        direccion = d;
        coordenadas = c;
        tipo = t;
    }
}
