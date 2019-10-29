package tp5ej2;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class Buzon {
protected HashSet<Carta> cartas;
private ArrayList<Ni�o> buenos;

public Buzon(){
	cartas = new HashSet<Carta>();
	buenos = new ArrayList <Ni�o>();
}

private void add(Carta r){
	cartas.add(r);
}
private void add(Ni�o r){
	buenos.add(r);
}
public int cartasRecibidas(CondicionNavidad c){
	int suma = 0;
	for(Carta i: cartas){
		if(c.seCumple(i)){
			suma++;
		}
	}
	return suma;
}
public void agregarCarta(Carta c){
	boolean esta = false;
	for(Ni�o n: buenos){
		if(c.remitente.equals(n)){
			esta = true;
			
		}
		if(esta){
			add(c);
		}
		else{
			c.vaciar();
			add(c);
		}
	}
	
}
public int ni�osMalos(){
	int suma = 0;
	for(Carta c: cartas){
		if(c.vacia()){
			suma++;
		}
	}
	return suma;
}
}
