package tp5ej2;

import java.util.ArrayList;

public class Carta {
protected Ni�o remitente;
protected ArrayList<String> regalos;
public Carta(Ni�o remitente) {
	this.remitente = remitente;
	regalos = new ArrayList <String>();
}
public void add(String r){
	regalos.add(r);
}
public void vaciar(){
	regalos.removeAll(regalos);
	regalos.add("Trozo de carb�n");	
}
public boolean vacia(){
	return regalos.get(0) == "Trozo de carb�n";
}
}
