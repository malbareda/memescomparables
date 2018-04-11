import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {

		
		ArrayList<Meme> list = new ArrayList<>();
		
		list.add(new MemesClase("La Venta de Oro","Xavi",13,false));
		list.add(new MemesClase("Fantasmas Caseros","Jessica",10,true));
		list.add(new MemesClase("Lolis","Lluis Hurtado",10,false));
		list.add(new MemesClase("Marco Frias","Marco Frias",10,false));
		list.add(new MemesExternos("Uganda Knuckles","Uganda",10,true));
		list.add(new MemesExternos("My job here is done","Yasuo",10,false));
		list.add(new MemesExternos("Loss","cuatro barras",10,false));
		
		
		Collections.sort(list);
		
		System.out.println(list);

	}

}
