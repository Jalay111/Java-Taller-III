package com.poo.exercise;


import java.util.Random;
import java.util.Scanner;


public class Main {


	private static Scanner reader;

	public static void main(String[] args) {
  
		reader = new Scanner(System.in);
		double resultado;
		double operacion = 0;
		int total = 0, contBueno = 0, contRegular = 0, contMalo = 0, contPesimo = 0, tiempoLimite = 30;
		int cambiar;
		TeachesArithmetic teaches = new TeachesArithmetic(0, 0, 0, 0);
		Random rnd = new Random();
		int z, x1, x2, x3, x4;
		char operador = '+';
		
		System.out.println("En cuantos Tiempo Crees que puedes Resolver las preguntas: ");
		System.out.println("Por defecto te daremos 30 seg si desea cambiarlo digite [1]\n"+
		"de lo contrario ingrese [0]");
	
		cambiar = reader.nextInt();
	
		if( cambiar == 1){
			System.out.print("Ingrese tiempo en segudos: ");
			tiempoLimite =  reader.nextInt();
		}
		
		
		for(int i=1; i<=1; i++){
			
			z = (int) (rnd.nextDouble() * 4);
			x1 = (int) (rnd.nextDouble() * 10);
			x2 = (int) (rnd.nextDouble() * 10);
			x3 = (int) (rnd.nextDouble() * 10);
			x4 = (int) (rnd.nextDouble() * 10);
			
			if( z == 0){
				operador = '+';
				operacion = (double) teaches.getSuma(x1, x2, x3, x4);
			}else if(z == 1){
				operador = '-';
				operacion = (double) teaches.getResta(x1, x2, x3, x4);
			}else if(z == 2){
				operador = '*';
				operacion = (double) teaches.getMultiplicacion(x1, x2, x3, x4);
			}else if(z == 3){
				operador = '/';
				operacion = (double) teaches.getDivision(x1, x2, x3, x4);
			}
			System.out.print("(" + x1 + "/" + x2 +  ")" + operador + "(" + x3 + "/" + x4 +  ")");
			System.out.println("= ? :");
			long start = System.currentTimeMillis();
			resultado = reader.nextDouble();
		    long end = System.currentTimeMillis();
		    long resTiempo = (end - start)/1000;
		    if(resTiempo <= tiempoLimite ){
		    	
		    	if( operacion == resultado ){
		    		contBueno++;
		    	}else{
		    		contMalo++;
		    	}
		    	
		    }else{
		    	
		    	if( operacion == resultado){
		    		contRegular++;
		    	}else{
		    		contPesimo++;
		    	}
		    	
		    }
	
		}
		
		
		System.out.println("\t\tAntes del tiempo \t Despues del tiempo");
		System.out.println("Correctas\t\t"+contBueno+"\t\t\t"+contRegular);
		System.out.println("incorrect\t\t"+contMalo+"\t\t\t"+contPesimo);
		contBueno*=10;
		contRegular*=6;
		contMalo*=3;
		contPesimo=0;
		total = contBueno + contMalo + contPesimo + contRegular;
		System.out.println("Total puntos:\t" + total +
				           " (" + (contBueno + " + " + contRegular +" + "+
				        	       contMalo  + " + " + contPesimo) + 
				           ")");
		
	}
}
