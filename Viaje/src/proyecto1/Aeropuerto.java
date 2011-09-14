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
    //Valor de retorno: direccion
    public String getDireccion() {
        return direccion;
    }
    //Parametros: variable String direccion
    //Funcinalidad: almacenar datos
    //Valor de retorno: no aplica
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    //Parametros: no aplica
    //Funcinalidad: obtener datos
    //Valor de retorno: coordenadas
    public String getCoordenadas() {
        return coordenadas;
    }
    //Parametros: variable String coordenadas
    //Funcinalidad: almacenar datos
    //Valor de retorno: no aplica
    public void setCoordenadas(String coordenadas) {
        this.coordenadas = coordenadas;
    }
    //Parametros: no aplica
    //Funcinalidad: obtener datos
    //Valor de retorno: tipo
    public char getTipo() {
        return tipo;
    }
    //Parametros: variable char tipo
    //Funcinalidad: almacenar datos
    //Valor de retorno: no aplica
    public void setTipo(char tipo) {
        this.tipo = tipo;
    }
}
