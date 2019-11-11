import java.util.ArrayList;


public class Empleado extends Empresa{
	protected  int horasTrabajo;
	protected ArrayList<String> especialidades;

	public Empleado(String n, String a, int e, double s, int horasTrabajo) {
		nombre = n;
		apellido = a;
		edad = e;
		sueldo = s;
		this.horasTrabajo = horasTrabajo;
		this.especialidades = new ArrayList<String>();

	}

	public Empleado() {
	}

	public ArrayList<String> getEspecialidad() {
		return especialidades;
	}

	@Override
	public double getSueldo() {
		return horasTrabajo * sueldo;
	}

	@Override
	public ArrayList<Empleado> getProgramador() {
		ArrayList<Empleado> aux = new ArrayList<Empleado>();
		aux.add(this);
		return aux;
	}

	@Override
	public Empleado getProgramador(Condicion c) {
		if(c.seCumple(this)){
		return this;
		}
		return null;
	}
}
