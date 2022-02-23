package ejerciciosListas;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
public class E701 {

	
	public static void main(String[]args) {
		
		//*Apartado A*//
		
		
		ArrayList <Integer> numeros;
		
		numeros = new ArrayList<>();
		
		
	//*Apartado B *//
		
		for(int i=0; i<10;i++) {
			int numAleatorio= (int) (Math.random()*1000 % 21);
			numeros.add(numAleatorio);
		}
		
		//*Apartado C *//
		
		for(int i=0;i<numeros.size();i++) {
			System.out.println(numeros.get(i));
		}
		
	//*Apartado D *//
		
		
		for(int i=0; i<5;i++) {
			int numAleatorio= (int) (Math.random()*1000 % 10 + 90);
			numeros.add(i,numAleatorio);
		}
		
	//*Apartado E *//
		
		
	
		
	//*Apartado F *//
		
		numeros.add(5,(int) (Math.random()*(99-90)+90));
		numeros.add(6,(int) Math.random()*(99-90)+90);
		numeros.add(7,(int) Math.random()*(99-90)+90);
		numeros.add(8,(int) Math.random()*(99-90)+90);
		numeros.add(9,(int) Math.random()*(99-90)+90);
		
	//*Apartado G *//
		
		Iterator it = numeros.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
		
	//Apartado H 
		
		numeros.remove(12);
		
		
	//*Apartado I *//
		
		if(numeros.indexOf(16)==-1)
			System.out.println("no esta");
		else
			System.out.println("si esta");
		
		
		//*Apartado J *//	
		
		
		
		//*Apartado K *//
		
		Collections.sort(numeros);
		
		
		
		//*Apartado L *//
		
		Iterator it2 = numeros.iterator();
		while(it.hasNext()) {
			System.out.println(it2.next());
		}
	}
	
}
