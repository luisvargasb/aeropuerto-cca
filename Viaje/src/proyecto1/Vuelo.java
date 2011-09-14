/*******************************************************************************
Autores: 
-Eddy Omar Castro Jauregui
-Ana Guisela Alfaro Marroquin
-Freddy Alejandro Chinchilla Culajay
Carne:11032
Seccion: 21
Fecha:  de 2011
Nombre del archivo: Vuelo.java
Breve descripcion: En esta clase se generan los nuevos vuelos.
Utiliza metodos set() y get().
 *******************************************************************************/
public class Vuelo {
    //Definicion de atributos
    private String piloto;
    private String aeromoza;
    private String tipoVuelo;
    private String destino;
    private String fechaDespegue;
    private String horaDespegue;
    private String fechaAterrizaje;
    private String horaAterrizaje;
    private String aeropuerto;
    private String avion;
    
    //Constructor
    public Vuelo(String p, String a, String tv, String d, String fd, String hd, String fa, String ha, String ae, String av){
        piloto = p;
        aeromoza = a;
        tipoVuelo = tv;
        destino = d;
        fechaDespegue = fd;
        horaDespegue = hd;
        fechaAterrizaje = fa;
        horaAterrizaje = ha;
        aeropuerto = ae;
        avion = av;
    }
    //Parametros: no aplica
    //Funcinalidad: obtener datos
    //Valor de retorno: piloto
    public String getPiloto() {
        return piloto;
    }
    //Parametros: variable String piloto
    //Funcinalidad: almacenar datos
    //Valor de retorno: no aplica
    public void setPiloto(String piloto) {
        this.piloto = piloto;
    }
    //Parametros: no aplica
    //Funcinalidad: obtener datos
    //Valor de retorno: aeromoza
    public String getAeromoza() {
        return aeromoza;
    }
    //Parametros: variable String aeromoza
    //Funcinalidad: almacenar datos
    //Valor de retorno: no aplica
    public void setAeromoza(String aeromoza) {
        this.aeromoza = aeromoza;
    }
    //Parametros: no aplica
    //Funcinalidad: obtener datos
    //Valor de retorno: tipoVuelo
    public String getTipoVuelo() {
        return tipoVuelo;
    }
    //Parametros: variable String tipoVuelo
    //Funcinalidad: almacenar datos
    //Valor de retorno: no aplica
    public void setTipoVuelo(String tipoVuelo) {
        this.tipoVuelo = tipoVuelo;
    }
    //Parametros: no aplica
    //Funcinalidad: obtener datos
    //Valor de retorno: destino
    public String getDestino() {
        return destino;
    }
    //Parametros: variable String destino
    //Funcinalidad: almacenar datos
    //Valor de retorno: no aplica
    public void setDestino(String destino) {
        this.destino = destino;
    }
    //Parametros: no aplica
    //Funcinalidad: obtener datos
    //Valor de retorno: fechaDespegue
    public String getFechaDespegue() {
        return fechaDespegue;
    }
    //Parametros: variable String fechaDespegue
    //Funcinalidad: almacenar datos
    //Valor de retorno: no aplica
    public void setFechaDespegue(String fechaDespegue) {
        this.fechaDespegue = fechaDespegue;
    }
    //Parametros: no aplica
    //Funcinalidad: obtener datos
    //Valor de retorno: horaDespegue
    public String getHoraDespegue() {
        return horaDespegue;
    }
    //Parametros: variable String horaDespegue
    //Funcinalidad: almacenar datos
    //Valor de retorno: no aplica
    public void setHoraDespegue(String horaDespegue) {
        this.horaDespegue = horaDespegue;
    }
    //Parametros: no aplica
    //Funcinalidad: obtener datos
    //Valor de retorno: fehcaAterrizaje
    public String getFechaAterrizaje() {
        return fechaAterrizaje;
    }
    //Parametros: variable String fechaAterrizaje
    //Funcinalidad: almacenar datos
    //Valor de retorno: no aplica
    public void setFechaAterrizaje(String fechaAterrizaje) {
        this.fechaAterrizaje = fechaAterrizaje;
    }
    //Parametros: no aplica
    //Funcinalidad: obtener datos
    //Valor de retorno: horaAterrizaje
    public String getHoraAterrizaje() {
        return horaAterrizaje;
    }
    //Parametros: variable String horaAterrizaje
    //Funcinalidad: almacenar datos
    //Valor de retorno: no aplica
    public void setHoraAterrizaje(String horaAterrizaje) {
        this.horaAterrizaje = horaAterrizaje;
    }
    //Parametros: no aplica
    //Funcinalidad: obtener datos
    //Valor de retorno: aeropuerto
    public String getAeropuerto() {
        return aeropuerto;
    }
    //Parametros: variable String aeropuerto
    //Funcinalidad: almacenar datos
    //Valor de retorno: no aplica
    public void setAeropuerto(String aeropuerto) {
        this.aeropuerto = aeropuerto;
    }
    //Parametros: no aplica
    //Funcinalidad: obtener datos
    //Valor de retorno: avion
    public String getAvion() {
        return avion;
    }
    //Parametros: variable String avion
    //Funcinalidad: almacenar datos
    //Valor de retorno: no aplica
    public void setAvion(String avion) {
        this.avion = avion;
    }
}
