
public class Meme implements Comparable{
	
	String nombre;
	String creador;
	int gracia;
	
	Meme(String n, String c, int g){
		nombre=n;
		creador=c;
		gracia=g;
	}

	@Override
	public int compareTo(Object otro) {
		//Si tu eres mas pequeño que el que te pasan, devuelve negativo
		//Si tu eres mas grande que el que te pasan, devuelve positivo
		//Si tu eres igual que el que te pasan, devuelve cero
		Meme memeotro = (Meme) otro;
		int res = -(memeotro.gracia-this.gracia);
		if(res!=0) {
			return res;
		}else {
			return this.nombre.compareTo(memeotro.nombre);
		}
		
	}
	
	
	public String toString() {
		return nombre;
	}

}
