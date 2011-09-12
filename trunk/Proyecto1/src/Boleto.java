/*******************************************************************************
Autores: 
    -Eddy Omar Castro Jauregui
    -Ana Guisela Alfaro Marroquin
    -Freddy Alejandro Chinchilla Culajay
Carne:11032
Seccion: 21
Fecha:  de 2011
Nombre del archivo: Boleto.java
Breve descripcion: En esta clase se generan los nuevos boletos.
Utiliza metodos set() y get().
*******************************************************************************/
public class Boleto {
    //Definicion de atributos
    private char asiento;
    private String pasajero;
    private String vuelo;
    
    //Constructor
    public Boleto(char a, String p, String v){
        asiento = a;
        pasajero = p;
        vuelo = v;
    }
    //Parametros: no aplica
    //Funcinalidad: obtener datos
    //Valor de retorno: asiento
    public char getAsiento() {
        return asiento;
    }
    //Parametros: variable char asiento
    //Funcinalidad: almacenar datos
    //Valor de retorno: no aplica
    public void setAsiento(char asiento) {
        this.asiento = asiento;
    }
    //Parametros: no aplica
    //Funcinalidad: obtener datos
    //Valor de retorno: pasajero
    public String getPasajero() {
        return pasajero;
    }
    //Parametros: variable String pasajero
    //Funcinalidad: almacenar datos
    //Valor de retorno: no aplica
    public void setPasajero(String pasajero) {
        this.pasajero = pasajero;
    }
    //Parametros: no aplica
    //Funcinalidad: obtener datos
    //Valor de retorno: vuelo
    public String getVuelo() {
        return vuelo;
    }
    //Parametros: variable String vuelo
    //Funcinalidad: almacenar datos
    //Valor de retorno: no aplica
    public void setVuelo(String vuelo) {
        this.vuelo = vuelo;
    }
    
}
