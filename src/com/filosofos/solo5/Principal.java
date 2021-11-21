package com.filosofos.solo5;

import java.util.ArrayList;
import java.util.List;

public class Principal {

	public static void main(String[] args) {
		List<Filosofo> filosofos = new ArrayList<Filosofo>();
		// Los creamos
		Filosofo f1 = new Filosofo("Socrates");
		Filosofo f2 = new Filosofo("Descartes");
		Filosofo f3 = new Filosofo("Heráclito");
		Filosofo f4 = new Filosofo("Pitágoras");
		Filosofo f5 = new Filosofo("Platón");
		// Los añadimos a la mesa
		filosofos.add(f1);
		filosofos.add(f2);
		filosofos.add(f3);
		filosofos.add(f4);
		filosofos.add(f5);
		
		Comer mesa = new Comer(filosofos);
		mesa.start();
		try {
			mesa.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		for(Filosofo f :filosofos) { 
			if(f.getTiempocomido()==60) {
				System.out.println("El filosofo "+f.getNombre()+ " ha comido completamente");
			}else {
				System.out.println("El filosofo "+f.getNombre()+ " no ha comido del todo, ha comido durante " +f.getTiempocomido());
			}
		}
		

	}

}
