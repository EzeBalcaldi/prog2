
public class CondicionAnd extends Condicion{
private Condicion c1;
private Condicion c2;

public CondicionAnd(Condicion c, Condicion c1){
	this.c1 = c;
	this.c2 = c1;
}
public boolean seCumple(Empleado e){
	return c1.seCumple(e) && c2.seCumple(e);
}
}
