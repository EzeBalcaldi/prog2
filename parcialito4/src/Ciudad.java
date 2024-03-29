import java.util.ArrayList;


public class Ciudad extends ElementoGeografico implements Comparable<Ciudad> {
private String region;
private int habitantes;
private int gastos;
private int ingresos;
public Ciudad(String nombre, String region, int habitantes, int gastos, int ingresos) {
	this.nombre = nombre;
	this.region = region;
	this.habitantes = habitantes;
	this.gastos = gastos;
	this.ingresos = ingresos;
}
public String getRegion() {
	return region;
}
public void setRegion(String region) {
	this.region = region;
}
public int getHabitantes() {
	return habitantes;
}
public void setHabitantes(int habitantes) {
	this.habitantes = habitantes;
}
public int getGastos() {
	return gastos;
}
public void setGastos(int gastos) {
	this.gastos = gastos;
}
public int getIngresos() {
	return ingresos;
}
public void setIngresos(int ingresos) {
	this.ingresos = ingresos;
}
public int cantidadHabitantes(){
	return habitantes;
}
public int gastosTotales(){
	return gastos;
}
public boolean estoyEnDeficit(){
	return gastos > ingresos;
}
public ArrayList ciudadesDeficit(){
	ArrayList<Ciudad> deficit = new ArrayList<Ciudad>();
	if(estoyEnDeficit()){
		deficit.add(this);
	}
	return deficit;

}
public int compareTo(Ciudad o){
	return this.nombre.compareTo(o.nombre);
}
}


