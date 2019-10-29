package tp5ej2;

import java.util.ArrayList;

public class Ciudad extends ElementoSistema{
private Buzon b;
private ArrayList<Ni�o> buenos;
public Ciudad(Buzon b) {
	this.b = b;
	buenos = new ArrayList<Ni�o>();
}
public void add(Ni�o r){
	buenos.add(r);
}
public int cartasRecibidas() {
	return b.cartas.size();
}
@Override
public int cartasRecibidas(CondicionNavidad c) {
	return b.cartasRecibidas(c);
}


}