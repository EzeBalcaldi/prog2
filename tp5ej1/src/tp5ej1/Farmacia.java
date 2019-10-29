package tp5ej1;

public class Farmacia {
private String nombre;


public Farmacia(String nombre) {
	this.nombre = nombre;
}
public  boolean puedoVender(Medicamento m, Cliente c){
	return c.puedeUsar(m);
}

}
