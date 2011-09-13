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
    private char vInternacional;
    private char cPrimera;
    private char cEjecutiva;
    private char cTurista;
    
    //Constructor
    public Avion(String n, char vi, char cp, char ce, char ct){
        nombre = n;
        vInternacional = vi;
        cPrimera = cp;
        cEjecutiva = ce;
        cTurista = ct;
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
    public char getcPrimera() {
        return cPrimera;
    }
    //Parametros: variable char cPrimera
    //Funcinalidad: almacenar datos
    //Valor de retorno: no aplica
    public void setcPrimera(char cPrimera) {
        this.cPrimera = cPrimera;
    }
    //Parametros: no aplica
    //Funcinalidad: obtener datos
    //Valor de retorno: cEjecutiva
    public char getcEjecutiva() {
        return cEjecutiva;
    }
    //Parametros: variable char cEjecutiva
    //Funcinalidad: almacenar datos
    //Valor de retorno: no aplica
    public void setcEjecutiva(char cEjecutiva) {
        this.cEjecutiva = cEjecutiva;
    }
    //Parametros: no aplica
    //Funcinalidad: obtener datos
    //Valor de retorno: cTurista
    public char getcTurista() {
        return cTurista;
    }
    //Parametros: variable char cTurista
    //Funcinalidad: almacenar datos
    //Valor de retorno: no aplica
    public void setcTurista(char cTurista) {
        this.cTurista = cTurista;
    }
}
