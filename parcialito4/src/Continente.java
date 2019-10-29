import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;


public class Continente extends ElementoGeografico  {
protected Comparator<Ciudad> c;
protected ArrayList<ElementoGeografico> ciudades;
public Continente(String n){
	nombre = n;
	ciudades = new ArrayList<ElementoGeografico>();
}
	public int cantidadHabitantes(){
		int suma = 0;
		for(ElementoGeografico i: ciudades){
			suma = suma + i.cantidadHabitantes();
			}
		return suma;
	}
	public void add(ElementoGeografico e){
		ciudades.add(e);
	}
	public int gastosTotales(){
		int suma = 0;
		for(ElementoGeografico i: ciudades){
			suma = suma + i.gastosTotales();
			}
		return suma;
	}
	public ArrayList ciudadesDeficit(){
		ArrayList<Ciudad> deficit = new ArrayList<Ciudad>();
		ArrayList<Ciudad> aux = new ArrayList<Ciudad>();
		for(ElementoGeografico i: ciudades){
			aux = i.ciudadesDeficit();
					if(aux!= null){
						deficit.addAll(aux);
					}
					Collections.sort(deficit);
			}
		for(Ciudad i: deficit){
			System.out.println(i.nombre);
		}
		return deficit;
	}

	
}
