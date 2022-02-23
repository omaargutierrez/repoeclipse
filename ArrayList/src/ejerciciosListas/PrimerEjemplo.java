package ejerciciosListas;


import java.util.ArrayList;
import java.util.Iterator;
public class PrimerEjemplo {

	public static void main(String[]args) {
		
		ArrayList <String> ciudades;
		
		ciudades = new ArrayList<>();
		
		ciudades.add("Gijon");
		ciudades.add("Aviles");
		ciudades.add("Oviedo");
		
		ciudades.add(1,"Madrid");
		
		for(int i=0;i<ciudades.size();i++) {
			System.out.println(ciudades.get(i));
		}
		
		Iterator it = ciudades.iterator();
		System.out.println();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}

}
