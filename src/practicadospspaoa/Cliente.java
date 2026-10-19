package practicadospspaoa;
public class Cliente {
    private String numero;
    private String nombre;
    private String edad;
    private String puntos;

    public Cliente(String numero, String nombre, String edad, String puntos) {
        this.numero = numero;
        this.nombre = nombre;
        this.edad = edad;
        this.puntos = puntos;
    }
    
    public String getNumero() {return numero;}
    public void setNumero(String numero) {this.numero = numero;}
    public String getNombre() {return nombre;}
    public void setNombre(String nombre){this.nombre = nombre;}
    public String getEdad() {return edad;}
    public void setEdad(String edad) {this.edad = edad;}
    public String getPuntos() {return puntos;}
    public void setPuntos(String puntos) {this.puntos = puntos;}

    
    
    @Override
    public String toString() {
        return "Numero: " + this.numero + " Nombre: " + this.nombre + " Edad: " + this.edad + " Puntos: " + this.puntos;
    }
    
    
}
