package tp5ej2;

public class Niño {
private String dni;

public Niño(String dni) {
	this.dni = dni;
}
public void entregarCarta(Carta c, Buzon b){
	b.agregarCarta(c);
}
public boolean equals(Niño otro){
	if(dni == otro.dni){
		return true;
	}
	return false;
}

}
