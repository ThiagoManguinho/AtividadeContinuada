package br.com.cesarschool.poo.titulos.utils;

public class Ordenador {
	
	 public static void ordenar(Comparavel[] ents, Comparador comp) {
	        for (int l=0; l<ents.length - 1; l++) {
	            for (int t=0; t<ents.length - l - 1; t++) {
	                if (comp.comparar(ents[t], ents[t + 1]) > 0) {
	                    
	                    Comparavel auxiliar = ents[t];
	                    ents[t] = ents[t + 1];
	                    ents[t + 1] = auxiliar;
	                }
	            }
	        }
	    }
	 
	 public static void ordenar(Comparavel[] comps) {
	        for (int t=0; t<comps.length - 1; t++) {
	            for (int l=0; l<comps.length - t - 1; l++) {
	                if (comps[l].comparar(comps[l + 1]) > 0) {
	                    
	                    Comparavel auxiliar = comps[l];
	                    comps[l] = comps[l + 1];
	                    comps[l + 1] = auxiliar;
	                }
	            }
	        }
	    }
}
