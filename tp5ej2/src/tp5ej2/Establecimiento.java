package tp5ej2;

import java.util.ArrayList;

public class Establecimiento extends SistemaElectoral{
protected ArrayList<SistemaElectoral> establecimientos;
protected String nombre;
public Establecimiento(String nombre) {
	this.nombre = nombre;
	establecimientos = new ArrayList<SistemaElectoral>();
}
public int cantidadVotos() {
	int suma = 0;
	for(SistemaElectoral e: establecimientos){
		suma = suma + e.cantidadVotos();
	}
	return suma;
}
public int cantidadVotos(Condicion c) {
	int suma = 0;
	for(SistemaElectoral e: establecimientos){
		suma = suma + e.cantidadVotos(c);
	}
	return suma;
}
public void add(SistemaElectoral e){
	establecimientos.add(e);
}

}
