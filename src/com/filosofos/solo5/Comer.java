package com.filosofos.solo5;

import java.util.List;

public class Comer extends Thread{
	private List<Filosofo> filosofos;

	public Comer(List<Filosofo> filosofos) {
		super();
		this.filosofos = filosofos;
	}

	public List<Filosofo> getFilosofos() {
		return filosofos;
	}

	public void setFilosofos(List<Filosofo> filosofos) {
		this.filosofos = filosofos;
	}
	
	@Override
	public void run() {
		double tiempocomer = 60/filosofos.size();
		long tiempocomiendo = 60000/filosofos.size();
		for(int x = 0 ; x<filosofos.size();x++) {
			//Primero comen el 0 y el 2
			filosofos.get(0).setTiempocomido(filosofos.get(0).getTiempocomido() + tiempocomer);
			filosofos.get(2).setTiempocomido(filosofos.get(2).getTiempocomido() + tiempocomer);
			System.out.println(x);
			try {
				sleep(tiempocomiendo);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			filosofos.get(1).setTiempocomido(filosofos.get(1).getTiempocomido() + tiempocomer);
			filosofos.get(3).setTiempocomido(filosofos.get(3).getTiempocomido() + tiempocomer);
			try {
				sleep(tiempocomiendo);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			filosofos.get(4).setTiempocomido(filosofos.get(4).getTiempocomido() + tiempocomer);
			try {
				sleep(tiempocomiendo);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		}
	}
}
