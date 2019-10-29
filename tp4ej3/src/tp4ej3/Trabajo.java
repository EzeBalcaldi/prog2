package tp4ej3;

import java.util.Vector;

public class Trabajo {
protected Vector palabrasClaves;

public boolean acepta(Evaluador e){
	for(int i = 0; i < palabrasClaves.size(); i++){
		if(e.tieneConocimiento((String)palabrasClaves.get(i))){
			return true;
		}
	}
	return false;
}
}
