import java.util.ArrayList;
import java.util.Collections;


public class Jefe extends Empresa {
protected int antiguedad;
protected ArrayList<Empresa> empleados;
protected CompadorEmpresa comp;

public Jefe(String n, String a, int e, double s, int antiguedad, CompadorEmpresa cc) {
	nombre = n;
	apellido = a;
	edad = e;
	sueldo = s;
	this.antiguedad = antiguedad;
	comp = cc;
	empleados = new ArrayList<Empresa>();
}

public ArrayList<String> getEspecialidad() {
	 ArrayList<String> aux = new ArrayList<String>();
	for(Empresa e: empleados){
		aux.addAll(e.getEspecialidad());
	}
	return aux;
}

public double getSueldo() {
	double suma = 0;
	for(Empresa e: empleados){
		suma += e.getSueldo();
	}
	return suma + sueldo;
}
public ArrayList<Empleado> getProgramador(){
	ArrayList<Empleado> aux = new ArrayList<Empleado>();
	for(Empresa e: empleados){
		aux.addAll(e.getProgramador());
	}
	Collections.sort(aux, comp);
	return aux;
}
public void setComparador(CompadorEmpresa cc){
	comp = cc;
}

public ArrayList<Empresa> getEmpleados() {
	ArrayList<Empresa> aux = new ArrayList<Empresa>();
	for(Empresa e: empleados){
		aux.addAll(e.getProgramador());
	}
	//aux = (ArrayList<Empresa>)(this.getProgramador());
		aux.add(this);
	Collections.sort(aux, comp);
	return aux;
}
public ArrayList<Empleado> getEmpleados(Jefe j){
	return j.getProgramador();
}

@Override
public Empleado getProgramador(Condicion c) {
	for(Empresa e: empleados){
		return e.getProgramador(c);
	}
	return null;
}

}
