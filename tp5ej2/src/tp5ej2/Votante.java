package tp5ej2;

public class Votante {
private String nombre;
protected int dni;
public Votante(String nombre, int dni) {
	this.nombre = nombre;
	this.dni = dni;
}
public String getNombre() {
	return nombre;
}
public int getDni() {
	return dni;
}
public void votar(Mesa m, Voto vo){
	m.votar(this, vo);
}

}
