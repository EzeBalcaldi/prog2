package tp4ej3;

import java.util.Vector;

public class Evaluador {
private Vector conocimientos;

public Evaluador(Vector conocimientos) {
	this.conocimientos = conocimientos;
}
public Vector getConocimiento(int i){
	return (Vector)conocimientos.elementAt(i);
}
public boolean tieneConocimiento(String conocimiento){
	if(conocimientos.contains((String)conocimiento)){
		return true;
	}
return false;
}
}
