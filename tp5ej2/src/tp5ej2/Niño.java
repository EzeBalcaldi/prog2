package tp5ej2;

public class Ni�o {
private String dni;

public Ni�o(String dni) {
	this.dni = dni;
}
public void entregarCarta(Carta c, Buzon b){
	b.agregarCarta(c);
}
public boolean equals(Ni�o otro){
	if(dni == otro.dni){
		return true;
	}
	return false;
}

}
