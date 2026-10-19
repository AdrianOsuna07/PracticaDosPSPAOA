package practicadospspaoa;
public class Cliente {
    private String numero;
    private String nombre;
    private String edad;
    private String puntos;

    @Override
    public String toString() {
        return "Numero: " + this.numero + " Nombre: " + this.nombre + " Edad: " + this.edad + " Puntos: " + this.puntos;
    }
    
    
}
