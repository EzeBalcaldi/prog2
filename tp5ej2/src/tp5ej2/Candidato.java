package tp5ej2;

public class Candidato {
private String nombre;
private String partido;
private String agrupacion;
public Candidato(String nombre, String partido, String agrupacion) {
	this.nombre = nombre;
	this.partido = partido;
	this.agrupacion = agrupacion;
}
public String getNombre() {
	return nombre;
}
public boolean equals(Candidato o){
	if(nombre.equals(o.nombre)){
		if(partido.equals(o.partido)){
			if(agrupacion.equals(o.agrupacion)){
				return true;
			}
		}
	}
	return false;
}

}
