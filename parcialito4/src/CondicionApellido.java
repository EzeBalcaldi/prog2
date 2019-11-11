
public class CondicionApellido extends Condicion{
	private String apellido;
	public CondicionApellido(String n){
		apellido = n;
	}
	public boolean seCumple(Empleado e) {
		return e.apellido.equals(apellido);
	}

}
