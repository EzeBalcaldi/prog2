import java.util.ArrayList;


public abstract class Empresa {
protected String nombre;
protected String apellido;
protected int edad;
protected double sueldo;
public abstract ArrayList<String> getEspecialidad();
public abstract double getSueldo();
public abstract ArrayList<Empleado> getProgramador();
public abstract Empleado getProgramador(Condicion c);
}
