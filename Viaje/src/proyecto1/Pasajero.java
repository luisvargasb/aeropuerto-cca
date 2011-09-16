package proyecto1;

/*******************************************************************************
Autores: 
-Eddy Omar Castro Jauregui
-Ana Guisela Alfaro Marroquin
-Freddy Alejandro Chinchilla Culajay
Carne:11032
Seccion: 21
Fecha:  de 2011
Nombre del archivo: Pasajero.java
Breve descripcion: En esta clase se definen los nuevos pasajeros.
Utiliza metodos set() y get().
 *******************************************************************************/
public class Pasajero {
    //Definicion de atributos
    private String nombre;
    
    //Constructor
    public Pasajero(String n){
        nombre = n;
    }
    //Parametros: no aplica
    //Funcinalidad: obtener datos
    //Valor de retorno: nombre
    public String getNombre() {
        return nombre;
    }
    //Parametros: variable String nombre
    //Funcinalidad: almacenar datos
    //Valor de retorno: no aplica
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
