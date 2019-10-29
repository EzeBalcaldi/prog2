package tp5ej2;

import java.util.ArrayList;

public class Mundo extends ElementoSistema {
private ArrayList<ElementoSistema> elementos;

public Mundo(){
	elementos = new ArrayList<ElementoSistema>();
}

@Override
public int cartasRecibidas() {
	int suma = 0;
	for(ElementoSistema e: elementos){
		suma = suma + e.cartasRecibidas();
	}
	return suma;
}

@Override
public int cartasRecibidas(CondicionNavidad c) {
	int suma = 0;
	for(ElementoSistema e: elementos){
		suma = suma + e.cartasRecibidas(c);
	}
	return suma;
}
public int promedioCartas(CondicionNavidad c){
	return (this.cartasRecibidas()/this.cartasRecibidas(c))*100;
	
}
}
