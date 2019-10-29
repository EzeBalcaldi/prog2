package tp4ej3;

import java.util.Vector;

public class Poster extends Trabajo{

	public Poster() {
		super();
	}
	
	public boolean esApto(Evaluador e){
		for(int i = 0; i< palabrasClaves.size(); i++){
			if(palabrasClaves.contains(e.getConocimiento(i))){
				return true;
			}
		}
		return false;
	}

}
