package tp5ej1;

import java.util.Vector;

public class Medicamento {
private String nombre;
private Vector <String> sintomas;
private int precio;
public Medicamento(String nombre,  int precio) {
	this.nombre = nombre;
	this.precio = precio;
	sintomas = new Vector();
}
public boolean tieneSintoma(String sintoma){
	if(sintomas.contains((String)sintoma)){
		return true;
	}
return false;
}
public int getPrecio(){
	return precio;
}
public void addSintoma(String s){
	sintomas.add(s);
}
}
