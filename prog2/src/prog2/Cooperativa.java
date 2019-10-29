package prog2;

import java.util.Vector;

public class Cooperativa {
protected Vector cereales;
protected Vector lotes;
protected Vector mineralesP;

public Cooperativa(Vector cereales, Vector lotes, Vector mineralesP) {
	this.cereales = cereales;
	this.lotes = lotes;
	this.mineralesP = mineralesP;
}
public boolean puedoSembrar(Lote l, Cereal c){
	return c.acepta(l);
}
public void add(Lote l){
	lotes.add(l);
}
public void add(Cereal c){
	cereales.add(c);
}
public boolean esPrimario(Lote l){
	for(int i = 0; i< mineralesP.size(); i++){
		if(l.tieneMineral((String)mineralesP.elementAt(i))){
			return true;
		}
	}
	return false;
}
public Vector cerealesEn(Lote l){
	Vector r = new Vector();
	for(int i = 0; i< cereales.size(); i++){
		Cereal c = (Cereal)cereales.elementAt(i);
		if(c.acepta(l)){
			r.add(c);
		}
		
	}
	return r;
}
public Vector lotesPara(Cereal c){
	Vector r = new Vector();
	for(int i = 0; i< lotes.size(); i++){
		Lote l = (Lote)lotes.elementAt(i);
		if(c.acepta(l)){
			r.add(l);
		}
	}
	return r;
}

}
