
public class CondicionNombre extends Condicion{
	private String nombre;
	public CondicionNombre(String n){
		nombre = n;
	}

	public boolean seCumple(Empleado e) {
		return e.nombre.equals(nombre);
	}

}
