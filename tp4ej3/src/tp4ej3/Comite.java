package tp4ej3;

import java.util.Vector;

import prog2.Cereal;
import prog2.Lote;

public class Comite {
private Vector evaluadores;
private Vector trabajos;
private Vector evaluadoresExpertos;
public Comite(Vector evaluadores, Vector trabajos, Vector evaluadoresExpertos) {
	this.evaluadores = evaluadores;
	this.trabajos = trabajos;
	this.evaluadoresExpertos = evaluadoresExpertos;
}
public void add(Evaluador e){
	evaluadores.add(e);
}
public void add(Trabajo t){
	trabajos.add(t);
}
public boolean puedoAsignar(Evaluador e, Trabajo t){
	return t.acepta(e);
}
ublic boolean esExperto(Evaluador e){
	for(int i = 0; i< mineralesP.size(); i++){
		if(l.tieneMineral((String)mineralesP.elementAt(i))){
			return true;
		}
	}
	return false;
}
}
