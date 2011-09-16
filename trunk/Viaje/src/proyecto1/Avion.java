package proyecto1;

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
import java.util.Scanner;
public class Avion {
    //Definicion de atributos
    private String nombre;
    private char vInternacional;
    private String cPrimera;
    private String cTurista;
    private String cEjecutiva;
    
    //Constructor
    public Avion(String n, char vi,String cp,String ce, String ct){
        nombre = n;
        vInternacional = vi;
        cPrimera = cp;
        cTurista = ct;
        cEjecutiva = ce;
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
    //Parametros: no aplica
    //Funcinalidad: obtener datos
    //Valor de retorno: vInternacional
    public char getvInternacional() {
        return vInternacional;
    }
    //Parametros: variable char vInternacional
    //Funcinalidad: almacenar datos
    //Valor de retorno: no aplica
    public void setvInternacional(char vInternacional) {
        this.vInternacional = vInternacional;
    }
    //Parametros: no aplica
    //Funcinalidad: obtener datos
    //Valor de retorno: cPrimera
    public String getcPrimera() {
        return cPrimera;
    }
    //Parametros: variable char cPrimera
    //Funcinalidad: almacenar datos
    //Valor de retorno: no aplica
    public void setcPrimera(String cPrimera) {
        this.cPrimera = cPrimera;
    }
  
    //Parametros: no aplica
    //Funcinalidad: obtener datos
    //Valor de retorno: cTurista
    public String getcTurista() {
        return cTurista;
    }
    //Parametros: variable char cTurista
    //Funcinalidad: almacenar datos
    //Valor de retorno: no aplica
    public void setcTurista(String cTurista) {
        this.cTurista = cTurista;
    }
     //Parametros: no aplica
    //Funcinalidad: obtener datos
    //Valor de retorno: cTurista
    public String getcEjecutiva() {
        return cEjecutiva;
    }
    //Parametros: variable char cTurista
    //Funcinalidad: almacenar datos
    //Valor de retorno: no aplica
    public void setcEjecutiva(String cEjecutiva) {
        this.cEjecutiva = cEjecutiva;
    }
}
