package tp5ej1;

import java.util.Vector;

public class Cliente {
private Vector <String> sintomas;
private ObraSocial os;
public Cliente( ObraSocial os) {
	this.os = os;
	sintomas = new Vector();
}
public void addSintoma(String s){
	sintomas.add(s);
}
public String getSintoma(int index){
	return sintomas.elementAt(index);
}
public ObraSocial getObraSocial(){
	return this.os;
}
public boolean puedeUsar(Medicamento m){
	for(int i = 0; i< this.sintomas.size(); i++){
		if(!m.tieneSintoma((String)sintomas.get(i))){
			return false;
		}
	}
	return true;
}
public  double calcularPrecio(Medicamento m){
	if(this.os == null){
		return m.getPrecio();
	}
		return m.getPrecio() * os.getDescuento();	
}

}
