package tp5ej2;

import java.util.ArrayList;

public class Mesa extends SistemaElectoral{
protected ArrayList<Votante> votantes;
protected ArrayList<Voto> votos;

public Mesa() {
	votantes = new ArrayList<Votante>();
	votos = new ArrayList<Voto>();
}
private void add(Voto v){
	votos.add(v);
}
public void add(Votante v){
	votantes.add(v);
}
public int cantidadVotos() {
	return votos.size();
}

public int cantidadVotos(Condicion c) {
	int suma = 0;
	for(Voto v: votos){
		if(c.seCumple(v)){
			suma++;
		}
	}
	return suma;
}
public boolean votar(Votante v, Voto vo){
	for(Votante i: votantes){
		if(i.getDni() == v.getDni()){
			add(vo);
			return true;
		}
	}
	return false;
}

}
